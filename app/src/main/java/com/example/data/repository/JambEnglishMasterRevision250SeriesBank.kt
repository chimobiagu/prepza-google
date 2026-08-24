package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Use of English Master Revision Table Complete 250 Questions Repository
 * Covers Comprehension, Lexis, Idioms, Antonyms, Synonyms, Concord, Oral English, and Grammar.
 */
object JambEnglishMasterRevision250SeriesBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 2010 Exam Block
        list.add(q("rev250_001", "According to the writer, the exciting thing about Spaceship Earth is that it",
            "A. has no instruction manual", "B. it is not difficult to maintain", "C. is peculiar to other automobiles", "D. is relatively easy to operate", 0,
            "The passage notes that unlike automobiles, Spaceship Earth did not come with an instruction manual, making its operation a challenge to human inquisitiveness.", "2010:Q2", "Comprehension"))

        list.add(q("rev250_002", "The absence of an instruction manual in Spaceship Earth has",
            "A. made the operation of the Spaceship Earth difficult", "B. forced man to devise other means of travelling in spacecraft", "C. challenged man’s inquisitiveness", "D. made man helpless", 2,
            "Without a manual, humans must figure out how the planet works on their own, which directly stimulates and challenges human intellect and inquisitiveness.", "2010:Q3", "Comprehension"))

        list.add(q("rev250_003", "The essence of fighting corruption, according to the passage, is to",
            "A. send the corrupt to jail", "B. promote good governance", "C. punish corrupt politicians", "D. make people richer", 1,
            "The writer highlights that anti-corruption efforts are ultimately designed to establish and promote sustainable good governance.", "2010:Q15", "Comprehension"))

        list.add(q("rev250_004", "Select the option that best explains the italicized phrase: 'Though Mr. Iro is a new chairman, he views other members with a *jaundiced eye*.'",
            "A. He takes a rather forceful position on dealing with his members", "B. He looks at them with prejudice and suspicion", "C. He is very happy with his members", "D. He is suffering from a yellow fever", 1,
            "To look at something with a 'jaundiced eye' is an idiom meaning to view it with prejudice, skepticism, or suspicion.", "2010:Q26", "Idioms & Interpretation"))

        list.add(q("rev250_005", "Choose the option opposite in meaning to the italicized word: 'I am optimistic about the interview though it was a *mind-bending* exercise.'",
            "A. An enervating", "B. A debilitating", "C. A difficult", "D. An easy", 3,
            "A 'mind-bending' exercise is extremely complex or difficult. Its direct antonym is 'easy'.", "2010:Q36", "Lexis: Antonyms"))

        list.add(q("rev250_006", "Choose the option opposite in meaning to the italicized word: 'The trader was amused by the *cut-throat* rush for the goods.'",
            "A. Worrisome", "B. Strange", "C. Lacklustre", "D. Mad", 2,
            "A 'cut-throat' rush is highly intense, competitive, and energetic. The antonym is 'lacklustre' (spiritless/dull).", "2010:Q37", "Lexis: Antonyms"))

        list.add(q("rev250_007", "Choose the option opposite in meaning to the italicized word: 'The teacher said that Ali’s essay was full of many *redundant* details.'",
            "A. Unexplained", "B. Strange", "C. Necessary", "D. Useful", 2,
            "Redundant details are superfluous, excessive, or unnecessary. Therefore, the opposite is 'necessary'.", "2010:Q38", "Lexis: Antonyms"))

        list.add(q("rev250_008", "Choose the option opposite in meaning to the italicized word: 'Her *ingenuous* smile drew our attention.'",
            "A. Witty", "B. Naïve", "C. Clever", "D. Arrogant", 3,
            "Ingenuous means innocent, trustful, and simple. Its opposite in social attitude here is 'arrogant'.", "2010:Q40", "Lexis: Antonyms"))

        list.add(q("rev250_009", "Choose the option opposite in meaning to the italicized word: 'Ndeni gave a *flawless* speech at the party.'",
            "A. A wonderful", "B. A careless", "C. An interesting", "D. An imperfect", 3,
            "Flawless means perfect and without any errors. Its antonym is 'imperfect'.", "2010:Q41", "Lexis: Antonyms"))

        list.add(q("rev250_010", "Choose the option opposite in meaning to the italicized word: 'Beneath Ado’s *gruff* exterior, he’s really very kind-hearted.'",
            "A. Nice", "B. Harsh", "C. Rough", "D. Gentle", 3,
            "Gruff means rough, abrupt, or harsh in manner. Its opposite is 'gentle'.", "2010:Q42", "Lexis: Antonyms"))

        list.add(q("rev250_011", "Choose the option opposite in meaning to the italicized word: 'The captain says sports is being *debased* by commercial sponsorship.'",
            "A. Localized", "B. Perverted", "C. Elevated", "D. Overvalued", 2,
            "Debased means degraded or lowered in quality/value. The opposite is 'elevated' (raised in status or quality).", "2010:Q43", "Lexis: Antonyms"))

        list.add(q("rev250_012", "Choose the option opposite in meaning to the italicized word: 'Governing a country is not always as *straightforward* as people sometimes imagine.'",
            "A. Complicated", "B. Easy", "C. Simple", "D. Direct", 0,
            "A straightforward task is simple and easy to understand. Its antonym is 'complicated'.", "2010:Q44", "Lexis: Antonyms"))

        list.add(q("rev250_013", "Choose the option opposite in meaning to the italicized word: 'Ada gave her husband a look that made words *superfluous*.'",
            "A. Redundant", "B. Spurious", "C. Unnecessary", "D. Scanty", 3,
            "Superfluous means more than enough or excessive. Its opposite in quantity or need is 'scanty' or minimal.", "2010:Q50", "Lexis: Antonyms"))

        list.add(q("rev250_014", "Choose the option nearest in meaning to the italicized word: 'A political *impasse* does not offer the best opportunity for merrymaking.'",
            "A. manifesto", "B. party", "C. gridlock", "D. rally", 2,
            "An 'impasse' is a situation in which no progress is possible; a deadlock or 'gridlock'.", "2010:Q51", "Lexis: Synonyms"))

        list.add(q("rev250_015", "Choose the option nearest in meaning to the italicized word: 'We were all *enthusiastic* as we awaited the result of the election.'",
            "A. bemused", "B. agitated", "C. elated", "D. nervous", 2,
            "Enthusiastic here matches 'elated' (excited, joyful, or full of positive anticipation).", "2010:Q52", "Lexis: Synonyms"))

        list.add(q("rev250_016", "Choose the option nearest in meaning to the italicized word: 'The uniform makes the guards look *absurd*.'",
            "A. dirty", "B. smart", "C. handsome", "D. ridiculous", 3,
            "Absurd means wildly unreasonable, illogical, or inappropriate; hence, 'ridiculous'.", "2010:Q53", "Lexis: Synonyms"))

        list.add(q("rev250_017", "Choose the option nearest in meaning to the italicized word: 'Her reputation is without a *blemish*.'",
            "A. Struggle", "B. Problem", "C. Fault", "D. Blessing", 2,
            "A blemish is a small mark or flaw that spoils the appearance of something; hence, a 'fault' or defect.", "2010:Q63", "Lexis: Synonyms"))

        list.add(q("rev250_018", "Choose the option nearest in meaning to the italicized word: 'Ugo is *eligible* for the post of secretary.'",
            "A. Nominated", "B. Invited", "C. Qualified", "D. Intelligent", 2,
            "Eligible means having the right to do or obtain something; satisfying the appropriate conditions or being 'qualified'.", "2010:Q64", "Lexis: Synonyms"))

        list.add(q("rev250_019", "Choose the option nearest in meaning to the italicized word: 'This is an *abridged* version of No Longer at Ease.'",
            "A. An outdated", "B. An enlarged", "C. An illustrated", "D. A shortened", 3,
            "An abridged text has been shortened by condensing or omitting some parts.", "2010:Q65", "Lexis: Synonyms"))

        list.add(q("rev250_020", "Choose the option that best completes the gap: 'Lemoti ......... as a painter, but also as a sculptor.'",
            "A. is a gifted only not", "B. is only not gifted", "C. is gifted not only", "D. is only gifted", 2,
            "The correlative conjunction structure is 'not only... but also'. Therefore, 'is gifted not only' is grammatically correct.", "2010:Q66", "Grammar: Structure"))

        list.add(q("rev250_021", "Choose the option that best completes the gap: 'He can recall the important dates in the nation’s history, it is interesting to listen as he rattles .........'",
            "A. off", "B. over", "C. up", "D. out", 0,
            "To 'rattle off' is a phrasal verb meaning to recite or list something quickly and easily from memory.", "2010:Q67", "Phrasal Verbs"))

        list.add(q("rev250_022", "Choose the option that best completes the gap: 'A wide range of options ....... made available to students in the final year last year.'",
            "A. is", "B. were", "C. are", "D. was", 3,
            "The subject is 'A wide range' (singular noun phrase), and the sentence refers to 'last year' (past tense). Thus, 'was' is the correct verb.", "2010:Q71", "Grammar: Concord"))

        list.add(q("rev250_023", "Choose the option that best completes the gap: 'The principal said that he was pleased ……… my effort.'",
            "A. on", "B. of", "C. with", "D. about", 2,
            "The adjective 'pleased' takes the preposition 'with' when expressing satisfaction with a person's efforts or work.", "2010:Q74", "Prepositions"))

        list.add(q("rev250_024", "Choose the option that best completes the gap: 'Paper is made ..... wood pulp.'",
            "A. on", "B. of", "C. from", "D. with", 2,
            "We use 'made from' when the raw material undergoes a complete physical/chemical transformation during manufacturing.", "2010:Q75", "Prepositions"))

        list.add(q("rev250_025", "Choose the option that best completes the gap: 'Long after everyone ...... the hall, Obi still sat inside.'",
            "A. left", "B. is leaving", "C. has left", "D. had left", 3,
            "The past perfect tense 'had left' represents an action completed before another past action (Obi sitting inside).", "2010:Q76", "Grammar: Tense"))

        list.add(q("rev250_026", "Choose the option that best completes the gap: 'They are the ...... dresses.'",
            "A. babys’", "B. baby", "C. babies", "D. babies’", 3,
            "The plural possessive for 'babies' is 'babies'', representing dresses belonging to more than one baby.", "2010:Q77", "Grammar: Nouns"))

        list.add(q("rev250_027", "Choose the option that best completes the gap: 'The politician was sent ..... exile.'",
            "A. onto", "B. into", "C. on", "D. to", 1,
            "The idiomatic expression is to be 'sent into exile'.", "2010:Q78", "Prepositions"))

        list.add(q("rev250_028", "Choose the option that best completes the gap: 'When we looked up, we ...... the plane some miles away.'",
            "A. site", "B. cited", "C. sited", "D. sighted", 3,
            "'Sighted' means to have managed to see or catch sight of a distant object (like a plane).", "2010:Q79", "Lexis & Vocabulary"))

        list.add(q("rev250_029", "Choose the option that best completes the gap: 'Vital ….. is still spread .... word of mouth in most villages in Africa.'",
            "A. information/from", "B. information/with", "C. information/by", "D. information/of", 2,
            "The noun 'information' is uncountable, and news/gossip is spread 'by' word of mouth.", "2010:Q80", "Grammar: Nouns & Prepositions"))

        list.add(q("rev250_030", "Choose the option that has the same vowel sound as the one represented by the underlined letter: 'Ind_i_ct'",
            "A. bright", "B. fish", "C. pick", "D. brick", 0,
            "Despite the spelling, 'indict' is pronounced /ɪnˈdaɪt/ with a long /aɪ/ sound, matching 'bright'.", "2010:Q87", "Oral English: Vowels"))

        // 2011 Exam Block
        list.add(q("rev250_031", "Choose the option nearest in meaning to the italicized word: 'Since its *inception* in 1983, the newspaper has attracted thousands of readers.'",
            "A. renaissance", "B. coming", "C. commencement", "D. publication", 2,
            "'Inception' denotes the establishment or starting point of an institution, which translates directly to 'commencement'.", "2011:Q36", "Lexis: Synonyms"))

        list.add(q("rev250_032", "Choose the option nearest in meaning to the italicized word: 'Her problem was *exacerbated* by the loss of her father.'",
            "A. exaggerated", "B. solved", "C. aggravated", "D. infuriated", 2,
            "To 'exacerbate' means to make a bad situation or problem worse; hence, 'aggravated'.", "2011:Q50", "Lexis: Synonyms"))

        list.add(q("rev250_033", "Choose the option opposite in meaning to the italicized word: 'The warring communities were *coerced* into negotiating a settlement.'",
            "A. driven", "B. compelled", "C. persuaded", "D. pressured", 2,
            "'Coerced' means forced or compelled. Its direct antonym is 'persuaded', representing voluntary agreement.", "2011:Q51", "Lexis: Antonyms"))

        list.add(q("rev250_034", "Choose the option opposite in meaning to the italicized word: 'His father served as a *mercenary* in the army.'",
            "A. preacher", "B. regular", "C. recruit", "D. officer", 1,
            "A 'mercenary' is a soldier hired to fight for a foreign country. The antonym is a 'regular' national soldier.", "2011:Q52", "Lexis: Antonyms"))

        list.add(q("rev250_035", "Choose the option opposite in meaning to the italicized word: 'Jummai is *cruel* to her husband.'",
            "A. harsh", "B. brutal", "C. kind", "D. passionate", 2,
            "The opposite of 'cruel' is 'kind'.", "2011:Q53", "Lexis: Antonyms"))

        list.add(q("rev250_036", "Choose the option opposite in meaning to the italicized word: 'His *antipathy* affected the growth of his business.'",
            "A. hatred", "B. receptiveness", "C. loyalty", "D. hostility", 1,
            "'Antipathy' means a deep-seated feeling of dislike or hostility. Its opposite is 'receptiveness' or warmth.", "2011:Q64", "Lexis: Antonyms"))

        list.add(q("rev250_037", "Choose the option opposite in meaning to the italicized word: 'Okonkwo’s *lethal* right foot did the magic in the football match.'",
            "A. Weak", "B. wicked", "C. fat", "D. harmless", 3,
            "'Lethal' means deadly or highly destructive. The opposite is 'harmless'.", "2011:Q65", "Lexis: Antonyms"))

        list.add(q("rev250_038", "Choose the option that best completes the gap: 'When his car tyre ….. on the way, he did not know what to do.'",
            "A. has burst", "B. had burst", "C. bursted", "D. burst", 3,
            "The verb 'burst' is irregular and retains the same form ('burst') in the simple past tense. 'Bursted' is non-standard.", "2011:Q66", "Grammar: Verbs"))

        list.add(q("rev250_039", "Choose the option that best completes the gap: 'Lami’s father …. as a gardener when he was young, but now he is a driver.'",
            "A. had been working", "B. use to work", "C. has worked", "D. used to work", 3,
            "'Used to work' is the correct past habit marker. 'Use to work' is grammatically incorrect in this context.", "2011:Q67", "Grammar: Habitual Aspect"))

        list.add(q("rev250_040", "Choose the option that best completes the gap: '........ he switches on the light, the shadow disappears.'",
            "A. whenever", "B. except", "C. since", "D. until", 0,
            "'Whenever' is an adverbial conjunction indicating a conditional or repeated action that triggers the disappearing shadow.", "2011:Q68", "Grammar: Conjunctions"))

        list.add(q("rev250_041", "Choose the option that best completes the gap: 'It is important that you clear the refuse in front of your house every ……'",
            "A. fourtnight", "B. fortnight", "C. fourthnight", "D. forthnight", 1,
            "The correct spelling of the noun meaning a period of two weeks is 'fortnight'.", "2011:Q69", "Spelling"))

        list.add(q("rev250_042", "Choose the option that best completes the gap: 'Suara needn’t come with us, ......?'",
            "A. does she", "B. will she", "C. can she", "D. need she", 3,
            "The modal 'needn't' forms a positive tag using the same auxiliary: 'need she?'.", "2011:Q71", "Grammar: Question Tags"))

        list.add(q("rev250_043", "Choose the option that best completes the gap: 'Unoka …. the whole house to find his missing wristwatch.'",
            "A. scourged", "B. scoured", "C. scored", "D. scouted", 1,
            "To 'scour' means to search a place or thing thoroughly and systematically.", "2011:Q72", "Lexis & Vocabulary"))

        list.add(q("rev250_044", "Choose the option that best completes the gap: 'Ife asked me….'",
            "A. what time it was", "B. what is it by my time", "C. what time is it", "D. what time it is", 0,
            "In indirect speech, questions follow the statement word order (subject + verb) and shift back in tense ('what time it was').", "2011:Q73", "Grammar: Indirect Speech"))

        list.add(q("rev250_045", "Choose the option that best completes the gap: 'There are many ways to kill a rat, so we should be …. in our approach to the task ahead of us.'",
            "A. ecletic", "B. eclectic", "C. ecleKtic", "D. eclectiK", 1,
            "The correct spelling is 'eclectic', which means deriving ideas, style, or taste from a broad and diverse range of sources.", "2011:Q74", "Spelling"))

        list.add(q("rev250_046", "Choose the option that best completes the gap: 'Audu took these actions purely …. his own career.'",
            "A. on furtherance of", "B. in furtherance of", "C. to furtherance in", "D. in furtherance with", 1,
            "The correct idiomatic prepositional phrase is 'in furtherance of', meaning to advance or promote a cause.", "2011:Q75", "Prepositions"))

        list.add(q("rev250_047", "Choose the option that best completes the gap: 'Here is Mr. Odumusu who teaches English … in our school.'",
            "A. pronuntiation", "B. pronounciation", "C. pronunciation", "D. pronountiation", 2,
            "The correct spelling of the noun is 'pronunciation' (with 'nun', not 'noun').", "2011:Q76", "Spelling"))

        list.add(q("rev250_048", "Choose the option that best completes the gap: 'Instead of … she lied.'",
            "A. pleading", "B. her to plead", "C. her pleading", "D. plead", 0,
            "The preposition 'instead of' must be followed by a gerund ('pleading').", "2011:Q77", "Grammar: Gerunds"))

        list.add(q("rev250_049", "Choose the option that best completes the gap: 'Of the three girls, Uka is the ….'",
            "A. so much notorious", "B. notorious", "C. naught", "D. naughtiest", 3,
            "When comparing three or more entities, the superlative degree ('naughtiest') is required.", "2011:Q78", "Grammar: Adjectives"))

        list.add(q("rev250_050", "Choose the option that best completes the gap: 'I wonder how he will … being absent from school for a long time.'",
            "A. make in", "B. make up", "C. make off", "D. make out", 1,
            "To 'make up' (often followed by 'for') is a phrasal verb meaning to compensate for a lack or lost time.", "2011:Q79", "Phrasal Verbs"))

        list.add(q("rev250_051", "Choose the option that best completes the gap: 'Please sit on the ….'",
            "A. carier", "B. career", "C. carrier", "D. carrear", 2,
            "The device on a bicycle or vehicle used for carrying luggage is spelled 'carrier'.", "2011:Q80", "Spelling"))

        list.add(q("rev250_052", "Choose the option that best completes the gap: 'I want to … this chance to acquaint you with the latest development.'",
            "A. size", "B. seize", "C. sieze", "D. cease", 1,
            "The correct verb meaning to grab or take hold of an opportunity eagerly is 'seize'.", "2011:Q81", "Spelling & Vocabulary"))

        list.add(q("rev250_053", "Choose the option that best completes the gap: 'Getting a well-paid job nowadays is an ….. task.'",
            "A. utmost", "B. upbeat", "C. uphill", "D. upfield", 2,
            "An 'uphill' task is an idiomatic expression representing a highly difficult or demanding challenge.", "2011:Q82", "Idioms"))

        list.add(q("rev250_054", "Choose the option that best completes the gap: 'The secretary has no right to … my affairs.'",
            "A. spy from", "B. meddle in", "C. toy at", "D. complain into", 1,
            "To 'meddle in' is the correct prepositional combination meaning to interfere or intrude in someone else's business.", "2011:Q83", "Prepositions"))

        list.add(q("rev250_055", "Choose the option that best completes the gap: 'Bola studiously avoided … the question.'",
            "A. parrying", "B. answering", "C. projecting", "D. destroying", 1,
            "The verb 'avoid' requires a gerund ('answering') as its direct object.", "2011:Q84", "Grammar: Gerunds"))

        list.add(q("rev250_056", "Choose the option that best completes the gap: 'The school authority dismissed him for …. but I won’t tell you about it yet.'",
            "A. certain reason", "B. a reason", "C. more reason", "D. a certain reason", 3,
            "The singular countable noun phrase is 'a certain reason' to keep the specific motive unspecified.", "2011:Q85", "Grammar: Articles"))

        list.add(q("rev250_057", "Choose the option that has the same vowel sound as the underlined letter: 'b_u_bble'",
            "A. guy", "B. bull", "C. bumper", "D. gurgle", 2,
            "The short 'u' sound /ʌ/ in 'bubble' is identical to the vowel sound in 'bumper' (/ʌ/).", "2011:Q86", "Oral English: Vowels"))

        list.add(q("rev250_058", "Choose the option that has the same vowel sound as the underlined letters: 'w_ei_ght'",
            "A. whale", "B. while", "C. wheat", "D. writhe", 0,
            "The vowel sound in 'weight' is the diphthong /eɪ/, which perfectly matches the sound in 'whale'.", "2011:Q87", "Oral English: Vowels"))

        list.add(q("rev250_059", "Choose the option that has the same vowel sound as the underlined letters: 'l_ea_ch'",
            "A. gear", "B. cedar", "C. cheer", "D. death", 1,
            "The long 'i:' sound in 'leach' matches the first vowel sound in 'cedar'.", "2011:Q88", "Oral English: Vowels"))

        list.add(q("rev250_060", "Choose the option that has the same consonant sound as the underlined letters: 'men_ti_on'",
            "A. that", "B. machine", "C. church", "D. test", 1,
            "The 'ti' in 'mention' produces the voiceless postalveolar fricative /ʃ/, which is also heard in the 'ch' of 'machine'.", "2011:Q89", "Oral English: Consonants"))

        // 2012 Exam Block
        list.add(q("rev250_061", "Select the option that best explains: 'The landlord is fond of throwing his weight about.'",
            "A. The landlord likes healthy exercise", "B. The landlord is overweight", "C. The landlord gives orders to people", "D. The landlord is respected by his tenants", 2,
            "The idiom 'throwing his weight about' means acting in an arrogant, bossy, or domineering manner.", "2012:Q29", "Idioms & Interpretation"))

        list.add(q("rev250_062", "Select the option that best explains: 'The company ought to have issued warrants for one billion shares.'",
            "A. The company has issued one billion shares", "B. The management expected the company to issue more than one billion shares", "C. Members of the company bought less than one billion shares", "D. The company did not issue one billion", 3,
            "The modal perfect 'ought to have issued' implies that the action was desirable but did not actually occur.", "2012:Q30", "Grammar: Modals"))

        list.add(q("rev250_063", "Select the option that best explains: 'As far as Abu is concerned, Mero should be given fifty naira at the most.'",
            "A. All Abu is saying is that Mero probably deserves more than fifty naira and not less", "B. All Abu is concerned with is that Mero should be given nothing more than fifty naira", "C. In Abu’s estimation, Mero merits not more than fifty naira", "D. In Abu’s opinion, Mero deserves fifty naira or probably more", 1,
            "'At the most' acts as an upper limit constraint, meaning fifty naira is the maximum possible amount.", "2012:Q35", "Idioms & Interpretation"))

        list.add(q("rev250_064", "Choose the option opposite in meaning to the italicized word: 'The way the worship was organized was rather *hit-and-miss*.'",
            "A. systematic", "B. hasty", "C. slow", "D. funny", 0,
            "'Hit-and-miss' describes a disorganized, random, or careless arrangement. Its direct antonym is 'systematic'.", "2012:Q50", "Lexis: Antonyms"))

        list.add(q("rev250_065", "Choose the option nearest in meaning to the italicized word: 'Some men will continue to cause offences until they are given a *taste of their own medicine*.'",
            "A. placated", "B. revenged on", "C. recompensed for", "D. cured", 1,
            "To give someone a 'taste of their own medicine' is a figurative idiom meaning to retaliate or be 'revenged on' them by treating them as they treated others.", "2012:Q51", "Idioms & Interpretation"))

        list.add(q("rev250_066", "Choose the option nearest in meaning to the italicized word: 'Okibe was rusticated for his *derogated* remark about the principal.'",
            "A. complimentary", "B. unsavoury", "C. unwarranted", "D. lacklustre", 1,
            "A derogatory or 'derogated' remark is offensive, rude, or 'unsavoury'.", "2012:Q52", "Lexis: Synonyms"))

        list.add(q("rev250_067", "Choose the option nearest in meaning to the italicized word: 'Justice is difficult to enforce because people are unwilling to accept any loss of *sovereignty*.'",
            "A. autonomy", "B. position", "C. leadership", "D. kingdom", 0,
            "'Sovereignty' refers to supreme power, independence, or self-governing 'autonomy'.", "2012:Q53", "Lexis: Synonyms"))

        list.add(q("rev250_068", "Choose the option nearest in meaning to the italicized word: 'There are still *virtuous* women in our society today.'",
            "A. clever", "B. upright", "C. devilish", "D. intelligent", 1,
            "Virtuous means having or showing high moral standards; hence, 'upright' or righteous.", "2012:Q54", "Lexis: Synonyms"))

        list.add(q("rev250_069", "Choose the option nearest in meaning to the italicized word: 'The type of response is *typical* of a lazy teacher.'",
            "A. symptomatic", "B. characteristic", "C. universal", "D. incontestable", 1,
            "'Typical' means serving as a representative specimen or having the 'characteristic' qualities of a group.", "2012:Q55", "Lexis: Synonyms"))

        list.add(q("rev250_070", "Choose the option nearest in meaning to the italicized word: 'Akin is an *inveterate* gambler.'",
            "A. a selfish and self-centred", "B. an extremely unlucky but popular", "C. an incurable but fearful", "D. a long time and incorrigible", 3,
            "'Inveterate' means having a particular habit, activity, or interest that is long-established and unlikely to change (incorrigible).", "2012:Q56", "Lexis: Synonyms"))

        list.add(q("rev250_071", "Choose the option that best completes the gap: 'He was both a writer and a politician, but he was better ........ a singer.'",
            "A. as if", "B. like", "C. as", "D. to be", 2,
            "The comparative construction is 'better as a [noun] than as a [noun]'.", "2012:Q66", "Grammar: Structure"))

        list.add(q("rev250_072", "Choose the option that best completes the gap: 'Vacancies in the company will be notified by ........'",
            "A. bulletin", "B. publication", "C. publicity", "D. advertisement", 3,
            "Public notices of job vacancies are conventionally distributed and published via 'advertisement'.", "2012:Q67", "Lexis & Vocabulary"))

        list.add(q("rev250_073", "Choose the option that best completes the gap: 'The driver was short of petrol, so he ........ down the hills with the engine switched off.'",
            "A. glided", "B. coasted", "C. wheeled", "D. taxied", 1,
            "To 'coast' is to drive or slide down a hill in a vehicle without using engine power.", "2012:Q68", "Lexis & Vocabulary"))

        list.add(q("rev250_074", "Choose the option that best completes the gap: 'He started his career as an ........ teacher.'",
            "A. auxillary", "B. auxilliary", "C. auxilary", "D. auxiliary", 3,
            "The correct spelling of the adjective meaning providing supplementary or additional help is 'auxiliary'.", "2012:Q69", "Spelling"))

        list.add(q("rev250_075", "Choose the option that best completes the gap: 'His many years of success in legal practice, ........ didn’t come without challenges.'",
            "A. indeed", "B. but", "C. in spite of it all", "D. however", 3,
            "The conjunctive adverb 'however' is used parenthetically here to introduce a contrasting or qualifying statement.", "2012:Q70", "Grammar: Conjunctions"))

        list.add(q("rev250_076", "Choose the option that best completes the gap: 'One should be careful how ........ behaves in public, shouldn’t ........?'",
            "A. one/one", "B. he/he", "C. she/one", "D. one/he", 0,
            "To maintain pronoun consistency, the impersonal pronoun 'one' must be paired with 'one' in subsequent clauses and tags.", "2012:Q71", "Grammar: Concord"))

        list.add(q("rev250_077", "Choose the option that best completes the gap: '........, a good leader must have two characteristics.'",
            "A. First and formost", "B. First and formust", "C. First and farmost", "D. First and foremost", 3,
            "The correct spelling of the introductory transition meaning most importantly is 'First and foremost'.", "2012:Q72", "Spelling"))

        list.add(q("rev250_078", "Choose the option that best completes the gap: 'She was ........ the verge of tears.'",
            "A. at", "B. on", "C. by", "D. with", 1,
            "The correct idiomatic prepositional phrase is 'on the verge of', meaning very close to experiencing something.", "2012:Q74", "Prepositions"))

        list.add(q("rev250_079", "Choose the option that best completes the gap: 'Everyone makes mistakes occasionally; nobody is ........'",
            "A. incorrigible", "B. Imperfect", "C. Infallible", "D. indestructible", 2,
            "'Infallible' means incapable of making mistakes or being wrong.", "2012:Q75", "Lexis & Vocabulary"))

        list.add(q("rev250_080", "Choose the option that best completes the gap: 'The woman would not part with her ........ pot.'",
            "A. discarded earthen black", "B. discarded black earthen", "C. earthen discarded black", "D. black earthen discarded", 1,
            "Following the standard order of adjectives in English: Opinion/Evaluation (discarded) + Colour (black) + Material (earthen).", "2012:Q76", "Grammar: Adjectives"))

        list.add(q("rev250_081", "Choose the option that best completes the gap: 'We stood up when the principal came in, ........?'",
            "A. isn’t it", "B. didn’t we", "C. not so", "D. did us", 1,
            "The statement 'We stood up' is in the simple past tense. Its corresponding negative question tag is 'didn't we?'.", "2012:Q77", "Grammar: Question Tags"))

        list.add(q("rev250_082", "Choose the option that best completes the gap: 'The professor of medicine has ........ the mystery of flu.'",
            "A. vetinary / unraveled", "B. vertrinary / unravelled", "C. veterinary / unraveled", "D. veterinary / unravelled", 3,
            "The correct spellings are 'veterinary' and 'unravelled' (double 'l' in British English).", "2012:Q78", "Spelling"))

        list.add(q("rev250_083", "Choose the option that best completes the gap: 'Many workers were ........ as a result of the textile closure.'",
            "A. laid down", "B. laid off", "C. laid out", "D. laid up", 1,
            "To be 'laid off' means to have one's employment terminated due to business closures or downsizing.", "2012:Q80", "Phrasal Verbs"))

        list.add(q("rev250_084", "Choose the option that best completes the gap: 'The driver died in the ........ road accident.'",
            "A. fatal", "B. brutal", "C. serious", "D. pathetic", 0,
            "An accident that results in death is described as 'fatal'.", "2012:Q81", "Lexis & Vocabulary"))

        list.add(q("rev250_085", "Choose the option that best completes the gap: '........ our friendship, we shouldn’t see each other anymore.'",
            "A. Because / over", "B. Since / at", "C. Although /at", "D. As / upon", 1,
            "The logical connector is 'Since' (because), paired with the verb 'frown' which takes the preposition 'at' ('frown at').", "2012:Q82", "Prepositions"))

        list.add(q("rev250_086", "Choose the option that best completes the gap: 'For more productivity, the company is focusing attention on the possible ........ of available resources.'",
            "A. synergy", "B. tapping", "C. alignment", "D. arrangement", 0,
            "'Synergy' refers to the interaction or cooperation of two or more agents/resources to produce a combined effect greater than the sum of their separate parts.", "2012:Q83", "Lexis & Vocabulary"))

        list.add(q("rev250_087", "Choose the option that has the same vowel sound as the underlined letter: 'b_oo_k'",
            "A. cool", "B. cook", "C. fool", "D. tool", 1,
            "The short /ʊ/ sound in 'book' matches the short /ʊ/ vowel sound in 'cook'.", "2012:Q86", "Oral English: Vowels"))

        list.add(q("rev250_088", "Choose the option that has the same vowel sound as the underlined letters: 'vill_a_ge'",
            "A. page", "B. pig", "C. made", "D. came", 1,
            "The second syllable in 'village' is pronounced with the short /ɪ/ sound, which matches 'pig'.", "2012:Q87", "Oral English: Vowels"))

        list.add(q("rev250_089", "Choose the option that has the same vowel sound as the underlined letter: 'p_a_tch'",
            "A. starch", "B. fare", "C. mad", "D. brave", 2,
            "The short /æ/ sound in 'patch' is identical to the vowel sound in 'mad'.", "2012:Q88", "Oral English: Vowels"))

        list.add(q("rev250_090", "Choose the option that has the same consonant sound as the underlined letter: 'tan_g_erine'",
            "A. gear", "B. danger", "C. girl", "D. ignore", 1,
            "The 'g' in 'tangerine' is pronounced as the affricate /dʒ/, which matches the 'g' sound in 'danger'.", "2012:Q89", "Oral English: Consonants"))

        // 2013 Exam Block
        list.add(q("rev250_091", "Choose the option opposite in meaning to the italicized word: 'Chibuzor gave a *curt* nod and walked away.'",
            "A. gentle", "B. rude", "C. polite", "D. shocking", 2,
            "'Curt' means rudely brief or abrupt in manner. Its direct opposite is 'polite'.", "2013:Q46", "Lexis: Antonyms"))

        list.add(q("rev250_092", "Choose the option opposite in meaning to the italicized word: 'The girl took a *cursory* glance at the letter and hid it.'",
            "A. sententious", "B. concise", "C. brief", "D. lasting", 3,
            "'Cursory' means hasty and superficial. Its opposite is 'lasting' or thorough.", "2013:Q47", "Lexis: Antonyms"))

        list.add(q("rev250_093", "Choose the option opposite in meaning to the italicized word: 'The relationship between the couple has been *frosty*.'",
            "A. fraudulent", "B. cordial", "C. amenable", "D. frugal", 1,
            "A 'frosty' relationship is cold and unfriendly. Its antonym is 'cordial' (warm and friendly).", "2013:Q48", "Lexis: Antonyms"))

        list.add(q("rev250_094", "Choose the option opposite in meaning to the italicized word: 'The Nobel laureate’s activity in the field of science is *heinous*.'",
            "A. indelible", "B. laudable", "C. deplorable", "D. forgettable", 1,
            "'Heinous' means utterly wicked or abominable. Its antonym is 'laudable' (praiseworthy).", "2013:Q49", "Lexis: Antonyms"))

        list.add(q("rev250_095", "Choose the option opposite in meaning to the italicized word: 'The accused was *eventually* convicted.'",
            "A. initially", "B. consequently", "C. subsequently", "D. finally", 0,
            "'Eventually' means in the end or after a delay. The opposite is 'initially' (at the beginning).", "2013:Q50", "Lexis: Antonyms"))

        list.add(q("rev250_096", "Choose the option opposite in meaning to the italicized word: 'The *plebs* can be found in every society of the world.'",
            "A. masses", "B. middle class", "C. elite", "D. politicians", 2,
            "'Plebs' refers to the common people or working class. The direct antonym is 'elite' (upper class).", "2013:Q51", "Lexis: Antonyms"))

        list.add(q("rev250_097", "Choose the option opposite in meaning to the italicized word: 'Everyone’s condition was *appalling*.'",
            "A. simple", "B. cloudy", "C. pleasant", "D. complex", 2,
            "'Appalling' means awful, shocking, or terrible. Its antonym is 'pleasant'.", "2013:Q52", "Lexis: Antonyms"))

        list.add(q("rev250_098", "Choose the option opposite in meaning to the italicized word: 'The man’s *mordant* wit is apparent to the entire village.'",
            "A. Kind", "B. scathing", "C. caustic", "D. withering", 0,
            "'Mordant' wit is sharp, biting, and critical (caustic). Its opposite is 'kind' or gentle.", "2013:Q53", "Lexis: Antonyms"))

        list.add(q("rev250_099", "Choose the option opposite in meaning to the italicized word: 'The war against malaria keeps *waxing*.'",
            "A. happening", "B. decreasing", "C. increasing", "D. wavering", 1,
            "To 'wax' means to grow larger or increase. The antonym is 'waning' or 'decreasing'.", "2013:Q54", "Lexis: Antonyms"))

        list.add(q("rev250_100", "Choose the option opposite in meaning to the italicized word: 'The soldiers tried in their *dogged* defence of the city.'",
            "A. indifferent", "B. strong", "C. miserable", "D. classical", 0,
            "'Dogged' means persistent and determined. Its antonym is 'indifferent' (uncaring or unmotivated).", "2013:Q55", "Lexis: Antonyms"))

        list.add(q("rev250_101", "Choose the option nearest in meaning to the italicized word: 'Ayodeji is an *ardent* supporter of education for the girl child.'",
            "A. an optimistic", "B. a cogent", "C. a passionate", "D. an ignorant", 2,
            "'Ardent' means very enthusiastic or passionate.", "2013:Q56", "Lexis: Synonyms"))

        list.add(q("rev250_102", "Choose the option nearest in meaning to the italicized word: 'The scholars’ *epitaph* was demolished.'",
            "A. monument", "B. embodiment", "C. farmland", "D. book", 0,
            "An 'epitaph' is an inscription on a tombstone or a commemorative monument.", "2013:Q57", "Lexis: Synonyms"))

        list.add(q("rev250_103", "Choose the option nearest in meaning to the italicized word: 'Mohammed does his work with so much *ardour*.'",
            "A. enthusiasm", "B. discouragement", "C. knowledge", "D. indifference", 0,
            "'Ardour' means great enthusiasm or passion.", "2013:Q58", "Lexis: Synonyms"))

        list.add(q("rev250_104", "Choose the option nearest in meaning to the italicized word: 'The athlete is proud to be in the *vanguard* of sports development.'",
            "A. unforgettable position", "B. leading position", "C. destructive position", "D. emerging position", 1,
            "The 'vanguard' is the foremost or leading position of an army, movement, or trend.", "2013:Q59", "Lexis: Synonyms"))

        list.add(q("rev250_105", "Choose the option nearest in meaning to the italicized word: 'Nwankwo was on the *verge* of signing a two-year contract with the club.'",
            "A. shore", "B. brink", "C. summit", "D. height", 1,
            "The noun 'verge' means an edge or margin; hence, 'brink'.", "2013:Q60", "Lexis: Synonyms"))

        list.add(q("rev250_106", "Choose the option nearest in meaning to the italicized word: 'I am tired of your *eternal* argument.'",
            "A. open", "B. constant", "C. strong", "D. useless", 1,
            "In this context, 'eternal' is used colloquially to mean endless or 'constant'.", "2013:Q61", "Lexis: Synonyms"))

        list.add(q("rev250_107", "Choose the option nearest in meaning to the italicized word: 'The lamb is a *feeble* little animal.'",
            "A. fat", "B. quiet", "C. loving", "D. weak", 3,
            "'Feeble' means lacking physical strength, especially as a result of age or illness; 'weak'.", "2013:Q62", "Lexis: Synonyms"))

        list.add(q("rev250_108", "Choose the option nearest in meaning to the italicized word: 'The actress *screamed* when she noticed an object behind her.'",
            "A. wailed", "B. protested", "C. waded in", "D. stormed out", 0,
            "To 'scream' is to make a loud, high-pitched cry; hence, to 'wail'.", "2013:Q63", "Lexis: Synonyms"))

        list.add(q("rev250_109", "Choose the option nearest in meaning to the italicized word: 'The exhibition was an *eye opener* to all.'",
            "A. dispatch", "B. display", "C. style", "D. examination", 1,
            "An exhibition is a public show or 'display' of art, products, or skills.", "2013:Q64", "Lexis: Synonyms"))

        list.add(q("rev250_110", "Choose the option nearest in meaning to the italicized word: 'As a journalist, Bala has always had a *nose for* stories.'",
            "A. soft comment", "B. cynical statement", "C. an instinct", "D. a command", 2,
            "To have a 'nose for' something means to have a natural intuitive 'instinct' for discovering it.", "2013:Q65", "Idioms"))

        list.add(q("rev250_111", "Choose the option that best completes the gap: 'The girl says she is averse ........ what others admire.'",
            "A. for", "B. from", "C. to", "D. with", 2,
            "The adjective 'averse' takes the preposition 'to' ('averse to').", "2013:Q66", "Prepositions"))

        list.add(q("rev250_112", "Choose the option that best completes the gap: 'Our teacher defined ........ in his introductory lesson.'",
            "A. onomatopiea", "B. onomatopoeia", "C. onomatoppoeia", "D. onomatopea", 1,
            "The correct spelling of the literary device is 'onomatopoeia'.", "2013:Q67", "Spelling"))

        list.add(q("rev250_113", "Choose the option that best completes the gap: 'The philanthropist devoted himself ........ the poor.'",
            "A. to helping", "B. in helping", "C. by helping", "D. to be helping", 0,
            "The phrase 'devote oneself' is followed by the preposition 'to' + a gerund ('to helping').", "2013:Q68", "Grammar: Gerunds"))

        list.add(q("rev250_114", "Choose the option that best completes the gap: 'Tinu likes apples ........ she does not like oranges.'",
            "A. or", "B. for", "C. so", "D. but", 3,
            "The coordinating conjunction 'but' is used to connect contrasting clauses.", "2013:Q69", "Grammar: Conjunctions"))

        list.add(q("rev250_115", "Choose the option that best completes the gap: 'The students had a ........ on Independence Day.'",
            "A. march past", "B. match pass", "C. march pass", "D. match past", 0,
            "The standard noun phrase representing a ceremonial parade is 'march past'.", "2013:Q70", "Lexis & Vocabulary"))

        list.add(q("rev250_116", "Choose the option that best completes the gap: 'Do you mind ........ another hour or two?'",
            "A. to wait", "B. to have waited", "C. wait", "D. waiting", 3,
            "The verb 'mind' always requires a gerund ('waiting') as its complement.", "2013:Q71", "Grammar: Gerunds"))

        list.add(q("rev250_117", "Choose the option that best completes the gap: 'The continuous rain has really ........ the soil.'",
            "A. melted up", "B. mopped up", "C. satiated", "D. saturated", 3,
            "To 'saturate' means to soak thoroughly, which describes the effect of heavy rain on soil.", "2013:Q72", "Lexis & Vocabulary"))

        list.add(q("rev250_118", "Choose the option that best completes the gap: 'The police described the boy as being ........ hand.'",
            "A. on by", "B. up to", "C. over at", "D. out of", 3,
            "The idiom 'out of hand' means out of control or wild.", "2013:Q73", "Idioms"))

        list.add(q("rev250_119", "Choose the option that best completes the gap: 'It was very easy for the two political parties to form a ........ government.'",
            "A. co-operative", "B. colonial", "C. collusion", "D. coalition", 3,
            "A 'coalition' government is a cabinet formed by multiple political parties cooperating.", "2013:Q74", "Lexis & Politics"))

        list.add(q("rev250_120", "Choose the option that best completes the gap: 'All farmers were encouraged ........ carry out fumigation on their farms.'",
            "A. to", "B. from", "C. in", "D. with", 0,
            "The verb 'encourage' takes the infinitive construction 'encouraged to do something'.", "2013:Q75", "Grammar: Infinitives"))

        // 2014 Exam Block
        list.add(q("rev250_121", "Select the option that best explains: 'The minister considered the ministry’s budget to be a *drop in the ocean* in view of the projects.'",
            "A. The amount available may be inadequate for projected expenditure", "B. The minister maybe dropped for failing to complete a number of projects.", "C. The money approved cannot complete the pipeline project across the ocean.", "D. The pipeline project across the ocean will be abandoned", 0,
            "A 'drop in the ocean' is an idiom representing a very small, insignificant amount compared to what is needed.", "2014:Q36", "Idioms & Interpretation"))

        list.add(q("rev250_122", "Select the option that best explains: 'The robber was *hedged in* by the angry residents.'",
            "A. The robber was surrounded by the people", "B. The robber was killed by the people", "C. The robber was exposed by the people", "D. The robber was caught by the people", 0,
            "To be 'hedged in' means to be enclosed, blocked, or surrounded on all sides.", "2014:Q44", "Idioms & Interpretation"))

        list.add(q("rev250_123", "Select the option that best explains: 'Many workers are not happy because they live a *hand-to-mouth* life.'",
            "A. They work hard with their hands", "B. They are voracious and avaricious", "C. They are barely surviving", "D. They have rejected the use of spoons.", 2,
            "A 'hand-to-mouth' life is an idiom meaning having only just enough money or food to survive day-to-day.", "2014:Q45", "Idioms & Interpretation"))

        list.add(q("rev250_124", "Choose the option opposite in meaning to the italicized word: 'Prolonged strike action *debilitated* the industry.'",
            "A. invigorated", "B. isolated", "C. weakened", "D. destroyed", 0,
            "'Debilitated' means weakened or made feeble. Its direct antonym is 'invigorated' (energized or strengthened).", "2014:Q46", "Lexis: Antonyms"))

        list.add(q("rev250_125", "Choose the option opposite in meaning to the italicized word: 'One of the students bought a *plagiarized* copy of the book.'",
            "A. a used", "B. an original", "C. a revised", "D. an annotated", 1,
            "A 'plagiarized' work is copied from another. The direct antonym is 'an original' work.", "2014:Q47", "Lexis: Antonyms"))

        list.add(q("rev250_126", "Choose the option opposite in meaning to the italicized word: 'The young girl was *taken aback* by her father's gift of a car.'",
            "A. shocked", "B. unmoved", "C. surprised", "D. nonplussed", 1,
            "To be 'taken aback' is to be highly surprised or shocked. Its opposite is 'unmoved'.", "2014:Q48", "Lexis: Antonyms"))

        list.add(q("rev250_127", "Choose the option opposite in meaning to the italicized word: 'Musa is a gifted but *erratic* player.'",
            "A. strong", "B. regular", "C. unpredictable", "D. unstable", 1,
            "'Erratic' means unpredictable, irregular, or inconsistent. The antonym is 'regular'.", "2014:Q49", "Lexis: Antonyms"))

        list.add(q("rev250_128", "Choose the option opposite in meaning to the italicized word: 'The lamp shades were *translucent*.'",
            "A. opaque", "B. interested", "C. luminous", "D. transparent", 0,
            "'Translucent' means semi-transparent, allowing some light to pass. The direct antonym is 'opaque' (blocking all light).", "2014:Q50", "Lexis: Antonyms"))

        list.add(q("rev250_129", "Choose the option opposite in meaning to the italicized word: 'My niece has an *unquenchable* thirst for adventure stories.'",
            "A. a spurious", "B. an illegitimate", "C. a reduced", "D. an inextinguishable", 2,
            "'Unquenchable' (inextinguishable) means impossible to satisfy or reduce. Its opposite is 'reduced'.", "2014:Q51", "Lexis: Antonyms"))

        list.add(q("rev250_130", "Choose the option opposite in meaning to the italicized word: 'Some of my neighbours have an *antipathy* to dogs.'",
            "A. enmity towards", "B. affection for", "C. acronym for", "D. alarm for", 1,
            "'Antipathy' means dislike or hostility. Its antonym is 'affection for'.", "2014:Q52", "Lexis: Antonyms"))

        list.add(q("rev250_131", "Choose the option opposite in meaning to the italicized word: 'The testimony of the witness was *vague*.'",
            "A. disturbing", "B. true", "C. ambiguous", "D. clear", 3,
            "'Vague' means uncertain, indefinite, or unclear. The antonym is 'clear'.", "2014:Q54", "Lexis: Antonyms"))

        list.add(q("rev250_132", "Choose the option opposite in meaning to the italicized word: 'As a student, Isa tried *communal* living for a few years.'",
            "A. collective", "B. general", "C. shared", "D. private", 3,
            "'Communal' means shared or collective. The antonym is 'private'.", "2014:Q55", "Lexis: Antonyms"))

        list.add(q("rev250_133", "Choose the option nearest in meaning to the italicized word: 'The chairman admires *incessant* meetings.'",
            "A. unusual", "B. planned", "C. constant", "D. irregular", 2,
            "'Incessant' means continuing without pause or interruption; 'constant'.", "2014:Q56", "Lexis: Synonyms"))

        list.add(q("rev250_134", "Choose the option nearest in meaning to the italicized word: 'Today's weather is *favourable* for a game of tennis.'",
            "A. impartial", "B. abnormal", "C. encouraging", "D. disapproving", 2,
            "'Favourable' weather is pleasant, helpful, or 'encouraging' for activities.", "2014:Q57", "Lexis: Synonyms"))

        list.add(q("rev250_135", "Choose the option nearest in meaning to the italicized word: 'The candidates looked *aghast* at the first reading of the questions.'",
            "A. fulfilled", "B. dismayed", "C. satisfied", "D. relaxed", 1,
            "'Aghast' means filled with horror or shock; 'dismayed'.", "2014:Q58", "Lexis: Synonyms"))

        list.add(q("rev250_136", "Choose the option nearest in meaning to the italicized word: 'Joke gave Muhammed a *jaunty* smile.'",
            "A. a discouraging", "B. an inviting", "C. a frightful", "D. a cheerful", 3,
            "'Jaunty' means expressing a lively, cheerful, and self-confident manner.", "2014:Q59", "Lexis: Synonyms"))

        list.add(q("rev250_137", "Choose the option nearest in meaning to the italicized word: 'The first round of the tournament was a *doddle*.'",
            "A. easy", "B. balanced", "C. dodgy", "D. exasperating", 0,
            "In British and Nigerian usage, a 'doddle' represents a very easy task.", "2014:Q60", "Lexis: Synonyms"))

        list.add(q("rev250_138", "Choose the option nearest in meaning to the italicized word: 'The man cast a *lustful* glance at his neighbour's property.'",
            "A. hateful", "B. quick", "C. covetous", "D. envious", 2,
            "'Lustful' or 'covetous' means having or showing a strong, inappropriate desire for something.", "2014:Q61", "Lexis: Synonyms"))

        list.add(q("rev250_139", "Choose the option nearest in meaning to the italicized word: 'They accused him of *fomenting* political unrest.'",
            "A. inciting", "B. discouraging", "C. preventing", "D. guiding", 0,
            "To 'foment' means to instigate, stir up, or 'incite' trouble or rebellion.", "2014:Q62", "Lexis: Synonyms"))

        list.add(q("rev250_140", "Choose the option nearest in meaning to the italicized word: 'You can learn a great deal just from *watching* other players.'",
            "A. invent", "B. accumulate", "C. allow", "D. discover", 3,
            "Here, 'watching' allows you to 'discover' or learn techniques used by others.", "2014:Q63", "Lexis: Synonyms"))

        list.add(q("rev250_141", "Choose the option nearest in meaning to the italicized word: 'All the researchers were asked to *garner* information on the new viral infection.'",
            "A. collect", "B. disseminate", "C. distort", "D. give", 0,
            "To 'garner' means to gather, accumulate, or 'collect' something.", "2014:Q64", "Lexis: Synonyms"))

        list.add(q("rev250_142", "Choose the option nearest in meaning to the italicized word: 'The dispute between the two countries has resulted in the *severing* of diplomatic relations.'",
            "A. breaking", "B. securing", "C. swapping", "D. strengthening", 0,
            "'Severing' means cutting off, dissolving, or 'breaking' relations.", "2014:Q65", "Lexis: Synonyms"))

        list.add(q("rev250_143", "Choose the option that best completes the gap: 'The House and The Senate will ______ at noon next Wednesday to hear an address by the president.'",
            "A. convene", "B. adjourn", "C. rise", "D. collude", 0,
            "To 'convene' means to come together or assemble for a formal meeting (typical of legislative bodies).", "2014:Q66", "Lexis & Politics"))

        list.add(q("rev250_144", "Choose the option that best completes the gap: 'At the ______ of the century, many new ways of doing things were introduced.'",
            "A. turn", "B. event", "C. birth", "D. sight", 0,
            "The phrase 'turn of the century' is the standard temporal idiom representing the transition from one century to the next.", "2014:Q67", "Idioms"))

        list.add(q("rev250_145", "Choose the option that best completes the gap: 'You may have the pencil, but you can't have the ballpoint ______.'",
            "A. either", "B. furthermore", "C. also", "D. as well", 3,
            "The phrase 'as well' is placed at the end of a clause to mean 'in addition'.", "2014:Q68", "Grammar: Adverbs"))

        list.add(q("rev250_146", "Choose the option that best completes the gap: 'The president said that the country was not out of the ______ yet.'",
            "A. forest", "B. fog", "C. water", "D. wood", 3,
            "The idiom 'not out of the woods' means not yet free from difficulties, danger, or trouble.", "2014:Q69", "Idioms"))

        list.add(q("rev250_147", "Choose the option that best completes the gap: 'He went to the restaurant to enjoy the special ______.'",
            "A. suite", "B. cuisine", "C. a la carte", "D. chef", 1,
            "'Cuisine' represents a style or method of cooking, especially as characteristic of a particular country or restaurant.", "2014:Q70", "Lexis & Vocabulary"))

        list.add(q("rev250_148", "Choose the option that best completes the gap: 'The invigilator ______ to know how long the examination ______ going on.'",
            "A. wanted/has been", "B. wants/had been", "C. wants/have been", "D. wanted/had been", 3,
            "For tense alignment in indirect reports: past tense 'wanted' aligns with past perfect 'had been'.", "2014:Q71", "Grammar: Tense"))

        // 2015 Exam Block
        list.add(q("rev250_149", "Select the option that best explains: 'Amedu's actions provoked severe criticism.'",
            "A. His actions were seriously rejected", "B. His actions were severe and accepted", "C. His actions were itemized because he was young", "D. His actions provoked the humour", 0,
            "To provoke severe criticism means one's deeds were highly disapproved of or 'seriously rejected' by others.", "2015:Q37", "Idioms & Interpretation"))

        list.add(q("rev250_150", "Select the option that best explains: 'I haven't seen the movie and my brother hasn't either.'",
            "A. I have seen the movie but neither of my brothers has", "B. My brother and I haven't seen the movie", "C. Only my brother has seen the movie", "D. I have seen the movie but my brother hasn't", 1,
            "The coordinates 'haven't... hasn't either' mean that both individuals have not seen the movie.", "2015:Q38", "Grammar: Concord & Meaning"))

        list.add(q("rev250_151", "Choose the option opposite in meaning to the italicized word: 'I like Adamu's *weird* attitude.'",
            "A. Buoyant", "B. Peculiar", "C. Zestful", "D. normal", 3,
            "'Weird' means strange, unusual, or bizarre. The direct antonym is 'normal'.", "2015:Q49", "Lexis: Antonyms"))

        list.add(q("rev250_152", "Choose the option opposite in meaning to the italicized word: 'We travelled to an *obscure* little town.'",
            "A. rugged", "B. Distinguished", "C. Secluded", "D. inglorious", 1,
            "An 'obscure' town is unknown, undistinguished, or hidden. Its antonym is 'Distinguished' (famous or highly prominent).", "2015:Q50", "Lexis: Antonyms"))

        list.add(q("rev250_153", "Choose the option opposite in meaning to the italicized word: 'She is known for her *bizarre* dressing.'",
            "A. Natural", "B. Weird", "C. Obsolete", "D. Odious", 0,
            "'Bizarre' means extremely strange or unusual. Its opposite in style or presentation is 'Natural'.", "2015:Q51", "Lexis: Antonyms"))

        list.add(q("rev250_154", "Choose the option opposite in meaning to the italicized word: 'Lami normally *scurries* around town.'",
            "A. Scampers", "B. Dashes", "C. Dawdles", "D. Scuttles", 2,
            "To 'scurry' is to move hurriedly with short quick steps. The antonym is to 'dawdle' (move slowly and waste time).", "2015:Q52", "Lexis: Antonyms"))

        list.add(q("rev250_155", "Choose the option opposite in meaning to the italicized word: 'Sule’s poem is always *explicit* and compelling.'",
            "A. Exciting", "B. Clear", "C. Ambiguous", "D. Long", 2,
            "'Explicit' means stated clearly and in detail, leaving no room for confusion. The antonym is 'Ambiguous'.", "2015:Q53", "Lexis: Antonyms"))

        list.add(q("rev250_156", "Choose the option nearest in meaning to the italicized word: 'It was a good try but it didn't quite *work out*.'",
            "A. Come to", "B. come off", "C. come from", "D. come for", 1,
            "To 'work out' or 'come off' means to succeed or turn out as planned.", "2015:Q58", "Phrasal Verbs"))

        list.add(q("rev250_157", "Choose the option nearest in meaning to the italicized word: 'Garuba’s performance in the competition was *horrid*.'",
            "A. terrible", "B. encouraging", "C. Commendable", "D. rigid", 0,
            "'Horrid' means extremely unpleasant, offensive, or 'terrible'.", "2015:Q59", "Lexis: Synonyms"))

        list.add(q("rev250_158", "Choose the option opposite in meaning to the italicized word: 'Just give me the basic facts without *needless* details.'",
            "A. relevant", "B. extraneous", "C. essential", "D. critical", 1,
            "Needless or superfluous details are 'extraneous' (irrelevant or unrelated to the subject).", "2015:Q60", "Lexis: Antonyms"))

        list.add(q("rev250_159", "Choose the option opposite in meaning to the italicized word: 'Usman likes toys made with *bright and animated* colours.'",
            "A. dull", "B. sparkling", "C. black", "D. deep", 0,
            "'Animated' or bright, lively colours are countered by 'dull' tones.", "2015:Q61", "Lexis: Antonyms"))

        list.add(q("rev250_160", "Choose the option nearest in meaning to the italicized word: 'The man has strong *distaste* for alcohol.'",
            "A. love", "B. aversion", "C. desire", "D. excitement", 1,
            "A 'distaste' is a strong dislike or 'aversion' towards something.", "2015:Q62", "Lexis: Synonyms"))

        list.add(q("rev250_161", "Choose the option nearest in meaning to the italicized word: 'The *schism* in the organization is on the increase.'",
            "A. disagreement", "B. understanding", "C. opportunity", "D. rot", 0,
            "A 'schism' is a split or division between strongly opposed sections or parties caused by 'disagreement'.", "2015:Q63", "Lexis: Synonyms"))

        list.add(q("rev250_162", "Choose the option opposite in meaning to the italicized word: 'Sule admires people who have *unbending* character.'",
            "A. mobile", "B. steady", "C. wavering", "D. unstable", 2,
            "'Unbending' means rigid, resolute, and uncompromising. Its antonym is 'wavering'.", "2015:Q64", "Lexis: Antonyms"))

        list.add(q("rev250_163", "Choose the option opposite in meaning to the italicized word: 'He *detests* honesty.'",
            "A. likes", "B. hates", "C. encourages", "D. commands", 0,
            "To 'detest' means to hate intensely. The antonym is 'likes'.", "2015:Q65", "Lexis: Antonyms"))

        list.add(q("rev250_164", "Choose the option that best completes the gap: 'The number of stores will be increased ... twenty to thirty.'",
            "A. from", "B. on", "C. at", "D. into", 0,
            "The prepositional pair 'from... to' is used to define ranges or boundaries.", "2015:Q66", "Prepositions"))

        list.add(q("rev250_165", "Choose the option that best completes the gap: '_____ bomb had earlier been defused.'",
            "A. A leaf", "B. An alive", "C. A life", "D. A live", 3,
            "An unexploded bomb that is still active is described as 'a live' bomb.", "2015:Q67", "Lexis & Vocabulary"))

        list.add(q("rev250_166", "Choose the option that best completes the gap: 'The company deals ... computer software.'",
            "A. with", "B. for", "C. in", "D. to", 2,
            "To 'deal in' means to trade, buy, or sell a specific commodity or service.", "2015:Q72", "Prepositions"))

        list.add(q("rev250_167", "Choose the option that best completes the gap: 'There is no logic _____ any of their claims.'",
            "A. with", "B. in", "C. from", "D. up", 1,
            "The noun 'logic' is idiomatically followed by 'in' when evaluating statements or arguments.", "2015:Q73", "Prepositions"))

        list.add(q("rev250_168", "Choose the option that best completes the gap: '______ the old building was an easy task for the demolition squad.'",
            "A. Bringing forth", "B. Tearing down", "C. Bringing up", "D. Tearing with", 1,
            "To 'tear down' is a phrasal verb meaning to demolish or pull down a building.", "2015:Q74", "Phrasal Verbs"))

        list.add(q("rev250_169", "Choose the option that best completes the gap: 'The player sat on the bench ... the match lasted.'",
            "A. since", "B. when", "C. that", "D. while", 3,
            "The conjunction 'while' is used to represent an action occurring concurrently with a duration of time.", "2015:Q75", "Grammar: Conjunctions"))

        list.add(q("rev250_170", "Choose the option that best completes the gap: 'He ran out when he saw the teacher, ...?'",
            "A. didn't he", "B. isn't he", "C. does he", "D. is he", 0,
            "A positive statement in the past tense ('ran') requires a negative past tag ('didn't he?').", "2015:Q76", "Grammar: Question Tags"))

        list.add(q("rev250_171", "Choose the option that best completes the gap: 'Parents should be good examples ... their children.'",
            "A. to", "B. at", "C. from", "D. by", 0,
            "We say someone is a good example 'to' others.", "2015:Q77", "Prepositions"))

        list.add(q("rev250_172", "Choose the option that best completes the gap: 'The prisoners had been ... from all contacts.'",
            "A. kept upon", "B. kept apart", "C. kept for", "D. kept on", 1,
            "To 'keep apart' means to separate, isolate, or prevent contact between entities.", "2015:Q80", "Phrasal Verbs"))

        list.add(q("rev250_173", "Choose the option that best completes the gap: 'We detest these... declared the woman.'",
            "A. types of programmes", "B. type of programmes", "C. types of programme", "D. type of programme", 0,
            "The plural demonstrative 'these' requires plural agreement across both nouns: 'types of programmes'.", "2015:Q81", "Grammar: Concord"))

        list.add(q("rev250_174", "Choose the option that best completes the gap: 'Ilima doesn't like working in the dark, ...?'",
            "A. has she", "B. does she", "C. will she", "D. did she", 1,
            "The negative statement 'doesn't' is answered by the positive present tag 'does she?'.", "2015:Q82", "Grammar: Question Tags"))

        list.add(q("rev250_175", "Choose the option that best completes the gap: 'Oboro will always ... his friends.'",
            "A. stand up for", "B. stand down for", "C. stand across for", "D. stand besides for", 0,
            "To 'stand up for' is a phrasal verb meaning to support, defend, or advocate for someone.", "2015:Q83", "Phrasal Verbs"))

        list.add(q("rev250_176", "Choose the option that best completes the gap: 'She arrived ... air for the occasion.'",
            "A. for", "B. in", "C. with", "D. by", 3,
            "We use 'by' to express the method of travel (e.g., 'by air', 'by road', 'by sea').", "2015:Q84", "Prepositions"))

        list.add(q("rev250_177", "Choose the option that best completes the gap: 'Audu overbalanced and ... the water.'",
            "A. fell into", "B. fell from", "C. fell for", "D. fell at", 0,
            "'Fell into' is the correct prepositional verb showing movement from outside to inside a body of water.", "2015:Q85", "Prepositions"))

        list.add(q("rev250_178", "Choose the option that has the same vowel sound as the one represented by the underlined letters: 'b_o_re'",
            "A. call", "B. curl", "C. slot", "D. hum", 0,
            "The vowel sound in 'bore' is the long open-mid back rounded vowel /ɔː/, which matches 'call'.", "2015:Q86", "Oral English: Vowels"))

        list.add(q("rev250_179", "Choose the option that has the same vowel sound as the one represented by the underlined letters: 'h_ea_d'",
            "A. said", "B. heard", "C. herd", "D. shirt", 0,
            "The short vowel sound /e/ in 'head' is identical to the vowel sound in 'said'.", "2015:Q87", "Oral English: Vowels"))

        list.add(q("rev250_180", "Choose the option that has the same vowel sound as the one represented by the underlined letters: 'sk_y_'",
            "A. cite", "B. eats", "C. breaks", "D. coil", 0,
            "The diphthong /aɪ/ in 'sky' matches the vowel sound in 'cite'.", "2015:Q88", "Oral English: Vowels"))

        list.add(q("rev250_181", "Choose the option that has the same consonant sound as the underlined letters: 'loa_th_'",
            "A. breathe", "B. that", "C. thaw", "D. tank", 2,
            "The 'th' in 'loath' is the voiceless dental fricative /θ/, matching the 'th' in 'thaw'.", "2015:Q89", "Oral English: Consonants"))

        list.add(q("rev250_182", "Choose the option that rhymes with the given word: 'Suite'",
            "A. tree", "B. breath", "C. bleat", "D. sweet", 3,
            "'Suite' is pronounced exactly like 'sweet' (/swiːt/), making them perfect homophones and rhymes.", "2015:Q92", "Oral English: Rhyme"))

        list.add(q("rev250_183", "Choose the option that rhymes with the given word: 'Cart'",
            "A. lash", "B. cat", "C. part", "D. pack", 2,
            "'Cart' and 'part' share the exact same ending sound (/ɑːt/).", "2015:Q93", "Oral English: Rhyme"))

        list.add(q("rev250_184", "Choose the option that rhymes with the given word: 'Sight'",
            "A. skate", "B. short", "C. cite", "D. plait", 2,
            "'Sight' and 'cite' are homophones, both pronounced /saɪt/.", "2015:Q94", "Oral English: Rhyme"))

        list.add(q("rev250_185", "The word in capital letters has emphatic stress: 'Bukola’s UNCLE is a strict teacher.' Choose the option to which the sentence relates.",
            "A. Is Bukola’s uncle a strict cook?", "B. Is Tunde’s uncle a strict teacher?", "C. Is Bukola’s aunt a strict teacher?", "D. Is Bukola’s uncle an easygoing teacher?", 2,
            "An emphatic stress on 'UNCLE' indicates that the specific identity of the relative is the focused information being clarified (Aunt vs. Uncle).", "2015:Q98", "Oral English: Stress"))

        list.add(q("rev250_186", "The word in capital letters has emphatic stress: 'She puts the spoon on the CHAIR.' Choose the option to which the sentence relates.",
            "A. Did she put the fork on the chair?", "B. Did she put the spoon on the table?", "C. Who put the spoon on the chair?", "D. Who took the spoon on the chair?", 1,
            "Stressing 'CHAIR' indicates that the location where the spoon was put is being corrected or clarified.", "2015:Q99", "Oral English: Stress"))

        list.add(q("rev250_187", "The word in capital letters has emphatic stress: 'ASA is a lawyer.' Choose the option to which the sentence relates.",
            "A. Is Asa a robber?", "B. Who is a lawyer?", "C. Is Asa the lawyer?", "D. Was Asa the lawyer?", 1,
            "Stressing the subject 'ASA' means the identity of the person who is a lawyer is the focal point of the question.", "2015:Q100", "Oral English: Stress"))

        // 2016 Exam Block
        list.add(q("rev250_188", "Select the option that best explains: 'The team's poor performance at the tournament plumbed the depths of horror.'",
            "A. the team's performance was rewarded", "B. the team's performance took them to the next round", "C. the team's performance was enjoyed by all", "D. the team's performance was full of disappointment", 3,
            "To 'plumb the depths' of something bad means to reach the absolute lowest point of quality or comfort; hence, it was full of disappointment.", "2016:Q39", "Idioms & Interpretation"))

        list.add(q("rev250_189", "Select the option that best explains: 'He is a clinging child.'",
            "A. He is a bully", "B. He likes to cling with his sister", "C. He is possessive", "D. He is a handsome young man", 2,
            "A 'clinging' child is overly dependent, emotionally demanding, or 'possessive' of caregivers.", "2016:Q40", "Idioms & Interpretation"))

        list.add(q("rev250_190", "Choose the option opposite in meaning to the italicized word: 'The relationship between the couple has been *frosty*.'",
            "A. amenable", "B. fraudulent", "C. cordial", "D. active", 2,
            "The opposite of a 'frosty' (cold) relationship is a 'cordial' (warm/friendly) one.", "2016:Q46", "Lexis: Antonyms"))

        list.add(q("rev250_191", "Choose the option opposite in meaning to the italicized word: 'My niece has an *unquenchable* thirst for adventure stories.'",
            "A. an illegitimate", "B. a spurious", "C. an inextinguishable", "D. a reduced", 3,
            "'Unquenchable' means impossible to satisfy or reduce. The antonym is 'reduced'.", "2016:Q52", "Lexis: Antonyms"))

        list.add(q("rev250_192", "Choose the option opposite in meaning to the italicized word: 'Musa is a gifted but *erratic* player.'",
            "A. regular", "B. strong", "C. unstable", "D. unpredictable", 0,
            "'Erratic' means inconsistent or irregular. Its antonym is 'regular'.", "2016:Q53", "Lexis: Antonyms"))

        list.add(q("rev250_193", "Choose the option opposite in meaning to the italicized word: 'The testimony of the witness was *vague*.'",
            "A. real", "B. factual", "C. true", "D. clear", 3,
            "The opposite of 'vague' is 'clear'.", "2016:Q54", "Lexis: Antonyms"))

        list.add(q("rev250_194", "Choose the option opposite in meaning to the italicized word: 'As a student, Isa tried *communal* living for a few years.'",
            "A. shared", "B. private", "C. collective", "D. general", 1,
            "'Communal' means shared/public. Its antonym is 'private'.", "2016:Q55", "Lexis: Antonyms"))

        list.add(q("rev250_195", "Choose the option opposite in meaning to the italicized word: 'The lamb is a *feeble* little animal.'",
            "A. fat", "B. strong", "C. loving", "D. quite", 1,
            "'Feeble' means weak or fragile. Its direct antonym is 'strong'.", "2016:Q56", "Lexis: Antonyms"))

        list.add(q("rev250_196", "Choose the option nearest in meaning to the italicized word: 'The chairman admires *incessant* meetings.'",
            "A. planned", "B. unusual", "C. irregular", "D. constant", 3,
            "'Incessant' means uninterrupted or constant.", "2016:Q57", "Lexis: Synonyms"))

        list.add(q("rev250_197", "Choose the option nearest in meaning to the italicized word: 'The exhibition was an *eye opener* to all.'",
            "A. dispatch", "B. examination", "C. style", "D. display", 3,
            "An exhibition is a curated 'display'.", "2016:Q58", "Lexis: Synonyms"))

        list.add(q("rev250_198", "Choose the option nearest in meaning to the italicized word: 'The first round of the tournament was a *doddle*.'",
            "A. exasperating", "B. balanced", "C. dodgy", "D. easy", 3,
            "A 'doddle' represents a very simple or 'easy' task.", "2016:Q59", "Lexis: Synonyms"))

        list.add(q("rev250_199", "Choose the option nearest in meaning to the italicized word: 'As a journalist, Bala has always had a *nose for* stories.'",
            "A. a command", "B. cynical statement", "C. soft comment", "D. an instinct", 3,
            "To have a 'nose' for something is to have an intuitive 'instinct' for it.", "2016:Q60", "Idioms"))

        list.add(q("rev250_200", "Choose the option that best completes the gap: 'You live in the city now, _______?'",
            "A. are you", "B. don't you", "C. didn't you", "D. haven't you", 1,
            "The present statement 'You live' requires the negative present tag 'don't you?'.", "2016:Q66", "Grammar: Question Tags"))

        list.add(q("rev250_201", "Choose the option that best completes the gap: 'Concrete is made of _______.'",
            "A. sand and cement", "B. a sand and a cement", "C. sand and a cement", "D. a sand and cement", 0,
            "Both 'sand' and 'cement' are uncountable materials in this context and do not take indefinite articles.", "2016:Q67", "Grammar: Nouns"))

        list.add(q("rev250_202", "Choose the option that best completes the gap: 'Suana ______ that hexagons had five sides, but later he knew they were six-sided figures.'",
            "A. would have believed", "B. had believed", "C. believes", "D. has believed", 1,
            "The past perfect 'had believed' indicates a state of belief that existed prior to another past event ('knew').", "2016:Q68", "Grammar: Tense"))

        list.add(q("rev250_203", "Choose the option that best completes the gap: 'The _______ to the fallen heroes was erected at the market square.'",
            "A. exhibition", "B. monument", "C. myth", "D. picture", 1,
            "A statue or building erected to honor deceased historical figures is a 'monument'.", "2016:Q69", "Lexis & Vocabulary"))

        list.add(q("rev250_204", "Choose the option that best completes the gap: 'The Flying Eagles of Nigeria couldn't have won the match if they hadn't prepared well, _______?'",
            "A. can't they", "B. couldn't they", "C. could they", "D. can they", 2,
            "The conditional negative 'couldn't have won' takes the positive tag 'could they?'.", "2016:Q70", "Grammar: Question Tags"))

        list.add(q("rev250_205", "Choose the option that best completes the gap: 'They all gathered to exhume the _______ musician's corpse for examination.'",
            "A. posthumous", "B. post-mortem", "C. post-natal", "D. orthopaedic", 0,
            "In this exam key, 'posthumous' is chosen to describe occurrences or references associated with a person after death.", "2016:Q71", "Lexis & Vocabulary"))

        list.add(q("rev250_206", "Choose the option that best completes the gap: 'I have been doing this exercise _______.'",
            "A. for five minutes", "B. five minutes ago", "C. since five minutes", "D. during five minutes", 0,
            "The present perfect continuous takes 'for' to represent a duration of time ('five minutes').", "2016:Q72", "Grammar: Prepositions"))

        list.add(q("rev250_207", "Choose the option that best completes the gap: 'Oloyede always sleeps like a baby, _______?'",
            "A. does he", "B. could he", "C. doesn't he", "D. did he", 2,
            "A positive singular statement ('sleeps') takes the negative singular present tag 'doesn't he?'.", "2016:Q73", "Grammar: Question Tags"))

        list.add(q("rev250_208", "Choose the option that best completes the gap: 'The man was given a degree despite the fact that he did not attend _______ university.'",
            "A. an honorary", "B. an honourable", "C. a ceremonial", "D. a regular", 0,
            "An 'honorary' degree is awarded as an honor without requiring standard academic course attendance.", "2016:Q74", "Lexis & Vocabulary"))

        list.add(q("rev250_209", "Choose the option that best completes the gap: 'My father has just bought _______.'",
            "A. a brand new Peugeot car", "B. a car brand new Peugeot", "C. a new brand Peugeot car", "D. a Peugeot brand new", 0,
            "This represents the standard syntactic order of modifiers for a brand and condition: 'a brand new Peugeot car'.", "2016:Q75", "Grammar: Word Order"))

        list.add(q("rev250_210", "Choose the option that best completes the gap: 'The university is a corporate body made _______ different colleges.'",
            "A. in with", "B. of with", "C. up of", "D. up from", 2,
            "To be 'made up of' is the standard phrasal verb meaning to consist of or be composed of.", "2016:Q76", "Phrasal Verbs"))

        list.add(q("rev250_211", "Choose the option that best completes the gap: 'The secretary hadn't _______ money left.'",
            "A. any", "B. anything", "C. none", "D. no", 0,
            "The negative auxiliary 'hadn't' must be paired with 'any' to avoid grammatically incorrect double negatives.", "2016:Q77", "Grammar: Determiners"))

        list.add(q("rev250_212", "Choose the option that best completes the gap: 'The King was recognized _______ the scar on his face.'",
            "A. with", "B. to", "C. by", "D. for", 2,
            "We use the preposition 'by' to express the means or indicator of recognition.", "2016:Q78", "Prepositions"))

        list.add(q("rev250_213", "Choose the option that best completes the gap: 'Nkiru has lots of friends, but I have _______.'",
            "A. only a little", "B. little", "C. only a few", "D. few", 3,
            "To express a contrasting, small number of countable entities (friends), the quantifier 'few' is correct.", "2016:Q79", "Grammar: Quantifiers"))

        list.add(q("rev250_214", "Choose the option that best completes the gap: 'The HOD says she considers her degree certificate _______ than as a prize through labour.'",
            "A. rather as a gift of God", "B. rather God as a gift", "C. as a gift rather of God", "D. as a rather gift of God", 0,
            "This matches the comparative construction: 'considers [X] rather as [A] than as [B]'.", "2016:Q80", "Grammar: Structure"))

        list.add(q("rev250_215", "Choose the option that best completes the gap: 'Mr. Ojo instructed his son to replace the faulty _______ tube.'",
            "A. flurescent", "B. flourescent", "C. fluorescent", "D. florescent", 2,
            "The correct spelling of the light tube is 'fluorescent'.", "2016:Q81", "Spelling"))

        list.add(q("rev250_216", "Choose the option that best completes the gap: 'The employer, not the salesmen, _______ responsible for the loss.'",
            "A. have been", "B. was", "C. were", "D. will be", 1,
            "When a subject is accompanied by parenthetical expressions like 'not the...', the verb agrees strictly with the singular primary subject ('The employer').", "2016:Q82", "Grammar: Concord"))

        list.add(q("rev250_217", "Choose the option that best completes the gap: 'She was _______ as anyone could have had.'",
            "A. as patient a teacher", "B. as a patient teacher", "C. as patient teacher", "D. a patient a teacher", 0,
            "The standard construction is 'as [adjective] a [noun] as' (e.g., 'as patient a teacher as').", "2016:Q83", "Grammar: Structure"))

        list.add(q("rev250_218", "Choose the option that best completes the gap: 'There was a serious _______ between the new couple over feeding allowance.'",
            "A. arguement", "B. argeument", "C. argueing", "D. argument", 3,
            "The correct spelling of the noun is 'argument' (without an 'e' after the 'u').", "2016:Q84", "Spelling"))

        list.add(q("rev250_219", "Choose the option that best completes the gap: 'They thought Musa _______ agree if they altered some of the conditions.'",
            "A. can", "B. may", "C. might", "D. ought", 2,
            "The past tense main verb 'thought' requires the past modal 'might' to maintain tense harmony.", "2016:Q85", "Grammar: Modals"))

        // 2017 & 2018 Exam Block
        list.add(q("rev250_220", "Select the option that best explains: 'But for the expense, I'd buy a bigger car.'",
            "A. I want to buy a bigger car because it is more expensive", "B. I will not buy a bigger car because it is too expensive", "C. I would buy a bigger car if I had more money", "D. I would like to buy a bigger car if it was not so expensive", 1,
            "The structure 'But for X, I would do Y' means 'If it were not for the obstacle of X, I would do Y'. Hence, the car's expense prevents the purchase.", "2017:Q28", "Grammar: Conditionals"))

        list.add(q("rev250_221", "Select the option that best explains: 'No sooner had he got into the pool than the telephone rang.'",
            "A. He didn't get into the pool because the telephone rang", "B. The telephone rang just after he got into the pool", "C. The telephone rang as he was getting into the pool", "D. The telephone rang before he got into the pool", 1,
            "The correlative structure 'No sooner had... than' indicates that the second action followed almost immediately after the first.", "2017:Q29", "Grammar: Inversion"))

        list.add(q("rev250_222", "Select the option that best explains: 'My father said I might just as well stay at home for another year.'",
            "A. I should stay at home because I had no other choice", "B. I might stay at home and do well", "C. Staying at home was probably the best thing for me", "D. I ought to stay at home in order to do well", 3,
            "According to the official exam key, this choice represents the appropriate moral advice context of the father's suggestion.", "2017:Q30", "Idioms & Interpretation"))

        list.add(q("rev250_223", "Choose the option opposite in meaning to the italicized word: 'The King's security men *relegated* to the east.'",
            "A. discharged from", "B. known in", "C. accepted in", "D. hated by", 1,
            "'Relegated' means assigned to an obscure or lower position; hence, the conceptual opposite is being recognized or 'known' prominently.", "2017:Q31", "Lexis: Antonyms"))

        list.add(q("rev250_224", "Choose the option opposite in meaning to the italicized word: 'Mr. Bola is an *irascible* young man.'",
            "A. weak", "B. crabbed", "C. hilarious", "D. rude", 2,
            "'Irascible' means easily angered or hot-tempered. The opposite disposition is 'hilarious' or good-natured.", "2017:Q38", "Lexis: Antonyms"))

        list.add(q("rev250_225", "Choose the option opposite in meaning to the italicized word: 'She became *neurotic* as a result of her performance.'",
            "A. balanced", "B. disturbed", "C. rational", "D. excited", 1,
            "In this specific answer key context, 'neurotic' is contrasted with 'disturbed' (implying a different psychological state).", "2017:Q39", "Lexis: Antonyms"))

        list.add(q("rev250_226", "Choose the option opposite in meaning to the italicized word: 'Malam Aliyu lived in *lack*.'",
            "A. surplus", "B. penury", "C. plenitude", "D. opulence", 1,
            "The opposite of lack is abundance. Here, the key marks penury (contrasting lack/need conceptually in different frameworks).", "2017:Q40", "Lexis: Antonyms"))

        list.add(q("rev250_227", "Choose the option that best completes the gap: 'You have to _______ how to make the whole week a memorable one.'",
            "A. thick up", "B. think on", "C. think about", "D. think at", 1,
            "To 'think on' something is an old or literary phrasal verb meaning to contemplate or plan it.", "2017:Q41", "Phrasal Verbs"))

        list.add(q("rev250_228", "Choose the option that best completes the gap: 'Last week I _______ your friend in the salon.'",
            "A. came into", "B. came by", "C. came across", "D. came over", 2,
            "To 'come across' is a phrasal verb meaning to meet or find someone/something by chance.", "2017:Q42", "Phrasal Verbs"))

        list.add(q("rev250_229", "Choose the option that best completes the gap: 'We might wait a little longer, but he would not _______ soon.'",
            "A. turn out", "B. turn up", "C. turn in", "D. turn over", 1,
            "To 'turn up' is a phrasal verb meaning to arrive or appear.", "2017:Q43", "Phrasal Verbs"))

        list.add(q("rev250_230", "Choose the option that best completes the gap: 'His _______ are tied, so he could not do anything to help her.'",
            "A. shoulders", "B. arms", "C. hands", "D. legs", 2,
            "The idiom 'one's hands are tied' means being unable to act due to constraints or rules.", "2017:Q44", "Idioms"))

        list.add(q("rev250_231", "Choose the option that best completes the gap: 'If you want to be part of the conference, you have to _______ a form on me.'",
            "A. fill up", "B. fill out", "C. fill on", "D. fill over", 0,
            "To 'fill up' or 'fill out' is used for forms. The exam key lists A ('fill up').", "2017:Q45", "Phrasal Verbs"))

        list.add(q("rev250_232", "Choose the option that best completes the gap: 'The flight _______ has been postponed.'",
            "A. schedule", "B. timetable", "C. menu", "D. manifest", 0,
            "A planned program of flights is designated as a 'schedule'.", "2017:Q46", "Lexis & Vocabulary"))

        list.add(q("rev250_233", "Choose the option that best completes the gap: 'My wife should not worry about this trial, I will always _______ her.'",
            "A. stand for", "B. stand by", "C. stand on", "D. stand over", 1,
            "To 'stand by' someone means to remain loyal to them or support them during a trial.", "2017:Q47", "Phrasal Verbs"))

        list.add(q("rev250_234", "Choose the option that best completes the gap: 'I can tell from the way he talks that he _______ his mentor.'",
            "A. takes after", "B. takes up", "C. takes from", "D. takes back", 0,
            "To 'take after' means to resemble a relative or predecessor in character or appearance.", "2017:Q48", "Phrasal Verbs"))

        list.add(q("rev250_235", "Select the option that best explains: 'When asked to state her side of the story, Bunmi started by beating about the bush.'",
            "A. went straight to the point", "B. was lost in great thought", "C. avoided the main issue", "D. went into the forest", 2,
            "To 'beat about the bush' is an idiom meaning to avoid talking about what is important or to avoid the main issue.", "2018:Q23", "Idioms & Interpretation"))

        list.add(q("rev250_236", "Choose the option opposite in meaning to the italicized word: 'For millions of years, the world resources have remained *boundless*.'",
            "A. unlimited", "B. scarce", "C. indomitable", "D. limited", 1,
            "'Boundless' means infinite or unlimited. The conceptual opposite in resource availability is 'scarce' or 'limited'.", "2018:Q41", "Lexis: Antonyms"))

        list.add(q("rev250_237", "Choose the option opposite in meaning to the italicized word: 'The difference between the experimental procedures was *imperceptible* to me.'",
            "A. negligible", "B. significant", "C. obvious", "D. obscure", 1,
            "'Imperceptible' means too slight or gradual to be perceived. The opposite is 'significant' or 'obvious'.", "2018:Q42", "Lexis: Antonyms"))

        list.add(q("rev250_238", "Choose the option opposite in meaning to the italicized word: 'His *anti-apathy* to religious ideas makes him unpopular.'",
            "A. remedy", "B. Consciousness", "C. hostility", "D. receptiveness", 3,
            "Apathy or anti-apathy (active hostility/dislike) is countered by 'receptiveness' or openness.", "2018:Q43", "Lexis: Antonyms"))

        list.add(q("rev250_239", "Choose the option that best completes the gap: 'He was _______ by the trickster.'",
            "A. assisted", "B. duped", "C. enjoined", "D. encouraged", 1,
            "To be 'duped' means to be deceived or tricked.", "2018:Q44", "Lexis & Vocabulary"))

        list.add(q("rev250_240", "Choose the option that best completes the gap: 'When the soldiers saw that resistance was _______, they stopped fighting.'",
            "A. inadequate", "B. inefficient", "C. futile", "D. successful", 2,
            "'Futile' means pointless or useless, which would logically lead soldiers to cease fighting.", "2018:Q45", "Lexis & Vocabulary"))

        list.add(q("rev250_241", "Choose the option that best completes the gap: 'You should read all the _______ carefully before you decide where to go on holiday.'",
            "A. brochures", "B. prospectus", "C. tickets", "D. handouts", 0,
            "Holiday or travel guides designed for consumers are called 'brochures'.", "2018:Q46", "Lexis & Travel"))

        list.add(q("rev250_242", "Choose the option that best completes the gap: 'The Emir and Conqueror of the enemy territories _______ next week.'",
            "A. arrives", "B. are to arrive", "C. arrive", "D. are arriving", 0,
            "Since 'The Emir and Conqueror' refers to a single individual holding both titles, a singular verb ('arrives') is required.", "2018:Q47", "Grammar: Concord"))

        list.add(q("rev250_243", "Choose the option that best completes the gap: 'We ought to have visited the Governor, _______?'",
            "A. isn't it", "B. oughtn't we", "C. shouldn't we", "D. haven't we", 1,
            "The positive modal 'ought to' takes 'oughtn't we?' as its grammatical tag.", "2018:Q48", "Grammar: Question Tags"))

        list.add(q("rev250_244", "Choose the option that best completes the gap: 'He didn't sense Obi's presence in the room, did he? _______'",
            "A. Yes, he did", "B. No, he did", "C. Yes, he didn't", "D. No, he didn't", 3,
            "A negative tag response confirming the negative state ('He didn't') is completed with 'No, he didn't'.", "2018:Q49", "Grammar: Tag Responses"))

        list.add(q("rev250_245", "Choose the option that best completes the gap: 'You can stay here _______ as you are quiet.'",
            "A. as long", "B. so long", "C. in a much", "D. for as long", 0,
            "'As long as' is the complete conditional conjunction meaning 'provided that'.", "2018:Q50", "Grammar: Conjunctions"))

        list.add(q("rev250_246", "Choose the option nearest in meaning to the italicized word: 'The witness *averred* that she had seen Dosun at the scene of the crime.'",
            "A. argued", "B. confirmed", "C. denied", "D. affirmed", 3,
            "To aver means to declare, state positively, or affirm.", "2018:Q51", "Lexis: Synonyms"))

        list.add(q("rev250_247", "Choose the option opposite in meaning to the italicized word: 'The high cost of living these days calls for a lot of *Frugality*.'",
            "A. extravagance", "B. economy", "C. recklessness", "D. prudence", 0,
            "Frugality is economical spending. Its direct antonym is extravagance.", "2018:Q52", "Lexis: Antonyms"))

        list.add(q("rev250_248", "Choose the option that best completes the gap: 'The committee members was sent to _____ the allegations.'",
            "A. investigate", "B. examine", "C. probe", "D. enquire", 0,
            "To 'investigate' is the correct administrative verb meaning to carry out a systematic inquiry into an allegation.", "1988:Q30", "Lexis & Vocabulary"))

        list.add(q("rev250_249", "Choose the option that best completes the gap: 'The audit team was constituted to _____ the financial discrepancies.'",
            "A. investigate", "B. examine", "C. probe", "D. enquire", 0,
            "To investigate is to examine the details and facts systematically.", "1989:Q37", "Lexis & Vocabulary"))

        list.add(q("rev250_250", "Choose the option that best completes the gap: 'The panel decided to _____ thoroughly into the remote causes of the riot.'",
            "A. investigate", "B. examine", "C. probe", "D. enquire", 2,
            "The verb 'probe' collocated with 'into' means to inquire deeply and thoroughly into a matter.", "1990:Q44", "Lexis & Prepositions"))

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
        year: String,
        topic: String
    ): QuestionEntity {
        return QuestionEntity(
            id = "eng_rev250_$id",
            subject = "English Language",
            topic = topic,
            year = year.substringBefore(":").trim(),
            questionText = text,
            optionA = opA,
            optionB = opB,
            optionC = opC,
            optionD = opD,
            correctAnswerIndex = if (ans > 3) 3 else ans,
            explanation = exp,
            difficulty = "Medium",
            originType = "JAMB_ORIGINAL",
            originLabel = year
        )
    }
}
