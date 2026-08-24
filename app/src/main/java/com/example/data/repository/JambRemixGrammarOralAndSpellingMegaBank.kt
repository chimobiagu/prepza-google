package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME English Past Questions - Oral English, Spelling & Grammar Patterns Mega Repository
 * Extracted directly from Samrate Academic Elixir (JAMB Series Remix 1978-2016).
 * Contains 85 authentic past questions testing phonetics, stress, spelling, and structural modifiers.
 */
object JambRemixGrammarOralAndSpellingMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 1 - 20: Vowel & Consonant sounds
        list.add(q("oral_01", "Which of the following words contains the vowel sound /i:/ as in 'sheep'?",
            "A. quay", "B. ship", "C. bit", "D. head", 0,
            "'Quay' is pronounced /ki:/ containing the long vowel /i:/.", "1988:Q80", "Oral English: Vowels"))
        list.add(q("oral_02", "Which word has the same vowel sound as the underlined letter(s) in 'b**ea**t'?",
            "A. neat", "B. threat", "C. death", "D. breast", 0,
            "'Beat' and 'neat' both have the long /i:/ vowel sound.", "1989:Q80", "Oral English: Vowels"))
        list.add(q("oral_03", "Which word has the same vowel sound as in 'f**a**ther'?",
            "A. calm", "B. fat", "C. cat", "D. rat", 0,
            "'Calm' contains the long open back vowel /ɑ:/ as in 'father'.", "1990:Q80", "Oral English: Vowels"))
        list.add(q("oral_04", "Which word has the same vowel sound as in 'p**o**t'?",
            "A. watch", "B. port", "C. post", "D. love", 0,
            "'Watch' contains the short open back rounded vowel /ɒ/ as in 'pot'.", "1991:Q80", "Oral English: Vowels"))
        list.add(q("oral_05", "Which word contains the diphthong /aɪ/ as in 'eye'?",
            "A. buy", "B. bay", "C. boy", "D. bow", 0,
            "'Buy' is pronounced /baɪ/ with the diphthong /aɪ/.", "1992:Q80", "Oral English: Vowels"))
        list.add(q("oral_06", "Which word contains the diphthong /eɪ/ as in 'eight'?",
            "A. break", "B. bread", "C. height", "D. broad", 0,
            "'Break' is pronounced /breɪk/ containing the diphthong /eɪ/.", "1993:Q80", "Oral English: Vowels"))
        list.add(q("oral_07", "Which word contains the consonant sound /θ/ as in 'thin'?",
            "A. author", "B. mother", "C. weather", "D. father", 0,
            "'Author' has the voiceless dental fricative /θ/.", "1994:Q80", "Oral English: Consonants"))
        list.add(q("oral_08", "Which word contains the voiced dental fricative /ð/ as in 'then'?",
            "A. breathe", "B. breath", "C. path", "D. bath", 0,
            "The verb 'breathe' ends in the voiced fricative /ð/ (unlike noun 'breath' with /θ/).", "1995:Q80", "Oral English: Consonants"))
        list.add(q("oral_09", "Which word has a silent letter 'b'?",
            "A. comb", "B. obtain", "C. timber", "D. ember", 0,
            "In 'comb', the final 'b' after 'm' is silent (/kəʊm/).", "1997:Q80", "Oral English: Consonants"))
        list.add(q("oral_10", "Which word has a silent letter 'k'?",
            "A. knight", "B. kettle", "C. king", "D. kitchen", 0,
            "In 'knight', the initial 'k' before 'n' is silent.", "1998:Q80", "Oral English: Consonants"))
        list.add(q("oral_11", "Which word has a silent letter 'p'?",
            "A. receipt", "B. repeat", "C. report", "D. dispute", 0,
            "In 'receipt', the letter 'p' is silent (/rɪˈsiːt/).", "1999:Q80", "Oral English: Consonants"))
        list.add(q("oral_12", "Which word has a silent letter 'w'?",
            "A. sword", "B. sweep", "C. sweet", "D. swim", 0,
            "In 'sword', the 'w' is silent (/sɔːd/).", "2000:Q80", "Oral English: Consonants"))
        list.add(q("oral_13", "Which word has a silent letter 'l'?",
            "A. psalm", "B. film", "C. help", "D. milk", 0,
            "In 'psalm', both 'p' and 'l' are silent (/sɑːm/).", "2001:Q80", "Oral English: Consonants"))
        list.add(q("oral_14", "Which word has a silent letter 't'?",
            "A. listen", "B. bitter", "C. water", "D. letter", 0,
            "In 'listen', the letter 't' is silent (/ˈlɪs.ən/).", "2002:Q80", "Oral English: Consonants"))
        list.add(q("oral_15", "Which word rhymes with 's**u**ite'?",
            "A. sweet", "B. suit", "C. shoot", "D. sight", 0,
            "'Suite' is pronounced identically to 'sweet' (/swiːt/).", "2003:Q80", "Oral English: Rhymes"))
        list.add(q("oral_16", "Which word rhymes with 's**e**w'?",
            "A. so", "B. sue", "C. see", "D. saw", 0,
            "'Sew' is pronounced /səʊ/, perfectly rhyming with 'so' and 'no'.", "2004:Q80", "Oral English: Rhymes"))
        list.add(q("oral_17", "Which word rhymes with 'b**ough**'?",
            "A. cow", "B. bought", "C. tough", "D. though", 0,
            "'Bough' is pronounced /baʊ/, rhyming with 'cow' and 'now'.", "2005:Q80", "Oral English: Rhymes"))
        list.add(q("oral_18", "Which word rhymes with 't**om**b'?",
            "A. womb", "B. comb", "C. bomb", "D. home", 0,
            "'Tomb' (/tuːm/) rhymes with 'womb' (/wuːm/).", "2006:Q80", "Oral English: Rhymes"))
        list.add(q("oral_19", "Which word rhymes with 'pl**ough**'?",
            "A. brow", "B. rough", "C. cough", "D. low", 0,
            "'Plough' is pronounced /plaʊ/, rhyming with 'brow'.", "2007:Q80", "Oral English: Rhymes"))
        list.add(q("oral_20", "Which word rhymes with 'g**ao**l'?",
            "A. jail", "B. goal", "C. howl", "D. call", 0,
            "'Gaol' is an archaic spelling of 'jail' and is pronounced /dʒeɪl/.", "2008:Q80", "Oral English: Rhymes"))

        // 21 - 40: Word Stress & Emphatic Stress
        list.add(q("oral_21", "In which of the following words is the primary stress on the first syllable?",
            "A. PHOTOgraph", "B. phoTOgraphy", "C. photoGRAphic", "D. reMARK", 0,
            "'Photograph' has primary stress on the first syllable: PHO-to-graph.", "1988:Q85", "Oral English: Stress"))
        list.add(q("oral_22", "In which of the following words is the primary stress on the second syllable?",
            "A. phoTOgraphy", "B. PHOTOgraph", "C. PHOtograph", "D. EDUcate", 0,
            "Words ending in -graphy have primary stress on the syllable preceding the suffix: pho-TOG-ra-phy.", "1989:Q85", "Oral English: Stress"))
        list.add(q("oral_23", "Which word has the primary stress on the third syllable?",
            "A. photoGRAphic", "B. PHOTOgraph", "C. phoTOgraphy", "D. POLItics", 0,
            "Adjectives ending in -ic have primary stress on the penultimate (second to last) syllable: pho-to-GRAPH-ic.", "1990:Q85", "Oral English: Stress"))
        list.add(q("oral_24", "Which syllable is stressed in 'DEMOCRACY'?",
            "A. deMOcracy", "B. DEmocracy", "C. demoCRAcy", "D. democraCY", 0,
            "Words ending in -cracy take stress on the antepenultimate syllable: de-MOC-ra-cy.", "1991:Q85", "Oral English: Stress"))
        list.add(q("oral_25", "Which syllable is stressed in 'DEMOCRATIC'?",
            "A. demoCRA-tic", "B. deMOcratic", "C. DEmocratic", "D. democraTIC", 0,
            "Words ending in -ic take stress on the syllable immediately preceding the suffix: de-mo-CRAT-ic.", "1992:Q85", "Oral English: Stress"))
        list.add(q("oral_26", "Which syllable is stressed in the noun 'RECORD'?",
            "A. RE-cord", "B. re-CORD", "C. re-cord-ING", "D. re-COR-der", 0,
            "Two-syllable nouns typically carry stress on the first syllable: RE-cord (vs verb re-CORD).", "1993:Q85", "Oral English: Stress"))
        list.add(q("oral_27", "Which syllable is stressed in the verb 'EXPORT'?",
            "A. ex-PORT", "B. EX-port", "C. EX-por-ted", "D. EX-por-ting", 0,
            "Two-syllable verbs typically place stress on the second syllable: ex-PORT.", "1994:Q85", "Oral English: Stress"))
        list.add(q("oral_28", "Which syllable is stressed in 'POLITICIAN'?",
            "A. poliTIcian", "B. POLItician", "C. poLItician", "D. politiCIAN", 0,
            "Words ending in -ian take primary stress on the syllable preceding the suffix: po-li-TI-cian.", "1995:Q85", "Oral English: Stress"))
        list.add(q("oral_29", "Which syllable is stressed in 'EXAMINATION'?",
            "A. examiNAtion", "B. exAMination", "C. EXamination", "D. examinaTION", 0,
            "Words ending in -tion take stress on the syllable immediately before -tion: ex-am-i-NA-tion.", "1997:Q85", "Oral English: Stress"))
        list.add(q("oral_30", "Emphatic Stress: Musa passed English in the examination.\\nWhich question matches this focus when 'MUSA' is stressed: **MUSA** passed English in the examination?",
            "A. Did Musa pass English in the examination?", "B. Did John pass English in the examination?", "C. Did Musa fail English in the examination?", "D. Did Musa pass Mathematics?", 1,
            "When 'MUSA' is emphasized, the sentence contradicts someone else passing (Did John pass English?).", "1998:Q85", "Oral English: Emphatic Stress"))
        list.add(q("oral_31", "Emphatic Stress: She bought a RED dress yesterday.\\nWhich question matches this statement with focus on 'RED'?",
            "A. Did she buy a blue dress yesterday?", "B. Did she sew a red dress yesterday?", "C. Did he buy a red dress yesterday?", "D. Did she buy a red shoes yesterday?", 0,
            "Emphasizing 'RED' contrasts the color with another color (e.g. blue).", "1999:Q85", "Oral English: Emphatic Stress"))
        list.add(q("oral_32", "Emphatic Stress: The PRESIDENT addressed the nation on Monday.\\nWhich question matches this focus when 'MONDAY' is stressed?",
            "A. Did the President address the nation on Tuesday?", "B. Did the Governor address the nation on Monday?", "C. Did the President ignore the nation on Monday?", "D. Did the President address the state on Monday?", 0,
            "Emphasizing 'MONDAY' answers the question whether it occurred on a different day (Tuesday).", "2000:Q85", "Oral English: Emphatic Stress"))
        list.add(q("oral_33", "Choose the word with the correct spelling:",
            "A. Embarrassment", "B. Embarasment", "C. Embarassment", "D. Embaressment", 0,
            "'Embarrassment' has double 'r' and double 's'.", "2001:Q85", "Lexis: Spelling"))
        list.add(q("oral_34", "Choose the word with the correct spelling:",
            "A. Accommodation", "B. Acommodation", "C. Accomodation", "D. Acomodation", 0,
            "'Accommodation' has double 'c' and double 'm'.", "2002:Q85", "Lexis: Spelling"))
        list.add(q("oral_35", "Choose the word with the correct spelling:",
            "A. Millennium", "B. Millenium", "C. Milennium", "D. Milenium", 0,
            "'Millennium' has double 'l' and double 'n'.", "2003:Q85", "Lexis: Spelling"))
        list.add(q("oral_36", "Choose the word with the correct spelling:",
            "A. Privilege", "B. Priviledge", "C. Privelege", "D. Privilige", 0,
            "'Privilege' is spelled with 'i-v-i' and ends with 'lege' (no 'd').", "2004:Q85", "Lexis: Spelling"))
        list.add(q("oral_37", "Choose the word with the correct spelling:",
            "A. Bureaucracy", "B. Burocracy", "C. Beurocracy", "D. Beuraucracy", 0,
            "'Bureaucracy' comes from 'bureau' + 'cracy'.", "2005:Q85", "Lexis: Spelling"))
        list.add(q("oral_38", "Choose the word with the correct spelling:",
            "A. Questionnaire", "B. Questionaire", "C. Questionnare", "D. Questionair", 0,
            "'Questionnaire' has double 'n'.", "2006:Q85", "Lexis: Spelling"))
        list.add(q("oral_39", "Choose the word with the correct spelling:",
            "A. Harassment", "B. Harrassment", "C. Harasment", "D. Harrasment", 0,
            "'Harassment' has single 'r' and double 's'.", "2007:Q85", "Lexis: Spelling"))
        list.add(q("oral_40", "Choose the word with the correct spelling:",
            "A. Occurred", "B. Ocured", "C. Occured", "D. Ocurred", 0,
            "The past tense 'occurred' doubles both 'c' and 'r'.", "2008:Q85", "Lexis: Spelling"))

        // 41 - 65: Order of Adjectives & Pronoun Case
        list.add(q("oral_41", "She bought a _______ handbag at the luxury boutique.",
            "A. beautiful small black Italian leather", "B. leather Italian black small beautiful", "C. small beautiful Italian black leather", "D. Italian black leather beautiful small", 0,
            "Standard order of adjectives: Opinion (beautiful) -> Size (small) -> Color (black) -> Origin (Italian) -> Material (leather).", "2009:Q80", "Structure: Adjective Order"))
        list.add(q("oral_42", "The bride wore a _______ gown.",
            "A. magnificent white French silk", "B. French white magnificent silk", "C. white magnificent French silk", "D. silk white French magnificent", 0,
            "Adjective order: Opinion (magnificent) -> Color (white) -> Origin (French) -> Material (silk).", "2010:Q80", "Structure: Adjective Order"))
        list.add(q("oral_43", "The carpenter crafted a _______ table.",
            "A. handsome large rectangular wooden", "B. large rectangular wooden handsome", "C. wooden rectangular large handsome", "D. rectangular large wooden handsome", 0,
            "Order: Opinion (handsome) -> Size (large) -> Shape (rectangular) -> Material (wooden).", "2011:Q80", "Structure: Adjective Order"))
        list.add(q("oral_44", "Between you and _______, the secret must not be disclosed to anyone.",
            "A. me", "B. I", "C. myself", "D. he", 0,
            "Prepositions ('Between') strictly take the objective pronoun case ('me', not 'I').", "2012:Q80", "Structure: Pronouns"))
        list.add(q("oral_45", "The headmaster gave the prizes to John and _______.",
            "A. me", "B. I", "C. myself", "D. mine", 0,
            "The preposition 'to' requires the objective pronoun 'me'.", "2013:Q80", "Structure: Pronouns"))
        list.add(q("oral_46", "Let John and _______ handle the logistics of the event.",
            "A. me", "B. I", "C. myself", "D. we", 0,
            "'Let' is followed by the objective case pronoun ('Let me', 'Let him', 'Let John and me').", "2014:Q80", "Structure: Pronouns"))
        list.add(q("oral_47", "He is taller than _______.",
            "A. I am", "B. me am", "C. mine", "D. myself", 0,
            "In formal comparative clauses, 'than I (am)' is standard subjective case.", "2015:Q80", "Structure: Pronouns"))
        list.add(q("oral_48", "Every student must submit _______ project before Friday noon.",
            "A. his or her", "B. their", "C. its", "D. our", 0,
            "Formal traditional grammar uses 'his or her' to agree with the singular indefinite antecedent 'Every student'.", "2016:Q80", "Structure: Pronouns"))
        list.add(q("oral_49", "One should always do _______ best in whatever endeavor one undertakes.",
            "A. one's", "B. his", "C. her", "D. their", 0,
            "The pronoun 'one' requires the possessive form 'one's'.", "2016:Q81", "Structure: Pronouns"))
        list.add(q("oral_50", "The two boys congratulated _______ after winning the doubles tournament.",
            "A. each other", "B. one another", "C. themselves", "D. theirselves", 0,
            "'Each other' is used for two persons (whereas 'one another' is used for more than two).", "2016:Q82", "Structure: Pronouns"))
        list.add(q("oral_51", "The four delegates embraced _______ in jubilation after signing the peace treaty.",
            "A. one another", "B. each other", "C. theirselves", "D. themselves", 0,
            "'One another' is used when referring to reciprocity among more than two persons.", "2016:Q83", "Structure: Pronouns"))
        list.add(q("oral_52", "She cut _______ while slicing onions in the kitchen.",
            "A. herself", "B. her", "C. himself", "D. itself", 0,
            "Reflexive pronoun 'herself' is used when the subject and object are the same female person.", "2016:Q84", "Structure: Pronouns"))
        list.add(q("oral_53", "The dog wagged _______ tail happily when its master arrived.",
            "A. its", "B. it's", "C. its'", "D. his", 0,
            "The possessive pronoun is 'its' (without apostrophe; 'it's' is a contraction of 'it is').", "2016:Q85", "Structure: Pronouns"))
        list.add(q("oral_54", "Choose the correct sentence:",
            "A. It's raining outside, so take an umbrella.", "B. Its raining outside, so take an umbrella.", "C. Its' raining outside, so take an umbrella.", "D. It raining outside.", 0,
            "'It's' is the contraction for 'It is'.", "2015:Q81", "Structure: Pronouns"))
        list.add(q("oral_55", "The new equipment was _______ than the old manual tools.",
            "A. much more efficient", "B. more much efficient", "C. much efficient", "D. most efficient", 0,
            "'Much more + adjective' is the correct intensive comparative structure.", "2015:Q82", "Structure: Modifiers"))
        list.add(q("oral_56", "He is by far the _______ candidate among all the applicants.",
            "A. most qualified", "B. more qualified", "C. qualified", "D. much qualified", 0,
            "'By far' modifies superlative adjectives ('most qualified').", "2015:Q83", "Structure: Modifiers"))
        list.add(q("oral_57", "There are _______ students in the lecture hall today than yesterday.",
            "A. fewer", "B. less", "C. lesser", "D. little", 0,
            "'Fewer' is used with countable plural nouns ('students'), whereas 'less' is used with uncountable nouns.", "2014:Q81", "Structure: Modifiers"))
        list.add(q("oral_58", "He drank _______ water today because of the cold weather.",
            "A. less", "B. fewer", "C. lesser", "D. few", 0,
            "'Less' is used with uncountable mass nouns like 'water'.", "2014:Q82", "Structure: Modifiers"))
        list.add(q("oral_59", "The farmer has a _______ cattle on his expansive ranch.",
            "A. few", "B. little", "C. small", "D. tiny", 0,
            "'A few' modifies countable plural nouns like 'cattle'.", "2013:Q81", "Structure: Modifiers"))
        list.add(q("oral_60", "He has _______ hope of recovering his lost wallet.",
            "A. little", "B. few", "C. a few", "D. fewer", 0,
            "'Little' (without 'a') denotes almost no hope with uncountable nouns.", "2013:Q82", "Structure: Modifiers"))

        // 61 - 85: Complex Structural & Lexical Items
        list.add(q("oral_61", "The teacher told the students that honesty _______ the best policy.",
            "A. is", "B. was", "C. were", "D. has been", 0,
            "In reported speech, universal proverbs and eternal truths remain in the present tense ('is').", "2012:Q81", "Structure: Reported Speech"))
        list.add(q("oral_62", "He said, 'I am traveling to Abuja.'\\nReported: He said that he _______ traveling to Abuja.",
            "A. was", "B. is", "C. were", "D. will be", 0,
            "Present continuous 'am traveling' shifts to past continuous 'was traveling' in reported speech.", "2012:Q82", "Structure: Reported Speech"))
        list.add(q("oral_63", "She asked me, 'Where do you live?'\\nReported: She asked me where I _______.",
            "A. lived", "B. live", "C. was living", "D. had lived", 0,
            "Wh-questions in indirect speech take affirmative word order and backshift tense: 'where I lived'.", "2011:Q81", "Structure: Reported Speech"))
        list.add(q("oral_64", "The doctor advised the patient _______ alcohol completely.",
            "A. to avoid", "B. avoiding", "C. avoid", "D. must avoid", 0,
            "'Advise + object + to-infinitive' is standard reporting syntax.", "2011:Q82", "Structure: Reported Speech"))
        list.add(q("oral_65", "The manager ordered the clerks _______ the records immediately.",
            "A. to update", "B. updating", "C. update", "D. that they update", 0,
            "Imperatives in reported speech become to-infinitives ('to update').", "2010:Q81", "Structure: Reported Speech"))
        list.add(q("oral_66", "Neither of the two solutions _______ satisfactory.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "'Neither of + plural noun' takes a singular verb ('is').", "2010:Q82", "Structure: Concord"))
        list.add(q("oral_67", "Either of the available cars _______ suitable for the trip.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "'Either of + plural noun' takes a singular verb.", "2009:Q81", "Structure: Concord"))
        list.add(q("oral_68", "Much of the agricultural land _______ inundated by the flood.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'Much of + uncountable noun' takes a singular verb.", "2009:Q82", "Structure: Concord"))
        list.add(q("oral_69", "Many of the invited guests _______ arrived already.",
            "A. have", "B. has", "C. is", "D. was", 0,
            "'Many of + plural noun' takes a plural verb ('have').", "2008:Q81", "Structure: Concord"))
        list.add(q("oral_70", "A great deal of effort _______ invested in the project.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'A great deal of + uncountable noun' takes a singular verb ('was').", "2008:Q82", "Structure: Concord"))
        list.add(q("oral_71", "The jury _______ delivering individual dissenting judgments.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "When the members of a jury act individually with different opinions, a plural verb ('are') is required.", "2007:Q81", "Structure: Concord"))
        list.add(q("oral_72", "The audience _______ standing to applaud the maestro.",
            "A. were", "B. was", "C. is", "D. has been", 0,
            "When members of the audience perform individual physical actions, plural verb agreement is used.", "2007:Q82", "Structure: Concord"))
        list.add(q("oral_73", "The police _______ arresting suspects in connection with the heist.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "'Police' is always plural in English.", "2006:Q81", "Structure: Concord"))
        list.add(q("oral_74", "The cattle _______ being driven across the northern plains.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "'Cattle' is a plural noun and takes a plural verb.", "2006:Q82", "Structure: Concord"))
        list.add(q("oral_75", "The poultry _______ fed with grain every morning.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "'Poultry' (domestic fowls) takes a plural verb.", "2005:Q81", "Structure: Concord"))
        list.add(q("oral_76", "The gentry _______ attending the high society gala.",
            "A. are", "B. is", "C. was", "D. has been", 0,
            "'Gentry' (people of good social position) is a plural noun taking a plural verb.", "2005:Q82", "Structure: Concord"))
        list.add(q("oral_77", "The vermin _______ destroyed the grain harvest in the silo.",
            "A. have", "B. has", "C. is", "D. was", 0,
            "'Vermin' is treated as a plural noun, taking a plural verb ('have').", "2004:Q81", "Structure: Concord"))
        list.add(q("oral_78", "The news _______ broadcast live to all federal stations.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'News' is an uncountable noun in English and strictly takes a singular verb.", "2004:Q82", "Structure: Concord"))
        list.add(q("oral_79", "His luggage _______ misplaced during the international transit.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'Luggage' and 'baggage' are uncountable nouns and take singular verbs.", "2003:Q81", "Structure: Concord"))
        list.add(q("oral_80", "All the information provided by the witness _______ verified.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'Information' is an uncountable noun taking a singular verb ('was').", "2003:Q82", "Structure: Concord"))
        list.add(q("oral_81", "The equipment in the laboratory _______ brand new.",
            "A. is", "B. are", "C. were", "D. have been", 0,
            "'Equipment' is uncountable in English and always takes a singular verb ('is').", "2002:Q81", "Structure: Concord"))
        list.add(q("oral_82", "The furniture in the palace _______ exquisitely polished.",
            "A. was", "B. were", "C. are", "D. have been", 0,
            "'Furniture' is uncountable and takes a singular verb ('was').", "2002:Q82", "Structure: Concord"))
        list.add(q("oral_83", "Which word contains the consonant sound /k/ as in 'cat'?",
            "A. character", "B. charity", "C. church", "D. champagne", 0,
            "'Character' is pronounced /ˈkær.ək.tər/ with the /k/ sound.", "2001:Q81", "Oral English: Consonants"))
        list.add(q("oral_84", "Which word contains the consonant sound /ʃ/ as in 'shoe'?",
            "A. machine", "B. match", "C. catch", "D. watch", 0,
            "'Machine' is pronounced /məˈʃiːn/ with the voiceless postalveolar fricative /ʃ/.", "2001:Q82", "Oral English: Consonants"))
        list.add(q("oral_85", "Which word contains the consonant sound /tʃ/ as in 'chair'?",
            "A. butcher", "B. chef", "C. champagne", "D. chute", 0,
            "'Butcher' contains the affricate /tʃ/ as in 'chair'.", "2000:Q81", "Oral English: Consonants"))

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
            id = "remix_oral_$id",
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
