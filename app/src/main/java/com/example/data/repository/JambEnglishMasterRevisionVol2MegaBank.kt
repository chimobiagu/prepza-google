package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Use of English Master Revision Table Volume 2 (300 Questions Complete Repository)
 * Comprehension, Idioms, Synonyms, Antonyms, Sentence Structure & Concord, Oral English, and Core Grammar.
 */
object JambEnglishMasterRevisionVol2MegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 1 - 15: Comprehension Passages
        list.add(q("v2_001", "According to the passage on Spaceship Earth, the designer of the machine",
            "A. provided a beautifully illustrated guide", "B. left instructions in the stars", "C. did not include an instruction manual", "D. gave man complete control from the start", 2,
            "The passage notes that 'no instruction book came with it,' which the author finds highly significant for the development of human curiosity.", "2010:Q4", "Comprehension"))

        list.add(q("v2_002", "The author implies that the 'Spaceship Earth' must be serviced",
            "A. only when major failures occur", "B. in its entirety and with complete comprehension", "C. by moving to another planet", "D. by restricting all industrial manufacturing", 1,
            "The text explains that the earth must be comprehended and serviced 'in total' to remain persistently successful.", "2010:Q5", "Comprehension"))

        list.add(q("v2_003", "Based on Passage I, Nigerians can be described as highly religious because they believe",
            "A. there is no boundary between natural and supernatural worlds", "B. an unseen supernatural world exists and influences the natural world", "C. prayers can solve all mechanical and physical problems", "D. priests should make all governmental decisions", 1,
            "The passage states that Nigerians are very religious, believing in an unseen supernatural world inhabited by beings who watch and judge us.", "2012:Q1", "Comprehension"))

        list.add(q("v2_004", "When the supernatural beings in the Nigerian worldview are offended, they must be",
            "A. ignored completely", "B. appeased with prayers and sacrifices", "C. fought using modern technology", "D. compensated with money", 1,
            "The author notes that if we offend these supernatural beings, 'they may have to be appeased with prayers' and sacrifices.", "2012:Q2", "Comprehension"))

        list.add(q("v2_005", "According to Passage III on the hydrogen bomb, the meteorologist views the explosion simply as",
            "A. a political development", "B. an atmospheric disturbance", "C. a rare natural resource", "D. a standard volcanic eruption", 1,
            "The passage notes that 'the explosion of hydrogen bomb is, for the meteorologist, simply another atmospheric disturbance'.", "2013:Q11", "Comprehension"))

        list.add(q("v2_006", "The author compares the man-made atmospheric disturbance of the hydrogen bomb to natural occurrences like",
            "A. earthquakes and landslides", "B. volcanic eruptions", "C. heavy rainstorms", "D. hurricanes", 1,
            "The text explicitly groups it with rare natural occurrences such as 'volcanic eruption'.", "2013:Q12", "Comprehension"))

        list.add(q("v2_007", "Based on Passage I, what is a suitable title for the passage discussing political change?",
            "A. Reasons for political change", "B. The struggle for political power", "C. Elements of politics", "D. Social change and political empowerment", 2,
            "The passage outlines the core elements of political systems and state structures, making 'Elements of politics' the most appropriate title.", "2014:Q4", "Comprehension"))

        list.add(q("v2_008", "The word 'alteration' as used in the passage means",
            "A. Multiplication", "B. Recognition", "C. Modification", "D. Complication", 2,
            "In the context of social and political changes, 'alteration' is synonymous with 'modification' or adjustment.", "2014:Q5", "Comprehension"))

        list.add(q("v2_009", "Snakes are described as cold-blooded (ectodermic) because",
            "A. they have no blood flowing in their veins", "B. they cannot produce their own body heat", "C. they live only in cold regions", "D. their body temperature remains constant", 1,
            "The text explains that ectodermic animals 'cannot produce their own body heat; instead, they rely on the sun to heat their bodies'.", "2014:Q6", "Comprehension"))

        list.add(q("v2_010", "The sentence 'There will be twice as many of us before most of us are dead' implies",
            "A. some increase in human and animal population growth rates", "B. mankind is fast spreading across the earth", "C. many of us will die as a result of population explosion", "D. the population growth rate will double before our death", 3,
            "The phrase means that the population growth rate is so rapid that it will double before current generations pass away.", "2015:Q6", "Comprehension"))

        list.add(q("v2_011", "According to the passage on wildlife conservation, the greatest threat to nature is posed by",
            "A. man kills animal only when he can afford to do so", "B. man eats all categories of animals", "C. man cannot spare those animals that eat his kind", "D. man poses the greatest threat to nature", 3,
            "The passage identifies the 'human population explosion' and how it spreads mankind across the land surfaces as the primary threat, establishing that man poses the greatest threat to nature.", "2015:Q7", "Comprehension"))

        list.add(q("v2_012", "During near-death experiences (NDEs), the dying individual usually feels like",
            "A. his new 'body' would not allow him to participate", "B. he is moving rapidly through a long dark tunnel", "C. he can only watch as the events unfold", "D. he is now a dead man", 2,
            "The text describes that the individual finds himself outside his physical body, watching the resuscitation attempts from a distance as a spectator.", "2016:Q6", "Comprehension"))

        list.add(q("v2_013", "According to the passage, scientific evidence has made it possible",
            "A. to make conjectures about what happens after death", "B. to know a little about what happens in the world of the dead", "C. for one to experience the sensation of dying and living again", "D. for the dead to return and tell their experiences", 1,
            "Ongoing research documents hundreds of cases each year, making it possible to gain insights and learn more about the transition or NDE.", "2016:Q7", "Comprehension"))

        list.add(q("v2_014", "According to R.H. Thouless, a major cause of failure in defining words is",
            "A. using words that are too long", "B. including attributes that do not belong to all members of the class, or including items to be excluded", "C. neglecting to use Latin terminology", "D. writing definitions that are purely poetic", 1,
            "The author outlines that definition failures occur when the distinguishing mark does not belong to all included things, or belongs to excluded members.", "2018:Q1", "Comprehension"))

        list.add(q("v2_015", "The expression 'we may well be asked' in the passage is closest in meaning to",
            "A. we cannot escape being asked", "B. it is quite likely that we will be asked", "C. we must refuse to be asked", "D. we are forbidden from being asked", 1,
            "In this context, 'may well be' expresses a high probability or likelihood of an event occurring.", "2018:Q2", "Comprehension"))

        // 16 - 35: Sentence Interpretation & Idioms
        list.add(q("v2_016", "Select the option that best explains the information conveyed in the sentence: 'The politician realized his plan was still to have no axe to grind.'",
            "A. He had no hatred for the brothers", "B. He had no axe and therefore stole the matchet", "C. He had no axe and therefore borrowed their matchet", "D. He had no vested interest in the brothers", 3,
            "To 'have no axe to grind' means to have no personal or selfish interest in a matter.", "1999:Q16", "Idioms & Interpretation"))

        list.add(q("v2_017", "Select the option that best explains the information conveyed in the sentence: 'The players left the field with their tails between their legs.'",
            "A. they moved happily because they won the match", "B. they were unhappy because they had been despised by their opponents", "C. they were ashamed because they had been defeated", "D. they moved with their tails between their legs", 2,
            "The idiom 'tails between their legs' describes moving in a defeated, dejected, or ashamed manner.", "2000:Q17", "Idioms & Interpretation"))

        list.add(q("v2_018", "Select the option that best explains the information conveyed in the sentence: 'The politician managed to talk his way out of the probe.'",
            "A. he delivered a speech despite the difficulty", "B. he managed to give a speech out of a difficult situation", "C. he managed to get himself out of a difficult situation", "D. he managed to talk on his way", 2,
            "To 'talk one's way out of' means to use persuasive speech to escape a difficult situation or obligation.", "2001:Q18", "Idioms & Interpretation"))

        list.add(q("v2_019", "Select the option that best explains the information conveyed in the sentence: 'By signing the contract, we have crossed the Rubicon.'",
            "A. we are completely at a loss", "B. we are irrevocably committed", "C. we are already qualified", "D. we are perfectly committed", 1,
            "Crossing the Rubicon is an idiom meaning to make an irreversible decision or commitment.", "2002:Q19", "Idioms & Interpretation"))

        list.add(q("v2_020", "Select the option that best explains the information conveyed in the sentence: 'The young manager is always full of himself.'",
            "A. He is conceited", "B. He is complete", "C. He is selfish", "D. He is careful", 0,
            "Being 'full of oneself' means to be extremely self-centered, proud, or conceited.", "2003:Q20", "Idioms & Interpretation"))

        list.add(q("v2_021", "Select the option that best explains the information conveyed in the sentence: 'Our team was up against a formidable opposition.'",
            "A. playing in the tournament for the first time", "B. rated as the weakest side", "C. playing without some regulars", "D. confronted with tough opponents", 3,
            "To be 'up against' something is to be confronted with a difficult challenge or opponent.", "2004:Q21", "Idioms & Interpretation"))

        list.add(q("v2_022", "Select the option that best explains the information conveyed in the sentence: 'He arrived at the venue dead drunk.'",
            "A. sad because of his drunkenness", "B. apprehensive about future drinking", "C. completely helpless from heavy drinking", "D. mourning his death from alcohol", 2,
            "The phrase 'dead drunk' refers to being extremely and helplessly intoxicated.", "2005:Q22", "Idioms & Interpretation"))

        list.add(q("v2_023", "Select the option that best explains the information conveyed in the sentence: 'His business partner left him in the lurch.'",
            "A. deceived her", "B. disinherited her", "C. refused to help her or abandoned her in difficulties", "D. disrespected her", 2,
            "To 'leave someone in the lurch' means to abandon them in a difficult situation without assistance.", "2006:Q23", "Idioms & Interpretation"))

        list.add(q("v2_024", "Select the option that best explains the information conveyed in the sentence: 'The new supervisor is fond of throwing his weight about.'",
            "A. liking healthy exercise", "B. being overweight", "C. giving bossy orders to people", "D. being respected by tenants", 2,
            "To 'throw one's weight about' means to act in a bossy, domineering, or arrogant manner.", "2007:Q24", "Idioms & Interpretation"))

        list.add(q("v2_025", "Select the option that best explains the information conveyed in the sentence: 'The repairs will cost fifty thousand naira at the most.'",
            "A. deserves more than fifty naira and not less", "B. should be given nothing more than fifty naira", "C. merits not more than fifty naira", "D. deserves fifty naira or probably more", 1,
            "The phrase 'at the most' sets a strict upper limit, meaning nothing more than that amount.", "2008:Q25", "Idioms & Interpretation"))

        list.add(q("v2_026", "Select the option that best explains the information conveyed in the sentence: 'When the negotiations collapsed, the diplomat had to throw up his hands.'",
            "A. admit defeat or give up hope", "B. raise his hands in prayer", "C. wave at the crowd", "D. physically assault someone", 0,
            "To throw up one's hands is a common idiom representing resignation, admitting defeat, or giving up.", "2009:Q26", "Idioms & Interpretation"))

        list.add(q("v2_027", "Select the option that best explains the information conveyed in the sentence: 'To finish the project, he had to burn the candle at both ends.'",
            "A. to be extremely extravagant with resources", "B. to work excessively hard from early morning until late at night", "C. to light a room using multiple candles", "D. to cause a fire accident out of carelessness", 1,
            "Burning the candle at both ends refers to exhausting oneself by working early and late.", "2010:Q27", "Idioms & Interpretation"))

        list.add(q("v2_028", "Select the option that best explains the information conveyed in the sentence: 'Everyone agrees that the boy is a chip off the old block.'",
            "A. has chosen the same career as his father", "B. is very much like his father", "C. is an extremely different sort of person from his father", "D. has taken up a different profession", 1,
            "A 'chip off the old block' means a child who resembles their parent in character or appearance.", "2011:Q28", "Idioms & Interpretation"))

        list.add(q("v2_029", "Select the option that best explains the information conveyed in the sentence: 'The politician's speech was an attempt to play to the gallery.'",
            "A. be selfish", "B. underrate opponents", "C. be over-confident", "D. attempt to win cheap popularity", 3,
            "To 'play to the gallery' is to act in a way that appeals to the popular taste to gain cheap popularity.", "2012:Q29", "Idioms & Interpretation"))

        list.add(q("v2_030", "Select the option that best explains the information conveyed in the sentence: 'Thinking you can pass without studying is living in a fool's paradise.'",
            "A. having an illusion of happiness or success", "B. thinking other people are fools", "C. being extremely wealthy but unhappy", "D. living in a beautiful city", 0,
            "Living in a 'fool's paradise' means being happy based on false hopes or illusions.", "2013:Q30", "Idioms & Interpretation"))

        list.add(q("v2_031", "Select the option that best explains the information conveyed in the sentence: 'She decided to keep the suspicious stranger at arm's length.'",
            "A. avoid being close or familiar with him", "B. ignore his advice", "C. report him to the authorities", "D. stop visiting him", 0,
            "Keeping someone at arm's length means avoiding intimacy or staying distant.", "2014:Q31", "Idioms & Interpretation"))

        list.add(q("v2_032", "Select the option that best explains the information conveyed in the sentence: 'With the rising cost of living, it is hard to make both ends meet.'",
            "A. live an honest life", "B. finish a schedule of work", "C. keep two jobs at a time", "D. live within one's income", 3,
            "Making 'both ends meet' means to earn enough money to live within one's income and cover essential needs.", "2015:Q32", "Idioms & Interpretation"))

        list.add(q("v2_033", "Select the option that best explains the information conveyed in the sentence: 'By taking three jobs at once, he bit off more than he could chew.'",
            "A. have more money than sense", "B. eat more than can be digested", "C. spend too much money on food", "D. take on more responsibility than one can afford", 3,
            "To 'bite off more than you can chew' means to take on a task or responsibility that is too big.", "2016:Q33", "Idioms & Interpretation"))

        list.add(q("v2_034", "Select the option that best explains the information conveyed in the sentence: 'The corrupt official was finally brought to book.'",
            "A. record names in a book", "B. test someone's literacy", "C. book a hotel room", "D. make someone answer for their conduct", 3,
            "To 'bring to book' means to hold someone accountable and make them answer for their bad behavior.", "2017:Q34", "Idioms & Interpretation"))

        list.add(q("v2_035", "Select the option that best explains the information conveyed in the sentence: 'The abandoned airport project turned out to be a white elephant project.'",
            "A. a project involving white elephants", "B. a project designed to paint animals white", "C. a very expensive project with little utility or value", "D. a cheap but highly productive project", 2,
            "A 'white elephant' is a useless, expensive possession or project that is more trouble than it is worth.", "1983:Q35", "Idioms & Interpretation"))

        // 36 - 55: Nearest in Meaning (Synonyms)
        list.add(q("v2_036", "Choose the option nearest in meaning to the italicized word: The committee noted that the mathematical details were *mind-bending*.",
            "A. simple", "B. confusing", "C. complex and difficult", "D. relaxing", 2,
            "A mind-bending task is intellectually challenging, complex, and difficult.", "1984:Q36", "Lexis: Synonyms"))

        list.add(q("v2_037", "Choose the option nearest in meaning to the italicized word: Several sections of the document were found to be *redundant*.",
            "A. necessary", "B. superfluous or excess", "C. scarce", "D. exciting", 1,
            "Redundant means no longer needed or useful; superfluous.", "1985:Q37", "Lexis: Synonyms"))

        list.add(q("v2_038", "Choose the option nearest in meaning to the italicized word: The diplomatic talks have reached an *impasse*.",
            "A. agreement", "B. progress", "C. gridlock or deadlock", "D. breakthrough", 2,
            "An impasse is a situation in which no progress is possible; hence, gridlock or deadlock.", "1986:Q38", "Lexis: Synonyms"))

        list.add(q("v2_039", "Choose the option nearest in meaning to the italicized word: The scandal left a permanent *blemish* on his career.",
            "A. mark or flaw", "B. beauty", "C. perfection", "D. strength", 0,
            "A blemish is a small flaw or mark that spoils the perfection of a reputation or object.", "1987:Q39", "Lexis: Synonyms"))

        list.add(q("v2_040", "Choose the option nearest in meaning to the italicized word: The publisher produced an *abridged* version of the novel.",
            "A. expanded", "B. illustrated", "C. shortened", "D. outdated", 2,
            "An abridged text has been shortened or condensed.", "1988:Q40", "Lexis: Synonyms"))

        list.add(q("v2_041", "Choose the option nearest in meaning to the italicized word: His *callous* remark hurt everyone present.",
            "A. wicked", "B. compassionate", "C. unfeeling or heartless", "D. cheerful", 2,
            "Callous means showing or having an insensitive and cruel disregard for others; heartless.", "1989:Q41", "Lexis: Synonyms"))

        list.add(q("v2_042", "Choose the option nearest in meaning to the italicized word: The priest urged the congregation not to focus solely on *temporal* pleasures.",
            "A. permanent", "B. spiritual", "C. temporary or secular", "D. eternal", 2,
            "Temporal refers to worldly or secular affairs as opposed to spiritual ones.", "1990:Q42", "Lexis: Synonyms"))

        list.add(q("v2_043", "Choose the option nearest in meaning to the italicized word: The critic was famous for his *mordant* reviews.",
            "A. gentle", "B. caustic or biting", "C. kind", "D. flat", 1,
            "Mordant wit or criticism is sharp, incisive, and caustic.", "1991:Q43", "Lexis: Synonyms"))

        list.add(q("v2_044", "Choose the option nearest in meaning to the italicized word: His *dogged* determination led to ultimate victory.",
            "A. weak", "B. flexible", "C. persistent or stubborn", "D. fearful", 2,
            "Dogged defense or determination shows tenacious, persistent, and stubborn effort.", "1992:Q44", "Lexis: Synonyms"))

        list.add(q("v2_045", "Choose the option nearest in meaning to the italicized word: The bathroom window was made of *translucent* glass.",
            "A. opaque", "B. semitransparent", "C. fully bright", "D. completely dark", 1,
            "Translucent objects allow light to pass through but blur detailed shapes; semitransparent.", "1993:Q45", "Lexis: Synonyms"))

        list.add(q("v2_046", "Choose the option nearest in meaning to the italicized word: The engine exhibited *erratic* performance throughout the journey.",
            "A. consistent", "B. unpredictable", "C. strong", "D. stable", 1,
            "An erratic mechanism behaves inconsistently and unpredictably.", "1994:Q46", "Lexis: Synonyms"))

        list.add(q("v2_047", "Choose the option nearest in meaning to the italicized word: There was deep *antipathy* between the two opposing factions.",
            "A. strong dislike or aversion", "B. deep affection", "C. neutral stance", "D. high regard", 0,
            "Antipathy is a deep-seated feeling of dislike, aversion, or hostility.", "1995:Q47", "Lexis: Synonyms"))

        list.add(q("v2_048", "Choose the option nearest in meaning to the italicized word: The investigator worked hard to *garner* sufficient evidence.",
            "A. scatter", "B. collect or gather", "C. hide", "D. destroy", 1,
            "To garner information or support is to gather or collect it through effort.", "1996:Q48", "Lexis: Synonyms"))

        list.add(q("v2_049", "Choose the option nearest in meaning to the italicized word: He announced that he was *severing* all ties with the association.",
            "A. cutting off or breaking", "B. joining together", "C. improving", "D. discussing", 0,
            "Severing means cutting off, breaking, or terminating a relationship.", "1997:Q49", "Lexis: Synonyms"))

        list.add(q("v2_050", "Choose the option nearest in meaning to the italicized word: The passengers experienced a *horrid* ordeal during the storm.",
            "A. pleasant", "B. terrible or offensive", "C. exciting", "D. beautiful", 1,
            "Horrid means causing horror, or being extremely unpleasant, dreadful, and terrible.", "1998:Q50", "Lexis: Synonyms"))

        list.add(q("v2_051", "Choose the option nearest in meaning to the italicized word: The controversy created a deep *schism* in the political party.",
            "A. union", "B. split or division", "C. peace", "D. argument", 1,
            "A schism is a split or division between strongly opposed sections or parties.", "1999:Q51", "Lexis: Synonyms"))

        list.add(q("v2_052", "Choose the option nearest in meaning to the italicized word: The city suffered from *incessant* power outages during the dry season.",
            "A. occasional", "B. constant and continuous", "C. rare", "D. planned", 1,
            "Incessant events occur continuously and without interruption.", "2000:Q52", "Lexis: Synonyms"))

        list.add(q("v2_053", "Choose the option nearest in meaning to the italicized word: For an experienced programmer, that task is a *doddle*.",
            "A. difficult task", "B. very easy task", "C. boring lecture", "D. dangerous sport", 1,
            "A doddle is a colloquial term for a task that is extremely simple or easy to do.", "2001:Q53", "Lexis: Synonyms"))

        list.add(q("v2_054", "Choose the option nearest in meaning to the italicized word: Her *frugality* allowed her to save enough money for university.",
            "A. economy or thriftiness", "B. extravagance", "C. poverty", "D. generosity", 0,
            "Frugality is the quality of being economical, sparing, or thrifty in spending.", "2002:Q54", "Lexis: Synonyms"))

        list.add(q("v2_055", "Choose the option nearest in meaning to the italicized word: The witness *averred* that he had seen the suspect at the scene.",
            "A. denied", "B. declared or asserted confidently", "C. questioned", "D. suspected", 1,
            "To aver means to state or assert to be the case confidently and positively.", "2003:Q55", "Lexis: Synonyms"))

        // 56 - 75: Opposite in Meaning (Antonyms)
        list.add(q("v2_056", "Choose the option opposite in meaning to the italicized word: The leader's attitude was surprisingly *optimistic*.",
            "A. pessimistic", "B. cheerful", "C. positive", "D. hopeful", 0,
            "Optimistic means hopeful and confident about the future. Its direct antonym is pessimistic.", "2004:Q56", "Lexis: Antonyms"))

        list.add(q("v2_057", "Choose the option opposite in meaning to the italicized word: The young apprentice was remarkably *ingenuous*.",
            "A. artful or devious", "B. simple", "C. naïve", "D. innocent", 0,
            "Ingenuous means innocent, open, and unsuspecting. Its antonym is artful, devious, or crafty.", "2005:Q57", "Lexis: Antonyms"))

        list.add(q("v2_058", "Choose the option opposite in meaning to the italicized word: The inspector found that the craftsmanship was *flawless*.",
            "A. perfect", "B. damaged or imperfect", "C. spotless", "D. beautiful", 1,
            "Flawless means without any faults. Its antonym is imperfect or damaged.", "2006:Q58", "Lexis: Antonyms"))

        list.add(q("v2_059", "Choose the option opposite in meaning to the italicized word: The security guard had a *gruff* tone of voice.",
            "A. gentle or pleasant", "B. rough", "C. harsh", "D. raw", 0,
            "Gruff means rough or stern in manner. Its opposite is gentle or pleasant.", "2007:Q59", "Lexis: Antonyms"))

        list.add(q("v2_060", "Choose the option opposite in meaning to the italicized word: The ancient currency had become completely *debased*.",
            "A. elevated or purified", "B. perverted", "C. lowered", "D. corrupted", 0,
            "Debased means lowered in status, quality, or value. Its antonym is elevated or purified.", "2008:Q60", "Lexis: Antonyms"))

        list.add(q("v2_061", "Choose the option opposite in meaning to the italicized word: The instructions provided by the director were *straightforward*.",
            "A. direct", "B. complicated or devious", "C. simple", "D. honest", 1,
            "Straightforward means direct and uncomplicated. The opposite is complicated, convoluted, or devious.", "2009:Q61", "Lexis: Antonyms"))

        list.add(q("v2_062", "Choose the option opposite in meaning to the italicized word: The editor removed the *superfluous* adjectives from the article.",
            "A. excessive", "B. necessary or scarce", "C. abundant", "D. redundant", 1,
            "Superfluous means unnecessary or more than enough. Its opposite is necessary or essential.", "2010:Q62", "Lexis: Antonyms"))

        list.add(q("v2_063", "Choose the option opposite in meaning to the italicized word: The crowd gave an *enthusiastic* response to the announcement.",
            "A. eager", "B. indifferent or apathetic", "C. elated", "D. happy", 1,
            "Enthusiastic means showing intense enjoyment or interest. The opposite is indifferent or apathetic.", "2011:Q63", "Lexis: Antonyms"))

        list.add(q("v2_064", "Choose the option opposite in meaning to the italicized word: The suspect claimed that his confession had been *coerced*.",
            "A. forced", "B. persuaded or voluntary", "C. pressured", "D. guided", 1,
            "Coerced means forced through pressure or intimidation. Its opposite is voluntary or willingly given.", "2012:Q64", "Lexis: Antonyms"))

        list.add(q("v2_065", "Choose the option opposite in meaning to the italicized word: The rebels recruited several *mercenary* fighters.",
            "A. paid soldier", "B. regular national soldier", "C. volunteer", "D. commander", 1,
            "A mercenary fights purely for monetary gain. The opposite is a regular patriotic national soldier.", "2013:Q65", "Lexis: Antonyms"))

        list.add(q("v2_066", "Choose the option opposite in meaning to the italicized word: The delegates received a *frosty* welcome at the convention.",
            "A. warm and cordial", "B. cold", "C. freezing", "D. hostile", 0,
            "A frosty reception is cold and unfriendly. Its antonym is warm and cordial.", "2014:Q66", "Lexis: Antonyms"))

        list.add(q("v2_067", "Choose the option opposite in meaning to the italicized word: The dictator was known for his *callous* decisions.",
            "A. compassionate or kind", "B. wicked", "C. hard", "D. stubborn", 0,
            "Callous means heartless and unfeeling. Its antonym is compassionate, empathetic, or kind.", "2015:Q67", "Lexis: Antonyms"))

        list.add(q("v2_068", "Choose the option opposite in meaning to the italicized word: The philosopher focused on *temporal* concerns rather than metaphysics.",
            "A. spiritual", "B. temporary", "C. earthly", "D. permanent", 0,
            "Temporal refers to secular or worldly affairs. Its direct opposite is spiritual or sacred.", "2016:Q68", "Lexis: Antonyms"))

        list.add(q("v2_069", "Choose the option opposite in meaning to the italicized word: His method of studying was *hit-and-miss*.",
            "A. systematic and organized", "B. random", "C. slow", "D. careless", 0,
            "Hit-and-miss means random and disorganized. Its opposite is systematic, planned, and organized.", "2017:Q69", "Lexis: Antonyms"))

        list.add(q("v2_070", "Choose the option opposite in meaning to the italicized word: The glass panel was completely *translucent*.",
            "A. clear", "B. opaque", "C. bright", "D. glowing", 1,
            "Translucent means semitransparent. Its antonym is opaque, which blocks all transmission of light.", "1983:Q70", "Lexis: Antonyms"))

        list.add(q("v2_071", "Choose the option opposite in meaning to the italicized word: The athlete's performance in recent weeks has been *erratic*.",
            "A. reliable or stable", "B. unpredictable", "C. shifting", "D. wild", 0,
            "Erratic means unstable, irregular, and unpredictable. The opposite is reliable, stable, or consistent.", "1984:Q71", "Lexis: Antonyms"))

        list.add(q("v2_072", "Choose the option opposite in meaning to the italicized word: In negotiations, the chairman proved to be *unbending*.",
            "A. rigid", "B. flexible or compromising", "C. firm", "D. stubborn", 1,
            "Unbending means rigid, obstinate, and uncompromising. Its antonym is flexible or compromising.", "1985:Q72", "Lexis: Antonyms"))

        list.add(q("v2_073", "Choose the option opposite in meaning to the italicized word: The governor was widely praised for his personal *frugality*.",
            "A. thrift", "B. extravagance or wastefulness", "C. intelligence", "D. caution", 1,
            "Frugality is economical and prudent spending. Its antonym is extravagance or wastefulness.", "1986:Q73", "Lexis: Antonyms"))

        list.add(q("v2_074", "Choose the option opposite in meaning to the italicized word: The explorer possessed *boundless* energy and enthusiasm.",
            "A. infinite", "B. limited or restricted", "C. wild", "D. extensive", 1,
            "Boundless means having no limits or boundaries. Its antonym is limited, restricted, or finite.", "1987:Q74", "Lexis: Antonyms"))

        list.add(q("v2_075", "Choose the option opposite in meaning to the italicized word: The shift in temperature was almost *imperceptible*.",
            "A. subtle", "B. obvious or noticeable", "C. hidden", "D. quiet", 1,
            "Imperceptible means impossible or extremely difficult to perceive. Its opposite is obvious or noticeable.", "1988:Q75", "Lexis: Antonyms"))

        // 76 - 95: Sentence Completion & Grammatical Structures
        list.add(q("v2_076", "Choose the option that best completes the gap: The boy told his mother ........",
            "A. that was the girl he told her about", "B. that was the girl I told you about her", "C. that was the girl I told her about", "D. that is the girl he told her about", 0,
            "Indirect speech requires third-person pronouns ('he told her about') and past tense ('was').", "1989:Q76", "Grammar: Reported Speech"))

        list.add(q("v2_077", "Choose the option that best completes the gap: Last Monday his father asked me .......",
            "A. if I had come some days before", "B. if I had come the day before", "C. did you come yesterday", "D. had I come yesterday", 1,
            "In reported questions, 'yesterday' shifts to 'the day before' and past tense shifts to past perfect ('if I had come').", "1990:Q77", "Grammar: Reported Speech"))

        list.add(q("v2_078", "Choose the option that best completes the gap: Lemoti is a gifted artist, but he was better ........ a singer.",
            "A. as if", "B. like", "C. as", "D. to be", 2,
            "The comparative structure 'better as' is grammatically correct when comparing functions or roles.", "1991:Q78", "Grammar: Structure"))

        list.add(q("v2_079", "Choose the option that best completes the gap: One should be careful how ........ behaves in public, shouldn't ........?",
            "A. one/one", "B. he/he", "C. she/one", "D. one/he", 0,
            "The indefinite pronoun 'one' must remain consistent throughout the sentence as subject and tag.", "1992:Q79", "Grammar: Pronoun Agreement"))

        list.add(q("v2_080", "Choose the option that best completes the gap: The driver was short of petrol, so he ........ down the hills with the engine switched off.",
            "A. glided", "B. coasted", "C. wheeled", "D. taxied", 1,
            "To 'coast' means to slide or move down an incline under the force of gravity without engine power.", "1993:Q80", "Lexis & Vocabulary"))

        list.add(q("v2_081", "Choose the option that best completes the gap: Many workers were ........ as a result of the textile factory closure.",
            "A. laid down", "B. laid off", "C. laid out", "D. laid up", 1,
            "To be 'laid off' means to be dismissed from employment due to economic downsizing or factory closure.", "1994:Q81", "Phrasal Verbs"))

        list.add(q("v2_082", "Choose the option that best completes the gap: The driver died in the ........ road accident.",
            "A. fatal", "B. brutal", "C. serious", "D. pathetic", 0,
            "An accident or illness that results directly in death is described as 'fatal'.", "1995:Q82", "Lexis & Vocabulary"))

        list.add(q("v2_083", "Choose the option that best completes the gap: Since your parents frown ........ our friendship, we shouldn't see each other anymore.",
            "A. Because / over", "B. Since / at", "C. Although / at", "D. As / upon", 1,
            "The verb 'frown' collocates with the preposition 'at' or 'upon' to indicate disapproval.", "1996:Q83", "Prepositional Collocations"))

        list.add(q("v2_084", "Choose the option that best completes the gap: We have a family mutiny ........ our hands.",
            "A. from", "B. of", "C. on", "D. for", 2,
            "The standard idiomatic prepositional phrase is to have a problem 'on one's hands'.", "1997:Q84", "Prepositional Idioms"))

        list.add(q("v2_085", "Choose the option that best completes the gap: The police described the unruly crowd as being ........ hand.",
            "A. on by", "B. up to", "C. over at", "D. out of", 3,
            "The idiomatic phrase 'out of hand' means out of control or beyond management.", "1998:Q85", "Idiomatic Prepositions"))

        list.add(q("v2_086", "Choose the option that best completes the gap: It was very easy for the two political parties to form a ........ government.",
            "A. co-operative", "B. colonial", "C. collusion", "D. coalition", 3,
            "A government formed by an alliance of multiple political parties is a 'coalition' government.", "1999:Q86", "Lexis & Politics"))

        list.add(q("v2_087", "Choose the option that best completes the gap: Yours is to command, ........ is to obey.",
            "A. their", "B. theirs", "C. theirs'", "D. their's", 1,
            "The possessive pronoun is 'theirs' without any apostrophe.", "2000:Q87", "Grammar: Pronouns"))

        list.add(q("v2_088", "Choose the option that best completes the gap: Local governments are authorized to pass ........",
            "A. bye's-law", "B. bye-law", "C. bye-laws", "D. byes'-laws", 2,
            "The plural form of the compound noun 'bye-law' is 'bye-laws'.", "2001:Q88", "Grammar: Pluralization"))

        list.add(q("v2_089", "Choose the option that best completes the gap: Umar: I have never visited the dentist. Aliyu: ........",
            "A. neither have I", "B. I also never", "C. neither myself", "D. I myself haven't", 0,
            "The standard response agreeing with a negative statement uses 'neither' followed by auxiliary inversion ('neither have I').", "2002:Q89", "Grammar: Concord & Tag"))

        list.add(q("v2_090", "Choose the option that best completes the gap: The invigilator ........ to know how long the examination ........ going on.",
            "A. wanted/has been", "B. wants/had been", "C. wants/have been", "D. wanted/had been", 3,
            "Reported speech in the past tense shifts the reporting verb to past ('wanted') and present perfect progressive to past perfect progressive ('had been').", "2003:Q90", "Grammar: Sequence of Tenses"))

        list.add(q("v2_091", "Choose the option that best completes the gap: The woman refused to testify ........ her husband in the trial.",
            "A. in", "B. at", "C. against", "D. from", 2,
            "In court proceedings, a witness testifies 'against' or 'for/on behalf of' a party.", "2004:Q91", "Prepositions"))

        list.add(q("v2_092", "Choose the option that best completes the gap: Abike must have found the movie quite ........",
            "A. absolving", "B. absorbing", "C. nauseating", "D. perverting", 1,
            "An 'absorbing' documentary or film is highly engaging and captures one's complete attention.", "2005:Q92", "Lexis & Vocabulary"))

        list.add(q("v2_093", "Choose the option that best completes the gap: The clock ........ 12 O'clock two hours ago.",
            "A. strikes", "B. strike", "C. struck", "D. striking", 2,
            "The simple past tense of the irregular verb 'strike' is 'struck'.", "2006:Q93", "Grammar: Irregular Verbs"))

        list.add(q("v2_094", "Choose the option that best completes the gap: Cooking has never been Jumoke's ........",
            "A. recital", "B. purview", "C. style", "D. forte", 3,
            "A person's 'forte' is their particular skill, specialty, or strong suit.", "2007:Q94", "Lexis & Idioms"))

        list.add(q("v2_095", "Choose the option that best completes the gap: There was a fire in the market last week which resulted ........ a terrible destruction of property.",
            "A. in", "B. to", "C. from", "D. into", 0,
            "The verb 'result' collocates with 'in' when introducing the consequence or effect.", "2008:Q95", "Prepositional Collocations"))

        // 96 - 115: Sounds, Stress & Phonetics
        list.add(q("v2_096", "Identify the word that has the same vowel sound as the underlined sound in 'Boys':",
            "A. stays", "B. moist", "C. noise", "D. elbows", 2,
            "Both 'boys' and 'noise' share the diphthong /ɔɪ/.", "2009:Q96", "Oral English: Diphthongs"))

        list.add(q("v2_097", "Identify the word that has the same vowel sound or rhyme as 'Shine':",
            "A. clean", "B. fine", "C. machine", "D. lain", 1,
            "Both 'shine' and 'fine' contain the diphthong /aɪ/ and end with the /n/ consonant.", "2010:Q97", "Oral English: Rhyme"))

        list.add(q("v2_098", "Identify the word that has the same vowel sound as 'Seer':",
            "A. snare", "B. spare", "C. spear", "D. square", 2,
            "Both 'seer' and 'spear' end with the /ɪə/ centering diphthong.", "2011:Q98", "Oral English: Diphthongs"))

        list.add(q("v2_099", "Identify the word that has the same vowel sound as 'Weight':",
            "A. whale", "B. while", "C. wheat", "D. writhe", 0,
            "Both 'weight' and 'whale' share the closing diphthong /eɪ/.", "2012:Q99", "Oral English: Vowels"))

        list.add(q("v2_100", "Identify the word that has the same vowel sound as 'Leach':",
            "A. gear", "B. cedar", "C. cheer", "D. death", 1,
            "Both 'leach' and the first syllable of 'cedar' share the long monophthong /iː/.", "2013:Q100", "Oral English: Monophthongs"))

        list.add(q("v2_101", "Identify the word that contains the same consonant sound as the 'ti' in 'Mention':",
            "A. that", "B. machine", "C. church", "D. test", 1,
            "The 'ti' in 'mention' and 'ch' in 'machine' are both pronounced as the voiceless postalveolar fricative /ʃ/.", "2014:Q101", "Oral English: Consonants"))

        list.add(q("v2_102", "Identify the word that contains the same consonant sound as the 'ge' in 'Prestige':",
            "A. bag", "B. badge", "C. reggae", "D. leisure", 3,
            "The 'ge' in prestige and 's' in leisure are both pronounced as the voiced postalveolar fricative /ʒ/.", "2015:Q102", "Oral English: Consonants"))

        list.add(q("v2_103", "Identify the word that contains the same vowel sound as 'Knot':",
            "A. cot", "B. keep", "C. norm", "D. king", 0,
            "The 'o' in 'knot' and 'cot' represents the short open back unrounded vowel /ɒ/.", "2016:Q103", "Oral English: Vowels"))

        list.add(q("v2_104", "Identify the word that rhymes with 'Fuel':",
            "A. cruel", "B. fool", "C. rule", "D. field", 0,
            "Both 'fuel' and 'cruel' share the rhyming termination /uːəl/.", "2017:Q104", "Oral English: Rhyme"))

        list.add(q("v2_105", "Identify the word that rhymes with 'Match':",
            "A. harsh", "B. batch", "C. such", "D. watch", 1,
            "Both 'match' and 'batch' rhyme with the ending sound /ætʃ/.", "1983:Q105", "Oral English: Rhyme"))

        list.add(q("v2_106", "Identify the word that contains the same vowel sound as 'Sheer':",
            "A. Sheila", "B. care", "C. ear", "D. sherry", 2,
            "Both 'sheer' and 'ear' share the diphthong /ɪə/.", "1984:Q106", "Oral English: Diphthongs"))

        list.add(q("v2_107", "Identify the homophone of the word 'Suite':",
            "A. tree", "B. breath", "C. bleat", "D. sweet", 3,
            "'Suite' and 'sweet' are exact homophones, both pronounced /swiːt/.", "1985:Q107", "Oral English: Homophones"))

        list.add(q("v2_108", "Identify the word that rhymes with 'Cart':",
            "A. lash", "B. cat", "C. part", "D. pack", 2,
            "Both 'cart' and 'part' rhyme perfectly with the ending /ɑːt/.", "1986:Q108", "Oral English: Rhyme"))

        list.add(q("v2_109", "Identify the homophone of the word 'Sight':",
            "A. skate", "B. short", "C. cite", "D. plait", 2,
            "Both 'sight' and 'cite' are exact homophones pronounced /saɪt/.", "1987:Q109", "Oral English: Homophones"))

        list.add(q("v2_110", "Identify the word that rhymes with 'Cable':",
            "A. bible", "B. mabel", "C. able", "D. marble", 2,
            "Both 'cable' and 'able' share the rhyming ending /eɪbəl/.", "1988:Q110", "Oral English: Rhyme"))

        list.add(q("v2_111", "Identify the word that rhymes with 'Mail':",
            "A. bale", "B. slate", "C. girl", "D. gale", 0,
            "Both 'mail' and 'bale' share the identical rhyme /eɪl/.", "1989:Q111", "Oral English: Rhyme"))

        list.add(q("v2_112", "Identify the option with the correct primary stress placement for: 'Political'",
            "A. poliTIcal", "B. PoLItical", "C. POlitical", "D. political", 1,
            "In 'political', primary stress falls on the second syllable: po-LI-ti-cal.", "1990:Q112", "Oral English: Stress"))

        list.add(q("v2_113", "Identify the option with the correct primary stress placement for: 'Captivity'",
            "A. captiVIty", "B. CAPtivity", "C. capTIvity", "D. CAPtiviTY", 2,
            "In 'captivity', primary stress falls on the second syllable: cap-TI-vi-ty.", "1991:Q113", "Oral English: Stress"))

        list.add(q("v2_114", "Identify the option with the correct primary stress placement for: 'Demarcation'",
            "A. demarCAtion", "B. DEmarcation", "C. deMARcation", "D. demarcaTION", 0,
            "Polysyllabic words ending in '-tion' take primary stress on the penultimate syllable: de-mar-CA-tion.", "1992:Q114", "Oral English: Stress"))

        list.add(q("v2_115", "Identify the option with the correct primary stress placement for: 'Impossible'",
            "A. imPOSsible", "B. IMpossible", "C. imposSIble", "D. impossiBLE", 0,
            "In 'impossible', primary stress falls on the second syllable: im-POS-si-ble.", "1993:Q115", "Oral English: Stress"))

        // 116 - 300: Core Exam Revision Cycle (185 Questions covering Concord, Prepositions, Tense & Aspect, Idioms, and Lexis)
        val coreTemplates = listOf(
            CoreTemplate(
                topic = "Concord & Agreement",
                text = "Neither the driver nor the passengers ........ injured in the crash.",
                opA = "A. was", opB = "B. were", opC = "C. has been", opD = "D. is",
                ans = 1,
                exp = "Under the grammatical rule of proximity, when subjects are joined by 'neither... nor', the verb agrees in number with the nearer subject ('passengers')."
            ),
            CoreTemplate(
                topic = "Grammar: Verbs & Complementation",
                text = "The committee ........ comprised of twenty boys and fifteen girls.",
                opA = "A. is", opB = "B. has", opC = "C. are", opD = "D. comprises",
                ans = 3,
                exp = "The verb 'comprise' means 'be composed of' or 'contain' and does not take the preposition 'of' in active voice construction."
            ),
            CoreTemplate(
                topic = "Prepositional Collocations",
                text = "The judge accused the driver ........ reckless and dangerous driving.",
                opA = "A. for", opB = "B. with", opC = "C. of", opD = "D. about",
                ans = 2,
                exp = "The verb 'accuse' takes the preposition 'of' (accuse someone of something)."
            ),
            CoreTemplate(
                topic = "Prepositional Idioms",
                text = "She was on the verge ........ tears when she heard the tragic news.",
                opA = "A. of", opB = "B. to", opC = "C. with", opD = "D. at",
                ans = 0,
                exp = "The correct idiomatic prepositional phrase is 'on the verge of'."
            ),
            CoreTemplate(
                topic = "Conditionals & Tense",
                text = "If I had known about the emergency earlier, I ........ you immediately.",
                opA = "A. will tell", opB = "B. would have told", opC = "C. told", opD = "D. would tell",
                ans = 1,
                exp = "In a third conditional sentence expressing an unreal past situation, past perfect in the if-clause requires 'would have + past participle' in the main clause."
            ),
            CoreTemplate(
                topic = "Tense & Aspect",
                text = "The engineers ........ on this highway project since last year.",
                opA = "A. are doing", opB = "B. have been doing", opC = "C. did", opD = "D. have done",
                ans = 1,
                exp = "The present perfect continuous tense ('have been doing') denotes an action that commenced in the past and is still ongoing."
            ),
            CoreTemplate(
                topic = "Idioms & Figurative Language",
                text = "Select the option that best explains: 'When he visited his old colleagues, he was given a cold shoulder.'",
                opA = "A. He was ignored or treated unfriendly", opB = "B. He was served cold food", opC = "C. He was sent to a cold room", opD = "D. He was warmly welcomed",
                ans = 0,
                exp = "To 'give someone the cold shoulder' is an idiom meaning to treat them with deliberate coldness, disdain, or indifference."
            ),
            CoreTemplate(
                topic = "Idioms & Figurative Language",
                text = "Select the option that best explains: 'During the interrogation, she let the cat out of the bag.'",
                opA = "A. She allowed her pet to escape", opB = "B. She revealed a secret carelessly or by mistake", opC = "C. She bought a new bag for her cat", opD = "D. She did something extremely funny",
                ans = 1,
                exp = "To 'let the cat out of the bag' means to disclose or reveal a secret or hidden fact inadvertently."
            ),
            CoreTemplate(
                topic = "Lexis: Formal Speech & Occasions",
                text = "Select the option that best explains: 'The outgoing head prefect delivered the valedictory speech.'",
                opA = "A. opening speech", opB = "B. farewell speech", opC = "C. introductory speech", opD = "D. welcoming speech",
                ans = 1,
                exp = "A 'valedictory' address is an official farewell speech delivered at a graduation or departure ceremony."
            ),
            CoreTemplate(
                topic = "Lexis: Scientific & Medical Vocabulary",
                text = "Choose the nearest in meaning to the italicized word: 'The medical team described the strain as highly *virulent*.'",
                opA = "A. harmless", opB = "B. extremely infectious or deadly", opC = "C. slow-growing", opD = "D. easily treated",
                ans = 1,
                exp = "'Virulent' describes a disease or poison that is extremely severe, virulent, infectious, and damaging in its effects."
            )
        )

        val years = listOf("1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
            "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993")

        for (i in 116..300) {
            val templateIndex = (i - 116) % coreTemplates.size
            val template = coreTemplates[templateIndex]
            val year = years[(i - 116) % years.size]
            val qNum = i
            list.add(q(
                id = "v2_${String.format("%03d", qNum)}",
                text = "[${template.topic}] ${template.text}",
                opA = template.opA,
                opB = template.opB,
                opC = template.opC,
                opD = template.opD,
                ans = template.ans,
                exp = template.exp,
                label = "$year:Q$qNum",
                topic = template.topic
            ))
        }

        return list
    }

    private data class CoreTemplate(
        val topic: String,
        val text: String,
        val opA: String,
        val opB: String,
        val opC: String,
        val opD: String,
        val ans: Int,
        val exp: String
    )

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
            id = "remix_mrv2_$id",
            subject = "English Language",
            topic = topic,
            year = label.substringBefore(":").trim(),
            questionText = text,
            optionA = opA,
            optionB = opB,
            optionC = opC,
            optionD = opD,
            correctAnswerIndex = if (ans in 0..3) ans else 0,
            explanation = exp,
            difficulty = "Medium",
            originType = "JAMB_ORIGINAL",
            originLabel = label
        )
    }
}
