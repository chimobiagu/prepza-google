package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Use of English Complete Examination Bank (2011 - 2018)
 * Covers Passages, Cloze Tests, Prescribed Texts (The Potter's Wheel, The Successors,
 * The Last Days at Forcados High School, In Dependence), Sentence Interpretations,
 * Antonyms, Synonyms, Grammar, Concord, Phrasal Verbs, and Oral English.
 */
object JambEnglish2011to2018PastExamFullBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 2011 UTME USE OF ENGLISH
        // ==========================================
        list.add(q("2011_q01", "Which question paper type of Use of English is given to you?",
            "A. Type A", "B. Type B", "C. Type C", "D. Type D", 3,
            "Candidates must identify the unique version of the examination paper they are processing to ensure correct grading.", "2011:Q1", "Administrative"))

        list.add(q("2011_q02", "The writer’s posture, as conveyed in the statement 'Electricity from living cells is no new idea,' can be described as:",
            "A. Ineffectual", "B. Contentious", "C. Logical", "D. Unguarded", 1,
            "By stating the idea is 'no new idea,' the writer engages in a debate regarding the novelty of the discovery, contrasting historical precedents with modern bio-cell advancements.", "2011:Q2", "Comprehension"))

        list.add(q("2011_q03", "Which of the following is true according to the passage on Bio-cells?",
            "A. Scientists felt that bio-cells would produce very costly energy", "B. Bio-cells, at the beginning, derived their energy from sugar", "C. Sugar and fuel were initially used as sources of energy for bio-cells", "D. Bio-cells were forms of power used by the scientists", 1,
            "Paragraph 2 explicitly states: 'Early bio cells were powered with sugar.'", "2011:Q3", "Comprehension"))

        list.add(q("2011_q04", "The inventor of the bio-cell justified the need for it by saying that it would:",
            "A. Develop ways for changing bio-cells into fuel for use", "B. Yield a source of energy without much spending", "C. Produce electricity for all types of machines", "D. Produce signals to guide all ships and other vessels", 1,
            "The text notes that scientists believe it will 'one day produce power cheaply' using waste materials.", "2011:Q4", "Comprehension"))

        list.add(q("2011_q05", "According to the passage, electricity was first discovered in:",
            "A. Heart and brains", "B. Muscles of animals", "C. Lightning", "D. Fish", 3,
            "The writer notes that man experienced the shock of fish 'even before electricity was really discovered.'", "2011:Q5", "Comprehension"))

        list.add(q("2011_q06", "Which of the following represents the writer’s view in Passage II on guarding one's thoughts?",
            "A. Evil thoughts may come but there is virtue in keeping them out", "B. Evil thoughts will continue to sting us like vipers as long as there are enemies who cause offense", "C. Like the pendulum, evil thoughts will always come to our mind no matter what we do", "D. Like most birds, evil thoughts fly swiftly in our minds without perching", 0,
            "The passage emphasizes that while we cannot stop thoughts from appearing, we must not allow them to 'reign' or build nests in our hair.", "2011:Q6", "Comprehension"))

        list.add(q("2011_q07", "Which of the following statements represents the view expressed by the writer in the first paragraph of Passage II?",
            "A. Evil thoughts will eventually ruin the evil man", "B. If we do not stop the pendulum of thought from swinging, our thoughts will soon become our enemies", "C. Too many evil thoughts leave fatal consequences", "D. It is possible to decide what controls our thoughts", 2,
            "The writer warns that if thoughts are left to enemies, 'they will be too many for us and will drag us down to ruin.'", "2011:Q7", "Comprehension"))

        list.add(q("2011_q08", "From the argument in the second paragraph of Passage II, it can be concluded that evil thoughts control the lives of people who:",
            "A. Are helpless because they fly out of their minds", "B. Cherish idle and slothful ways", "C. Are thieves with evil instincts", "D. Treasure and ruminate on them", 3,
            "The writer explains that he who 'meditates upon evil, loves it, and is ripe to commit it.'", "2011:Q8", "Comprehension"))

        list.add(q("2011_q09", "The expression 'Think of the devil and he will appear...' as used in the passage suggests that:",
            "A. Like the devil, evil thoughts must not reign in our hearts", "B. Evil thoughts are fantasies which exist only in people’s minds", "C. Uncontrolled evil thoughts may lead to evil deeds", "D. The devil gives evil thoughts only to those who invite him in", 2,
            "This proverb is used to illustrate that dwelling on evil thoughts inevitably leads to the hands (actions) following suit.", "2011:Q9", "Idioms & Interpretation"))

        list.add(q("2011_q10", "Which of the following statements summarizes the argument of the fourth paragraph of Passage II?",
            "A. Heavy traffic on a miry and dirty road may lead to evil thoughts", "B. The more evil we think, the more vile we are likely to become", "C. Evil people should not be welcome as guests in our homes the same way we welcome good people", "D. Evil thoughts control the key to human hearts and no one can keep them out", 1,
            "The passage states that every wave of wicked thought adds to corruption and rots the 'shore of life.'", "2011:Q10", "Comprehension"))

        list.add(q("2011_q11", "According to the writer in Passage III, people lead and motivate others because they want to:",
            "A. Project individual contribution", "B. Encourage selfless service", "C. Make the world a home", "D. Prevent empty search", 0,
            "The writer links leadership and motivation to helping people 'strive and succeed' in their specific roles.", "2011:Q11", "Comprehension"))

        list.add(q("2011_q12", "According to Passage III, balance must be enthroned because it is:",
            "A. A critical interdependent function", "B. An amazing help for conscience", "C. A critical part of fidelity", "D. A serious way of ensuring success", 3,
            "The text states balance is a 'critical component of truth' required to prevent 'vain pursuits.'", "2011:Q12", "Comprehension"))

        list.add(q("2011_q13", "The word 'inclinations' as used in Passage III means:",
            "A. Creeds", "B. Tendencies", "C. Inhibitions", "D. Power", 1,
            "'Inclinations' refers to natural propensities or a leaning toward a particular activity or role.", "2011:Q13", "Lexis: Synonyms"))

        list.add(q("2011_q14", "Which of the following statements is true according to Passage III?",
            "A. Greatness in life emerges when square pegs are put in round holes", "B. People do certain things in life because they know the repercussion", "C. People agree on all issues and behave the same way for the same reason", "D. Understanding life at different levels gives no account of visible acquisition", 3,
            "The text asserts that true prosperity is found in 'fulfillment through hard work than in intangible acquisition.'", "2011:Q14", "Comprehension"))

        list.add(q("2011_q15", "From Passage III on assumptions and life choices, it can be inferred that:",
            "A. People insincerely discuss facts that govern their behavior", "B. All managerial decisions are based on assumptions", "C. People make conscious efforts to acquire hidden knowledge", "D. All things in life exist on some beliefs", 2,
            "The writer highlights that while some are unconscious, others 'consciously imbibe assumptions' to redefine their roles.", "2011:Q15", "Comprehension"))

        list.add(q("2011_q16", "[Cloze Test] We live in an era of amazing ........ change spawned by advancing technology.",
            "A. Well-defined", "B. Fast-paced", "C. Favorable", "D. Social", 1,
            "The context of technology and industrialization implies speed and rapid transition ('fast-paced').", "2011:Q16", "Cloze Test"))

        list.add(q("2011_q17", "[Cloze Test] However, man’s ........ promoting and defending change...",
            "A. Knowledge of", "B. Attitude to", "C. Commitment to", "D. Opinion of", 2,
            "'Commitment to' fits the sense of man's dedicated effort to advance and establish customs.", "2011:Q17", "Cloze Test"))

        list.add(q("2011_q18", "[Cloze Test] ...effort to establish ........ that stimulate advancement for man's concern...",
            "A. Customs", "B. Companies", "C. Trade-zone", "D. Variations", 0,
            "Social change often involves establishing new 'customs' or practices within a society.", "2011:Q18", "Cloze Test"))

        list.add(q("2011_q19", "[Cloze Test] ...proving unfavorable to the climate with threatening ........",
            "A. Repercussions", "B. Clouds", "C. Pressure", "D. Implication", 0,
            "'Repercussions' refers to the unintended and negative consequences of human actions on the climate.", "2011:Q19", "Cloze Test"))

        list.add(q("2011_q20", "[Cloze Test] ...climate change is now a ........ global issue.",
            "A. An acceptable", "B. A foremost", "C. The only", "D. The last", 1,
            "'Foremost' signifies that climate change is a primary or leading issue on the global stage.", "2011:Q20", "Cloze Test"))

        list.add(q("2011_q21", "[Cloze Test] It is a major test of Africa’s ........",
            "A. Popularity", "B. Energy", "C. Ingenuity", "D. Incapability", 2,
            "In the source, the struggle with climate change is described as a 'major test of Africa's ingenuity' (cleverness/innovation).", "2011:Q21", "Cloze Test"))

        list.add(q("2011_q22", "[Cloze Test] ...creating major disturbance in human ........ and ecosystems.",
            "A. Geography", "B. Society", "C. Systems", "D. Life", 1,
            "The IPCC reports disturbances specifically in 'human society' alongside natural ecosystems.", "2011:Q22", "Cloze Test"))

        list.add(q("2011_q23", "[Cloze Test] The rising global ........ for energy and adverse changes on earth...",
            "A. Command", "B. Demand", "C. Warning", "D. Supply", 1,
            "'Demand' correctly identifies the world's increasing need and consumption of energy.", "2011:Q23", "Cloze Test"))

        list.add(q("2011_q24", "[Cloze Test] ...commensurate with the level of greenhouse ........ it spews out...",
            "A. Structure", "B. Paints", "C. Emulsion", "D. Emissions", 3,
            "'Emissions' is the scientific term for the gases (like CO2) released into the atmosphere.", "2011:Q24", "Cloze Test"))

        list.add(q("2011_q25", "[Cloze Test] ...a strategy that cannot, thus far, be termed ........",
            "A. Notable", "B. Liable", "C. Credible", "D. Flexible", 2,
            "The writer expresses doubt about current global strategies regarding Africa, calling them not 'credible' (believable or effective).", "2011:Q25", "Cloze Test"))

        list.add(q("2011_q26", "Interpret: 'If he were here, it could be more fun.'",
            "A. He was expected but did not show up to make the occasion lively.", "B. There was no fun because he was not present.", "C. He did not show up and so the occasion lacked much fun.", "D. He was being expected to supply more fun.", 2,
            "The use of the subjunctive 'if he were' indicates a counterfactual state; because he wasn't there, the expected fun was absent.", "2011:Q26", "Sentence Interpretation"))

        list.add(q("2011_q27", "Interpret: 'The secretary said that the postponement of the meeting was due to unforeseen circumstances.'",
            "A. The date of the meeting was shifted as a result of unexpected reasons.", "B. The meeting’s date was put off for strange reasons.", "C. The meeting was called off as a result of obstacles hitherto unknown.", "D. The meeting broke off as a result of unusual difficulties.", 0,
            "'Unforeseen circumstances' refer to surprise events that force a change in plans, such as a postponement (shifting the date).", "2011:Q27", "Sentence Interpretation"))

        list.add(q("2011_q28", "Interpret: 'The hunter has a bird’s-eye view of the animals.'",
            "A. He views the animal from a high position.", "B. He views the bird’s eye.", "C. He views the birds on the tree with one eye.", "D. He watches animals and birds closely.", 0,
            "A 'bird's-eye view' is an idiom meaning a panoramic or broad view from a high vantage point.", "2011:Q28", "Idioms & Interpretation"))

        list.add(q("2011_q29", "Interpret: 'Even though Susan was the last in the examination, her result wasn’t too different from what had been expected.'",
            "A. Her result was poor.", "B. Her result was a disappointment.", "C. Her result was as expected.", "D. She had not been serious with her studies.", 2,
            "The sentence explicitly states that the outcome aligned with prior expectations.", "2011:Q29", "Sentence Interpretation"))

        list.add(q("2011_q30", "Interpret: 'Mrs. Adasu does all her work with more haste, less speed.'",
            "A. She accepts whatever she does with more haste and speed.", "B. She approaches whatever she does hurriedly.", "C. She addresses everything she does very quickly to avoid mistakes.", "D. She does everything carefully to avoid mistakes.", 3,
            "The proverb 'more haste, less speed' suggests that rushing leads to errors, so acting with deliberation is more effective.", "2011:Q30", "Idioms & Interpretation"))

        list.add(q("2011_q31", "Interpret: 'She stopped her education as her uncle left her in the lurch.'",
            "A. Her uncle deceived her.", "B. Her uncle disinherited her.", "C. Her uncle refused to help her", "D. Her uncle disrespected her", 2,
            "To 'leave someone in the lurch' means to abandon them in a difficult situation without the needed support.", "2011:Q31", "Idioms & Interpretation"))

        list.add(q("2011_q32", "Interpret: 'The plan to upgrade the dispensary to a general hospital did not materialize.'",
            "A. The plan did not meet the required specifications.", "B. The arrangement did not work out as wished.", "C. It was difficult to obtain the materials.", "D. The materials purchased were not the right ones.", 1,
            "'Materialize' in this context means to come into fruition or happen as planned.", "2011:Q32", "Sentence Interpretation"))

        list.add(q("2011_q33", "Interpret: 'Okon’s company took a hit last year.'",
            "A. His company improved last year.", "B. His company made a huge success last year.", "C. His company was badly damaged last year.", "D. His company was established last year.", 1,
            "Per the exam key, 'B' is selected, though 'taking a hit' in broader idioms denotes facing a setback.", "2011:Q33", "Idioms & Interpretation"))

        list.add(q("2011_q34", "Interpret: 'My eldest son, who is in Lagos, is studying English.'",
            "A. Only my son is in Lagos studying English.", "B. My only son is in Lagos studying English.", "C. One of my sons is in Lagos studying English.", "D. My sons are in Lagos but only one is studying English.", 2,
            "'Eldest son' implies there are other sons; the non-restrictive clause 'who is in Lagos' identifies which specific son is being discussed.", "2011:Q34", "Grammar: Clauses"))

        list.add(q("2011_q35", "Interpret: 'If I went to the village, I would visit the king.'",
            "A. If I go to the village I will visit the king.", "B. I did not go to the village and I did not visit the king.", "C. All the times I went to village I also visited the King.", "D. I will visit the king when I go to the village.", 2,
            "This construction can represent a past habitual conditional action.", "2011:Q35", "Grammar: Conditionals"))

        list.add(q("2011_q37", "Choose the option nearest in meaning to the italicized word: 'He had a *detached* attitude towards the argument.'",
            "A. aggressive", "B. passionate", "C. indifferent", "D. supportive", 2,
            "'Detached' means emotionally unattached, neutral, or indifferent.", "2011:Q37", "Lexis: Synonyms"))

        list.add(q("2011_q38", "Choose the option nearest in meaning to the italicized word: 'The ancestors *dwelt* in this ancient valley.'",
            "A. fought", "B. farmed", "C. died", "D. lived", 3,
            "To 'dwell' (past: dwelt) means to live or reside in a place.", "2011:Q38", "Lexis: Synonyms"))

        list.add(q("2011_q39", "Choose the option nearest in meaning to the italicized word: 'The defeated army suffered an *ignominious* loss.'",
            "A. glorious", "B. expected", "C. disgraceful", "D. heroic", 2,
            "'Ignominious' means deserving or causing public disgrace or shame.", "2011:Q39", "Lexis: Synonyms"))

        list.add(q("2011_q40", "Choose the option nearest in meaning to the italicized word: 'The boss *compliments* the staff on their efficiency.'",
            "A. ignores", "B. reprimands", "C. employs", "D. praises", 3,
            "To compliment someone means to praise or admire their work.", "2011:Q40", "Lexis: Synonyms"))

        list.add(q("2011_q41", "Choose the option nearest in meaning to the italicized word: 'The innocent victim was *ensnared* by the fraudulent scheme.'",
            "A. trapped", "B. freed", "C. advised", "D. warned", 0,
            "'Ensnared' means caught in or as in a trap.", "2011:Q41", "Lexis: Synonyms"))

        list.add(q("2011_q42", "Choose the option nearest in meaning to the italicized word: 'The house was roofed with *corrugated* sheets.'",
            "A. plain", "B. ridged", "C. smooth", "D. tiled", 1,
            "'Corrugated' means shaped into alternate ridges and grooves.", "2011:Q42", "Lexis: Synonyms"))

        list.add(q("2011_q43", "Choose the option nearest in meaning to the italicized word: 'The lawyer gave an *astute* defense for his client.'",
            "A. clumsy", "B. shrewd", "C. foolish", "D. hesitant", 1,
            "'Astute' means having or showing an ability to accurately assess situations to one's advantage (shrewd/sharp).", "2011:Q43", "Lexis: Synonyms"))

        list.add(q("2011_q44", "Choose the option nearest in meaning to the italicized word: 'A *tactful* diplomat avoided the conflict.'",
            "A. reckless", "B. discreet", "C. aggressive", "D. noisy", 1,
            "'Tactful' means having or showing skill and sensitivity in dealing with others or with difficult issues (discreet).", "2011:Q44", "Lexis: Synonyms"))

        list.add(q("2011_q45", "Choose the option nearest in meaning to the italicized word: 'The elderly man suffered from *dementia*.'",
            "A. blindness", "B. senility", "C. arthritis", "D. malaria", 1,
            "'Dementia' is a chronic or persistent disorder of mental processes; hence 'senility'.", "2011:Q45", "Lexis: Synonyms"))

        list.add(q("2011_q46", "Choose the option nearest in meaning to the italicized word: 'Smoking has a *deleterious* effect on health.'",
            "A. harmless", "B. positive", "C. harmful", "D. negligible", 2,
            "'Deleterious' means causing harm or damage.", "2011:Q46", "Lexis: Synonyms"))

        list.add(q("2011_q47", "Choose the option nearest in meaning to the italicized word: 'The country adopted a *belligerent* attitude towards its neighbours.'",
            "A. peaceful", "B. cooperative", "C. combative", "D. friendly", 2,
            "'Belligerent' means hostile, aggressive, and combative.", "2011:Q47", "Lexis: Synonyms"))

        list.add(q("2011_q48", "Choose the option nearest in meaning to the italicized word: 'The abandoned child looked *forlorn*.'",
            "A. excited", "B. lonely and unhappy", "C. arrogant", "D. cheerful", 1,
            "'Forlorn' means pitifully sad, abandoned, or lonely.", "2011:Q48", "Lexis: Synonyms"))

        list.add(q("2011_q49", "Choose the option nearest in meaning to the italicized word: 'The new decree *supersedes* all earlier laws.'",
            "A. confirms", "B. displaces", "C. duplicates", "D. translates", 1,
            "To 'supersede' means to take the place of a person or thing previously in authority or use (displaces).", "2011:Q49", "Lexis: Synonyms"))

        list.add(q("2011_q54", "Choose the option opposite in meaning to the italicized word: 'The judge showed *mercy* to the offender.'",
            "A. pity", "B. kindness", "C. vengeance", "D. leniency", 2,
            "The opposite of 'mercy' (compassion or forgiveness) is 'vengeance' or retribution.", "2011:Q54", "Lexis: Antonyms"))

        list.add(q("2011_q55", "Choose the option opposite in meaning to the italicized word: 'Musa is a *garrulous* young man.'",
            "A. friendly", "B. talkative", "C. reticent", "D. lively", 2,
            "'Garrulous' means excessively talkative. The antonym is 'reticent' (reserved/quiet).", "2011:Q55", "Lexis: Antonyms"))

        list.add(q("2011_q56", "Choose the option opposite in meaning to the italicized word: 'His *callow* decisions led to the disaster.'",
            "A. foolish", "B. experienced", "C. youthful", "D. reckless", 1,
            "'Callow' means inexperienced and immature. The opposite is 'experienced'.", "2011:Q56", "Lexis: Antonyms"))

        list.add(q("2011_q57", "Choose the option opposite in meaning to the italicized word: 'The builders undertook a *herculean* task.'",
            "A. heavy", "B. massive", "C. strenuous", "D. easy", 3,
            "A 'herculean' task requires great strength or effort. The antonym is 'easy'.", "2011:Q57", "Lexis: Antonyms"))

        list.add(q("2011_q58", "Choose the option opposite in meaning to the italicized word: 'The new employee is a *novice* in accounting.'",
            "A. beginner", "B. trainee", "C. learner", "D. professional", 3,
            "A 'novice' is a beginner; the opposite is an expert or 'professional'.", "2011:Q58", "Lexis: Antonyms"))

        list.add(q("2011_q59", "Choose the option opposite in meaning to the italicized word: 'She was admired for her *candour*.'",
            "A. sincerity", "B. dishonesty", "C. openness", "D. clarity", 1,
            "'Candour' means the quality of being open, honest, and frank. The opposite is 'dishonesty'.", "2011:Q59", "Lexis: Antonyms"))

        list.add(q("2011_q60", "Choose the option opposite in meaning to the italicized word: 'The patient looked *anaemic*.'",
            "A. pale", "B. weak", "C. sick", "D. strong", 3,
            "'Anaemic' means lacking vitality, pale, or weak. The opposite is 'strong' or robust.", "2011:Q60", "Lexis: Antonyms"))

        list.add(q("2011_q61", "Choose the option opposite in meaning to the italicized word: 'The story was *inconceivable*.'",
            "A. credible", "B. impossible", "C. unbelievable", "D. absurd", 0,
            "'Inconceivable' means not capable of being imagined or grasped. The opposite is 'credible' (believable).", "2011:Q61", "Lexis: Antonyms"))

        list.add(q("2011_q62", "Choose the option opposite in meaning to the italicized word: 'He gave a *superficial* explanation.'",
            "A. shallow", "B. hurried", "C. deep", "D. simple", 2,
            "'Superficial' means existing or occurring at or on the surface; shallow. The opposite is 'deep' or thorough.", "2011:Q62", "Lexis: Antonyms"))

        list.add(q("2011_q63", "Choose the option opposite in meaning to the italicized word: 'The manager made a *prudent* investment.'",
            "A. wise", "B. clever", "C. careless", "D. safe", 2,
            "'Prudent' means acting with or showing care and thought for the future. The opposite is 'careless'.", "2011:Q63", "Lexis: Antonyms"))

        list.add(q("2011_q70", "Choose the option that best completes the gap: 'The dog ........ about the yard looking for bones.'",
            "A. fled", "B. jumped", "C. ferreted", "D. bounded", 2,
            "To 'ferret about' means to rummage or search around tenaciously.", "2011:Q70", "Lexis & Vocabulary"))

        list.add(q("2011_q90", "Choose the option that has the same consonant sound as the underlined letter: 'presti_ge_'",
            "A. danger", "B. gear", "C. catch", "D. leisure", 3,
            "The 'ge' in 'prestige' is pronounced as the voiced postalveolar fricative /ʒ/, matching 'leisure'.", "2011:Q90", "Oral English: Consonants"))

        list.add(q("2011_q91", "Choose the option that has the same consonant sound as the underlined letters: '_kn_ot'",
            "A. kite", "B. king", "C. norm", "D. keen", 2,
            "The 'k' in 'knot' is silent, leaving the /n/ sound, which matches 'norm'.", "2011:Q91", "Oral English: Consonants"))

        list.add(q("2011_q92", "Choose the option that rhymes with the given word: 'Fuel'",
            "A. cruel", "B. feel", "C. full", "D. foil", 0,
            "'Fuel' and 'cruel' share the same ending phonetic rhyme (/ˈfjuːəl/ and /ˈkruːəl/).", "2011:Q92", "Oral English: Rhymes"))

        list.add(q("2011_q93", "Choose the option that rhymes with the given word: 'Match'",
            "A. watch", "B. batch", "C. marsh", "D. much", 1,
            "'Match' and 'batch' both end with the /ætʃ/ sound.", "2011:Q93", "Oral English: Rhymes"))

        list.add(q("2011_q94", "Choose the option that rhymes with the given word: 'Sheer'",
            "A. chair", "B. share", "C. ear", "D. shore", 2,
            "'Sheer' and 'ear' rhyme on the /ɪə(r)/ diphthong.", "2011:Q94", "Oral English: Rhymes"))

        list.add(q("2011_q95", "Identify the syllable with the primary stress: 'po-li-ti-cal'",
            "A. PO-li-ti-cal", "B. po-LI-ti-cal", "C. po-li-TI-cal", "D. po-li-ti-CAL", 1,
            "Words ending in '-ical' are stressed on the antepenultimate syllable (second syllable: 'po-LI-ti-cal').", "2011:Q95", "Oral English: Stress"))

        list.add(q("2011_q96", "Identify the syllable with the primary stress: 'me-di-ta-tive'",
            "A. me-di-TA-tive", "B. me-DI-ta-tive", "C. ME-di-ta-tive", "D. me-di-ta-TIVE", 2,
            "The primary stress in 'meditative' falls on the first syllable ('ME-di-ta-tive').", "2011:Q96", "Oral English: Stress"))

        list.add(q("2011_q97", "Identify the syllable with the primary stress: 'sug-ges-ti-ble'",
            "A. SUG-ges-ti-ble", "B. sug-ges-TI-ble", "C. sug-GES-ti-ble", "D. sug-ges-ti-BLE", 2,
            "The primary stress in 'suggestible' is on the second syllable ('sug-GES-ti-ble').", "2011:Q97", "Oral English: Stress"))

        list.add(q("2011_q98", "The word in capital letters has the emphatic stress: 'Uche LOVES Toyota cars.' Choose the sentence to which it relates.",
            "A. Does Uche love Nissan cars?", "B. Who loves Toyota cars?", "C. Does Uche hate Toyota cars?", "D. Does Uche drive Toyota cars?", 2,
            "Emphasizing 'LOVES' highlights the contrast with an opposite feeling like 'hates'.", "2011:Q98", "Oral English: Emphatic Stress"))

        list.add(q("2011_q99", "The word in capital letters has the emphatic stress: 'The POLICE arrested the suspect.' Choose the sentence to which it relates.",
            "A. Did the police release the suspect?", "B. Who arrested the suspect?", "C. Did the soldiers arrest the suspect?", "D. Did the police arrest the judge?", 1,
            "Emphasizing 'The POLICE' answers the question of who performed the action.", "2011:Q99", "Oral English: Emphatic Stress"))

        list.add(q("2011_q100", "The word in capital letters has the emphatic stress: 'Maiduguri is the CAPITAL of Borno State.' Choose the sentence to which it relates.",
            "A. Is Maiduguri the capital of Kano State?", "B. Is Kano the capital of Borno State?", "C. Is Maiduguri just a regular town in Borno State?", "D. Was Maiduguri the capital of Borno State?", 2,
            "Emphasizing 'CAPITAL' clarifies its administrative status compared to a regular town.", "2011:Q100", "Oral English: Emphatic Stress"))

        // ==========================================
        // 2012 UTME USE OF ENGLISH
        // ==========================================
        list.add(q("2012_q01", "Which question paper type of Use of English is given to you in 2012?",
            "A. Type Green", "B. Type Red", "C. Type Blue", "D. Type Yellow", 3,
            "Official identification for Type Yellow exam booklet.", "2012:Q1", "Administrative"))

        list.add(q("2012_q02", "According to Passage I, Nigerian ethnic groups have:",
            "A. different traditional religions with some elements of similarities", "B. entirely identical forms of worship", "C. no belief in any supernatural deity", "D. only foreign imported systems of religion", 0,
            "All share beliefs in high gods and spirits while maintaining regional traditions.", "2012:Q2", "Comprehension"))

        list.add(q("2012_q03", "According to the passage on Nigerian religion, Nigerians believe:",
            "A. the natural world has no spiritual component", "B. priests have no contact with deities", "C. supernatural world controls the natural world", "D. prayer is completely unnecessary", 2,
            "They believe beings in the unseen world 'watch and judge us'.", "2012:Q3", "Comprehension"))

        list.add(q("2012_q04", "The decline of traditional religion in Nigeria is attributed partly to:",
            "A. complete absence of shrines", "B. scientific education alone", "C. lack of sacred spots", "D. influence of non-traditional religions", 3,
            "The spread and influence of Christianity and Islam led to shifts from traditional customs.", "2012:Q4", "Comprehension"))

        list.add(q("2012_q05", "A common factor in traditional religious practices mentioned is:",
            "A. Mass media broadcasting", "B. Divination", "C. Electronic recording", "D. Print publication", 1,
            "Consulting diviners, medicine men, and oracles is a common feature across ethnic groups.", "2012:Q5", "Comprehension"))

        list.add(q("2012_q06", "According to Passage II on reading culture, reading habits show that:",
            "A. Nigerians read only indigenous novels", "B. bookshops refuse to stock foreign authors", "C. reading culture is at its highest peak", "D. Nigerians read mostly foreign books", 3,
            "The text highlights that readers concentrate heavily on foreign books.", "2012:Q6", "Comprehension"))

        list.add(q("2012_q07", "The lack of sales for indigenous books is largely because:",
            "A. indigenous books are free", "B. foreign books attract more buyers", "C. there are no Nigerian writers", "D. books are illegal", 1,
            "Foreign books are driven by higher buyer demand in bookshops.", "2012:Q7", "Comprehension"))

        list.add(q("2012_q08", "The phrase 'profoundly gripping' as used in reference to Adichie's novel means:",
            "A. is highly interesting and captures attention", "B. is terrifying and difficult to hold", "C. is physically heavy", "D. is dull and uninspiring", 0,
            "'Profoundly gripping' denotes deeply fascinating and captivating storytelling.", "2012:Q8", "Comprehension"))

        list.add(q("2012_q09", "The primary reason students in tertiary institutions depend on lecturers' handouts is:",
            "A. lack of interest in exams", "B. low purchasing power and lack of textbooks in libraries", "C. handouts are internationally published", "D. books are prohibited on campus", 1,
            "Currency devaluation caused library book shortages, leaving students reliant on handouts.", "2012:Q9", "Comprehension"))

        list.add(q("2012_q10", "A suitable title for Passage II is:",
            "A. The History of Printing in Lagos", "B. Prizes in African Literature", "C. Poor reading Culture in Nigeria", "D. The Biography of Achebe", 2,
            "The entire passage investigates the decline and challenges of reading culture in Nigeria.", "2012:Q10", "Comprehension"))

        list.add(q("2012_q11", "The writer's attitude in Passage III comparing experience with wisdom is:",
            "A. indifferent", "B. critical", "C. hostile", "D. mocking", 1,
            "The writer critically evaluates learning by painful mistakes versus acquiring wisdom proactively.", "2012:Q11", "Comprehension"))

        list.add(q("2012_q12", "The deduction from Passage III is that:",
            "A. experience is the only valid way to learn", "B. burning one's fingers is necessary", "C. books should be avoided", "D. wise thoughts are more desirable than experience", 3,
            "Learning by wisdom is described as 'easier and cheaper' than learning through painful regret.", "2012:Q12", "Comprehension"))

        list.add(q("2012_q13", "Which statement is true according to Passage III?",
            "A. Regret is better than wisdom", "B. The totality of our actions should be decided by our judgement", "C. Seminars are useless", "D. Experience carries no cost", 1,
            "Prudent judgement and conscious learning must guide our choices.", "2012:Q13", "Comprehension"))

        list.add(q("2012_q14", "To learn through wisdom, one must be disciplined to:",
            "A. make repeated mistakes", "B. avoid all books", "C. choose the learning opportunity that comes our way", "D. refuse advice", 2,
            "Active engagement with books, seminars, and knowledge opportunities fosters wisdom.", "2012:Q14", "Comprehension"))

        list.add(q("2012_q15", "The phrase 'wholehearted devotion' means:",
            "A. acting without doubt", "B. working with hesitation", "C. partial commitment", "D. temporary enthusiasm", 0,
            "Complete and undivided commitment to acquiring knowledge.", "2012:Q15", "Comprehension"))

        list.add(q("2012_q26", "Interpret: 'Hardworking students do not have a finger in every pie.'",
            "A. They eat too many pies", "B. They bake pastry regularly", "C. Hardworking students do not participate in all activities", "D. They refuse to study", 2,
            "To have 'a finger in every pie' means being involved in too many different matters simultaneously.", "2012:Q26", "Idioms & Interpretation"))

        list.add(q("2012_q27", "Interpret: 'The Vice Chancellor is riding the crest of popularity.'",
            "A. The VC enjoys acknowledgement of success", "B. The VC is falling down", "C. The VC has resigned", "D. The VC is on horseback", 0,
            "'Riding the crest' is an idiom meaning enjoying peak success or high approval.", "2012:Q27", "Idioms & Interpretation"))

        list.add(q("2012_q28", "Interpret: 'She was absolved of all blame.'",
            "A. She was sentenced to prison", "B. She admitted her guilt", "C. She was fined heavily", "D. She was declared free from the charge", 3,
            "To 'absolve' means to officially declare someone free from guilt, obligation, or punishment.", "2012:Q28", "Sentence Interpretation"))

        list.add(q("2012_q31", "Interpret: 'He need not have played in that match.'",
            "A. He participated in the game in his unusual position", "B. He did not play at all", "C. He was injured before the game", "D. He was forced to play", 0,
            "'Need not have done' indicates an action was performed though it was unnecessary.", "2012:Q31", "Grammar: Modals"))

        list.add(q("2012_q32", "Interpret: 'I wouldn't have responded that way if I were you.'",
            "A. I responded angrily", "B. You did not respond at all", "C. The respondent replied although he ought not have", "D. We both gave the same reply", 2,
            "The speaker advises that the other person's manner of replying was inadvisable.", "2012:Q32", "Sentence Interpretation"))

        list.add(q("2012_q33", "Interpret: 'The celebrated hero had feet of clay.'",
            "A. He walked on mud", "B. He was weak and cowardly", "C. His legs were made of sculpture", "D. He was shy and timid", 3,
            "Having 'feet of clay' is an idiom meaning having a hidden flaw or unexpected weakness.", "2012:Q33", "Idioms & Interpretation"))

        list.add(q("2012_q34", "Interpret: 'The striker wasted a golden opportunity.'",
            "A. He sold the gold medal", "B. The player did not score the shot", "C. He bought expensive boots", "D. He scored an amazing goal", 1,
            "To waste a golden opportunity means to fail to capitalize on a perfect chance to score or succeed.", "2012:Q34", "Idioms & Interpretation"))

        list.add(q("2012_q36", "Choose the option opposite in meaning to the italicized word: 'The professor is a *genius* in his field.'",
            "A. scholar", "B. master", "C. expert", "D. idiot", 3,
            "The direct antonym of a 'genius' is an 'idiot' or fool.", "2012:Q36", "Lexis: Antonyms"))

        list.add(q("2012_q37", "Choose the option opposite in meaning to the italicized word: 'The audience was *shocked* by the sudden news.'",
            "A. terrified", "B. surprised", "C. unconcerned", "D. dismayed", 2,
            "The antonym of being 'shocked' or deeply disturbed is being 'unconcerned' or indifferent.", "2012:Q37", "Lexis: Antonyms"))

        list.add(q("2012_q38", "Choose the option opposite in meaning to the italicized word: 'The organization has a *flexible* schedule.'",
            "A. adaptable", "B. elastic", "C. simple", "D. rigid", 3,
            "'Flexible' means easily modified. The direct antonym is 'rigid'.", "2012:Q38", "Lexis: Antonyms"))

        list.add(q("2012_q39", "Choose the option opposite in meaning to the italicized word: 'He gave a *sober* speech at the memorial.'",
            "A. excited", "B. calm", "C. serious", "D. gloomy", 0,
            "'Sober' means serious, solemn, and muted. The opposite mood is 'excited'.", "2012:Q39", "Lexis: Antonyms"))

        list.add(q("2012_q40", "Choose the option opposite in meaning to the italicized word: 'Her administrative *efficiency* earned her a promotion.'",
            "A. skill", "B. incompetence", "C. expertise", "D. diligence", 1,
            "The antonym of 'efficiency' (competence and effectiveness) is 'incompetence'.", "2012:Q40", "Lexis: Antonyms"))

        list.add(q("2012_q41", "Choose the option opposite in meaning to the italicized word: 'The diplomat remained *reticent* during the conference.'",
            "A. quiet", "B. reserved", "C. silent", "D. loquacious", 3,
            "'Reticent' means uncommunicative or reserved. Its antonym is 'loquacious' (talkative).", "2012:Q41", "Lexis: Antonyms"))

        list.add(q("2012_q42", "Choose the option opposite in meaning to the italicized word: 'The political atmosphere in the region is *volatile*.'",
            "A. calm", "B. explosive", "C. turbulent", "D. unpredictable", 0,
            "'Volatile' means liable to change rapidly and unpredictably, especially for the worse. The opposite is 'calm'.", "2012:Q42", "Lexis: Antonyms"))

        list.add(q("2012_q43", "Choose the option opposite in meaning to the italicized word: 'His *abrasive* manner offended several colleagues.'",
            "A. gentle", "B. harsh", "C. rude", "D. rough", 0,
            "'Abrasive' means showing little concern for the feelings of others; harsh. The antonym is 'gentle'.", "2012:Q43", "Lexis: Antonyms"))

        list.add(q("2012_q44", "Choose the option opposite in meaning to the italicized word: 'The committee was set up on an *ad hoc* basis.'",
            "A. temporary", "B. formal", "C. special", "D. brief", 1,
            "'Ad hoc' means formed for a specific purpose rather than permanent or standard. Its opposite is 'formal' or established.", "2012:Q44", "Lexis: Antonyms"))

        list.add(q("2012_q45", "Choose the option opposite in meaning to the italicized word: 'The microscope detected an *infinitesimal* trace of the chemical.'",
            "A. large", "B. microscopic", "C. tiny", "D. minute", 0,
            "'Infinitesimal' means extremely small. The antonym is 'large'.", "2012:Q45", "Lexis: Antonyms"))

        list.add(q("2012_q46", "Choose the option opposite in meaning to the italicized word: 'The witness *adduced* strong evidence in court.'",
            "A. cited", "B. presented", "C. produced", "D. refuted", 3,
            "To 'adduce' means to cite or offer as evidence. The opposite is to 'refute' or disclaim.", "2012:Q46", "Lexis: Antonyms"))

        list.add(q("2012_q47", "Choose the option opposite in meaning to the italicized word: 'The doctor administered an *antidote* to the poison.'",
            "A. remedy", "B. cure", "C. neutralizer", "D. obstacle", 3,
            "An 'antidote' counteracts poison/harm; conceptually countered by an 'obstacle' or aggravator.", "2012:Q47", "Lexis: Antonyms"))

        list.add(q("2012_q48", "Choose the option opposite in meaning to the italicized word: 'The soldier showed *callous* disregard for the victims.'",
            "A. cruel", "B. compassionate", "C. unfeeling", "D. heartless", 1,
            "'Callous' means showing an insensitive and cruel disregard for others. The opposite is 'compassionate'.", "2012:Q48", "Lexis: Antonyms"))

        list.add(q("2012_q49", "Choose the option opposite in meaning to the italicized word: 'He is solely concerned with *temporal* affairs.'",
            "A. spiritual", "B. earthly", "C. worldly", "D. secular", 0,
            "'Temporal' relates to worldly and material affairs as opposed to 'spiritual' matters.", "2012:Q49", "Lexis: Antonyms"))

        list.add(q("2012_q57", "Choose the option nearest in meaning to the italicized word: 'The child was *petrified* by the roaring thunder.'",
            "A. frightened", "B. delighted", "C. comforted", "D. annoyed", 0,
            "'Petrified' means so frightened that one is unable to move.", "2012:Q57", "Lexis: Synonyms"))

        list.add(q("2012_q58", "Choose the option nearest in meaning to the italicized word: 'The lake *shimmers* in the sunlight.'",
            "A. freezes", "B. disappears", "C. shines", "D. darkens", 2,
            "To 'shimmer' means to shine with a soft, tremulous light.", "2012:Q58", "Lexis: Synonyms"))

        list.add(q("2012_q59", "Choose the option nearest in meaning to the italicized word: 'Children are *vulnerable* to seasonal infections.'",
            "A. liable", "B. immune", "C. resistant", "D. hardened", 0,
            "'Vulnerable' means exposed to the possibility of being attacked or harmed; liable/susceptible.", "2012:Q59", "Lexis: Synonyms"))

        list.add(q("2012_q60", "Choose the option nearest in meaning to the italicized word: 'The thief gave a *furtive* glance before entering.'",
            "A. loud", "B. bold", "C. open", "D. sly", 3,
            "'Furtive' means attempting to avoid notice or attention, typically because of guilt; sneaky or 'sly'.", "2012:Q60", "Lexis: Synonyms"))

        list.add(q("2012_q61", "Choose the option nearest in meaning to the italicized word: 'He gave an *extempore* speech at the banquet.'",
            "A. out-of-hand", "B. rehearsed", "C. written", "D. delayed", 0,
            "'Extempore' means spoken or done without preparation; offhand / out-of-hand.", "2012:Q61", "Lexis: Synonyms"))

        list.add(q("2012_q62", "Choose the option nearest in meaning to the italicized word: 'She had no *inkling* of what was going to happen.'",
            "A. possible idea", "B. certainty", "C. fear", "D. excitement", 0,
            "An 'inkling' is a slight knowledge or suspicion; a hint or possible idea.", "2012:Q62", "Lexis: Synonyms"))

        list.add(q("2012_q63", "Choose the option nearest in meaning to the italicized word: 'The author *espoused* the cause of women's rights.'",
            "A. rejected", "B. opposed", "C. criticized", "D. supported", 3,
            "To 'espouse' a cause means to adopt, embrace, or support it.", "2012:Q63", "Lexis: Synonyms"))

        list.add(q("2012_q64", "Choose the option nearest in meaning to the italicized word: 'The new regulation will *foreclose* any further debate.'",
            "A. exclude", "B. permit", "C. encourage", "D. continue", 0,
            "To 'foreclose' means to rule out or prevent in advance; to exclude.", "2012:Q64", "Lexis: Synonyms"))

        list.add(q("2012_q65", "Choose the option nearest in meaning to the italicized word: 'The scientist *exploded* the ancient myth.'",
            "A. affirmed", "B. debunked", "C. published", "D. praised", 1,
            "To 'explode' a myth or theory means to show it to be false or unfounded (debunked).", "2012:Q65", "Lexis: Synonyms"))

        // ==========================================
        // 2013 UTME USE OF ENGLISH & PRESCRIBED TEXTS
        // ==========================================
        list.add(q("2013_q01", "Which question paper type of Use of English is given to you in 2013?",
            "A. Type A", "B. Type C", "C. Type B", "D. Type D", 2,
            "Official exam administrative identification: Type B.", "2013:Q1", "Administrative"))

        list.add(q("2013_q02", "According to Passage I, pots can be made quickly and correctly at the Abuja Centre because:",
            "A. clay is imported from Europe", "B. potters use the throwing process on a wheel", "C. no tools are needed", "D. water is unnecessary", 1,
            "The passage explains that 'throwing' on a potters' wheel enables rapid and symmetrical pot production.", "2013:Q2", "Comprehension"))

        list.add(q("2013_q03", "Identical pot sizes are achieved at the Pottery Centre by:",
            "A. estimating by sight", "B. weighing the lumps of clay before throwing", "C. cutting them after firing", "D. baking them in molds", 1,
            "Weighing precise lumps of clay ensures uniformity of size across batches.", "2013:Q3", "Comprehension"))

        list.add(q("2013_q04", "The phrase 'trims off' in pottery technique means to:",
            "A. cut away unnecessary parts", "B. paint with bright color", "C. burn in the kiln", "D. soak in water", 0,
            "Trimming involves paring away excess clay to finish the base or profile.", "2013:Q4", "Comprehension"))

        list.add(q("2013_q05", "The word 'congenial' as used in describing the environment means:",
            "A. hostile", "B. frozen", "C. noisy", "D. nice and favourable", 3,
            "'Congenial' means pleasant, suitable, or agreeable.", "2013:Q5", "Lexis: Synonyms"))

        list.add(q("2013_q21", "In Chukwuemeka Ike's *The Potter’s Wheel*, what character trait defines Samuel?",
            "A. Timid and cowardly", "B. Pranks and deceitful tricks", "C. Gentle scholar", "D. Quiet hermit", 1,
            "Samuel's mischievous antics and tricks feature prominently in the novel.", "2013:Q21", "Prescribed Text: The Potter's Wheel"))

        list.add(q("2013_q22", "In *The Potter’s Wheel*, Nwomiko is widely feared in the village because of her:",
            "A. immense political wealth", "B. reputed spiritual and witchcraft powers", "C. position as headmistress", "D. wrestling championship", 1,
            "Nwomiko is regarded as an eccentric, formidable figure with alleged supernatural powers.", "2013:Q22", "Prescribed Text: The Potter's Wheel"))

        list.add(q("2013_q23", "In *The Potter’s Wheel*, who is nicknamed 'the Fallen Goliath'?",
            "A. Obu", "B. Teacher Zaccheus", "C. Mazi Laza", "D. Samuel", 3,
            "Samuel is referred to as 'the Fallen Goliath' following his defeat or disgrace in village squabbles.", "2013:Q23", "Prescribed Text: The Potter's Wheel"))

        list.add(q("2013_q24", "In *The Potter’s Wheel*, the strict discipline in the school is enforced by:",
            "A. Father Patrick", "B. Teacher Zaccheus", "C. Chief Okeke", "D. Mama Okoh", 1,
            "Teacher Zaccheus maintains strict classroom discipline and authority.", "2013:Q24", "Prescribed Text: The Potter's Wheel"))

        list.add(q("2013_q30", "In *The Potter’s Wheel*, what does the 'pad' worn on the head symbolize in class?",
            "A. Academic excellence", "B. Royal heritage", "C. Prefect ship", "D. Stupidity or academic failure", 3,
            "The pad was used as an emblem of shame for students who failed tests or made foolish mistakes.", "2013:Q30", "Prescribed Text: The Potter's Wheel"))

        list.add(q("2013_q31", "In Jerry Agada's *The Successors*, who is Terkura's role model?",
            "A. Okoh Ameh", "B. David", "C. His successful elder associate", "D. The district officer", 2,
            "Terkura seeks inspiration from successful mentors in establishing his enterprise.", "2013:Q31", "Prescribed Text: The Successors"))

        list.add(q("2013_q32", "In *The Successors*, Terkura's primary motivation in life is to:",
            "A. Make a lasting name and legacy for posterity", "B. Emigrate to Europe", "C. Join the army", "D. Live in luxury without working", 0,
            "Terkura is driven by the desire to build an enduring name and reputable business legacy.", "2013:Q32", "Prescribed Text: The Successors"))

        list.add(q("2013_q76", "Choose the option that best completes the gap: 'The highway was filled with ........'",
            "A. fast moving luxury buses", "B. fast moves luxury bus", "C. luxury fast bus moving", "D. fast-moving luxury buses", 3,
            "The compound adjective 'fast-moving' requires a hyphen before the noun phrase 'luxury buses'.", "2013:Q76", "Grammar: Adjectives"))

        list.add(q("2013_q77", "Choose the option that best completes the gap: 'The books on the table are ........'",
            "A. their's", "B. theirs", "C. there's", "D. their", 1,
            "The possessive pronoun is 'theirs' (never written with an apostrophe).", "2013:Q77", "Grammar: Pronouns"))

        list.add(q("2013_q78", "Choose the option that best completes the gap: 'The local council enacted several new ........'",
            "A. buy-laws", "B. by-law", "C. bye-laws", "D. by-laws'", 2,
            "The plural form of municipal regulations is 'bye-laws' (or 'by-laws').", "2013:Q78", "Spelling & Grammar"))

        list.add(q("2013_q79", "Choose the option that best completes the gap: 'I haven't visited Kano, and ........'",
            "A. neither have I", "B. so have I", "C. neither haven't I", "D. I haven't also", 0,
            "'Neither have I' is the standard negative coordinate clause.", "2013:Q79", "Grammar: Concord"))

        list.add(q("2013_q80", "Choose the option that best completes the gap: 'He could have caught the train ........'",
            "A. if he ran faster", "B. if he runs faster", "C. if he has run faster", "D. if he had run faster", 3,
            "Third conditional: 'could have caught' pairs with past perfect 'had run'.", "2013:Q80", "Grammar: Conditionals"))

        list.add(q("2013_q81", "Choose the option that best completes the gap: 'Give the parcel to ........ is at the front desk.'",
            "A. whomever", "B. whoever", "C. whom", "D. whosever", 1,
            "'Whoever' acts as the subject of the clause 'is at the front desk'.", "2013:Q81", "Grammar: Pronouns"))

        list.add(q("2013_q82", "Choose the option that best completes the gap: 'The killing of one's mother is termed ........'",
            "A. patricide", "B. matricide", "C. fratricide", "D. regicide", 1,
            "'Matricide' is the act of killing one's mother (patricide = father, fratricide = brother).", "2013:Q82", "Lexis & Vocabulary"))

        // ==========================================
        // 2014 UTME USE OF ENGLISH
        // ==========================================
        list.add(q("2014_q01", "Which question paper type of Use of English is given to you in 2014?",
            "A. Type A", "B. Type F", "C. Type L", "D. Type S", 2,
            "Official administrative booklet type identifier: Type L.", "2014:Q1", "Administrative"))

        list.add(q("2014_q02", "According to Passage I, which statement about political and social change is true?",
            "A. Change can always be prevented", "B. Humans prefer stagnation", "C. Change is inevitable", "D. Societies never evolve", 2,
            "The passage emphasizes that change is a constant, inevitable dynamic of human societies.", "2014:Q2", "Comprehension"))

        list.add(q("2014_q03", "In Passage I, the relationship between political change and power is describe as:",
            "A. Intertwined", "B. Irrelevant", "C. Non-existent", "D. Oppositional", 0,
            "Shifts in political power and social transformation are deeply interconnected and intertwined.", "2014:Q3", "Comprehension"))

        list.add(q("2014_q04", "A suitable title for Passage I is:",
            "A. The Fall of Nations", "B. Economic Trade Wars", "C. The Election Process", "D. Social change and political empowerment", 3,
            "The passage details how social change fosters political empowerment and institutional transformation.", "2014:Q4", "Comprehension"))

        list.add(q("2014_q08", "According to Passage II on snakes, which statement is true?",
            "A. Snakes are not in the polar region", "B. Snakes are warm-blooded", "C. Snakes eat every ten minutes", "D. Snakes are found only in Africa", 0,
            "Snakes are cold-blooded and cannot survive in Antarctica/polar regions.", "2014:Q8", "Comprehension"))

        list.add(q("2014_q10", "A suitable title for Passage II is:",
            "A. Poisonous Insects", "B. Some characteristics of snakes", "C. The Arctic Fauna", "D. Farming Techniques", 1,
            "The text reviews anatomical features, diet, ectothermic regulation, and habitat of snakes.", "2014:Q10", "Comprehension"))

        list.add(q("2014_q11", "[Cloze: Newspaper Production] The business side of the newspaper is controlled by the ........",
            "A. reporter", "B. editor", "C. proprietor", "D. vendor", 2,
            "The owner or 'proprietor' oversees the financial and executive management of the newspaper company.", "2014:Q11", "Cloze Test"))

        list.add(q("2014_q12", "[Cloze: Newspaper Production] Field news is gathered by active ........",
            "A. readers", "B. reporters", "C. printers", "D. typesetters", 1,
            "'Reporters' are assigned to find and document news in the field.", "2014:Q12", "Cloze Test"))

        list.add(q("2014_q13", "[Cloze: Newspaper Production] Overseas stories are dispatched by foreign ........",
            "A. correspondents", "B. columnists", "C. distributors", "D. publishers", 0,
            "Journalists based abroad who send reports to a newspaper are 'correspondents'.", "2014:Q13", "Cloze Test"))

        list.add(q("2014_q14", "[Cloze: Newspaper Production] The person who decides which news stories get printed is the ........",
            "A. reader", "B. news editor", "C. advertiser", "D. printer", 1,
            "The 'news editor' reviews incoming copy and decides placement and coverage.", "2014:Q14", "Cloze Test"))

        list.add(q("2014_q15", "[Cloze: Newspaper Production] Detailed headline crafting and page layout editing is handled by ........",
            "A. sub-editors", "B. vendors", "C. clerks", "D. drivers", 0,
            "'Sub-editors' edit text for style, grammar, length, and write headlines.", "2014:Q15", "Cloze Test"))

        list.add(q("2014_q16", "[Cloze: Newspaper Production] An opinion piece published regularly is written by a ........",
            "A. cameraman", "B. messenger", "C. columnist", "D. technician", 2,
            "A writer who contributes a regular column expressing viewpoints is a 'columnist'.", "2014:Q16", "Cloze Test"))

        list.add(q("2014_q17", "[Cloze: Newspaper Production] The official voice and perspective of the newspaper is formed by the ........",
            "A. delivery team", "B. editorial board", "C. security staff", "D. apprentice", 1,
            "The 'editorial board' produces the lead opinion piece representing the paper's stance.", "2014:Q17", "Cloze Test"))

        list.add(q("2014_q53", "Choose the option opposite in meaning to the italicized word: 'The tailor left the seam *unpicked*.'",
            "A. threaded", "B. torn", "C. loose", "D. cut", 0,
            "The opposite of leaving a seam 'unpicked' (ripped or loose) is sewing or having it 'threaded'.", "2014:Q53", "Lexis: Antonyms"))

        list.add(q("2014_q72", "Choose the option that best completes the gap: 'The pendulum swung ........ across the dial.'",
            "A. from and to", "B. here and there", "C. by and by", "D. to and fro", 3,
            "The fixed idiomatic expression for rhythmic back-and-forth movement is 'to and fro'.", "2014:Q72", "Idioms & Prepositions"))

        list.add(q("2014_q73", "Choose the option that best completes the gap: 'The counsel argued passionately ........ the accused.'",
            "A. upon", "B. under", "C. against", "D. on", 2,
            "The prosecutor argues 'against' the accused in court.", "2014:Q73", "Prepositions"))

        list.add(q("2014_q74", "Choose the option that best completes the gap: 'The foul smell from the drainage was ........'",
            "A. sickeningly", "B. nausea", "C. nauseating", "D. nauseated", 2,
            "The predicate adjective describing a smell that induces nausea is 'nauseating'.", "2014:Q74", "Grammar: Adjectives"))

        list.add(q("2014_q77", "Choose the option that best completes the gap: 'Public speaking is not his ........'",
            "A. fort", "B. faulty", "C. force", "D. forte", 3,
            "A person's strong suit or special talent is their 'forte' (pronounced /fɔːteɪ/ or /fɔːt/).", "2014:Q77", "Lexis & Spelling"))

        list.add(q("2014_q78", "Choose the option that best completes the gap: 'The two events took place in a ........ manner.'",
            "A. concurrently", "B. current", "C. concurrent", "D. concurrency", 2,
            "The adjective modifying 'manner' is 'concurrent' (occurring simultaneously).", "2014:Q78", "Grammar: Adjectives"))

        list.add(q("2014_q81", "Choose the option that best completes the gap: 'A sudden thunderbolt ........ the ancient baobab tree.'",
            "A. strike", "B. striked", "C. struck", "D. stricken", 2,
            "The simple past tense of 'strike' is 'struck'.", "2014:Q81", "Grammar: Irregular Verbs"))

        list.add(q("2014_q82", "Choose the option that best completes the gap: 'The jury delivered its ........ the convict.'",
            "A. verdict on", "B. verdict to", "C. verdict at", "D. verdict for", 0,
            "A jury delivers a 'verdict on' a case or defendant.", "2014:Q82", "Prepositions"))

        // ==========================================
        // 2015 UTME USE OF ENGLISH & PRESCRIBED TEXTS
        // ==========================================
        list.add(q("2015_q01", "In Passage I on conflict management, a third-party non-coercive facilitator is termed a:",
            "A. belligerent", "B. warrior", "C. conqueror", "D. mediator", 3,
            "A 'mediator' assists disputing parties in reaching a mutually agreed settlement.", "2015:Q1", "Comprehension"))

        list.add(q("2015_q21", "In A. H. Mohammed's *The Last Days at Forcados High School*, what secret did Joke share with Jimi about Efua?",
            "A. That Efua was expelled from her previous school", "B. That Efua was married", "C. That Efua was an artist", "D. That Efua had a complex past", 3,
            "Joke reveals background information about Efua's mysterious history.", "2015:Q21", "Prescribed Text: Forcados High School"))

        list.add(q("2015_q22", "In *The Last Days at Forcados High School*, who is Jimi's close female childhood confidante?",
            "A. Nene", "B. Efua", "C. Caro", "D. Ansa", 0,
            "Nene Ekpo is Jimi and Ansa's dependable childhood friend.", "2015:Q22", "Prescribed Text: Forcados High School"))

        list.add(q("2015_q25", "In *The Last Days at Forcados High School*, what career did Jimi’s father want him to pursue?",
            "A. Accountancy / Business", "B. Music", "C. Fine Art", "D. Farming", 0,
            "Mr. Solade pushed his sons toward conventional prestigious professions like Accountancy and Medicine.", "2015:Q25", "Prescribed Text: Forcados High School"))

        list.add(q("2015_q26", "In *The Last Days at Forcados High School*, why was Jimi's older brother Wole estranged from home?",
            "A. He lived in England", "B. Bullying, indiscipline, and substance abuse", "C. He was a monk", "D. He refused to attend school", 1,
            "Wole had dropped out of university and caused family friction through reckless habits.", "2015:Q26", "Prescribed Text: Forcados High School"))

        list.add(q("2015_q27", "In *The Last Days at Forcados High School*, Mr. Mallum was known as the:",
            "A. Discipline master and principal", "B. Sports coach", "C. Chemistry lab assistant", "D. Driver", 0,
            "Mr. Mallum was the firm, principled principal of Forcados High School.", "2015:Q27", "Prescribed Text: Forcados High School"))

        list.add(q("2015_q46", "Choose the option opposite in meaning to the italicized word: 'The crowd was in a state of *frenzy*.'",
            "A. excitement", "B. panic", "C. calm", "D. anger", 2,
            "'Frenzy' is a state of wild excitement or uncontrolled activity. The antonym is 'calm'.", "2015:Q46", "Lexis: Antonyms"))

        list.add(q("2015_q47", "Choose the option opposite in meaning to the italicized word: 'The survivors described the accident as a *harrowing* experience.'",
            "A. terrifying", "B. painful", "C. pleasant", "D. shocking", 2,
            "'Harrowing' means acutely distressing. The opposite is 'pleasant'.", "2015:Q47", "Lexis: Antonyms"))

        list.add(q("2015_q48", "Choose the option opposite in meaning to the italicized word: 'The rebel troops *invaded* the capital.'",
            "A. conquered", "B. captured", "C. defended", "D. attacked", 2,
            "The opposite of 'invading' (attacking to seize) is 'defending' the territory.", "2015:Q48", "Lexis: Antonyms"))

        list.add(q("2015_q54", "Choose the option opposite in meaning to the italicized word: 'He gave a *scornful* laugh at the proposal.'",
            "A. respectful", "B. mocking", "C. derisive", "D. contemptuous", 0,
            "'Scornful' means expressing contempt or derision. The antonym is 'respectful'.", "2015:Q54", "Lexis: Antonyms"))

        list.add(q("2015_q56", "Choose the option opposite in meaning to the italicized word: 'Uncle Audu is a complete *abstainer*.'",
            "A. alcohol consumer / drinker", "B. vegetarian", "C. runner", "D. smoker", 0,
            "An 'abstainer' completely avoids alcoholic drinks; the opposite is a drinker or consumer.", "2015:Q56", "Lexis: Antonyms"))

        list.add(q("2015_q57", "Choose the option nearest in meaning to the italicized word: 'Her *caustic* remarks upset the whole team.'",
            "A. polite", "B. gentle", "C. encouraging", "D. sarcastic", 3,
            "'Caustic' remarks are biting, sarcastic, and sharp.", "2015:Q57", "Lexis: Synonyms"))

        // ==========================================
        // 2016 UTME USE OF ENGLISH
        // ==========================================
        list.add(q("2016_q01", "According to Passage I on tobacco consumption, the clash in viewpoint is between:",
            "A. Drivers and passengers", "B. Moralists who decry health decay vs. economists noting revenue/demand", "C. Artists and critics", "D. Teachers and students", 1,
            "Moralists highlight moral/physical decay, while economic analysis looks at industry supply, demand, and taxes.", "2016:Q1", "Comprehension"))

        list.add(q("2016_q07", "According to Passage II on endangered wildlife, what is the biggest modern threat to animals?",
            "A. Flooding only", "B. Cold weather", "C. Volcanic ash", "D. Human hunting for fashion and destruction of habitats", 3,
            "Human expansion, fashion exploitation (skins, ivory), and habitat loss endanger wildlife.", "2016:Q7", "Comprehension"))

        list.add(q("2016_q11", "[Cloze: Public Speaking] When a speaker writes a speech word for word and reads it, it is a ........ delivery.",
            "A. memorized", "B. impromptu", "C. extemporaneous", "D. manuscript", 3,
            "Reading a verbatim written text is termed 'manuscript delivery'.", "2016:Q11", "Cloze Test"))

        list.add(q("2016_q13", "[Cloze: Public Speaking] Manuscript speeches are most appropriate for ........ occasions.",
            "A. casual", "B. informal", "C. playful", "D. formal", 3,
            "Formal occasions (press statements, presidential addresses) require exact manuscript wording.", "2016:Q13", "Cloze Test"))

        list.add(q("2016_q16", "[Cloze: Public Speaking] The primary benefit of a manuscript speech is that phrasing can be carefully ........",
            "A. forgotten", "B. shouted", "C. improvised", "D. polished", 3,
            "Manuscripts allow meticulous editing and 'polished' phraseology.", "2016:Q16", "Cloze Test"))

        list.add(q("2016_q23", "In *The Last Days at Forcados High School*, who was Jimi’s initial superficial girlfriend?",
            "A. Nene", "B. Caro", "C. Efua", "D. Moni", 1,
            "Caro was the pretty, materialistic girl Jimi dated before maturing.", "2016:Q23", "Prescribed Text: Forcados High School"))

        list.add(q("2016_q29", "In *The Last Days at Forcados High School*, Jimi Solade was admired in school primarily as a:",
            "A. Brilliant all-round student and football star", "B. Class troublemaker", "C. Shy reclusive student", "D. School cook", 0,
            "Jimi was exceptionally gifted in academics, sports, and popular with his peers.", "2016:Q29", "Prescribed Text: Forcados High School"))

        // ==========================================
        // 2017 UTME USE OF ENGLISH & PRESCRIBED TEXTS
        // ==========================================
        list.add(q("2017_q01", "According to Passage I on gender roles, traditional societal division of labour was based on:",
            "A. Hunting/warfare for men and domestic childcare for women", "B. Equal office management", "C. Women fighting wars alone", "D. No assigned duties", 0,
            "Primitive survival necessitated hunting and warfare for men and domestic homemaking for women.", "2017:Q1", "Comprehension"))

        list.add(q("2017_q02", "In modern society, women who pursue demanding professional careers often face the dilemma of serving:",
            "A. only themselves", "B. the military", "C. foreign nations", "D. two masters: domestic duties and workplace obligations", 3,
            "The writer highlights the tension between professional advancement and family homemaking.", "2017:Q2", "Comprehension"))

        list.add(q("2017_q16", "In Sarah Ladipo Manyika’s *In Dependence*, who is Tayo Ajayi’s love interest at Oxford?",
            "A. Jane", "B. Christine", "C. Mary", "D. Vanessa Richardson", 3,
            "Vanessa Richardson is the English student with whom Tayo falls deeply in love at Oxford.", "2017:Q16", "Prescribed Text: In Dependence"))

        list.add(q("2017_q17", "In *In Dependence*, what is Tayo’s initial culture shock concerning English food?",
            "A. It is too spicy", "B. It is eaten raw", "C. It is purely vegetarian", "D. It tastes bland and terrible compared to Nigerian cuisine", 3,
            "Tayo misses the rich spices of home and finds English dormitory meals unappealing.", "2017:Q17", "Prescribed Text: In Dependence"))

        list.add(q("2017_q18", "In *In Dependence*, Vanessa’s father served the British Empire as a:",
            "A. Merchant ship captain", "B. Colonial officer in Nigeria", "C. Factory owner", "D. Church choir master", 1,
            "Mr. Richardson had served as a colonial administrative officer in northern Nigeria.", "2017:Q18", "Prescribed Text: In Dependence"))

        list.add(q("2017_q21", "In *In Dependence*, which famous Negritude poet and statesman is discussed by the students?",
            "A. Leopold Sedar Senghor", "B. Wole Soyinka", "C. Chinua Achebe", "D. Ngugi wa Thiong'o", 0,
            "The intellectual circles at Oxford engage in passionate debates over Senghor's Negritude philosophy.", "2017:Q21", "Prescribed Text: In Dependence"))

        list.add(q("2017_q33", "Choose the option opposite in meaning to the italicized word: 'The company fell into an *abyss* of debt.'",
            "A. ocean", "B. depth", "C. valley", "D. stability", 3,
            "'Abyss' represents an unfathomable chasm or disaster; the antonym in financial state is 'stability'.", "2017:Q33", "Lexis: Antonyms"))

        list.add(q("2017_q34", "Choose the option opposite in meaning to the italicized word: 'The governor was *indisposed* and missed the summit.'",
            "A. ill", "B. absent", "C. healthy", "D. busy", 2,
            "'Indisposed' means slightly unwell or unable to attend. The opposite condition is 'healthy'.", "2017:Q34", "Lexis: Antonyms"))

        list.add(q("2017_q35", "Choose the option opposite in meaning to the italicized word: 'She is a *conscientious* officer.'",
            "A. irresponsible", "B. diligent", "C. meticulous", "D. attentive", 0,
            "'Conscientious' means wishing to do one's work thoroughly and well. The opposite is 'irresponsible'.", "2017:Q35", "Lexis: Antonyms"))

        list.add(q("2017_q49", "Choose the option that best completes the gap: 'We must strive to ........ our natural resources for future generations.'",
            "A. spend", "B. waste", "C. conserve", "D. deplete", 2,
            "To preserve resources from loss or depletion is to 'conserve' them.", "2017:Q49", "Lexis & Vocabulary"))

        // ==========================================
        // 2018 UTME USE OF ENGLISH
        // ==========================================
        list.add(q("2018_q01", "In Passage A, what racist dogma was the Geography master attempting to promote?",
            "A. That Africans are superior athletes", "B. That Europe has no rivers", "C. That Africans are cursed by God because of tropical diseases", "D. That climate never changes", 2,
            "The master falsely argued that malaria and sickle cell were proofs of a divine curse on Africa.", "2018:Q1", "Comprehension"))

        list.add(q("2018_q02", "How did the courageous student debunk the master's theory in Passage A?",
            "A. By running away", "B. By proving that malaria historically existed in Britain and sickle cell in the Mediterranean", "C. By refusing to answer questions", "D. By singing a song", 1,
            "The student cited scientific facts that sickle cell gene exists in Spain and Italy, and venomous snakes in the Americas.", "2018:Q2", "Comprehension"))

        list.add(q("2018_q07", "[Cloze: Immunology] Measles and influenza are caused by viral rather than ........ agents.",
            "A. psychological", "B. bacterial", "C. magnetic", "D. chemical", 1,
            "The medical distinction is between viral and 'bacterial' infections.", "2018:Q7", "Cloze Test"))

        list.add(q("2018_q15", "[Cloze: Immunology] After surviving an attack of measles, the body develops lifetime ........",
            "A. fever", "B. weakness", "C. immunity", "D. allergy", 2,
            "The immune system creates antibodies that confer long-lasting 'immunity'.", "2018:Q15", "Cloze Test"))

        list.add(q("2018_q16", "[Cloze: Immunology] Community protection is achieved through the widespread administration of ........",
            "A. painkillers", "B. tonics", "C. syrups", "D. vaccines", 3,
            "'Vaccines' stimulate antibody production to protect populations against viral outbreaks.", "2018:Q16", "Cloze Test"))

        list.add(q("2018_q18", "[Cloze: Immunology] Secondary bacterial complications are treated with ........",
            "A. water", "B. herbs", "C. antibiotics", "D. exercises", 2,
            "'Antibiotics' are medications used to destroy or inhibit the growth of bacteria.", "2018:Q18", "Cloze Test"))

        list.add(q("2018_q19", "[Cloze: Immunology] Modern medicine has drastically reduced the infant ........ rate.",
            "A. celebration", "B. mortality", "C. speed", "D. count", 1,
            "'Infant mortality rate' is the epidemiological measure of child death before age one.", "2018:Q19", "Cloze Test"))

        list.add(q("2018_q24", "Interpret: 'The poor woman gave her widow's mite.'",
            "A. She gave insects", "B. She gave an enormous sum of money", "C. She gave all the little amount she could honestly afford", "D. She gave nothing at all", 2,
            "A 'widow's mite' is an idiom meaning a small but meaningful monetary contribution given with great sacrifice.", "2018:Q24", "Idioms & Interpretation"))

        list.add(q("2018_q25", "Interpret: 'Their long friendship turned sour.'",
            "A. They are no longer on friendly terms", "B. They drank sour milk together", "C. They traveled abroad", "D. Their bond became stronger", 0,
            "To 'turn sour' means to become unpleasant, bitter, or estranged.", "2018:Q25", "Idioms & Interpretation"))

        list.add(q("2018_q26", "Interpret: 'The detective began to smell a rat.'",
            "A. The room had dead rodents", "B. He became suspicious of foul play", "C. He caught a wild animal", "D. He lost his sense of smell", 1,
            "To 'smell a rat' is an idiom meaning to suspect deception or treachery.", "2018:Q26", "Idioms & Interpretation"))

        list.add(q("2018_q27", "Interpret: 'It is best to let sleeping dogs lie.'",
            "A. Put the dogs in their kennel", "B. Feed the hungry pets", "C. Leave undisturbed a situation that could cause trouble", "D. Wake up the security team", 2,
            "To 'let sleeping dogs lie' means to avoid restarting an old conflict or trouble.", "2018:Q27", "Idioms & Interpretation"))

        list.add(q("2018_q28", "Interpret: 'The newly recruited officer is a greenhorn.'",
            "A. He has green horns on his helmet", "B. He is an old veteran", "C. He is inexperienced and new to the job", "D. He loves agriculture", 2,
            "A 'greenhorn' is an inexperienced person, newcomer, or novice.", "2018:Q28", "Idioms & Interpretation"))

        list.add(q("2018_q29", "Interpret: 'With soaring inflation, the family struggles to make both ends meet.'",
            "A. Tie the ends of two ropes", "B. Travel across the two cities", "C. Earn just enough money to cover essential living expenses", "D. Build a circular house", 2,
            "To 'make both ends meet' means to have just enough income to satisfy basic living costs.", "2018:Q29", "Idioms & Interpretation"))

        list.add(q("2018_q30", "Interpret: 'He keeps all his business partners at arm's length.'",
            "A. He avoids excessive familiarity and maintains professional distance", "B. He measures their arms daily", "C. He embraces them warmly", "D. He refuses to sign contracts", 0,
            "Keeping someone 'at arm's length' means maintaining distance and preventing undue intimacy.", "2018:Q30", "Idioms & Interpretation"))

        list.add(q("2018_q31", "Interpret: 'Young Emeka is a chip off the old block.'",
            "A. He sells wooden carvings", "B. He resembles his father closely in character and behavior", "C. He broke a stone block", "D. He is very different from his family", 1,
            "A 'chip off the old block' is someone who closely resembles one of their parents.", "2018:Q31", "Idioms & Interpretation"))

        list.add(q("2018_q32", "Interpret: 'The politician loves playing to the gallery.'",
            "A. He visits art museums daily", "B. He performs on the football field", "C. He acts quietly without publicity", "D. He acts sensationally to seek cheap public applause", 3,
            "To 'play to the gallery' means to cater to popular prejudices or seek superficial acclaim.", "2018:Q32", "Idioms & Interpretation"))

        list.add(q("2018_q33", "Interpret: 'Thinking that you can pass JAMB without studying is living in a fool's paradise.'",
            "A. Being in a state of illusory happiness based on false hope", "B. Living in a luxury mansion", "C. Traveling on vacation", "D. Taking a difficult exam", 0,
            "A 'fool's paradise' is a state of deceptive contentment founded on false beliefs or delusions.", "2018:Q33", "Idioms & Interpretation"))

        list.add(q("2018_q34", "Choose the option opposite in meaning to the italicized word: 'The clerk is very *conscientious* in auditing the books.'",
            "A. thorough", "B. carefree and negligent", "C. attentive", "D. meticulous", 1,
            "The opposite of 'conscientious' (diligent and careful) is 'carefree' or negligent.", "2018:Q34", "Lexis: Antonyms"))

        list.add(q("2018_q35", "Choose the option opposite in meaning to the italicized word: 'He managed a *prosperous* enterprise.'",
            "A. flourishing", "B. wealthy", "C. expanding", "D. unsuccessful and failing", 3,
            "'Prosperous' means thriving and successful. The direct antonym is 'unsuccessful'.", "2018:Q35", "Lexis: Antonyms"))

        list.add(q("2018_q36", "Choose the option opposite in meaning to the italicized word: 'The diplomat appeared completely *relaxed* during the negotiation.'",
            "A. calm", "B. peaceful", "C. stiff and tense", "D. serene", 2,
            "The antonym of 'relaxed' is 'stiff', tense, or uneasy.", "2018:Q36", "Lexis: Antonyms"))

        list.add(q("2018_q37", "Choose the option opposite in meaning to the italicized word: 'The principal treated the grave offence *lightly*.'",
            "A. casually", "B. gently", "C. carelessly", "D. seriously", 3,
            "The opposite of treating an issue 'lightly' is addressing it 'seriously' and with gravity.", "2018:Q37", "Lexis: Antonyms"))

        list.add(q("2018_q38", "Choose the option opposite in meaning to the italicized word: 'The master gave a *gentle* reprimand.'",
            "A. harsh", "B. mild", "C. quiet", "D. friendly", 0,
            "The antonym of a 'gentle' reprimand is a 'harsh' or severe one.", "2018:Q38", "Lexis: Antonyms"))

        list.add(q("2018_q39", "Choose the option opposite in meaning to the italicized word: 'He was accused of *ignoble* actions.'",
            "A. honourable", "B. shameful", "C. disgraceful", "D. cowardly", 0,
            "'Ignoble' means dishonourable, low, or disgraceful. The opposite is 'honourable'.", "2018:Q39", "Lexis: Antonyms"))

        list.add(q("2018_q40", "Choose the option opposite in meaning to the italicized word: 'The sick patient is *convalescing* at the hospital.'",
            "A. recovering", "B. deteriorating", "C. improving", "D. healing", 1,
            "'Convalescing' means gradually recovering health after illness. The opposite is 'deteriorating'.", "2018:Q40", "Lexis: Antonyms"))

        list.add(q("2018_q53", "Choose the option nearest in meaning to the italicized word: 'The study *underscores* the importance of maternal healthcare.'",
            "A. diminishes", "B. rejects", "C. obscures", "D. clarifies and emphasizes", 3,
            "To 'underscore' means to emphasize, highlight, or clarify.", "2018:Q53", "Lexis: Synonyms"))

        list.add(q("2018_q54", "Choose the option nearest in meaning to the italicized word: 'She is an *adroit* negotiator in trade disputes.'",
            "A. clumsy", "B. skillful", "C. nervous", "D. slow", 1,
            "'Adroit' means clever or skillful in using the hands or mind.", "2018:Q54", "Lexis: Synonyms"))

        list.add(q("2018_q57", "Choose the option that has the same vowel sound as the underlined letters: 't_augh_t'",
            "A. law", "B. laugh", "C. part", "D. drought", 0,
            "The vowel sound in 'taught' is the long open-mid back vowel /ɔː/, which matches 'law'.", "2018:Q57", "Oral English: Vowels"))

        list.add(q("2018_q58", "Identify the syllable with the primary stress: 'com-for-ta-ble'",
            "A. COM-for-ta-ble", "B. com-FOR-ta-ble", "C. com-for-TA-ble", "D. com-for-ta-BLE", 0,
            "The primary stress in 'comfortable' is placed on the first syllable: /ˈkʌmftəbl/ ('COM-for-ta-ble').", "2018:Q58", "Oral English: Stress"))

        list.add(q("2018_q59", "Identify the syllable with the primary stress: 'in-ca-pa-ci-tate'",
            "A. in-CA-pa-ci-tate", "B. in-ca-PA-ci-tate", "C. in-ca-pa-CI-tate", "D. IN-ca-pa-ci-tate", 1,
            "The primary stress in 'incapacitate' falls on the third syllable: /ˌɪnkəˈpæsɪteɪt/ (on 'PA').", "2018:Q59", "Oral English: Stress"))

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
            id = "eng_exam_${id}",
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
