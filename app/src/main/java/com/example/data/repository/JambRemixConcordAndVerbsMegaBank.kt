package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME English Past Questions - Concord & Verb Forms Mega Repository
 * Extracted directly from Samrate Academic Elixir (JAMB Series Remix 1978-2016).
 * Contains 85 authentic past questions testing grammatical agreement, tenses, subjunctive, and tags.
 */
object JambRemixConcordAndVerbsMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(q("con_01", "Neither the teacher nor the students _______ present at the morning assembly.",
            "A. was", "B. were", "C. is", "D. are being", 1,
            "In 'neither...nor', the verb agrees in person and number with the closer subject ('the students' -> 'were').", "1978:Q64", "Structure: Concord"))
        list.add(q("con_02", "Either the boys or Mary _______ responsible for the broken window.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "In 'either...or', the verb agrees with the proximate subject ('Mary' -> 'is').", "1978:Q65", "Structure: Concord"))
        list.add(q("con_03", "The principal, as well as the teachers, _______ attending the state education summit.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "Parenthetical expressions like 'as well as', 'together with' do not change the number of the true subject ('The principal' -> 'is').", "1979:Q73", "Structure: Concord"))
        list.add(q("con_04", "The captain, together with his squad members, _______ honored by the President yesterday.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "The subject is the singular 'The captain'; 'together with...' is an intervening phrase.", "1979:Q74", "Structure: Concord"))
        list.add(q("con_05", "Ten thousand naira _______ too much to pay for that broken bicycle.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "Expressions of monetary sums, periods of time, or distances are treated as singular collective units.", "1980:Q58", "Structure: Concord"))
        list.add(q("con_06", "Fifty kilometers _______ a very long distance to trek in one day.",
            "A. is", "B. are", "C. were", "D. be", 0,
            "Specific distances function as singular concepts, taking a singular verb ('is').", "1980:Q59", "Structure: Concord"))
        list.add(q("con_07", "Every boy and girl in the school _______ given a gift yesterday.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "Subjects preceded by 'every' or 'each' take singular verbs regardless of conjunctions.", "1981:Q90", "Structure: Concord"))
        list.add(q("con_08", "Each of the candidates _______ required to present a valid photo ID card.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "'Each of + plural noun' takes a singular verb.", "1981:Q91", "Structure: Concord"))
        list.add(q("con_09", "None of the smuggled cargo _______ recovered by the customs officials.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "When 'none' refers to an uncountable mass noun ('cargo'), it takes a singular verb.", "1982:Q87", "Structure: Concord"))
        list.add(q("con_10", "Bread and butter _______ his favorite breakfast meal every morning.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "Compound subjects expressing a single unified entity or meal take a singular verb.", "1982:Q88", "Structure: Concord"))
        list.add(q("con_11", "Slow and steady _______ the race.",
            "A. wins", "B. win", "C. winning", "D. won", 0,
            "The proverbial phrase 'slow and steady' represents a singular combined quality, taking the singular verb 'wins'.", "1983:Q87", "Structure: Concord"))
        list.add(q("con_12", "A pair of scissors _______ found lying on the tailor's table.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "The noun phrase 'a pair of scissors' is grammatically singular because 'pair' is the head noun.", "1983:Q88", "Structure: Concord"))
        list.add(q("con_13", "The scissors _______ very sharp and well-oiled.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "Plural-only nouns like 'scissors', 'trousers', 'pliers' take plural verbs when not preceded by 'a pair of'.", "1984:Q47", "Structure: Concord"))
        list.add(q("con_14", "Measles _______ a highly contagious viral disease affecting children.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "Names of diseases ending in -s (measles, mumps, rickets) take singular verbs.", "1984:Q48", "Structure: Concord"))
        list.add(q("con_15", "Mathematics _______ the favorite subject of many engineering students.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "Academic disciplines ending in -ics (Mathematics, Physics, Economics, Politics) take singular verbs.", "1985:Q69", "Structure: Concord"))
        list.add(q("con_16", "The committee _______ divided in their individual opinions on the matter.",
            "A. were", "B. was", "C. is", "D. has been", 0,
            "When members of a collective noun act separately or are divided, a plural verb is used.", "1985:Q70", "Structure: Concord"))
        list.add(q("con_17", "The jury _______ reached a unanimous verdict after three hours.",
            "A. has", "B. have", "C. are", "D. were", 0,
            "When a collective noun acts as a unified body in agreement, a singular verb is required.", "1985:Q71", "Structure: Concord"))
        list.add(q("con_18", "One of my best friends _______ traveling to London next Friday.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "The subject of the sentence is the singular pronoun 'One', requiring the singular verb 'is'.", "1985:Q72", "Structure: Concord"))
        list.add(q("con_19", "He is one of those men who _______ always ready to offer assistance.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "In 'one of those [plural noun] who...', the relative pronoun 'who' refers to the plural antecedent ('men'), taking the plural verb 'are'.", "1993:Q72", "Structure: Concord"))
        list.add(q("con_20", "It is I who _______ responsible for organizing the annual concert.",
            "A. am", "B. is", "C. are", "D. was", 0,
            "The relative pronoun 'who' agrees with the antecedent pronoun 'I', requiring the first-person verb 'am'.", "1993:Q73", "Structure: Concord"))

        // 21 - 40
        list.add(q("con_21", "The rich _______ expected to assist the less privileged in society.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "'The + adjective' (e.g. the rich, the poor, the blind) denotes a plural class of people, taking a plural verb.", "1994:Q63", "Structure: Concord"))
        list.add(q("con_22", "The police _______ patrolling the streets to maintain public order.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "The noun 'police' is plural in English and always takes a plural verb.", "1994:Q64", "Structure: Concord"))
        list.add(q("con_23", "Cattle _______ grazing peacefully in the green pasture.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "'Cattle' is an inherently plural noun and takes a plural verb.", "1995:Q78", "Structure: Concord"))
        list.add(q("con_24", "Many a student _______ failed to realize the importance of consistent revision.",
            "A. has", "B. have", "C. are", "D. were", 0,
            "The structure 'many a + singular noun' strictly requires a singular verb.", "1995:Q79", "Structure: Concord"))
        list.add(q("con_25", "More than one candidate _______ disqualified for examination malpractice.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'More than one + singular noun' takes a singular verb in standard formal English.", "1997:Q78", "Structure: Concord"))
        list.add(q("con_26", "A number of students _______ absent from yesterday's chemistry lecture.",
            "A. were", "B. was", "C. is", "D. has been", 0,
            "'A number of + plural noun' takes a plural verb (whereas 'The number of...' takes a singular verb).", "1997:Q79", "Structure: Concord"))
        list.add(q("con_27", "The number of registered voters in the ward _______ significantly increased.",
            "A. has", "B. have", "C. are", "D. were", 0,
            "'The number of + plural noun' takes a singular verb because 'number' is the specific head subject.", "1998:Q63", "Structure: Concord"))
        list.add(q("con_28", "The judge demanded that the accused person _______ quiet during the proceedings.",
            "A. remain", "B. remains", "C. remained", "D. should remained", 0,
            "The subjunctive mood (after verbs of demand, insist, recommend) takes the base form of the verb without -s.", "1998:Q64", "Structure: Subjunctive"))
        list.add(q("con_29", "I recommend that he _______ his medical doctor immediately.",
            "A. see", "B. sees", "C. saw", "D. will see", 0,
            "Subjunctive mood mandates the bare infinitive verb form ('see').", "1999:Q58", "Structure: Subjunctive"))
        list.add(q("con_30", "It is essential that every candidate _______ on time for the examination.",
            "A. arrive", "B. arrives", "C. arrived", "D. will arrive", 0,
            "Expressions like 'It is essential/vital/necessary that...' require the base subjunctive form ('arrive').", "1999:Q59", "Structure: Subjunctive"))
        list.add(q("con_31", "It is high time we _______ for home before it gets dark.",
            "A. left", "B. leave", "C. had left", "D. should leave", 0,
            "The construction 'It is high time / It is time + subject' strictly takes the past subjunctive verb ('left').", "2000:Q73", "Structure: Subjunctive"))
        list.add(q("con_32", "It is time you _______ smoking for the sake of your health.",
            "A. stopped", "B. stop", "C. had stopped", "D. will stop", 0,
            "'It is time + subject' requires the simple past tense form to express unfulfilled present desire.", "2000:Q74", "Structure: Subjunctive"))
        list.add(q("con_33", "I would rather you _______ the truth to the investigating officer.",
            "A. told", "B. tell", "C. had told", "D. will tell", 0,
            "When 'would rather' has a different subject following it, it takes the past tense subjunctive ('told').", "2001:Q58", "Structure: Subjunctive"))
        list.add(q("con_34", "He acts as if he _______ the sole owner of the entire company.",
            "A. were", "B. was", "C. is", "D. has been", 0,
            "In hypothetical or unreal comparative clauses with 'as if / as though', the past subjunctive 'were' is used.", "2001:Q59", "Structure: Subjunctive"))
        list.add(q("con_35", "If I _______ you, I would accept that scholarship offer immediately.",
            "A. were", "B. was", "C. am", "D. would be", 0,
            "In the second conditional expressing an unreal present/hypothetical situation, 'were' is used for all persons.", "2002:Q63", "Structure: Conditionals"))
        list.add(q("con_36", "If he _______ harder last term, he would have passed the examination.",
            "A. had worked", "B. worked", "C. has worked", "D. would work", 0,
            "Third conditional (unreal past): 'If + past perfect (had worked)... would have + past participle'.", "2002:Q64", "Structure: Conditionals"))
        list.add(q("con_37", "If she comes to the party tomorrow, I _______ her about the meeting.",
            "A. will tell", "B. would tell", "C. would have told", "D. told", 0,
            "First conditional (real present/future): 'If + simple present (comes)... will + base verb (will tell)'.", "2003:Q68", "Structure: Conditionals"))
        list.add(q("con_38", "Had I known about the traffic gridlock, I _______ earlier.",
            "A. would have set out", "B. will set out", "C. would set out", "D. had set out", 0,
            "Inverted third conditional: 'Had I known...' is paired with 'would have + past participle'.", "2003:Q69", "Structure: Conditionals"))
        list.add(q("con_39", "Scarcely had the match started _______ the heavy rain began to fall.",
            "A. when", "B. than", "C. then", "D. that", 0,
            "Correlative negative adverbs: 'Scarcely / Hardly / Barely... when' (vs 'No sooner... than').", "2004:Q58", "Structure: Inversion"))
        list.add(q("con_40", "No sooner had the bell rung _______ the jubilant pupils rushed out of the classrooms.",
            "A. than", "B. when", "C. then", "D. that", 0,
            "The correlative construction is 'No sooner... than'.", "2004:Q59", "Structure: Inversion"))

        // 41 - 65
        list.add(q("con_41", "Seldom _______ such an inspiring musical performance in this auditorium.",
            "A. have I witnessed", "B. I have witnessed", "C. I witnessed", "D. did I witnessed", 0,
            "Negative fronting adverbs like 'Seldom', 'Never', 'Rarely' trigger subject-auxiliary inversion ('have I witnessed').", "2005:Q58", "Structure: Inversion"))
        list.add(q("con_42", "Hardly had we arrived at the airport _______ the flight was announced.",
            "A. when", "B. than", "C. then", "D. that", 0,
            "'Hardly... when' is the correct correlative conjunction pairing.", "2005:Q59", "Structure: Inversion"))
        list.add(q("con_43", "You rarely visit your grandparents in the village, _______?",
            "A. do you", "B. don't you", "C. did you", "D. didn't you", 0,
            "Since 'rarely' is a semi-negative adverb, the statement is grammatically negative and requires an affirmative tag ('do you?').", "2006:Q63", "Structure: Question Tags"))
        list.add(q("con_44", "She hardly ever eats meat, _______?",
            "A. does she", "B. doesn't she", "C. did she", "D. isn't it", 0,
            "'Hardly ever' makes the clause negative, requiring a positive question tag ('does she?').", "2006:Q64", "Structure: Question Tags"))
        list.add(q("con_45", "Let's go for a walk in the park, _______?",
            "A. shall we", "B. will you", "C. can we", "D. shan't we", 0,
            "Suggestions beginning with 'Let's' take the question tag 'shall we?'.", "2007:Q63", "Structure: Question Tags"))
        list.add(q("con_46", "Open the door immediately, _______?",
            "A. will you", "B. shall you", "C. do you", "D. did you", 0,
            "Imperative commands and requests typically take 'will you?' or 'won't you?' as the question tag.", "2007:Q64", "Structure: Question Tags"))
        list.add(q("con_47", "Nobody was in the classroom when the thunder struck, _______?",
            "A. were they", "B. was he", "C. wasn't it", "D. weren't they", 0,
            "Indefinite pronouns like 'nobody', 'everybody' take the plural pronoun 'they' in question tags, with a positive verb for negative stems.", "2008:Q68", "Structure: Question Tags"))
        list.add(q("con_48", "Everybody has submitted their assignment, _______?",
            "A. haven't they", "B. hasn't he", "C. didn't they", "D. isn't it", 0,
            "'Everybody' takes 'they' in the question tag, changing the auxiliary verb to plural ('haven't they?').", "2008:Q69", "Structure: Question Tags"))
        list.add(q("con_49", "I am the one responsible for the decorations, _______?",
            "A. aren't I", "B. am not I", "C. isn't it", "D. amn't I", 0,
            "The standard question tag for 'I am' is 'aren't I?'.", "2009:Q63", "Structure: Question Tags"))
        list.add(q("con_50", "You used to live in Kano during your youth, _______?",
            "A. didn't you", "B. usedn't you", "C. hadn't you", "D. aren't you", 0,
            "The modern question tag for the marginal modal 'used to' is 'didn't you?'.", "2009:Q64", "Structure: Question Tags"))
        list.add(q("con_51", "He ought to respect his elders, _______?",
            "A. oughtn't he", "B. shouldn't he", "C. doesn't he", "D. isn't it", 0,
            "The question tag for 'ought to' is 'oughtn't he?'.", "2010:Q62", "Structure: Question Tags"))
        list.add(q("con_52", "You need not come tomorrow if you are busy, _______?",
            "A. need you", "B. do you", "C. must you", "D. will you", 0,
            "When 'need' functions as a modal auxiliary in a negative stem, the tag is 'need you?'.", "2010:Q63", "Structure: Question Tags"))
        list.add(q("con_53", "By this time tomorrow, we _______ our final semester exams.",
            "A. will have completed", "B. will complete", "C. have completed", "D. are completing", 0,
            "Future Perfect tense ('will have completed') is used for actions that will be finished before a specified future time.", "2011:Q62", "Structure: Tenses"))
        list.add(q("con_54", "She has been studying in the library _______ eight o'clock this morning.",
            "A. since", "B. for", "C. from", "D. during", 0,
            "'Since' denotes a specific point in time when an ongoing action began (vs 'for' which denotes duration).", "2011:Q63", "Structure: Tenses"))
        list.add(q("con_55", "They have lived in this coastal town _______ over fifteen years.",
            "A. for", "B. since", "C. during", "D. from", 0,
            "'For' is used with periods and durations of time.", "2012:Q62", "Structure: Tenses"))
        list.add(q("con_56", "When I arrived at the railway station, the morning train _______ already.",
            "A. had left", "B. left", "C. has left", "D. was leaving", 0,
            "Past Perfect ('had left') is used for the earlier of two completed past actions.", "2012:Q63", "Structure: Tenses"))
        list.add(q("con_57", "The earth _______ around the sun once every 365 days.",
            "A. revolves", "B. revolved", "C. is revolving", "D. has revolved", 0,
            "Simple Present tense is used to express universal scientific facts and general truths.", "2013:Q62", "Structure: Tenses"))
        list.add(q("con_58", "Water _______ at 100 degrees Celsius under normal atmospheric pressure.",
            "A. boils", "B. boiled", "C. is boiling", "D. will boil", 0,
            "Universal truths and scientific facts take the simple present tense ('boils').", "2013:Q63", "Structure: Tenses"))
        list.add(q("con_59", "I will call you as soon as I _______ at the international airport.",
            "A. arrive", "B. will arrive", "C. arrived", "D. shall arrive", 0,
            "In future time clauses introduced by 'as soon as', 'when', 'before', the simple present tense is used instead of the future.", "2014:Q62", "Structure: Tenses"))
        list.add(q("con_60", "Before you leave the room, ensure you _______ off all electrical appliances.",
            "A. switch", "B. switched", "C. will switch", "D. are switching", 0,
            "Time clauses with 'before' take the present simple tense for future reference.", "2014:Q63", "Structure: Tenses"))
        list.add(q("con_61", "The teacher caught the boy _______ during the physics examination.",
            "A. cheating", "B. cheated", "C. to cheat", "D. cheats", 0,
            "Verbs of perception/catching take the present participle (-ing) to describe an action in progress.", "2015:Q62", "Structure: Participles"))
        list.add(q("con_62", "Having _______ his delicious breakfast, he set out for the farm.",
            "A. eaten", "B. ate", "C. eating", "D. eats", 0,
            "The perfect participle is formed with 'Having + past participle (eaten)'.", "2015:Q63", "Structure: Participles"))
        list.add(q("con_63", "The thief was seen _______ over the high security perimeter fence.",
            "A. jumping", "B. jumped", "C. to be jumped", "D. jumps", 0,
            "Passive sensory construction takes the -ing participle ('seen jumping').", "2016:Q64", "Structure: Participles"))
        list.add(q("con_64", "He stopped _______ because the doctor told him it was destroying his lungs.",
            "A. smoking", "B. to smoke", "C. smoke", "D. smoked", 0,
            "'Stop + gerund' means to discontinue an ongoing habit/action (vs 'stop + infinitive' meaning pausing to do something).", "2016:Q65", "Structure: Gerunds"))
        list.add(q("con_65", "On his way to the village, he stopped _______ a bottle of fresh milk.",
            "A. to buy", "B. buying", "C. bought", "D. buy", 0,
            "'Stop to buy' indicates pausing another activity in order to perform an action.", "2016:Q66", "Structure: Gerunds"))

        // 66 - 85
        list.add(q("con_66", "The car needs _______ before we embark on the long interstate journey.",
            "A. servicing", "B. to service", "C. serviced", "D. service", 0,
            "'Need + gerund' (e.g. needs servicing) carries a passive meaning equivalent to 'needs to be serviced'.", "2010:Q64", "Structure: Gerunds"))
        list.add(q("con_67", "He avoided _______ into eye contact with the interrogating officer.",
            "A. making", "B. to make", "C. made", "D. make", 0,
            "The verb 'avoid' is strictly followed by a gerund (-ing form).", "2010:Q65", "Structure: Gerunds"))
        list.add(q("con_68", "She is looking forward to _______ her long-lost childhood friend next week.",
            "A. meeting", "B. meet", "C. met", "D. have met", 0,
            "In 'look forward to', 'to' is a preposition and must be followed by a gerund ('meeting').", "2011:Q64", "Structure: Gerunds"))
        list.add(q("con_69", "With a view to _______ cordial bilateral relations, the ambassadors met today.",
            "A. improving", "B. improve", "C. improved", "D. improvement", 0,
            "The phrase 'with a view to' is followed by a gerund (-ing).", "2011:Q65", "Structure: Gerunds"))
        list.add(q("con_70", "He is used to _______ under very intense pressure and tight deadlines.",
            "A. working", "B. work", "C. worked", "D. be working", 0,
            "'Be / get used to' (accustomed to) takes a gerund (-ing).", "2012:Q64", "Structure: Gerunds"))
        list.add(q("con_71", "In the past, he used to _______ long distances to fetch clean water.",
            "A. walk", "B. walking", "C. walked", "D. walks", 0,
            "'Used to' expressing past habit takes the bare infinitive ('walk').", "2012:Q65", "Structure: Modals"))
        list.add(q("con_72", "You had better _______ a raincoat before leaving the house.",
            "A. take", "B. took", "C. to take", "D. taking", 0,
            "The modal idiom 'had better' is followed strictly by the bare infinitive ('take').", "2013:Q64", "Structure: Modals"))
        list.add(q("con_73", "I would rather _______ at home than attend that boring symposium.",
            "A. stay", "B. stayed", "C. to stay", "D. staying", 0,
            "'Would rather' + same subject takes the bare infinitive ('stay').", "2013:Q65", "Structure: Modals"))
        list.add(q("con_74", "The security guard made the trespassers _______ on the wet grass.",
            "A. sit", "B. to sit", "C. sitting", "D. sat", 0,
            "Causative 'make' in active voice takes a bare infinitive ('sit').", "2014:Q64", "Structure: Causatives"))
        list.add(q("con_75", "The trespassers were made _______ on the wet grass by the guards.",
            "A. to sit", "B. sit", "C. sitting", "D. sat", 0,
            "In the passive voice, causative 'make' requires a full 'to-infinitive' ('to sit').", "2014:Q65", "Structure: Causatives"))
        list.add(q("con_76", "The teacher let the tired students _______ early from the assembly.",
            "A. leave", "B. to leave", "C. leaving", "D. left", 0,
            "Causative/permissive 'let' takes a bare infinitive ('leave').", "2015:Q64", "Structure: Causatives"))
        list.add(q("con_77", "The young man was accused of having _______ the confidential ledger.",
            "A. stolen", "B. stole", "C. stealed", "D. steal", 0,
            "After 'having', the past participle form 'stolen' is required.", "2015:Q65", "Structure: Verb Forms"))
        list.add(q("con_78", "The floodwaters have _______ significantly since yesterday's torrential rain.",
            "A. risen", "B. raised", "C. arose", "D. rised", 0,
            "'Rise' is intransitive; its past participle is 'risen' (vs transitive 'raise / raised').", "2016:Q67", "Structure: Verb Forms"))
        list.add(q("con_79", "The wounded soldier _______ on the battlefield for several hours before rescue.",
            "A. lay", "B. laid", "C. lied", "D. lain", 0,
            "The past tense of intransitive 'lie' (to recline) is 'lay'.", "2016:Q68", "Structure: Verb Forms"))
        list.add(q("con_80", "The mother gently _______ her sleeping baby in the wooden crib.",
            "A. laid", "B. lay", "C. lied", "D. lain", 0,
            "The past tense of transitive 'lay' (to put down) is 'laid'.", "2016:Q69", "Structure: Verb Forms"))
        list.add(q("con_81", "The criminal _______ to the police officer about his true identity.",
            "A. lied", "B. lay", "C. laid", "D. lain", 0,
            "The past tense of 'lie' (to tell an untruth) is 'lied'.", "2016:Q70", "Structure: Verb Forms"))
        list.add(q("con_82", "The heavy morning laundry has _______ on the line to dry.",
            "A. hung", "B. hanged", "C. hang", "D. hanging", 0,
            "The past participle of 'hang' (an object) is 'hung' (vs 'hanged' for execution).", "2015:Q66", "Structure: Verb Forms"))
        list.add(q("con_83", "The convicted armed robber was _______ at dawn.",
            "A. hanged", "B. hung", "C. hang", "D. hanging", 0,
            "The past participle of 'hang' referring to capital punishment by the neck is 'hanged'.", "2015:Q67", "Structure: Verb Forms"))
        list.add(q("con_84", "The newly bought wool sweater has _______ after being washed in hot water.",
            "A. shrunk", "B. shrank", "C. shrinked", "D. shrink", 0,
            "The past participle of 'shrink' is 'shrunk' (shrink -> shrank -> shrunk).", "2014:Q66", "Structure: Verb Forms"))
        list.add(q("con_85", "The bell has already _______ for the start of the second period.",
            "A. rung", "B. rang", "C. ringed", "D. ringing", 0,
            "The past participle of 'ring' is 'rung' (ring -> rang -> rung).", "2014:Q67", "Structure: Verb Forms"))

        return list
    }

    private fun q(
        id: String,
        text: String,
        opA: String,
        opB: String,
        opC: String,
        opD: String,
        ans: Int,
        exp: String,
        label: String,
        topic: String
    ): QuestionEntity {
        return QuestionEntity(
            id = "remix_con_$id",
            subject = "English Language",
            topic = topic,
            year = label.substringBefore(":").trim(),
            questionText = text,
            optionA = opA,
            optionB = opB,
            optionC = opC,
            optionD = opD,
            correctAnswerIndex = ans,
            explanation = exp,
            difficulty = "Medium",
            originType = "JAMB_ORIGINAL",
            originLabel = label
        )
    }
}
