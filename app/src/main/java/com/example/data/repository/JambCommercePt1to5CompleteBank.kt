package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Commerce Question Series (Parts 1 to 5)
 * 100% extracted from official JAMB UTME objective past question source papers.
 * Full commercial explanations, accounting calculations, exact source stems and options.
 */
object JambCommercePt1to5CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_01",
                subject = "Commerce",
                topic = "General Introduction",
                year = "PT. 1",
                questionText = "Which question paper Type of commerce is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 2,
                explanation = "JAMB examination paper type identification question.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_02",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "PT. 1",
                questionText = "The most important function of commerce is in _____.",
                optionA = "enhancing business relationships",
                optionB = "helping people to improve their profits",
                optionC = "facilitating exchange among individuals and firms",
                optionD = "assisting trade through banking and insurance",
                correctAnswerIndex = 2,
                explanation = "Commerce bridges the gap between producers and consumers by facilitating the distribution and exchange of goods and services.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_03",
                subject = "Commerce",
                topic = "Occupation",
                year = "PT. 1",
                questionText = "The three main classification of occupation are _____.",
                optionA = "construction, trade and services",
                optionB = "manufacturing, industry and services",
                optionC = "farming, banking and trading",
                optionD = "industry, commerce and services",
                correctAnswerIndex = 3,
                explanation = "Occupations are broadly divided into industry (extractive, manufacturing, constructive), commerce (trade and aids to trade), and direct/indirect services.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_04",
                subject = "Commerce",
                topic = "Production",
                year = "PT. 1",
                questionText = "An oil exploration company is engaged in _____.",
                optionA = "tertiary production",
                optionB = "constructive occupation",
                optionC = "extractive occupation",
                optionD = "secondary production",
                correctAnswerIndex = 2,
                explanation = "Extractive occupations extract natural resources and raw materials directly from the earth, sea, or air.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_05",
                subject = "Commerce",
                topic = "Services",
                year = "PT. 1",
                questionText = "Service rendered to the public is provided by _____.",
                optionA = "government",
                optionB = "civil servants",
                optionC = "professionals",
                optionD = "domestic servants",
                correctAnswerIndex = 1,
                explanation = "Civil servants provide indirect public administrative services to the general citizenry.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_06",
                subject = "Commerce",
                topic = "Production",
                year = "PT. 1",
                questionText = "The creation of goods and services to satisfy human wants is referred to as _____.",
                optionA = "manufacturing",
                optionB = "commercialization",
                optionC = "production",
                optionD = "entrepreneurship",
                correctAnswerIndex = 2,
                explanation = "In economics and commerce, production is the creation of utility to satisfy human needs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_07",
                subject = "Commerce",
                topic = "Division of Labour",
                year = "PT. 1",
                questionText = "Which of the following is a limitation of division of labour?",
                optionA = "Decline in craftsmanship",
                optionB = "Monotony of work",
                optionC = "Reduction in output",
                optionD = "Reduction in labour force",
                correctAnswerIndex = 1,
                explanation = "A major drawback of division of labour is monotony and boredom resulting from performing repetitive tasks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_08",
                subject = "Commerce",
                topic = "Stages of Production",
                year = "PT. 1",
                questionText = "Resources obtained from the extractive sector that are transformed into finished products are examples of _____.",
                optionA = "primary production",
                optionB = "tertiary production",
                optionC = "direct production",
                optionD = "secondary production",
                correctAnswerIndex = 3,
                explanation = "Secondary production involves converting raw materials into semi-finished or finished manufactured products.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_09",
                subject = "Commerce",
                topic = "Branches of Commerce",
                year = "PT. 1",
                questionText = "From the organizational tree of Commerce (Commerce -> Trade & Aids to Trade), what does I stand for?",
                optionA = "Aids to trade",
                optionB = "Publicity",
                optionC = "Home trade",
                optionD = "Advertising",
                correctAnswerIndex = 0,
                explanation = "Commerce is divided into Trade and Aids to Trade (banking, insurance, warehousing, transport, advertising, communication).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_10",
                subject = "Commerce",
                topic = "Channels of Distribution",
                year = "PT. 1",
                questionText = "An individual that links the producer with the retailer is _____.",
                optionA = "an agent",
                optionB = "a wholesaler",
                optionC = "an entrepreneur",
                optionD = "a principal",
                correctAnswerIndex = 1,
                explanation = "The wholesaler buys in bulk from the manufacturer/producer and breaks bulk to supply retailers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_11",
                subject = "Commerce",
                topic = "Retail Trade",
                year = "PT. 1",
                questionText = "One of the functions of a retailer is the _____.",
                optionA = "financing of production activities",
                optionB = "provision of credit facilities to relations",
                optionC = "provision of jobs for customers",
                optionD = "breaking of bulk",
                correctAnswerIndex = 3,
                explanation = "Retailers buy convenient quantities from wholesalers and sell in small units to final consumers (breaking bulk).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_12",
                subject = "Commerce",
                topic = "Direct Selling",
                year = "PT. 1",
                questionText = "The main aim of selling directly to the consumers by manufacturers is to _____.",
                optionA = "reduce transportation cost",
                optionB = "make contact with individual consumers",
                optionC = "discourage the activities of middlemen",
                optionD = "maximize profit margin",
                correctAnswerIndex = 3,
                explanation = "Direct marketing eliminates middleman markups, enabling manufacturers to maximize overall margins while offering competitive prices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_13",
                subject = "Commerce",
                topic = "International Trade",
                year = "PT. 1",
                questionText = "Balance of payment problems arise if a country's _____.",
                optionA = "exports are more than imports",
                optionB = "imports are more than exports",
                optionC = "currency devaluation",
                optionD = "invisible exports are more than visible exports",
                correctAnswerIndex = 1,
                explanation = "A balance of payments deficit occurs when total payments for imports exceed receipts from exports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_14",
                subject = "Commerce",
                topic = "Balance of Payments",
                year = "PT. 1",
                questionText = "The three components of a country's balance of payments are _____.",
                optionA = "current account, capital account and monetary movement account",
                optionB = "capital account, trade account and business record",
                optionC = "sales account, profit and loss account and capital account",
                optionD = "monetary movement account, trade account and sales ledger",
                correctAnswerIndex = 0,
                explanation = "A country's balance of payments consists of the Current Account, Capital Account, and Official Financing/Monetary Movement Account.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_15",
                subject = "Commerce",
                topic = "Negotiable Instruments",
                year = "PT. 1",
                questionText = "A document that indicates obligation that is transferable by delivery and endorsement is a _____.",
                optionA = "bill of lading",
                optionB = "bill of exchange",
                optionC = "documentary evidence",
                optionD = "negotiable instrument",
                correctAnswerIndex = 3,
                explanation = "A negotiable instrument is a document guaranteeing the payment of a specific amount of money, transferable by delivery or endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_16",
                subject = "Commerce",
                topic = "Shipping Documents",
                year = "PT. 1",
                questionText = "The document which can be exchange for a bill of lading is _____.",
                optionA = "freight note",
                optionB = "mate receipt",
                optionC = "export invoice",
                optionD = "ship report",
                correctAnswerIndex = 1,
                explanation = "The mate's receipt is issued by the ship's officer acknowledging cargo loading and is subsequently exchanged for the signed bill of lading.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_17",
                subject = "Commerce",
                topic = "Trade Terms",
                year = "PT. 1",
                questionText = "The price quoted which includes the cost of insurance, freight and all delivery charges to the importer's warehouse is _____.",
                optionA = "Free Alongside Ship",
                optionB = "Franco",
                optionC = "Free on Board",
                optionD = "Free on Rail",
                correctAnswerIndex = 1,
                explanation = "Franco (or Free Domicile) price covers all costs including carriage, insurance, customs, and delivery right to the buyer's premises.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_18",
                subject = "Commerce",
                topic = "Terms of Payment",
                year = "PT. 1",
                questionText = "The purchase of goods under the CWO system of payment implies that _____.",
                optionA = "money must be enclosed when ordering",
                optionB = "payment must be made on delivery",
                optionC = "payment must be made within few days",
                optionD = "cash must be paid on the spot",
                correctAnswerIndex = 0,
                explanation = "Cash With Order (CWO) mandates that full remittance accompany the purchase order before shipment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_19",
                subject = "Commerce",
                topic = "Advertising",
                year = "PT. 1",
                questionText = "The most effective but limited medium of advertising in Nigeria is _____.",
                optionA = "billboard",
                optionB = "television",
                optionC = "newspaper",
                optionD = "radio",
                correctAnswerIndex = 1,
                explanation = "Television provides high visual and auditory impact but has historically been limited by electrical power availability in rural communities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_20",
                subject = "Commerce",
                topic = "Banking",
                year = "PT. 1",
                questionText = "A cheque that has been drawn but not presented for payment can still be honoured _____.",
                optionA = "within 6 months",
                optionB = "after 9 months",
                optionC = "within 9 months",
                optionD = "after 6 months",
                correctAnswerIndex = 0,
                explanation = "In standard banking practice, a cheque remains valid and legally payable within six months of its date before becoming stale.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_21",
                subject = "Commerce",
                topic = "Commercial Banking",
                year = "PT. 1",
                questionText = "The major source of income to commercial banks is _____.",
                optionA = "loans",
                optionB = "deposits",
                optionC = "interest",
                optionD = "overdrafts",
                correctAnswerIndex = 2,
                explanation = "Commercial banks earn the bulk of their revenue from interest charged on loans, advances, and credit facilities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_22",
                subject = "Commerce",
                topic = "Aids to Trade",
                year = "PT. 1",
                questionText = "An ancillary to trade that easily links suppliers with consumers is _____.",
                optionA = "tourism",
                optionB = "banking",
                optionC = "communication",
                optionD = "transportation",
                correctAnswerIndex = 2,
                explanation = "Communication transmits trade enquiries, market data, and orders between suppliers and buyers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_23",
                subject = "Commerce",
                topic = "Insurance Principles",
                year = "PT. 1",
                questionText = "Mr. Lawal insured his warehouse against burglary but it was later gutted by fire. This implies that _____.",
                optionA = "the loss should be borne by the insurer",
                optionB = "Mr. Lawal is liable only for half of the estimated loss",
                optionC = "the insurer should make a consolation payment for the loss",
                optionD = "the loss should be borne by Mr. Lawal",
                correctAnswerIndex = 3,
                explanation = "Under the doctrine of proximate cause, an insurer only compensates for losses resulting directly from the specific insured peril.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_24",
                subject = "Commerce",
                topic = "Insurance",
                year = "PT. 1",
                questionText = "The agreement of insurers to spread risks among themselves is a major feature of _____.",
                optionA = "reinsurance",
                optionB = "life insurance",
                optionC = "underwriter",
                optionD = "marine insurance",
                correctAnswerIndex = 0,
                explanation = "Reinsurance allows an insurance company to transfer portions of its risk portfolio to other insurers to prevent catastrophic insolvency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_25",
                subject = "Commerce",
                topic = "Tourism",
                year = "PT. 1",
                questionText = "Inbound tourism occurs when _____.",
                optionA = "non-residents of a country travel to other countries",
                optionB = "resident of a country travel to another country",
                optionC = "non-resident of a country travel within it",
                optionD = "resident of a country travel within it",
                correctAnswerIndex = 2,
                explanation = "Inbound tourism refers to visits to a host country by visitors who are not residents of that country.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_26",
                subject = "Commerce",
                topic = "Transportation",
                year = "PT. 1",
                questionText = "One of the major disadvantages of pipeline transportation is its _____.",
                optionA = "high cost of construction",
                optionB = "limitation in scope",
                optionC = "vulnerability to climate changes",
                optionD = "high maintenance cost",
                correctAnswerIndex = 1,
                explanation = "Pipelines are inflexible and limited in scope because they can transport only liquid or gaseous fluids along fixed routes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_27",
                subject = "Commerce",
                topic = "Business Organizations",
                year = "PT. 1",
                questionText = "The business organization that can effectively combine management with control is _____.",
                optionA = "private limited liability company",
                optionB = "sole proprietorship",
                optionC = "public limited liability company",
                optionD = "co-operation society",
                correctAnswerIndex = 1,
                explanation = "The sole proprietor exercises absolute personal authority, unity of command, and direct supervision without corporate bureaucracy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_28",
                subject = "Commerce",
                topic = "Business Combinations",
                year = "PT. 1",
                questionText = "When two or more companies agree to execute a project too large for one to handle, this is referred to as _____.",
                optionA = "an amalgamation",
                optionB = "a cartel",
                optionC = "a merger",
                optionD = "a consortium",
                correctAnswerIndex = 3,
                explanation = "A consortium is a temporary association of independent corporate enterprises pooled together to execute a major project.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_29",
                subject = "Commerce",
                topic = "Company Liquidation",
                year = "PT. 1",
                questionText = "In the event of voluntary liquidation, the appointment of a liquidator is the responsibility of the _____.",
                optionA = "directors",
                optionB = "creditors",
                optionC = "promoters",
                optionD = "court",
                correctAnswerIndex = 1,
                explanation = "In a creditors' voluntary liquidation, the creditors appoint a liquidator to wind up the firm's affairs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_30",
                subject = "Commerce",
                topic = "Business Finance",
                year = "PT. 1",
                questionText = "A source of business financing which involves pledging of a specific asset is _____.",
                optionA = "bond",
                optionB = "mortgage",
                optionC = "debentures",
                optionD = "loan",
                correctAnswerIndex = 1,
                explanation = "A mortgage is a debt instrument secured by the collateral of specified real estate or fixed property.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_31",
                subject = "Commerce",
                topic = "Trade Associations",
                year = "PT. 1",
                questionText = "An example of a trade association is _____.",
                optionA = "ALGON",
                optionB = "NLC",
                optionC = "NURTW",
                optionD = "NULGE",
                correctAnswerIndex = 2,
                explanation = "The National Union of Road Transport Workers (NURTW) is a recognized commercial trade association protecting transport operators.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_32",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "PT. 1",
                questionText = "A broker is an agent who links a potential investor with _____.",
                optionA = "a shareholder who wants to register a company",
                optionB = "other members of the exchange who want to trade",
                optionC = "government official on the exchange",
                optionD = "a quoted company",
                correctAnswerIndex = 1,
                explanation = "Stockbrokers act as intermediary agents buying and selling securities on behalf of clients among exchange market participants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_33",
                subject = "Commerce",
                topic = "Capital Market",
                year = "PT. 1",
                questionText = "Second-tier Securities Market differs from the First-tier Securities Market in that the former is _____.",
                optionA = "highly restricted",
                optionB = "regulated by the SEC",
                optionC = "regulated by the NIPC",
                optionD = "less restricted",
                correctAnswerIndex = 3,
                explanation = "The Second-tier Securities Market (SSM) provides less stringent listing rules to encourage small and medium scale enterprises.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_34",
                subject = "Commerce",
                topic = "Management & Communication",
                year = "PT. 1",
                questionText = "A communication process providing information for decision-making in an organization is the _____.",
                optionA = "Management information System",
                optionB = "Transmission Control Protocol",
                optionC = "Information Retrieval System",
                optionD = "File Transfer Protocol",
                correctAnswerIndex = 0,
                explanation = "A Management Information System (MIS) collects and analyzes data to support executive organizational decisions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_35",
                subject = "Commerce",
                topic = "Span of Control",
                year = "PT. 1",
                questionText = "The managerial ability of a supervisor in an organization may be underutilized if the _____.",
                optionA = "morale of the supervised is high",
                optionB = "span of control is wide",
                optionC = "span of control is narrow",
                optionD = "morale of the supervisor is low",
                correctAnswerIndex = 2,
                explanation = "A very narrow span of control assigns too few subordinates to a supervisor, leading to underutilization of supervisory capacity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_36",
                subject = "Commerce",
                topic = "Organizational Structure",
                year = "PT. 1",
                questionText = "The arrangement and interrelationship of the various components and positions of a business is referred to as _____.",
                optionA = "organizational structure",
                optionB = "clarity of objective",
                optionC = "unity of direction",
                optionD = "line structure",
                correctAnswerIndex = 0,
                explanation = "Organizational structure defines formal lines of authority, responsibility, and departmental relationships.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_37",
                subject = "Commerce",
                topic = "Marketing Mix",
                year = "PT. 1",
                questionText = "The variety of goods and services which a company offers for sale is its _____.",
                optionA = "place mix",
                optionB = "promotion mix",
                optionC = "price mix",
                optionD = "product mix",
                correctAnswerIndex = 3,
                explanation = "Product mix refers to the complete portfolio of product lines and items offered for sale by a commercial entity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_38",
                subject = "Commerce",
                topic = "Sales Promotion",
                year = "PT. 1",
                questionText = "Activities undertaken to create awareness for goods by conducting contests is _____.",
                optionA = "marketing concept",
                optionB = "consumerism",
                optionC = "sales promotion",
                optionD = "marketing mix",
                correctAnswerIndex = 2,
                explanation = "Sales promotions utilize contests, free samples, vouchers, and discounts to stimulate consumer buying interest.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_39",
                subject = "Commerce",
                topic = "Advertising",
                year = "PT. 1",
                questionText = "The slogan, 'a wonderful world', used by a communication network is a form of _____.",
                optionA = "product differentiation",
                optionB = "persuasive advertising",
                optionC = "publicity",
                optionD = "packaging",
                correctAnswerIndex = 1,
                explanation = "Persuasive advertising uses emotional appeals and catchy slogans to attract customer patronage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_40",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "PT. 1",
                questionText = "To make a simple contract valid, the intention must be _____.",
                optionA = "legal and written",
                optionB = "legal and binding",
                optionC = "legal and attractive",
                optionD = "legal and harmonious",
                correctAnswerIndex = 1,
                explanation = "For a valid simple contract, there must be intention to create legal and binding relations between the parties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_41",
                subject = "Commerce",
                topic = "Law of Agency",
                year = "PT. 1",
                questionText = "The major parties to an agency relationship are the _____.",
                optionA = "principal and the creditor",
                optionB = "Bailee and the bailor",
                optionC = "principal and the agent",
                optionD = "shareholder and the creditor",
                correctAnswerIndex = 2,
                explanation = "An agency relationship exists between a principal who delegates authority and an agent authorized to act on their behalf.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_42",
                subject = "Commerce",
                topic = "Employment Law",
                year = "PT. 1",
                questionText = "One of the obligations of an employer to an employee is to _____.",
                optionA = "indemnify him against liabilities incurred on duty",
                optionB = "award scholarship to his children",
                optionC = "terminate his appointment without prior notice",
                optionD = "indemnify him against injuries caused through negligence",
                correctAnswerIndex = 0,
                explanation = "An employer has a common-law duty to indemnify an employee for legal liabilities and expenses incurred in discharging their lawful duties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_43",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "PT. 1",
                questionText = "The body charged with the responsibility of regulating foods and drugs in Nigeria is the _____.",
                optionA = "SON",
                optionB = "NDLEA",
                optionC = "NAFDAC",
                optionD = "CAC",
                correctAnswerIndex = 2,
                explanation = "NAFDAC (National Agency for Food and Drug Administration and Control) regulates drugs, food, and medical consumables in Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_44",
                subject = "Commerce",
                topic = "Computer Systems",
                year = "PT. 1",
                questionText = "The physical components of a computer system refers to the _____.",
                optionA = "system unit",
                optionB = "hardware",
                optionC = "software",
                optionD = "compact disk",
                correctAnswerIndex = 1,
                explanation = "Hardware refers to the tangible electronic and mechanical equipment comprising a computer system.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_45",
                subject = "Commerce",
                topic = "Operating Systems",
                year = "PT. 1",
                questionText = "An example of a computer operating system is _____.",
                optionA = "the PageMaker",
                optionB = "the Word Perfect",
                optionC = "Microsoft Word 2000",
                optionD = "Windows 2000",
                correctAnswerIndex = 3,
                explanation = "Windows 2000 is an operating system that manages computer hardware and system resources.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_46",
                subject = "Commerce",
                topic = "Business Networks",
                year = "PT. 1",
                questionText = "Intranet differs from extranet in that the former _____.",
                optionA = "requires a modem before it could be used",
                optionB = "can generally be accessed by the public",
                optionC = "is restricted to employees of an organization",
                optionD = "requires internet protocols",
                correctAnswerIndex = 2,
                explanation = "An intranet is a private internal network restricted solely to authorized organizational staff.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_47",
                subject = "Commerce",
                topic = "Internet Applications",
                year = "PT. 1",
                questionText = "A software application which enables a user to display and interact with texts, images and videos is the _____.",
                optionA = "web server",
                optionB = "Internet Protocol",
                optionC = "CorelDraw",
                optionD = "web browser",
                correctAnswerIndex = 3,
                explanation = "A web browser retrieves, renders, and displays multimedia web pages from the internet.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_48",
                subject = "Commerce",
                topic = "Web Technologies",
                year = "PT. 1",
                questionText = "A predominant make-up language for web pages is the _____.",
                optionA = "IP",
                optionB = "HTTP",
                optionC = "HTML",
                optionD = "TCP",
                correctAnswerIndex = 2,
                explanation = "HTML (HyperText Markup Language) is the standard markup language used to structure content on the World Wide Web.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_49",
                subject = "Commerce",
                topic = "Electronic Mail",
                year = "PT. 1",
                questionText = "The symbol @ in an internet mail address is used to _____.",
                optionA = "separate the user name from the machine name",
                optionB = "link the user with other Internet users",
                optionC = "locate the addresses of Internet users",
                optionD = "link the user with the machine",
                correctAnswerIndex = 0,
                explanation = "In email syntax, the '@' delimiter separates the individual account username from the host domain name.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt1_50",
                subject = "Commerce",
                topic = "Social Responsibility",
                year = "PT. 1",
                questionText = "A business organization is said to be socially responsible when it _____.",
                optionA = "gets involved in issues relating to the society",
                optionB = "rewards its staff for long-term service",
                optionC = "offers discounts to customers",
                optionD = "invites the public to its annual general meetings",
                correctAnswerIndex = 0,
                explanation = "Corporate Social Responsibility entails proactive business participation in solving community and environmental concerns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.1 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_01",
                subject = "Commerce",
                topic = "General Introduction",
                year = "PT. 2",
                questionText = "Which question paper type of commerce as indicated above is given to you?",
                optionA = "Type Green",
                optionB = "Type Purple",
                optionC = "Type Red",
                optionD = "Type Yellow",
                correctAnswerIndex = 1,
                explanation = "JAMB examination instructions require candidate verification of their paper type.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_02",
                subject = "Commerce",
                topic = "Importance of Commerce",
                year = "PT. 2",
                questionText = "One of the major benefits of commerce to government is to _____.",
                optionA = "improve the standard of living",
                optionB = "generate revenue for growth and development",
                optionC = "encourage cooperation among public organisations",
                optionD = "encourage the development of sociocultural values",
                correctAnswerIndex = 1,
                explanation = "Commerce yields substantial public revenue through excise duties, VAT, corporate income tax, and customs tariffs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_03",
                subject = "Commerce",
                topic = "Industry",
                year = "PT. 2",
                questionText = "An example of an activity in the construction industry is _____.",
                optionA = "blacksmithing",
                optionB = "bricklaying",
                optionC = "car assembling",
                optionD = "shoemaking",
                correctAnswerIndex = 1,
                explanation = "Bricklaying is a primary construction trade involved in building civil structures and edifices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_04",
                subject = "Commerce",
                topic = "Factors of Production",
                year = "PT. 2",
                questionText = "One of the inputs in production that can be motivated by remuneration is _____.",
                optionA = "capital",
                optionB = "entrepreneur",
                optionC = "labour",
                optionD = "land",
                correctAnswerIndex = 2,
                explanation = "Labour is human mental and physical exertion motivated by wages, salaries, and monetary bonuses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_05",
                subject = "Commerce",
                topic = "Division of Labour",
                year = "PT. 2",
                questionText = "The allocation of tasks to different skills in a production process is referred to as _____.",
                optionA = "production technique",
                optionB = "production function",
                optionC = "division of labour",
                optionD = "delegation of responsibility",
                correctAnswerIndex = 2,
                explanation = "Division of labour assigns workers to specific segments of an overall production chain based on specialization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_06",
                subject = "Commerce",
                topic = "Retail Trade",
                year = "PT. 2",
                questionText = "The sales of goods through a medium that accepts money and delivers the items to the customer is _____.",
                optionA = "an automated teller machine",
                optionB = "a vending machine",
                optionC = "a counting machine",
                optionD = "a branding machine",
                correctAnswerIndex = 1,
                explanation = "A vending machine is an automated retail dispensary that accepts cash/cards and dispenses selected merchandise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_07",
                subject = "Commerce",
                topic = "Marketing & Branding",
                year = "PT. 2",
                questionText = "The main purpose of branding is to _____.",
                optionA = "create identity for a product",
                optionB = "make a product look attractive",
                optionC = "create product awareness",
                optionD = "increase sales volume",
                correctAnswerIndex = 0,
                explanation = "Branding establishes distinct identity, trademark recognition, and differentiation from rival products.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_08",
                subject = "Commerce",
                topic = "International Trade",
                year = "PT. 2",
                questionText = "The basis for international trade is embedded in the principle of _____.",
                optionA = "absolute advantage",
                optionB = "globalization",
                optionC = "deregulation",
                optionD = "comparative advantage",
                correctAnswerIndex = 3,
                explanation = "David Ricardo's law of comparative advantage explains that nations trade to benefit from differences in relative opportunity costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_09",
                subject = "Commerce",
                topic = "Foreign Trade",
                year = "PT. 2",
                questionText = "The major problem encountered in international trade is that of _____.",
                optionA = "distance",
                optionB = "differences in culture",
                optionC = "politics",
                optionD = "differences in currency",
                correctAnswerIndex = 3,
                explanation = "Dealing across diverse foreign currencies and foreign exchange volatility constitutes a primary hurdle in cross-border commerce.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_10",
                subject = "Commerce",
                topic = "Trade Documents",
                year = "PT. 2",
                questionText = "The document a seller uses in dispatching goods to a customer by a carrier is _____.",
                optionA = "a bill of lading",
                optionB = "an invoice",
                optionC = "an advice note",
                optionD = "a delivery note",
                correctAnswerIndex = 3,
                explanation = "A delivery note accompanies dispatched goods to be signed by the consignee as evidence of physical receipt.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_11",
                subject = "Commerce",
                topic = "Foreign Trade Documents",
                year = "PT. 2",
                questionText = "A document which serves as an order with details of goods required by an intending purchaser is _____.",
                optionA = "a freight note",
                optionB = "an indent",
                optionC = "a bill of lading",
                optionD = "a way bill",
                correctAnswerIndex = 1,
                explanation = "An indent is an official order placed with an overseas agent specifying quantities, prices, and shipment terms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_12",
                subject = "Commerce",
                topic = "Trade Discounts",
                year = "PT. 2",
                questionText = "If a customer pays within nine days of receiving goods and takes advantage of 3% off the invoice price, this is stated as _____.",
                optionA = "3/9; net 30",
                optionB = "9/27; net 30",
                optionC = "30; net 9/3",
                optionD = "9/30; net 3",
                correctAnswerIndex = 0,
                explanation = "Trade credit terms '3/9; net 30' mean a 3% cash discount is granted if settled within 9 days, else the full bill is due in 30 days.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_13",
                subject = "Commerce",
                topic = "Banking Instruments",
                year = "PT. 2",
                questionText = "Which of the following is a characteristic of a bearer cheque?",
                optionA = "it is made with transverse lines",
                optionB = "it is made payable to whoever presents it",
                optionC = "it is made without transverse lines",
                optionD = "it is only payable into the payees account",
                correctAnswerIndex = 1,
                explanation = "A bearer cheque is payable on demand to anyone presenting it at the banking counter without proof of identity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_14",
                subject = "Commerce",
                topic = "Commercial Paper",
                year = "PT. 2",
                questionText = "A bill of exchange paid before its due date at an amount less than its face value is said to have been _____.",
                optionA = "accepted",
                optionB = "rejected",
                optionC = "discounted",
                optionD = "dishonoured",
                correctAnswerIndex = 2,
                explanation = "Discounting a bill of exchange involves selling it to a bank before maturity for cash minus a discount charge.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_15",
                subject = "Commerce",
                topic = "Advertising",
                year = "PT. 2",
                questionText = "The most effective type of advertising for branded products is _____.",
                optionA = "mass advertising",
                optionB = "persuasive advertising",
                optionC = "informative advertising",
                optionD = "competitive advertising",
                correctAnswerIndex = 3,
                explanation = "Competitive advertising aims to persuade consumers that a branded item is superior to identical rival offerings.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_16",
                subject = "Commerce",
                topic = "Banking Operations",
                year = "PT. 2",
                questionText = "A current account holder pays fees for services in form of _____.",
                optionA = "bank charges",
                optionB = "interest rates",
                optionC = "commission on turnover",
                optionD = "minimum lending rate",
                correctAnswerIndex = 2,
                explanation = "Commercial banks historically charged Commission on Turnover (COT) or account maintenance fees for handling current accounts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_17",
                subject = "Commerce",
                topic = "Communication",
                year = "PT. 2",
                questionText = "Printed messages sent by cable are recorded as _____.",
                optionA = "telegram",
                optionB = "SMS",
                optionC = "telex",
                optionD = "MMS",
                correctAnswerIndex = 2,
                explanation = "Telex allowed text messages to be exchanged internationally across a switched network of teleprinters.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_18",
                subject = "Commerce",
                topic = "Commercial Communication",
                year = "PT. 2",
                questionText = "Communication is relevant to business activities because it _____.",
                optionA = "creates wealth for people",
                optionB = "reduces the cost and risk of travelling",
                optionC = "connects people",
                optionD = "enhances delivery of goods and services",
                correctAnswerIndex = 1,
                explanation = "Efficient business telecommunication permits instant negotiation and transaction without expensive physical travel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_19",
                subject = "Commerce",
                topic = "Insurance Principles",
                year = "PT. 2",
                questionText = "The right of an insurance company to stand in place of an insured against a third party, who is liable for the occurrence of a loss, is the principle of _____.",
                optionA = "proximate cause",
                optionB = "insurable interest",
                optionC = "insurance priority",
                optionD = "subrogation",
                correctAnswerIndex = 3,
                explanation = "Subrogation grants the insurer all legal rights against liable third parties once the claim is indemnified.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_20",
                subject = "Commerce",
                topic = "Insurance vs Assurance",
                year = "PT. 2",
                questionText = "Assurance is different from insurance in that the former is based on _____.",
                optionA = "probability",
                optionB = "possibility",
                optionC = "risk",
                optionD = "uncertainty",
                correctAnswerIndex = 0,
                explanation = "Assurance covers events that are bound to happen sooner or later (such as death), whereas insurance covers contingent risks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_21",
                subject = "Commerce",
                topic = "Life Assurance",
                year = "PT. 2",
                questionText = "A person who undertakes life insurance is said to be an _____.",
                optionA = "insurer",
                optionB = "assurer",
                optionC = "assured",
                optionD = "insured",
                correctAnswerIndex = 2,
                explanation = "In life assurance, the person taking out the cover on their own life is designated the assured.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_22",
                subject = "Commerce",
                topic = "Tourism",
                year = "PT. 2",
                questionText = "Tourism serves the purpose of _____.",
                optionA = "cross-cultural understanding and peaceful interaction",
                optionB = "opening values for leaving the country",
                optionC = "economic development and naturalization",
                optionD = "exploiting the country's natural endowment",
                correctAnswerIndex = 0,
                explanation = "Tourism fosters cross-cultural exchange, global goodwill, and mutual international understanding.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_23",
                subject = "Commerce",
                topic = "Postal Services",
                year = "PT. 2",
                questionText = "The type of letters that are delivered through the normal mail or by airmail express service is referred to as _____.",
                optionA = "inland letters",
                optionB = "registered letters",
                optionC = "airmail letters express letters",
                optionD = "express letters",
                correctAnswerIndex = 3,
                explanation = "Express letters receive priority handling and rapid courier dispatch over ordinary post.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_24",
                subject = "Commerce",
                topic = "Partnerships",
                year = "PT. 2",
                questionText = "A business organization that exploits the capabilities of a member to remedy the weaknesses of another is _____.",
                optionA = "joint venture",
                optionB = "partnership",
                optionC = "nominal partnership",
                optionD = "cooperative",
                correctAnswerIndex = 1,
                explanation = "A partnership combines complementary skills, capital, and expertise of partners to offset individual weaknesses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_25",
                subject = "Commerce",
                topic = "Business Objectives",
                year = "PT. 2",
                questionText = "The most important business objective is to _____.",
                optionA = "improve investments",
                optionB = "provide quality products",
                optionC = "target consumers for satisfaction",
                optionD = "carve a niche for the business",
                correctAnswerIndex = 2,
                explanation = "Under the modern marketing concept, the supreme objective is creating satisfied customers at a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_26",
                subject = "Commerce",
                topic = "Company Liquidation",
                year = "PT. 2",
                questionText = "In case of a liquidation of a public limited liability company, those that are first paid are _____.",
                optionA = "ordinary shareholders",
                optionB = "preference shareholders",
                optionC = "cumulative preference shareholders",
                optionD = "debenture holders",
                correctAnswerIndex = 3,
                explanation = "Debenture holders are secured creditors and hold priority of repayment before any equity or preference shareholders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_27",
                subject = "Commerce",
                topic = "Company Law",
                year = "PT. 2",
                questionText = "A feature common to public and private limited liability companies is that _____.",
                optionA = "both can sue and be sued",
                optionB = "the minimum number of their shareholders is five",
                optionC = "the transfer of their shares is not restricted",
                optionD = "their annual accounts are published for public use",
                correctAnswerIndex = 0,
                explanation = "Both corporate forms are incorporated legal entities with distinct legal personality capable of suing and being sued.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_28",
                subject = "Commerce",
                topic = "Long-term Finance",
                year = "PT. 2",
                questionText = "A business organization can obtain long term financing through _____.",
                optionA = "bank overdraft",
                optionB = "the sale of shares",
                optionC = "credit purchases",
                optionD = "bureau de change",
                correctAnswerIndex = 1,
                explanation = "Issuing equity shares provides permanent capital that never requires repayment during business solvency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_29",
                subject = "Commerce",
                topic = "Corporate Capital",
                year = "PT. 2",
                questionText = "The portion of the authorized share capital given out to the public for subscription is _____.",
                optionA = "called-up capital",
                optionB = "issued capital",
                optionC = "paid-up capital",
                optionD = "reserved capital",
                correctAnswerIndex = 1,
                explanation = "Issued capital is the nominal value of shares actually offered to and taken up by shareholders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_30",
                subject = "Commerce",
                topic = "Company Finance",
                year = "PT. 2",
                questionText = "A company has an authorized capital of 40 million shares at N1 each, out of which 32 million are issued and fully paid-up. What happens to the remaining 8 million shares?",
                optionA = "it has been issued but not paid-up",
                optionB = "it has been applied for but not issued",
                optionC = "it is not paid-up",
                optionD = "it has not yet been issued",
                correctAnswerIndex = 3,
                explanation = "The remaining 8 million shares represent unissued capital kept in reserve for future public subscription.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_31",
                subject = "Commerce",
                topic = "Commercial Calculations",
                year = "PT. 2",
                questionText = "If the rate of turnover of a company in 1999 was 4 times while the average stock was ₦49,600, determine the turnover.",
                optionA = "₦199,400",
                optionB = "₦198,400",
                optionC = "₦100,200",
                optionD = "₦99,200",
                correctAnswerIndex = 1,
                explanation = "Turnover (Cost of Sales) = Rate of turnover × Average stock = 4 × ₦49,600 = ₦198,400.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_32",
                subject = "Commerce",
                topic = "Trading Account",
                year = "PT. 2",
                questionText = "Given: opening stock ₦1,800, purchases ₦2,800, sales ₦8,000, closing stock ₦350, carriage on sales ₦500. Calculate the value of the unused stock.",
                optionA = "₦800",
                optionB = "₦500",
                optionC = "₦350",
                optionD = "₦320",
                correctAnswerIndex = 2,
                explanation = "Unused stock at the close of an accounting trading period is simply the closing stock (₦350).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_33",
                subject = "Commerce",
                topic = "Trade Associations",
                year = "PT. 2",
                questionText = "The main objective of a trade association is to _____.",
                optionA = "protect its members against litigation",
                optionB = "boost the trade of its members",
                optionC = "secure credit for its members",
                optionD = "protect its members against victimization",
                correctAnswerIndex = 1,
                explanation = "Trade associations exist to promote, safeguard, and advance the collective business interests and profitability of members.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_34",
                subject = "Commerce",
                topic = "Chambers of Commerce",
                year = "PT. 2",
                questionText = "The promotion and protection of trade, industry and agriculture through trade fairs is a function of _____.",
                optionA = "NACRDB",
                optionB = "NACCIMA",
                optionC = "the consumer protection council",
                optionD = "the chamber of commerce",
                correctAnswerIndex = 3,
                explanation = "Chambers of Commerce organize international and domestic trade exhibitions to promote commerce and enterprise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_35",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "PT. 2",
                questionText = "Dealing in quoted securities on the Nigerian Stock Exchange is restricted to authorized _____.",
                optionA = "companies",
                optionB = "brokers",
                optionC = "investors",
                optionD = "principals",
                correctAnswerIndex = 1,
                explanation = "Only licensed dealing member firms and registered stockbrokers execute trades on the floor of the Stock Exchange.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_36",
                subject = "Commerce",
                topic = "Securities",
                year = "PT. 2",
                questionText = "Securities that entitle the investor to coupon rates are _____.",
                optionA = "bonds",
                optionB = "equities",
                optionC = "warrants",
                optionD = "treasury bills",
                correctAnswerIndex = 0,
                explanation = "Bonds are debt securities carrying a fixed annual nominal rate of interest called the coupon rate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_37",
                subject = "Commerce",
                topic = "Management Functions",
                year = "PT. 2",
                questionText = "Under what management function will the motivation of employees fall?",
                optionA = "staffing",
                optionB = "controlling",
                optionC = "organizing",
                optionD = "directing",
                correctAnswerIndex = 3,
                explanation = "Directing (or leading) involves guiding, supervising, communicating with, and motivating workforce personnel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_38",
                subject = "Commerce",
                topic = "Principles of Management",
                year = "PT. 2",
                questionText = "The promotion of team spirit in an organization is referred to as _____.",
                optionA = "unity of direction",
                optionB = "esprit de corps",
                optionC = "unity of purpose",
                optionD = "discipline",
                correctAnswerIndex = 1,
                explanation = "Henri Fayol's principle of 'esprit de corps' advocates fostering workplace harmony and team solidarity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_39",
                subject = "Commerce",
                topic = "Organizational Structure",
                year = "PT. 2",
                questionText = "One of the characteristics of a good organizational chart is that it should _____.",
                optionA = "be rigid",
                optionB = "show government policy",
                optionC = "facilitate communication",
                optionD = "be acceptable",
                correctAnswerIndex = 2,
                explanation = "An organizational chart clarifies reporting relationships, division of duties, and official communication pathways.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_40",
                subject = "Commerce",
                topic = "Marketing Concepts",
                year = "PT. 2",
                questionText = "An organization which focuses on consumer satisfaction is practicing _____.",
                optionA = "consumerism",
                optionB = "market segmentation",
                optionC = "selling concept",
                optionD = "marketing concept",
                correctAnswerIndex = 3,
                explanation = "The marketing concept asserts that corporate success depends on determining customer needs and delivering customer satisfaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_41",
                subject = "Commerce",
                topic = "Distribution Channels",
                year = "PT. 2",
                questionText = "Goods and services are made available to consumers through _____.",
                optionA = "the channel of distribution",
                optionB = "sales promotion",
                optionC = "the advertising agency",
                optionD = "the middle men",
                correctAnswerIndex = 0,
                explanation = "The channel of distribution provides the logistical conduit transferring title and goods from producer to user.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_42",
                subject = "Commerce",
                topic = "Law of Agency",
                year = "PT. 2",
                questionText = "A person who in consideration for an extra commission takes responsibility for goods sold on credit and in case of default is a _____.",
                optionA = "commission agent",
                optionB = "del credere agent",
                optionC = "broker",
                optionD = "factor",
                correctAnswerIndex = 1,
                explanation = "A del credere agent guarantees payment for goods sold on credit to third parties in exchange for an extra fee.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_43",
                subject = "Commerce",
                topic = "Commercial Law: Sales of Goods",
                year = "PT. 2",
                questionText = "Yahaya bought a piece of furniture on a credit sale agreement from Ahmed and resold it to Ali before all instalments were made. The court upheld that Ahmed could not recover possession of the items from Ali. The reason for the judgement was because _____.",
                optionA = "ownership was transferred on completion of instalment",
                optionB = "ownership was transferred on delivery",
                optionC = "Yahaya could not pass title to a third party",
                optionD = "Ali was still indebted to Yahaya",
                correctAnswerIndex = 1,
                explanation = "Under a credit sale agreement (unlike hire purchase), ownership and property in the goods pass immediately upon initial delivery.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_44",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "PT. 2",
                questionText = "The body which ensures that consumers are protected against harmful products in Nigeria is _____.",
                optionA = "NAFDAC",
                optionB = "NDLEA",
                optionC = "SON",
                optionD = "CPC",
                correctAnswerIndex = 2,
                explanation = "The Standards Organisation of Nigeria (SON) sets industrial standards and inspects consumer products against safety hazards.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_45",
                subject = "Commerce",
                topic = "Information Technology",
                year = "PT. 2",
                questionText = "The process of decoding data in a computer is known as _____.",
                optionA = "dilution",
                optionB = "default drive",
                optionC = "decryption",
                optionD = "data security",
                correctAnswerIndex = 2,
                explanation = "Decryption transforms encoded or encrypted data back into its original readable plain text format.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_46",
                subject = "Commerce",
                topic = "System Software",
                year = "PT. 2",
                questionText = "Which of the following is a type of system software?",
                optionA = "utility programmes",
                optionB = "registers",
                optionC = "hard drives",
                optionD = "packages",
                correctAnswerIndex = 0,
                explanation = "Utility programs (like antivirus, disk defragmenters) are system software maintaining computer performance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_47",
                subject = "Commerce",
                topic = "Computer Hardware",
                year = "PT. 2",
                questionText = "Computers that process all data as binary zeros and ones are _____.",
                optionA = "analog computers",
                optionB = "digital computers",
                optionC = "hybrid computers",
                optionD = "desktop computers",
                correctAnswerIndex = 1,
                explanation = "Digital computers process discrete numerical data using binary digits (0 and 1).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_48",
                subject = "Commerce",
                topic = "Banking",
                year = "PT. 2",
                questionText = "Modern means of payment is greatly facilitated by _____.",
                optionA = "e-commerce",
                optionB = "paper money",
                optionC = "e-banking",
                optionD = "credit transfer",
                correctAnswerIndex = 2,
                explanation = "Electronic banking (e-banking) enables instant fund transfers, ATM transactions, and digital payment clearance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_49",
                subject = "Commerce",
                topic = "Business Ethics",
                year = "PT. 2",
                questionText = "The provision of quality and safe products which guarantee the health of consumers is an example of _____.",
                optionA = "quality control",
                optionB = "price control",
                optionC = "civic responsibility",
                optionD = "social responsibility",
                correctAnswerIndex = 3,
                explanation = "Consumer protection and product safety represent core corporate social responsibilities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt2_50",
                subject = "Commerce",
                topic = "Business Environment",
                year = "PT. 2",
                questionText = "A business organization must always consider the overall effect of its actions on the _____.",
                optionA = "competitor",
                optionB = "product",
                optionC = "profit",
                optionD = "society",
                correctAnswerIndex = 3,
                explanation = "Modern enterprises must gauge the external socio-environmental impacts of their policies on the broader society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.2 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_01",
                subject = "Commerce",
                topic = "General Introduction",
                year = "PT. 3",
                questionText = "Which question paper Type of commerce is given to you?",
                optionA = "Type D",
                optionB = "Type I",
                optionC = "Type B",
                optionD = "Type U",
                correctAnswerIndex = 0,
                explanation = "JAMB examination instructions require verification of question paper type.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_02",
                subject = "Commerce",
                topic = "Labour & Employment",
                year = "PT. 3",
                questionText = "The type of labour that makes use of physical effort in production processes is the _____.",
                optionA = "unskilled labour",
                optionB = "skilled labour",
                optionC = "blue-collar job",
                optionD = "white-collar job",
                correctAnswerIndex = 0,
                explanation = "Unskilled labour relies predominantly on manual physical exertion with little specialized technical training.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_03",
                subject = "Commerce",
                topic = "Industry",
                year = "PT. 3",
                questionText = "The assembling of products into usable forms is known as _____.",
                optionA = "creation",
                optionB = "manufacturing",
                optionC = "construction",
                optionD = "formation",
                correctAnswerIndex = 1,
                explanation = "Manufacturing is the industrial processing and assembling of component parts into finished usable goods.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_04",
                subject = "Commerce",
                topic = "Channels of Distribution",
                year = "PT. 3",
                questionText = "The final link in the chain of distribution is _____.",
                optionA = "middlemen",
                optionB = "wholesaling",
                optionC = "consumer",
                optionD = "retailing",
                correctAnswerIndex = 2,
                explanation = "The final consumer is the ultimate user who consumes goods to satisfy personal wants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_05",
                subject = "Commerce",
                topic = "Balance of Trade",
                year = "PT. 3",
                questionText = "A country is said to be experiencing an unfavourable balance of trade if her _____.",
                optionA = "exports exceed imports",
                optionB = "visible exports exceed visible imports",
                optionC = "imports and exports are equal",
                optionD = "visible imports exceed visible exports",
                correctAnswerIndex = 3,
                explanation = "A deficit or unfavourable balance of trade occurs when the value of visible imports exceeds visible exports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_06",
                subject = "Commerce",
                topic = "International Trade",
                year = "PT. 3",
                questionText = "Trading position of Nigeria is the same as her _____.",
                optionA = "desire to trade with many countries",
                optionB = "willingness to grant credit to foreigners",
                optionC = "balance of trade",
                optionD = "terms of trade",
                correctAnswerIndex = 3,
                explanation = "The terms of trade describe a country's purchasing power and exchange position in international trade.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_07",
                subject = "Commerce",
                topic = "Customs & Excise",
                year = "PT. 3",
                questionText = "The role of customs and excise authority includes the _____.",
                optionA = "provision of a good transport system to facilitate imports and exports",
                optionB = "provision of security at the port",
                optionC = "control of the flow of goods in and out of the country",
                optionD = "provision of dockyards for ship repairs",
                correctAnswerIndex = 2,
                explanation = "The Customs Service regulates cross-border commodity flow, enforces trade tariffs, and intercepts prohibited contraband.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_08",
                subject = "Commerce",
                topic = "Shipping Documents",
                year = "PT. 3",
                questionText = "The document lodged with the customs authorities before a ship can leave the port is a _____.",
                optionA = "shipping note",
                optionB = "ship report",
                optionC = "ship manifest",
                optionD = "dock warrant",
                correctAnswerIndex = 2,
                explanation = "A ship manifest details the full cargo, crew, and destination presented to customs before sailing clearance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_09",
                subject = "Commerce",
                topic = "Shipping Documents",
                year = "PT. 3",
                questionText = "The document which must be endorsed by the ambassador of a country of destination before shipment of goods is a _____.",
                optionA = "consular invoice",
                optionB = "certificate of origin",
                optionC = "bill of lading",
                optionD = "close indent",
                correctAnswerIndex = 0,
                explanation = "A consular invoice is certified by the importing country's consul stationed in the exporting territory to verify values.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_10",
                subject = "Commerce",
                topic = "International Trade",
                year = "PT. 3",
                questionText = "A country's terms of trade are said to improve when the ratio of her export _____.",
                optionA = "decreases",
                optionB = "remains constant",
                optionC = "increases",
                optionD = "equals import",
                correctAnswerIndex = 2,
                explanation = "Terms of trade improve when export price indices rise relative to import price indices (export/import ratio increases).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_11",
                subject = "Commerce",
                topic = "Advertising Media",
                year = "PT. 3",
                questionText = "Which of the following advertising medium appeals to only the literate in the society?",
                optionA = "radio advertising",
                optionB = "print media advertising",
                optionC = "television advertising",
                optionD = "cinema advertising",
                correctAnswerIndex = 1,
                explanation = "Print media (newspapers, magazines, trade journals) requires literacy to read and comprehend the message.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_12",
                subject = "Commerce",
                topic = "Business Communication",
                year = "PT. 3",
                questionText = "The two main forms of communication are _____.",
                optionA = "oral and written",
                optionB = "verbal and non-verbal",
                optionC = "e-mail and fax",
                optionD = "traditional and modern media",
                correctAnswerIndex = 1,
                explanation = "Communication is classified into verbal communication (spoken or written words) and non-verbal communication (gestures, signs).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_13",
                subject = "Commerce",
                topic = "Communication",
                year = "PT. 3",
                questionText = "The most reliable and efficient means of conveying urgent documents is through _____.",
                optionA = "postal order",
                optionB = "ordinary letters",
                optionC = "registered letters",
                optionD = "courier services",
                correctAnswerIndex = 3,
                explanation = "Dedicated courier services provide tracked, prompt, door-to-door physical parcel and document dispatch.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_14",
                subject = "Commerce",
                topic = "Insurance",
                year = "PT. 3",
                questionText = "An undertaking given by a person to another assuring his integrity is _____.",
                optionA = "proximate cause",
                optionB = "fidelity guarantee",
                optionC = "subrogation",
                optionD = "insurable interest",
                correctAnswerIndex = 1,
                explanation = "Fidelity guarantee insurance protects employers against financial loss from employee dishonesty, fraud, or embezzlement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_15",
                subject = "Commerce",
                topic = "Insurance Calculations",
                year = "PT. 3",
                questionText = "If Mr. N takes a fire insurance policy with average clause on property valued at ₦100,000 for ₦25,000, and suffers an actual loss of ₦30,000, his compensation will be _____.",
                optionA = "₦5,000",
                optionB = "₦7,500",
                optionC = "₦70,000",
                optionD = "₦75,000",
                correctAnswerIndex = 1,
                explanation = "Under the Average Clause: Compensation = (Sum Insured / Actual Value) × Actual Loss = (₦25,000 / ₦100,000) × ₦30,000 = ₦7,500.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_16",
                subject = "Commerce",
                topic = "Insurance Principles",
                year = "PT. 3",
                questionText = "What insurance principle has Mr. P violated if he decides to overstate the actual value of his property?",
                optionA = "Indemnity",
                optionB = "Insurable interest",
                optionC = "Uberrimae fidei",
                optionD = "Subrogation",
                correctAnswerIndex = 2,
                explanation = "Uberrimae fidei (utmost good faith) requires full, accurate disclosure of all material facts without overstating values.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_17",
                subject = "Commerce",
                topic = "Insurance",
                year = "PT. 3",
                questionText = "The difference between indemnity insurance and non-indemnity insurance is that the latter provides _____.",
                optionA = "cover for exporters against risks",
                optionB = "cover for importers against risks",
                optionC = "full payment to the insured",
                optionD = "consolation payment to the insured",
                correctAnswerIndex = 2,
                explanation = "Non-indemnity policies (such as life and personal accident assurance) pay a fixed, pre-agreed sum on the occurrence of the event.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_18",
                subject = "Commerce",
                topic = "Warehousing",
                year = "PT. 3",
                questionText = "An importance of warehousing is in the _____.",
                optionA = "production of goods",
                optionB = "transportation of goods",
                optionC = "importation of goods",
                optionD = "repackaging of goods",
                correctAnswerIndex = 3,
                explanation = "Warehouses provide facilities for processing, grading, sorting, and repackaging goods before final marketing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_19",
                subject = "Commerce",
                topic = "Sole Proprietorship",
                year = "PT. 3",
                questionText = "In order to increase the capital owned, a sole trader may _____.",
                optionA = "seek for bank loan",
                optionB = "issue debentures",
                optionC = "acquire extra shop fittings on credit",
                optionD = "draw less of his profit for personal use",
                correctAnswerIndex = 3,
                explanation = "Retained earnings from reduced personal drawings directly increase the proprietor's owner equity and net worth.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_20",
                subject = "Commerce",
                topic = "Partnership",
                year = "PT. 3",
                questionText = "A business partner who provides capital but abstains from participation in administration of a firm is a _____.",
                optionA = "general partner",
                optionB = "nominal partner",
                optionC = "secret partner",
                optionD = "dormant partner",
                correctAnswerIndex = 3,
                explanation = "A dormant (sleeping) partner supplies capital and shares in profits/losses but takes no active part in business management.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_21",
                subject = "Commerce",
                topic = "Company Documents",
                year = "PT. 3",
                questionText = "Which of the following will not be stated in a Memorandum of Association?",
                optionA = "Name clause",
                optionB = "rights of shareholders",
                optionC = "object clause",
                optionD = "registered office",
                correctAnswerIndex = 1,
                explanation = "Shareholder rights, voting rules, and internal managerial regulations are detailed in the Articles of Association.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_22",
                subject = "Commerce",
                topic = "Corporate Capital",
                year = "PT. 3",
                questionText = "The amount of authorized capital that shareholders have subscribed to is _____.",
                optionA = "issued share capital",
                optionB = "authorized share capital",
                optionC = "owner's equity",
                optionD = "working capital",
                correctAnswerIndex = 0,
                explanation = "Issued (subscribed) capital represents the portion of authorized share capital agreed to be taken up by investors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_23",
                subject = "Commerce",
                topic = "Commercial Calculations",
                year = "PT. 3",
                questionText = "The rate of turnover of a firm in a given year is 5 times while the average stock is ₦12,500. What is the turnover of the firm?",
                optionA = "₦24,000",
                optionB = "₦46,500",
                optionC = "₦62,500",
                optionD = "₦65,000",
                correctAnswerIndex = 2,
                explanation = "Turnover = Rate of turnover × Average stock = 5 × ₦12,500 = ₦62,500.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_24",
                subject = "Commerce",
                topic = "Professional Associations",
                year = "PT. 3",
                questionText = "A lawyer that defrauds his client may be de-robed by the Nigerian Bar Association in order to _____.",
                optionA = "protect other lawyers",
                optionB = "protect the integrity of the association",
                optionC = "compensate the affected client",
                optionD = "prevent the client from suing the association",
                correctAnswerIndex = 1,
                explanation = "Professional disciplinary sanctions preserve ethical standards, public confidence, and institutional integrity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_25",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "PT. 3",
                questionText = "In the Nigerian GSM industry, a parliament is organized by the Nigerian Communications Commission in order to _____.",
                optionA = "increase profit of service providers",
                optionB = "protect the interest of government",
                optionC = "encourage more people into the business",
                optionD = "protect the interest of consumers",
                correctAnswerIndex = 3,
                explanation = "Consumer advocacy forums and telecoms consumer parliaments resolve grievances and safeguard consumer rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_26",
                subject = "Commerce",
                topic = "Chambers of Commerce",
                year = "PT. 3",
                questionText = "Trade fairs in Nigeria are organised by _____.",
                optionA = "the Federal Government",
                optionB = "Manufacturers' Association of Nigeria",
                optionC = "Ministry of Commerce and Industry",
                optionD = "Chambers of Commerce",
                correctAnswerIndex = 3,
                explanation = "Chambers of Commerce, Industry, Mines and Agriculture organize trade exhibitions and commercial fairs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_27",
                subject = "Commerce",
                topic = "Money and Banking",
                year = "PT. 3",
                questionText = "Money is generally accepted for transactions due to _____.",
                optionA = "the legal backing",
                optionB = "the rule of law",
                optionC = "its acceptability in the global market",
                optionD = "the Central Bank Governor's signature",
                correctAnswerIndex = 0,
                explanation = "Money is universally accepted because the state declares it legal tender with statutory backing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_28",
                subject = "Commerce",
                topic = "Qualities of Money",
                year = "PT. 3",
                questionText = "Which of the following is a quality of money?",
                optionA = "Availability",
                optionB = "Scarcity",
                optionC = "Indivisibility",
                optionD = "Convertibility",
                correctAnswerIndex = 1,
                explanation = "Scarcity (relative scarcity) ensures money retains purchasing power and does not lose value through excess abundance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_29",
                subject = "Commerce",
                topic = "Functions of Money",
                year = "PT. 3",
                questionText = "Money can simply be referred to as a _____.",
                optionA = "measure of value",
                optionB = "standard of value",
                optionC = "means of settlement",
                optionD = "durable asset for doing business",
                correctAnswerIndex = 2,
                explanation = "The fundamental economic role of money is serving as a recognized legal means of settling debts and transactions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_30",
                subject = "Commerce",
                topic = "Securities",
                year = "PT. 3",
                questionText = "Gilt-edged securities are issued mainly by _____.",
                optionA = "individuals",
                optionB = "non-governmental organisations",
                optionC = "Government",
                optionD = "multi-national companies",
                correctAnswerIndex = 2,
                explanation = "Gilt-edged securities are sovereign debt instruments issued by the Federal Government carrying virtually no risk of default.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_31",
                subject = "Commerce",
                topic = "Principles of Management",
                year = "PT. 3",
                questionText = "The initial function of a manager is _____.",
                optionA = "setting up an organisation",
                optionB = "coordinating",
                optionC = "planning",
                optionD = "provision of welfare package",
                correctAnswerIndex = 2,
                explanation = "Planning is the foundational management function determining objectives and mapping actions before execution begins.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_32",
                subject = "Commerce",
                topic = "Organizational Structure",
                year = "PT. 3",
                questionText = "The most suitable organizational structure for small or medium sized enterprises is _____.",
                optionA = "line structure",
                optionB = "staff structure",
                optionC = "committee structure",
                optionD = "functional structure",
                correctAnswerIndex = 0,
                explanation = "A line organizational structure provides direct, simple, unambiguous scalar authority well-suited to small firms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_33",
                subject = "Commerce",
                topic = "Management Authority",
                year = "PT. 3",
                questionText = "In a staff-authority relationship, the opinion of a specialist in one department to another is _____.",
                optionA = "a directive",
                optionB = "an advice",
                optionC = "a command",
                optionD = "a delegation",
                correctAnswerIndex = 1,
                explanation = "Staff authority has an advisory capacity; specialists counsel line managers without commanding execution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_34",
                subject = "Commerce",
                topic = "Business Management",
                year = "PT. 3",
                questionText = "Management of a business involves the development of ideas for the _____.",
                optionA = "distribution of goods and services that human wants",
                optionB = "transportation of goods and services that human wants",
                optionC = "transfer of title of ownership of goods and services to individuals",
                optionD = "production of goods and services that satisfy human needs",
                correctAnswerIndex = 3,
                explanation = "Business management harnesses resources to innovate, produce, and market utilities that fulfill human needs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_35",
                subject = "Commerce",
                topic = "Pricing Policies",
                year = "PT. 3",
                questionText = "Which of the following is used as a pricing policy?",
                optionA = "Packaging",
                optionB = "Market selection",
                optionC = "Labelling",
                optionD = "Market skimming",
                correctAnswerIndex = 3,
                explanation = "Market skimming charges high introductory prices to recover innovation costs from price-insensitive early adopters.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_36",
                subject = "Commerce",
                topic = "Marketing Management",
                year = "PT. 3",
                questionText = "The essential utility derived from the use of a product is known as _____.",
                optionA = "augmented benefit",
                optionB = "branded benefit",
                optionC = "core benefit",
                optionD = "formal benefit",
                correctAnswerIndex = 2,
                explanation = "The core benefit is the fundamental service or solution the customer is actually purchasing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_37",
                subject = "Commerce",
                topic = "Market Segmentation",
                year = "PT. 3",
                questionText = "The breaking down of a market into separate and identifiable elements is known as _____.",
                optionA = "differentiation",
                optionB = "segmentation",
                optionC = "skimming",
                optionD = "penetration",
                correctAnswerIndex = 1,
                explanation = "Market segmentation divides a broad consumer market into sub-groups sharing similar needs or characteristics.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_38",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "PT. 3",
                questionText = "A contract that is acknowledged before the law court is referred to as _____.",
                optionA = "informal contract",
                optionB = "formal contract",
                optionC = "contract of records",
                optionD = "specialty contract",
                correctAnswerIndex = 2,
                explanation = "A contract of record is an obligation confirmed by a court of law (e.g. judgment debts, recognizances).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_39",
                subject = "Commerce",
                topic = "Law of Agency",
                year = "PT. 3",
                questionText = "An agent employed to sell goods delivered to him by the principal is referred to as a _____.",
                optionA = "special agent",
                optionB = "del credere agent",
                optionC = "factor",
                optionD = "universal agent",
                correctAnswerIndex = 2,
                explanation = "A factor is an agent entrusted with possession and control of goods with authority to sell them in their own name.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_40",
                subject = "Commerce",
                topic = "Discharge of Contract",
                year = "PT. 3",
                questionText = "A motor dealer who agreed to sell a car to Mr. X but delivered it to Mr. Y on the delivery date agreed with Mr. X has discharged the contract by _____.",
                optionA = "performance",
                optionB = "frustration",
                optionC = "an agreement",
                optionD = "breach",
                correctAnswerIndex = 3,
                explanation = "Failing to deliver agreed subject matter to the buyer constitutes an actionable repudiation and fundamental breach.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_41",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "PT. 3",
                questionText = "A contract can be terminated through _____.",
                optionA = "physical combat",
                optionB = "family intervention",
                optionC = "frustration",
                optionD = "consultation",
                correctAnswerIndex = 2,
                explanation = "A contract terminates by frustration when unforeseen external circumstances render performance legally or physically impossible.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_42",
                subject = "Commerce",
                topic = "Sale of Goods",
                year = "PT. 3",
                questionText = "The right to retain possession of goods until the contract price is paid is referred to as _____.",
                optionA = "a promise",
                optionB = "ultra vires",
                optionC = "a breach",
                optionD = "a lien",
                correctAnswerIndex = 3,
                explanation = "A possessory lien entitles a seller to hold goods as security until full purchase payment is satisfied.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_43",
                subject = "Commerce",
                topic = "Intellectual Property",
                year = "PT. 3",
                questionText = "The sole legal right held by the author to publish his book is _____.",
                optionA = "trademark",
                optionB = "copyright",
                optionC = "patent right",
                optionD = "bookmark",
                correctAnswerIndex = 1,
                explanation = "Copyright grants exclusive statutory protection to authors of original literary, musical, and artistic works.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_44",
                subject = "Commerce",
                topic = "Computer Networks",
                year = "PT. 3",
                questionText = "The process of transferring data from one computer to another is referred to as _____.",
                optionA = "downloading",
                optionB = "faxing",
                optionC = "browsing",
                optionD = "decoding",
                correctAnswerIndex = 0,
                explanation = "Downloading copies digital files from a remote server or host computer to a local computer terminal.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_45",
                subject = "Commerce",
                topic = "Computer Systems",
                year = "PT. 3",
                questionText = "The physical component of a computer system is _____.",
                optionA = "software",
                optionB = "hardware",
                optionC = "hard disk",
                optionD = "floppy disk",
                correctAnswerIndex = 1,
                explanation = "Hardware encompasses all physical circuitry, peripheral devices, and mechanical units of a computer.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_46",
                subject = "Commerce",
                topic = "Computer Storage",
                year = "PT. 3",
                questionText = "A computer accessory through which information can be retrieved is the _____.",
                optionA = "hard disk",
                optionB = "input device",
                optionC = "control unit",
                optionD = "floppy disk",
                correctAnswerIndex = 0,
                explanation = "A hard disk is a permanent secondary storage medium from which recorded data and software files are retrieved.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_47",
                subject = "Commerce",
                topic = "Business Applications",
                year = "PT. 3",
                questionText = "The type of computer software used mainly for management information is _____.",
                optionA = "Corel draw",
                optionB = "AutoCAD",
                optionC = "database",
                optionD = "word perfect",
                correctAnswerIndex = 2,
                explanation = "Database management systems (DBMS) organize, process, and query large datasets for executive information.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_48",
                subject = "Commerce",
                topic = "Computer Security",
                year = "PT. 3",
                questionText = "To meet security requirements before gaining access to data, a computer operator supplies _____.",
                optionA = "an e-mail address",
                optionB = "a yahoo address",
                optionC = "a password",
                optionD = "a modem",
                correctAnswerIndex = 2,
                explanation = "Passwords verify user identity and enforce access authentication across computer networks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_49",
                subject = "Commerce",
                topic = "Business Environment",
                year = "PT. 3",
                questionText = "A major factor that affects business operations is _____.",
                optionA = "technology",
                optionB = "supply",
                optionC = "product",
                optionD = "rivalry",
                correctAnswerIndex = 0,
                explanation = "Technological innovations rapidly transform production techniques, delivery channels, and business models.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt3_50",
                subject = "Commerce",
                topic = "Environmental Hazards",
                year = "PT. 3",
                questionText = "The environmental hazard that is most difficult to control is _____.",
                optionA = "land pollution",
                optionB = "water pollution",
                optionC = "air pollution",
                optionD = "political unrest",
                correctAnswerIndex = 2,
                explanation = "Air pollution disperses rapidly and across international atmospheric boundaries, making it exceptionally difficult to contain.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.3 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_01",
                subject = "Commerce",
                topic = "General Introduction",
                year = "PT. 4",
                questionText = "Which paper type of commerce is given to you?",
                optionA = "Type F",
                optionB = "Type E",
                optionC = "Type L",
                optionD = "Type S",
                correctAnswerIndex = 2,
                explanation = "JAMB examination instructions require verification of question paper type.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_02",
                subject = "Commerce",
                topic = "Importance of Commerce",
                year = "PT. 4",
                questionText = "Cooperation and friendliness are enhanced among nations through interdependence necessitated by _____.",
                optionA = "tourism",
                optionB = "commerce",
                optionC = "agriculture",
                optionD = "socio-cultural activities",
                correctAnswerIndex = 1,
                explanation = "International commerce links nations together in mutual economic interdependence and diplomatic goodwill.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_03",
                subject = "Commerce",
                topic = "Industry",
                year = "PT. 4",
                questionText = "One of the products of an extractive industry is _____.",
                optionA = "an airplane",
                optionB = "an iron ore",
                optionC = "a shoe",
                optionD = "a textile material",
                correctAnswerIndex = 1,
                explanation = "Iron ore is mined directly from natural mineral deposits, representing primary extractive output.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_04",
                subject = "Commerce",
                topic = "Occupations",
                year = "PT. 4",
                questionText = "The payment for direct service is usually made by the _____.",
                optionA = "local authority",
                optionB = "community",
                optionC = "government",
                optionD = "individual",
                correctAnswerIndex = 3,
                explanation = "Direct personal services (domestic staff, barbers, private tutors) are paid directly by individual consumers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_05",
                subject = "Commerce",
                topic = "Factors of Production",
                year = "PT. 4",
                questionText = "An important feature of land is that it _____.",
                optionA = "has an elastic supply",
                optionB = "is an active factor of production",
                optionC = "is heterogeneous in nature",
                optionD = "is subject to returns to scale",
                correctAnswerIndex = 2,
                explanation = "Land is heterogeneous, non-reproducible, and varies widely in fertility, location, and mineral content.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_06",
                subject = "Commerce",
                topic = "Production",
                year = "PT. 4",
                questionText = "One of the major determinants of the volume of production is _____.",
                optionA = "the market size",
                optionB = "the availability of banks",
                optionC = "sex distribution",
                optionD = "government policy",
                correctAnswerIndex = 0,
                explanation = "The extent of effective market demand and population size determines the profitable volume of production.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_07",
                subject = "Commerce",
                topic = "Occupations",
                year = "PT. 4",
                questionText = "Mrs. Jones who lives in the riverine community of Rivers State makes her living through crabbing and fishing. This type of occupation she is in is _____.",
                optionA = "commercial",
                optionB = "manufacturing",
                optionC = "service",
                optionD = "extractive",
                correctAnswerIndex = 3,
                explanation = "Fishing and crabbing extract living biological resources directly from water bodies, constituting extractive occupation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_08",
                subject = "Commerce",
                topic = "Cooperative Societies",
                year = "PT. 4",
                questionText = "To eliminate middlemen, there should be a retail outlet such as _____.",
                optionA = "producer co-operative",
                optionB = "consumer co-operative",
                optionC = "multiple shop",
                optionD = "departmental store",
                correctAnswerIndex = 1,
                explanation = "Consumer cooperative societies purchase directly from producers in bulk and sell to member consumers at cost price, bypassing middlemen.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_09",
                subject = "Commerce",
                topic = "Warehousing Documents",
                year = "PT. 4",
                questionText = "The document issued by a port authority for goods deposited is a _____.",
                optionA = "bill of lading",
                optionB = "bill of sight",
                optionC = "consular invoice",
                optionD = "warehouse warrant",
                correctAnswerIndex = 3,
                explanation = "A warehouse warrant certifies title to specified goods deposited in a bonded or port warehouse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_10",
                subject = "Commerce",
                topic = "Customs Documents",
                year = "PT. 4",
                questionText = "The document submitted to the customs authority when full description of imported goods is not provided is _____.",
                optionA = "a bill of sight",
                optionB = "an invoice",
                optionC = "an indent",
                optionD = "a bill of entry",
                correctAnswerIndex = 0,
                explanation = "A bill of sight allows importers to examine landed cargo in the presence of customs officials when shipping invoices are incomplete.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_11",
                subject = "Commerce",
                topic = "Customs & Excise",
                year = "PT. 4",
                questionText = "The role of customs and excise authority includes the _____.",
                optionA = "control of the flow of goods in and out of the country",
                optionB = "control of security agents within and out of the borders",
                optionC = "provision of dockyards for ship repairs and maintenance",
                optionD = "provision of transport system to facilitate imports and exports",
                correctAnswerIndex = 0,
                explanation = "Customs authorities monitor import/export flows, levy tariffs, prevent smuggling, and enforce trade bans.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_12",
                subject = "Commerce",
                topic = "Trade Documents",
                year = "PT. 4",
                questionText = "A document recording the transactions of an organization with its customer for a specified period which normally shows the indebtedness of one to the other is a _____.",
                optionA = "statement of account",
                optionB = "consular invoice",
                optionC = "proforma invoice",
                optionD = "statement of affairs",
                correctAnswerIndex = 0,
                explanation = "A statement of account summarizes all debit and credit entries between a merchant and customer over a billing period.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_13",
                subject = "Commerce",
                topic = "Terms of Trade",
                year = "PT. 4",
                questionText = "In response to an inquiry from a customer, a wholesaler is expected to send back _____.",
                optionA = "a consignment note",
                optionB = "an order",
                optionC = "a quotation",
                optionD = "an advice note",
                correctAnswerIndex = 2,
                explanation = "A quotation states prices, delivery periods, discount terms, and conditions in response to a customer's trade enquiry.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_14",
                subject = "Commerce",
                topic = "Commercial Documents",
                year = "PT. 4",
                questionText = "A carton of noodles valued at ₦2,000 was invoiced at ₦200 only. The accounting procedure to correct this error is to issue _____.",
                optionA = "an invoice for ₦200",
                optionB = "a debit note for ₦2,000",
                optionC = "a credit note for ₦1,800",
                optionD = "a debit note for ₦1,800",
                correctAnswerIndex = 3,
                explanation = "A debit note is issued to charge the buyer for the undercharged difference (₦2,000 - ₦200 = ₦1,800).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_15",
                subject = "Commerce",
                topic = "Postal Services",
                year = "PT. 4",
                questionText = "Tourists with no fixed address in a town may receive their letters from post office through a _____.",
                optionA = "poste restante",
                optionB = "parcel post",
                optionC = "private mail bag",
                optionD = "recorded delivery",
                correctAnswerIndex = 0,
                explanation = "Poste restante holds transient mail at a designated post office until collected in person by travelers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_16",
                subject = "Commerce",
                topic = "Life Assurance",
                year = "PT. 4",
                questionText = "Endowment policy in insurance business is an aspect of _____.",
                optionA = "accident insurance policy",
                optionB = "fidelity guarantee insurance policy",
                optionC = "motor vehicle insurance policy",
                optionD = "life assurance policy",
                correctAnswerIndex = 3,
                explanation = "An endowment policy is a life assurance contract that pays a fixed capital sum either on a specified maturity date or at prior death.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_17",
                subject = "Commerce",
                topic = "Insurance",
                year = "PT. 4",
                questionText = "Insurance against burglary is an example of _____.",
                optionA = "indemnity insurance",
                optionB = "fidelity guarantee insurance",
                optionC = "non-insurable risk",
                optionD = "non-indemnity insurance",
                correctAnswerIndex = 0,
                explanation = "Property and burglary covers are indemnity contracts restoring the policyholder to their pre-loss financial position.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_18",
                subject = "Commerce",
                topic = "Insurance Principles",
                year = "PT. 4",
                questionText = "The principle which requires the insurance company to disclose to the proposer all material facts of the risk to be covered is _____.",
                optionA = "subrogation",
                optionB = "proximate cause",
                optionC = "uberrimae fidei",
                optionD = "contribution",
                correctAnswerIndex = 2,
                explanation = "Uberrimae fidei mandates complete good faith and transparent disclosure of all material risk details by both parties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_19",
                subject = "Commerce",
                topic = "Insurance Principles",
                year = "PT. 4",
                questionText = "The insurance principle that allows an insurance company to take over the rights of the insured once he has been compensated is _____.",
                optionA = "indemnity",
                optionB = "proximate cause",
                optionC = "utmost good faith",
                optionD = "subrogation",
                correctAnswerIndex = 3,
                explanation = "Subrogation prevents double recovery by allowing the insurer to pursue third-party wrongdoers after settling the claim.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_20",
                subject = "Commerce",
                topic = "Insurance",
                year = "PT. 4",
                questionText = "A trader who experienced loss through fire can be restored by _____.",
                optionA = "an insurance company",
                optionB = "a trade association",
                optionC = "the bank",
                optionD = "an advertising agency",
                correctAnswerIndex = 0,
                explanation = "A fire insurance policy indemnifies the property owner against actual damage caused by accidental conflagration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_21",
                subject = "Commerce",
                topic = "Transportation",
                year = "PT. 4",
                questionText = "The distribution of petroleum products in Nigeria is predominantly handled through _____.",
                optionA = "rail",
                optionB = "road",
                optionC = "sea",
                optionD = "air",
                correctAnswerIndex = 1,
                explanation = "In Nigeria, road transport via tanker haulage carries the overwhelming share of distributed refined petroleum.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_22",
                subject = "Commerce",
                topic = "Marine Insurance",
                year = "PT. 4",
                questionText = "The deliberate effort geared towards discarding some cargoes in order to lighten the vessel is _____.",
                optionA = "caveat emptor",
                optionB = "uberrimae fidei",
                optionC = "demurrage",
                optionD = "jettison",
                correctAnswerIndex = 3,
                explanation = "Jettison is the intentional throwing overboard of cargo to lighten a ship in danger of distress or sinking.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_23",
                subject = "Commerce",
                topic = "Public Corporations",
                year = "PT. 4",
                questionText = "The major aim of establishing a public corporation is to _____.",
                optionA = "establish a monopoly",
                optionB = "provide essential services",
                optionC = "provide employment opportunities",
                optionD = "encourage specialization",
                correctAnswerIndex = 1,
                explanation = "Public corporations provide critical social utilities (water, power, sanitation) on a non-profit-maximizing basis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_24",
                subject = "Commerce",
                topic = "Business Combinations",
                year = "PT. 4",
                questionText = "The coming together of a manufacturing business with a firm that markets its products is _____.",
                optionA = "backward integration",
                optionB = "a consortium",
                optionC = "forward integration",
                optionD = "a syndicate",
                correctAnswerIndex = 2,
                explanation = "Forward vertical integration unites a manufacturer with downstream distributors or retail outlets.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_25",
                subject = "Commerce",
                topic = "Business Combinations",
                year = "PT. 4",
                questionText = "An association of voluntary organizations that work together for a common aim while retaining their independence is a _____.",
                optionA = "syndicate",
                optionB = "merger",
                optionC = "cartel",
                optionD = "consortium",
                correctAnswerIndex = 3,
                explanation = "A consortium associates independent enterprises for a joint commercial undertaking without loss of corporate identity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_26",
                subject = "Commerce",
                topic = "Company Documents",
                year = "PT. 4",
                questionText = "The document that explains the types of shares available for sale to the public is _____.",
                optionA = "a prospectus",
                optionB = "an invoice",
                optionC = "an open indent",
                optionD = "a closed indent",
                correctAnswerIndex = 0,
                explanation = "A prospectus is a legal notice issued by a public company inviting subscriptions for shares or debentures.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_27",
                subject = "Commerce",
                topic = "Securities",
                year = "PT. 4",
                questionText = "Which of the following attracts only interest but leaves the capital unpaid?",
                optionA = "a long-term loan",
                optionB = "a development bond",
                optionC = "a redeemable bond",
                optionD = "an irredeemable bond",
                correctAnswerIndex = 3,
                explanation = "Irredeemable (perpetual) bonds pay regular coupon interest indefinitely without returning the principal sum.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_28",
                subject = "Commerce",
                topic = "Commercial Banking",
                year = "PT. 4",
                questionText = "A loan to a customer with a cheque account at a bank in which the account is allowed to go into debit is _____.",
                optionA = "overdraft",
                optionB = "advance",
                optionC = "interest",
                optionD = "commission",
                correctAnswerIndex = 0,
                explanation = "An overdraft permits a current account holder to draw funds exceeding their credit balance up to an agreed limit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_29",
                subject = "Commerce",
                topic = "Corporate Finance",
                year = "PT. 4",
                questionText = "Part payments made on allotted shares by subscribers is usually the _____.",
                optionA = "subscribed capital",
                optionB = "authorized capital",
                optionC = "issued capital",
                optionD = "called-up capital",
                correctAnswerIndex = 3,
                explanation = "Called-up capital represents the sum requested by the company to be paid up on allotted shares.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_30",
                subject = "Commerce",
                topic = "Trading and Profit & Loss",
                year = "PT. 4",
                questionText = "The net profit is the excess of gross profit and sources of income over all the expenses. This implies that net profit is _____.",
                optionA = "the difference between gross profit and trade expenses",
                optionB = "the difference between gross profit and net sales",
                optionC = "sales less cost of sales including sales returns",
                optionD = "opening stock add purchases less closing stock",
                correctAnswerIndex = 0,
                explanation = "Net profit is calculated by deducting operating and general business expenses from gross profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_31",
                subject = "Commerce",
                topic = "Money",
                year = "PT. 4",
                questionText = "A form of money with face value which is greater than the value of the metal content is _____.",
                optionA = "legal tender",
                optionB = "bank notes",
                optionC = "token money",
                optionD = "commodity money",
                correctAnswerIndex = 2,
                explanation = "Token money has an intrinsic metallic commodity value far below its legally declared face value.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_32",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "PT. 4",
                questionText = "An agent who transacts business with the broker in the stock exchange is a _____.",
                optionA = "stag",
                optionB = "bull",
                optionC = "del credere",
                optionD = "jobber",
                correctAnswerIndex = 3,
                explanation = "Stock jobbers are market makers who deal in securities on the exchange floor exclusively with stockbrokers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_33",
                subject = "Commerce",
                topic = "Stock Exchange Documents",
                year = "PT. 4",
                questionText = "A document sent by a broker to his client to confirm a purchase of sale made on his behalf is _____.",
                optionA = "delivery note",
                optionB = "consignment note",
                optionC = "transfer form",
                optionD = "contract note",
                correctAnswerIndex = 3,
                explanation = "A contract note specifies prices, fees, and settlement terms of stock transactions executed for the client.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_34",
                subject = "Commerce",
                topic = "Stock Terms",
                year = "PT. 4",
                questionText = "Cum div differs from ex div in that, the latter _____.",
                optionA = "entitles the purchaser to receive a company's current dividend",
                optionB = "entitles the vendor to receive a company's current dividend",
                optionC = "confirms a purchase or sale made on behalf of a share holder",
                optionD = "is a document used to transfer ownership of shares",
                correctAnswerIndex = 1,
                explanation = "When shares trade 'ex div' (excluding dividend), the seller (vendor) retains the declared dividend distribution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_35",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "PT. 4",
                questionText = "The payment made by a speculator to the buyer when he is unable to deliver stocks on the agreed date is _____.",
                optionA = "arbitrage",
                optionB = "Franco",
                optionC = "contango",
                optionD = "backwardation",
                correctAnswerIndex = 3,
                explanation = "Backwardation is a penalty fee paid by a seller unable to deliver shares on the settlement date to postpone delivery.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_36",
                subject = "Commerce",
                topic = "Capital Market Regulation",
                year = "PT. 4",
                questionText = "Which of the following regulates and controls the activities in the Nigerian Stock Exchange?",
                optionA = "BPE",
                optionB = "SEC",
                optionC = "NDIC",
                optionD = "CBN",
                correctAnswerIndex = 1,
                explanation = "The Securities and Exchange Commission (SEC) is the apex regulatory agency overseeing the Nigerian capital market.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_37",
                subject = "Commerce",
                topic = "Principles of Management",
                year = "PT. 4",
                questionText = "The principle of management that emphasizes on the number of subordinates under the direct supervision of a manager is _____.",
                optionA = "span of control",
                optionB = "unity of command",
                optionC = "scalar chain",
                optionD = "unity of direction",
                correctAnswerIndex = 0,
                explanation = "Span of control defines the optimal number of subordinates reporting directly to a single executive supervisor.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_38",
                subject = "Commerce",
                topic = "Marketing vs Selling",
                year = "PT. 4",
                questionText = "Marketing differs from selling in that, the latter only creates _____.",
                optionA = "possession utility",
                optionB = "marginal utility",
                optionC = "form utility",
                optionD = "place utility",
                correctAnswerIndex = 0,
                explanation = "Selling focuses narrowly on transferring ownership (possession utility), whereas marketing encompasses product creation, pricing, and placement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_39",
                subject = "Commerce",
                topic = "Marketing Concepts",
                year = "PT. 4",
                questionText = "A business that focuses attention on the quality of the goods produced by precisely knowing what the consumers desire is said to be operating the _____.",
                optionA = "product mix",
                optionB = "promotion mix",
                optionC = "marketing concept",
                optionD = "product orientation",
                correctAnswerIndex = 2,
                explanation = "The marketing concept aligns production with verified consumer desires, tastes, and expectations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_40",
                subject = "Commerce",
                topic = "Product Mix",
                year = "PT. 4",
                questionText = "The physical and psychological satisfaction a customer derives from the purchase of goods and services is _____.",
                optionA = "price mix",
                optionB = "product mix",
                optionC = "marketing mix",
                optionD = "promotion mix",
                correctAnswerIndex = 1,
                explanation = "The total product concept encompasses both functional performance and psychological consumer satisfactions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_41",
                subject = "Commerce",
                topic = "Sales Promotion",
                year = "PT. 4",
                questionText = "Which of the following aspects of marketing stimulates buying by providing free gifts?",
                optionA = "personal selling",
                optionB = "sales promotion",
                optionC = "advertising",
                optionD = "publicity",
                correctAnswerIndex = 1,
                explanation = "Sales promotion incorporates promotional incentives like premiums, contest prizes, and free samples.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_42",
                subject = "Commerce",
                topic = "Pricing Strategies",
                year = "PT. 4",
                questionText = "Which of the following is used as pricing policy?",
                optionA = "labelling",
                optionB = "packaging",
                optionC = "market selection",
                optionD = "market skimming",
                correctAnswerIndex = 3,
                explanation = "Market skimming is a strategic pricing mechanism recovering developmental expenditure from premium buyers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_43",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "PT. 4",
                questionText = "Mr. Taiwo entered into a contract to let a car to Mr. Bunmi for his wedding for two days. However, the car had an accident before the first day. Mr. Bunmi attempted to claim damages but failed. This implies the contract was terminated by _____.",
                optionA = "bankruptcy",
                optionB = "frustration",
                optionC = "breach",
                optionD = "lapse of time",
                correctAnswerIndex = 1,
                explanation = "Destruction of the essential subject matter without fault of either party discharges the agreement by frustration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_44",
                subject = "Commerce",
                topic = "Hire Purchase",
                year = "PT. 4",
                questionText = "Hire purchase is advantageous to the seller in that _____.",
                optionA = "it elevates his living standard",
                optionB = "his turnover will increase",
                optionC = "people pay in instalment",
                optionD = "it enhances high level of patronage",
                correctAnswerIndex = 1,
                explanation = "Permitting deferred payments broadens customer purchasing power, substantially expanding the seller's turnover.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_45",
                subject = "Commerce",
                topic = "Law of Agency",
                year = "PT. 4",
                questionText = "The difference between a factor and a broker is that the former _____.",
                optionA = "is licensed to sell goods on auction",
                optionB = "has a lien on the goods he possesses",
                optionC = "is not in possession of the goods",
                optionD = "cannot sell in his own name",
                correctAnswerIndex = 1,
                explanation = "A factor takes physical possession of merchandise and therefore enjoys an enforceable possessory lien for fees.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_46",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "PT. 4",
                questionText = "A contract which is devoid of legal effect is _____.",
                optionA = "void contract",
                optionB = "unenforceable contract",
                optionC = "voidable contract",
                optionD = "valid contract",
                correctAnswerIndex = 0,
                explanation = "A void contract is destitute of legal effect ab initio and confers no enforceable rights upon either party.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_47",
                subject = "Commerce",
                topic = "Computer Systems",
                year = "PT. 4",
                questionText = "The three functional units of a modern computer are _____.",
                optionA = "input, processor and output units",
                optionB = "processor, FORTRAN and output units",
                optionC = "black box, output and input units",
                optionD = "basic, COBOL and output units",
                correctAnswerIndex = 0,
                explanation = "Computer system architecture consists of Input Units, the Central Processing Unit, and Output Units.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_48",
                subject = "Commerce",
                topic = "Types of Computers",
                year = "PT. 4",
                questionText = "Which of the following computers can be used in weather forecast?",
                optionA = "Hybrid computer",
                optionB = "Digital computer",
                optionC = "Mainframe computer",
                optionD = "Analog computer",
                correctAnswerIndex = 0,
                explanation = "Hybrid computers combine analog sensors (measuring continuous temperatures/pressures) with digital computing speed.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_49",
                subject = "Commerce",
                topic = "Computer Hardware",
                year = "PT. 4",
                questionText = "A Digital Versatile Disk is an example of a _____.",
                optionA = "transmission control protocol",
                optionB = "microprocessor",
                optionC = "file transfer protocol",
                optionD = "computer storage device",
                correctAnswerIndex = 3,
                explanation = "A Digital Versatile Disk (DVD) is an optical secondary data storage device.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt4_50",
                subject = "Commerce",
                topic = "Corporate Social Responsibility",
                year = "PT. 4",
                questionText = "The social responsibility factor of an organization is geared towards _____.",
                optionA = "contributing to the sustenance and development of its host community",
                optionB = "operating without disrupting the very essence of the environment",
                optionC = "tackling the socio-economic problems of the state",
                optionD = "meeting the needs and demands of the shareholders",
                correctAnswerIndex = 0,
                explanation = "Corporate social responsibility focuses heavily on advancing the socio-economic welfare of host communities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.4 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_01",
                subject = "Commerce",
                topic = "Trade Documents",
                year = "PT. 5",
                questionText = "A proforma invoice is not required when _____.",
                optionA = "dealing regularly with a customer",
                optionB = "quoting for the supply of goods",
                optionC = "goods are sent on approval",
                optionD = "final prices are uncertain",
                correctAnswerIndex = 0,
                explanation = "Regular customers with established credit lines receive normal sales invoices rather than proforma estimates.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_02",
                subject = "Commerce",
                topic = "Company Law",
                year = "PT. 5",
                questionText = "A distinguishing characteristic of a limited liability company is that _____.",
                optionA = "is a collection of many sole proprietors",
                optionB = "can sue and be sued",
                optionC = "is a multiple partnership",
                optionD = "has limited resources",
                correctAnswerIndex = 1,
                explanation = "Incorporation confers separate legal personality (Salomon v Salomon), allowing the company to sue and be sued in its corporate name.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_03",
                subject = "Commerce",
                topic = "Industry",
                year = "PT. 5",
                questionText = "Construction activities include the building of houses and roads as well as _____.",
                optionA = "shoe-making",
                optionB = "black smithing",
                optionC = "brick laying",
                optionD = "car assembling",
                correctAnswerIndex = 2,
                explanation = "Bricklaying is an integral craft in construction operations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_04",
                subject = "Commerce",
                topic = "Company Documents",
                year = "PT. 5",
                questionText = "Which of the following information is contained in the Articles of Association of a limited liability company?",
                optionA = "Objectives of the company",
                optionB = "Rights and obligations of directors",
                optionC = "Amount of share capital",
                optionD = "Limitation of liability of share holders",
                correctAnswerIndex = 1,
                explanation = "The Articles of Association govern internal management, directors' powers, and shareholder voting procedures.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_05",
                subject = "Commerce",
                topic = "History of Commerce in Nigeria",
                year = "PT. 5",
                questionText = "Which of the following contributed least to the evolution of commercial activities in Nigeria?",
                optionA = "Development of banks",
                optionB = "Development of transportation",
                optionC = "Development of currencies",
                optionD = "Development of trader's union",
                correctAnswerIndex = 3,
                explanation = "Traders' unions regulate local retail disputes but played a minor role compared to modern banking, currencies, and transport systems.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_06",
                subject = "Commerce",
                topic = "Occupations",
                year = "PT. 5",
                questionText = "One of the factors which critically determines the choice of occupation is _____.",
                optionA = "skill",
                optionB = "training",
                optionC = "interest",
                optionD = "aptitude",
                correctAnswerIndex = 0,
                explanation = "Specialized vocational skill is the decisive qualification governing occupational eligibility.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_07",
                subject = "Commerce",
                topic = "Postal Services",
                year = "PT. 5",
                questionText = "Tourists with no fixed address in a town may receive letters from the post office through _____.",
                optionA = "poste restante",
                optionB = "recorded delivery",
                optionC = "post master",
                optionD = "parcel post",
                correctAnswerIndex = 0,
                explanation = "Poste restante allows travelers to receive general delivery mail held at the central post office.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_08",
                subject = "Commerce",
                topic = "Company Finance",
                year = "PT. 5",
                questionText = "On liquidation of a public limited liability company, the residual owners are the _____.",
                optionA = "debenture holders",
                optionB = "creditors",
                optionC = "preference shareholders",
                optionD = "ordinary shareholders",
                correctAnswerIndex = 3,
                explanation = "Ordinary shareholders bear residual risk and receive whatever surplus assets remain after all debts and preference claims are settled.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_09",
                subject = "Commerce",
                topic = "Aids to Trade",
                year = "PT. 5",
                questionText = "The major factors that facilitate merchandising are _____.",
                optionA = "banking, insurance and transportation",
                optionB = "management, insurance, and advertising",
                optionC = "communication, advertising, and banking",
                optionD = "trading, warehousing and production",
                correctAnswerIndex = 0,
                explanation = "Banking (finance), insurance (protection), and transportation (movement) are the core aids supporting merchandising.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_10",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "PT. 5",
                questionText = "The pivot on which the wheel of commerce rotates is _____.",
                optionA = "tariff",
                optionB = "taxation",
                optionC = "price",
                optionD = "trade",
                correctAnswerIndex = 3,
                explanation = "Trade—the buying and selling of goods—is the core axis around which all commercial auxiliary services revolve.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_11",
                subject = "Commerce",
                topic = "Trade Procedures",
                year = "PT. 5",
                questionText = "The major procedures in the purchase and sale of goods are enquiry _____.",
                optionA = "order, sale and invoice",
                optionB = "quotation, order and invoice",
                optionC = "placement, order and invoice",
                optionD = "bargain, order and invoice.",
                correctAnswerIndex = 1,
                explanation = "Standard trade transactions progress through Enquiry -> Quotation -> Order -> Invoice -> Delivery -> Receipt.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_12",
                subject = "Commerce",
                topic = "Hire Purchase",
                year = "PT. 5",
                questionText = "An advantage of hire purchase to the customer is the _____.",
                optionA = "low interest rate chargeable",
                optionB = "increase in turnover and profits",
                optionC = "economics of scale in production",
                optionD = "possession of goods before payment",
                correctAnswerIndex = 3,
                explanation = "Hire purchase allows buyers immediate physical possession and utility of valuable assets while paying in installments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_13",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "PT. 5",
                questionText = "The agency in Nigeria which ensures that products confirm to government quality specifications is the _____.",
                optionA = "Nigerian Consumers Association",
                optionB = "Standards Organization of Nigeria",
                optionC = "Nigerian Chamber of Commerce",
                optionD = "Manufacturer's Association of Nigeria",
                correctAnswerIndex = 1,
                explanation = "The Standards Organisation of Nigeria (SON) enforces mandatory industrial quality standards and product certifications.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_14",
                subject = "Commerce",
                topic = "Computer Languages",
                year = "PT. 5",
                questionText = "The most widely used computer language that focuses on solving science oriented problems is _____.",
                optionA = "COBOL",
                optionB = "ADA",
                optionC = "BASIC",
                optionD = "FORTRAN",
                correctAnswerIndex = 3,
                explanation = "FORTRAN (Formula Translation) was developed specifically for complex numeric, mathematical, and scientific computing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_15",
                subject = "Commerce",
                topic = "Business Finance",
                year = "PT. 5",
                questionText = "An essential factor for evaluating the different sources of funds for a business is the _____.",
                optionA = "ownership structure of the business concern",
                optionB = "burden of cost and repayment",
                optionC = "size and the type of the business",
                optionD = "decree establishing the business",
                correctAnswerIndex = 1,
                explanation = "Management must evaluate the interest burden, security pledges, and cash flow strain imposed by repayment schedules.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_16",
                subject = "Commerce",
                topic = "Capital Market",
                year = "PT. 5",
                questionText = "In the primary market, new shares are issued through _____.",
                optionA = "personal selling, publicity and advertising",
                optionB = "advertising, a prospectus and a bill of exchange",
                optionC = "a prospectus, an offer for sale and placing",
                optionD = "a prospectus, offer for sale and a bill of exchange",
                correctAnswerIndex = 2,
                explanation = "Primary issues are floated through public offers with a prospectus, offers for sale, private placements, or rights issues.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_17",
                subject = "Commerce",
                topic = "Public Policy",
                year = "PT. 5",
                questionText = "One of the advantages of commercialization is that it _____.",
                optionA = "increases the salaries of workers",
                optionB = "encourages entrepreneurship",
                optionC = "gives workers on-the-job training",
                optionD = "motivates government to establish more business",
                correctAnswerIndex = 1,
                explanation = "Commercialization makes state enterprises operate on private commercial principles, stimulating efficiency and enterprise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_18",
                subject = "Commerce",
                topic = "Accounting Calculations",
                year = "PT. 5",
                questionText = "Given: Sales ₦15,000, Opening stock ₦5,600, Purchases ₦9,700, Closing stock ₦4,400, Gross profit ₦4,500, Net profit ₦2,000. Calculate the rate of turnover.",
                optionA = "2.18 times",
                optionB = "3.50 times",
                optionC = "3.00 times",
                optionD = "2.00 times",
                correctAnswerIndex = 0,
                explanation = "Cost of Goods Sold = 5,600 + 9,700 - 4,400 = ₦10,900. Average Stock = (5,600 + 4,400) / 2 = ₦5,000. Rate of turnover = 10,900 / 5,000 = 2.18 times.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_19",
                subject = "Commerce",
                topic = "Customs Documents",
                year = "PT. 5",
                questionText = "Which of the following confirms the accuracy of the duty charged on imported goods?",
                optionA = "Consular invoice",
                optionB = "An indent",
                optionC = "Shipping note",
                optionD = "Bill of lading",
                correctAnswerIndex = 0,
                explanation = "A consular invoice is certified by consular officials to prevent under-invoicing and ensure accurate customs duty calculation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_20",
                subject = "Commerce",
                topic = "Organizational Communication",
                year = "PT. 5",
                questionText = "The type of communication from a superior to a subordinate in an organization is referred to as _____.",
                optionA = "downward communication",
                optionB = "horizontal communication",
                optionC = "lateral communication",
                optionD = "upward communication",
                correctAnswerIndex = 0,
                explanation = "Downward communication flows down the chain of command from management to operational staff.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_21",
                subject = "Commerce",
                topic = "Corporate Social Responsibility",
                year = "PT. 5",
                questionText = "The safety and quality of products are the social responsibility of _____.",
                optionA = "the Manufacturer's Association of Nigeria",
                optionB = "the Corporate Affairs Commission",
                optionC = "business organization",
                optionD = "the Standard Organization of Nigeria",
                correctAnswerIndex = 2,
                explanation = "Ensuring safe, defect-free goods that do not harm consumers is an essential social duty of the business enterprise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_22",
                subject = "Commerce",
                topic = "International Organizations",
                year = "PT. 5",
                questionText = "The members of ECOWAS include _____.",
                optionA = "Togo, Nigeria and Ghana",
                optionB = "Burkina Faso, Nigeria, Niger and Mauritania",
                optionC = "Guinea, Mali, Cameroon and Nigeria",
                optionD = "Nigeria, Chad, Gabon and Cape Verde",
                correctAnswerIndex = 0,
                explanation = "Togo, Nigeria, and Ghana are all active founding member states of ECOWAS in West Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_23",
                subject = "Commerce",
                topic = "Port Administration",
                year = "PT. 5",
                questionText = "One of the functions of Nigeria Ports Authority is the _____.",
                optionA = "provision of facilities to ensure that goods get to their destinations",
                optionB = "courier services to ensure specific delivery",
                optionC = "shelter for operators of cargoes",
                optionD = "facilities to enhance the speedy loading and offloading of cargoes",
                correctAnswerIndex = 3,
                explanation = "The NPA manages port berths, quays, and container cranes to expedite vessel loading and cargo discharge.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_24",
                subject = "Commerce",
                topic = "Capital Market",
                year = "PT. 5",
                questionText = "A document which advertises the shares of a company is known as _____.",
                optionA = "deed",
                optionB = "prospectus",
                optionC = "dividend warrant",
                optionD = "memorandum of satisfaction",
                correctAnswerIndex = 1,
                explanation = "A prospectus provides statutory financial disclosures inviting the public to subscribe for newly issued securities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_25",
                subject = "Commerce",
                topic = "Commercial Associations",
                year = "PT. 5",
                questionText = "An association to which all Chambers of Commerce in Nigeria are affiliated is the _____.",
                optionA = "National Association of Chambers of Commerce",
                optionB = "Nigeria Labour Congress",
                optionC = "Nigeria Stock Exchange",
                optionD = "Nigeria Association of Chambers of Commerce, Industry, Mines and Agriculture",
                correctAnswerIndex = 3,
                explanation = "NACCIMA is the umbrella national federation coordinating state and city chambers of commerce across Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_26",
                subject = "Commerce",
                topic = "Aids to Trade",
                year = "PT. 5",
                questionText = "An aspect of commerce that facilitates the distribution of product is _____.",
                optionA = "advertising",
                optionB = "branding",
                optionC = "transportation",
                optionD = "trading",
                correctAnswerIndex = 2,
                explanation = "Transportation bridges physical spatial distances, delivering commodities to consumption points.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_27",
                subject = "Commerce",
                topic = "Industrial Relations",
                year = "PT. 5",
                questionText = "Unresolved disputes between the employer and employees are usually referred to the _____.",
                optionA = "industrial arbitration tribunal",
                optionB = "disciplinary committee",
                optionC = "code of conduct bureau",
                optionD = "personal unit",
                correctAnswerIndex = 0,
                explanation = "Industrial disputes not settled by conciliation are referred to the Industrial Arbitration Panel (IAP).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_28",
                subject = "Commerce",
                topic = "Retail Trade",
                year = "PT. 5",
                questionText = "A chain store usually combines the features of _____.",
                optionA = "hyper markets and stalls",
                optionB = "multiple shops and hyper markets",
                optionC = "multiple shops and departmental shops",
                optionD = "mail order business and multiple shop",
                correctAnswerIndex = 2,
                explanation = "Chain stores utilize multiple retail branches while offering diverse departmental lines under central control.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_29",
                subject = "Commerce",
                topic = "Principles of Management",
                year = "PT. 5",
                questionText = "Which of the following is a matter of personal preference on the part of a superior officer?",
                optionA = "Delegation of authority",
                optionB = "Unity of direction",
                optionC = "Span of control",
                optionD = "Unity of command",
                correctAnswerIndex = 0,
                explanation = "Delegation of authority is discretionary, determined by the managerial style and confidence of the executive.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_30",
                subject = "Commerce",
                topic = "Production",
                year = "PT. 5",
                questionText = "Manufacturing and constructive activities are classified under _____.",
                optionA = "direct-service",
                optionB = "primary production",
                optionC = "tertiary production",
                optionD = "secondary production",
                correctAnswerIndex = 3,
                explanation = "Secondary production encompasses all industrial manufacturing, fabrication, and structural construction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_31",
                subject = "Commerce",
                topic = "Branches of Commerce",
                year = "PT. 5",
                questionText = "From the organizational tree of Commerce (Commerce -> Trade & Aids to Trade), what does I stand for?",
                optionA = "Publicity",
                optionB = "Home trade",
                optionC = "Aids to trade",
                optionD = "Advertising.",
                correctAnswerIndex = 2,
                explanation = "Commerce consists of Trade and Aids to Trade (transport, banking, insurance, warehousing, advertising).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_32",
                subject = "Commerce",
                topic = "Occupations",
                year = "PT. 5",
                questionText = "The three main classification of occupation are _____.",
                optionA = "industry, commerce and services",
                optionB = "manufacturing, industry and trading",
                optionC = "farming, banking and trading",
                optionD = "construction, trade and services",
                correctAnswerIndex = 0,
                explanation = "The canonical division of economic occupations is Industry, Commerce, and Direct/Indirect Services.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_33",
                subject = "Commerce",
                topic = "Life Assurance",
                year = "PT. 5",
                questionText = "The person who undertakes life assurance is said to be an _____.",
                optionA = "assurer",
                optionB = "insurer",
                optionC = "insured",
                optionD = "assured",
                correctAnswerIndex = 3,
                explanation = "The policyholder whose life is covered in life assurance contracts is designated the assured.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_34",
                subject = "Commerce",
                topic = "Business & Society",
                year = "PT. 5",
                questionText = "A business organization must always consider the overall effect of its actions on the _____.",
                optionA = "profit",
                optionB = "society",
                optionC = "product",
                optionD = "competitor",
                correctAnswerIndex = 1,
                explanation = "Sustainable commercial enterprise requires harmonizing corporate profit with positive societal welfare.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_35",
                subject = "Commerce",
                topic = "Insurance",
                year = "PT. 5",
                questionText = "An undertaking given by a person to another assuring his integrity is _____.",
                optionA = "subrogation",
                optionB = "insurable interest",
                optionC = "proximate clause",
                optionD = "fidelity guarantee",
                correctAnswerIndex = 3,
                explanation = "Fidelity guarantee contracts protect against financial losses arising from employee fraud or dishonesty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_36",
                subject = "Commerce",
                topic = "Money",
                year = "PT. 5",
                questionText = "Which of the following is a quality of money?",
                optionA = "scarcity",
                optionB = "availability",
                optionC = "convertibility",
                optionD = "indivisibility",
                correctAnswerIndex = 0,
                explanation = "Relative scarcity maintains the purchasing power and stability of monetary currency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_37",
                subject = "Commerce",
                topic = "Transportation",
                year = "PT. 5",
                questionText = "The distribution of petroleum products in Nigeria is predominantly through _____.",
                optionA = "the bank",
                optionB = "air",
                optionC = "sea",
                optionD = "road",
                correctAnswerIndex = 3,
                explanation = "Heavy articulated road tankers distribute petroleum products across the federation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_38",
                subject = "Commerce",
                topic = "Marketing",
                year = "PT. 5",
                questionText = "The business that focuses attention on the quality of the goods produced by precisely knowing what the consumers desire is said to be operating the _____.",
                optionA = "marketing concept",
                optionB = "promotion mix",
                optionC = "product orientation",
                optionD = "product mix",
                correctAnswerIndex = 0,
                explanation = "The marketing concept focuses on producing what consumers desire based on verified market demand.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_39",
                subject = "Commerce",
                topic = "Marine Insurance",
                year = "PT. 5",
                questionText = "A floating policy is an example of _____.",
                optionA = "marine insurance",
                optionB = "motor insurance",
                optionC = "fire insurance",
                optionD = "actuaries insurance",
                correctAnswerIndex = 0,
                explanation = "A floating policy in marine insurance covers fluctuating cargo values across multiple voyages up to an aggregate insured limit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_pt5_40",
                subject = "Commerce",
                topic = "Occupations",
                year = "PT. 5",
                questionText = "The art of soap making is an example of a _____.",
                optionA = "construction occupation",
                optionB = "tertiary occupation",
                optionC = "primary occupation",
                optionD = "secondary occupation",
                correctAnswerIndex = 3,
                explanation = "Soap making transforms chemical raw materials into consumer commodities, representing secondary manufacturing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce PT.5 • Q40",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
