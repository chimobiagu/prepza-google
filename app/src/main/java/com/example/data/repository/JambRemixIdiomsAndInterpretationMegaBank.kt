package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME English Past Questions - Idioms & Sentence Interpretation Mega Repository
 * Extracted directly from Samrate Academic Elixir (JAMB Series Remix 1978-2016).
 * Contains 90 authentic past questions testing idioms and contextual sentence interpretation.
 */
object JambRemixIdiomsAndInterpretationMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 1 - 20 (Exercise I: Interpretation)
        list.add(q("idm_01", "The headmaster decided to *turn a blind eye* to the minor infractions of the senior students.",
            "A. punish severely", "B. ignore deliberately", "C. investigate thoroughly", "D. report to parents", 1,
            "To 'turn a blind eye' means to deliberately choose to ignore or overlook something.", "1978:Q51", "Lexis: Idioms"))
        list.add(q("idm_02", "When the chips are down, you will know who your true friends are.",
            "A. when gambling", "B. when in a critical or difficult situation", "C. when buying food", "D. during celebration", 1,
            "'When the chips are down' means when a very difficult, critical, or decisive situation arises.", "1978:Q52", "Lexis: Idioms"))
        list.add(q("idm_03", "The politician was advised not to *wash dirty linen in public*.",
            "A. clean clothes outside", "B. discuss private disputes openly", "C. engage in public scandals", "D. avoid public meetings", 1,
            "To 'wash dirty linen in public' means to discuss intimate or private disputes before the public.", "1978:Q53", "Lexis: Idioms"))
        list.add(q("idm_04", "His promotion was *a feather in his cap*.",
            "A. a source of pride and achievement", "B. a decorated badge", "C. a light responsibility", "D. an unnecessary reward", 0,
            "A 'feather in one's cap' is an achievement or honor to be proud of.", "1978:Q54", "Lexis: Idioms"))
        list.add(q("idm_05", "The manager asked the secretary to *read between the lines* of the client's letter.",
            "A. read the text upside down", "B. discover a hidden meaning not explicitly stated", "C. count the words", "D. summarize the lines", 1,
            "To 'read between the lines' means to find deeper or hidden meanings not explicitly expressed.", "1978:Q55", "Lexis: Idioms"))
        list.add(q("idm_06", "The project proved to be a *white elephant*.",
            "A. an albino animal", "B. a very costly venture with no useful purpose", "C. a magnificent project", "D. an easy task", 1,
            "A 'white elephant' is a possession that is useless or troublesome, especially one that is expensive to maintain.", "1979:Q61", "Lexis: Idioms"))
        list.add(q("idm_07", "The suspect was caught *red-handed* by the security guard.",
            "A. with red paint on his hands", "B. in the exact act of committing the crime", "C. injured during escape", "D. without weapons", 1,
            "To be caught 'red-handed' means to be discovered in the very act of wrongdoing.", "1979:Q62", "Lexis: Idioms"))
        list.add(q("idm_08", "She took the news of her success *with a pinch of salt*.",
            "A. with disbelief and skepticism", "B. while eating dinner", "C. with total joy", "D. with disappointment", 0,
            "To take something 'with a pinch of salt' means to maintain skepticism or not completely believe it.", "1979:Q63", "Lexis: Idioms"))
        list.add(q("idm_09", "The two rival candidates decided to *bury the hatchet* before the election.",
            "A. conceal their weapons", "B. end their quarrel and make peace", "C. dig a deep trench", "D. fight secretly", 1,
            "To 'bury the hatchet' means to end a dispute and become friendly again.", "1979:Q64", "Lexis: Idioms"))
        list.add(q("idm_10", "The young lawyer decided to *burn the midnight oil* to prepare for the case.",
            "A. waste kerosene", "B. work late into the night", "C. light lamps", "D. start an accidental fire", 1,
            "To 'burn the midnight oil' means to work or study late into the night.", "1979:Q65", "Lexis: Idioms"))
        list.add(q("idm_11", "He was told to *let sleeping dogs lie* regarding the old scandal.",
            "A. avoid waking the pets", "B. avoid stirring up an old source of trouble", "C. feed the dogs on time", "D. keep the secret from family", 1,
            "To 'let sleeping dogs lie' means to avoid restarting an old conflict or trouble.", "1980:Q46", "Lexis: Idioms"))
        list.add(q("idm_12", "The unexpected rain was a *blessing in disguise* as it filled our dry tanks.",
            "A. a cursed event", "B. an apparent misfortune that eventuates in good fortune", "C. a disguised enemy", "D. a minor relief", 1,
            "A 'blessing in disguise' is something that seems bad at first, but produces positive results.", "1980:Q47", "Lexis: Idioms"))
        list.add(q("idm_13", "The accountant decided to *cook the books* before the auditors arrived.",
            "A. prepare food in the library", "B. falsify financial accounts", "C. burn the records", "D. arrange the books neatly", 1,
            "To 'cook the books' is an idiom meaning to falsify financial records fraudulently.", "1980:Q48", "Lexis: Idioms"))
        list.add(q("idm_14", "She managed to *keep her chin up* despite severe hardships.",
            "A. lift her face high", "B. remain cheerful and courageous", "C. look proud", "D. avoid talking", 1,
            "To 'keep one's chin up' means to remain optimistic and cheerful during adversity.", "1980:Q49", "Lexis: Idioms"))
        list.add(q("idm_15", "The new legislation was passed *by the skin of our teeth*.",
            "A. by dental surgery", "B. only just; by a very narrow margin", "C. with great enthusiasm", "D. without debate", 1,
            "'By the skin of one's teeth' means by the narrowest possible margin; barely.", "1980:Q50", "Lexis: Idioms"))
        list.add(q("idm_16", "The worker was dismissed *on the spur of the moment*.",
            "A. after a long inquiry", "B. on a sudden impulse without premeditation", "C. on a scheduled date", "D. with formal honor", 1,
            "'On the spur of the moment' means on a sudden impulse or without prior planning.", "1981:Q81", "Lexis: Idioms"))
        list.add(q("idm_17", "His promise to assist us was just *pie in the sky*.",
            "A. flying pastry", "B. an unrealistic, illusory hope", "C. a solid guarantee", "D. a written pledge", 1,
            "'Pie in the sky' refers to something pleasant that is promised but very unlikely to happen.", "1981:Q82", "Lexis: Idioms"))
        list.add(q("idm_18", "The governor promised to leave no stone unturned in the search for the missing funds.",
            "A. excavate the land", "B. try every possible course of action", "C. break the stones", "D. stop the search", 1,
            "To 'leave no stone unturned' means to do everything possible to achieve an outcome.", "1981:Q83", "Lexis: Idioms"))
        list.add(q("idm_19", "The two sisters are like two peas in a pod.",
            "A. they love green vegetables", "B. they are remarkably similar in appearance and manners", "C. they always quarrel", "D. they live apart", 1,
            "'Like two peas in a pod' means very similar, especially in appearance.", "1981:Q84", "Lexis: Idioms"))
        list.add(q("idm_20", "The young man was born with a *silver spoon in his mouth*.",
            "A. having metal teeth", "B. born into a wealthy and privileged family", "C. fed with expensive utensils", "D. very healthy at birth", 1,
            "To be 'born with a silver spoon in one's mouth' means to be born into wealth and privilege.", "1981:Q85", "Lexis: Idioms"))

        // 21 - 40
        list.add(q("idm_21", "The company decided to *call it a day* after six hours of negotiations.",
            "A. name the date", "B. stop working on something for the day", "C. extend the meeting", "D. sign the contract", 1,
            "To 'call it a day' means to stop what you are doing, often because you are tired.", "1982:Q94", "Lexis: Idioms"))
        list.add(q("idm_22", "She gave him the *cold shoulder* when they met at the reception.",
            "A. touched his shoulder with ice", "B. deliberately ignored or showed unfriendliness to him", "C. hugged him warmly", "D. whispered to him", 1,
            "To give someone the 'cold shoulder' means to intentionally ignore or treat them coldly.", "1982:Q95", "Lexis: Idioms"))
        list.add(q("idm_23", "He hit the nail on the head when he explained the cause of the delay.",
            "A. hammered the wall", "B. stated the exact truth accurately", "C. injured his finger", "D. made a mistake", 1,
            "To 'hit the nail on the head' means to describe exactly what is causing a situation or problem.", "1982:Q96", "Lexis: Idioms"))
        list.add(q("idm_24", "The trader bought a pig in a poke when he purchased the uninspected goods.",
            "A. bought livestock", "B. bought something sight unseen without checking its value", "C. traded illegally", "D. paid in cash", 1,
            "To buy a 'pig in a poke' means to buy something without examining it beforehand.", "1983:Q78", "Lexis: Idioms"))
        list.add(q("idm_25", "The new manager decided to *clear the air* by discussing the rumors openly.",
            "A. open the windows", "B. remove bad feelings or misunderstandings by candid talk", "C. vacuum the office", "D. punish gossips", 1,
            "To 'clear the air' means to get rid of suspicions, tensions, or bad feelings through open discussion.", "1983:Q79", "Lexis: Idioms"))
        list.add(q("idm_26", "She was *at her wits' end* when her car broke down in the dark forest.",
            "A. thinking smartly", "B. so worried and perplexed that she did not know what to do", "C. ending her trip", "D. looking for light", 1,
            "To be 'at one's wits' end' means to be overwhelmed by a problem and not knowing what to do next.", "1983:Q80", "Lexis: Idioms"))
        list.add(q("idm_27", "The sudden dismissal of the director *came out of the blue*.",
            "A. was accompanied by rain", "B. happened unexpectedly and completely by surprise", "C. was announced on radio", "D. was long planned", 1,
            "'Out of the blue' means completely unexpectedly and without prior warning.", "1984:Q40", "Lexis: Idioms"))
        list.add(q("idm_28", "The team captain decided to *throw in the towel* after conceding five goals.",
            "A. clean the pitch", "B. surrender or give up the struggle", "C. replace the goalkeeper", "D. argue with the referee", 1,
            "To 'throw in the towel' means to admit defeat or give up.", "1984:Q41", "Lexis: Idioms"))
        list.add(q("idm_29", "He managed to *keep his head above water* during the economic recession.",
            "A. swim across the river", "B. survive financially in difficult circumstances", "C. look upward", "D. drown in debt", 1,
            "To 'keep one's head above water' means to survive or avoid financial disaster during tough times.", "1985:Q54", "Lexis: Idioms"))
        list.add(q("idm_30", "The young man took French leave from the office yesterday.",
            "A. traveled to Paris", "B. departed without permission or announcement", "C. spoke French", "D. took formal leave", 1,
            "'French leave' means an unauthorized or unannounced departure.", "1985:Q57", "Lexis: Idioms"))
        list.add(q("idm_31", "The speaker's joke helped to *break the ice* among the new students.",
            "A. smash frozen water", "B. make people feel more relaxed and comfortable in a social setting", "C. end the meeting", "D. cause argument", 1,
            "To 'break the ice' means to relieve tension or social awkwardness.", "1985:Q59", "Lexis: Idioms"))
        list.add(q("idm_32", "The criminal decided to *make a clean breast of* his offenses to the priest.",
            "A. wash his chest", "B. confess fully and frankly", "C. deny the accusations", "D. escape from prison", 1,
            "To 'make a clean breast of' something means to make a full confession.", "1985:Q60", "Lexis: Idioms"))
        list.add(q("idm_33", "The politician tried to *pull the wool over the voters' eyes*.",
            "A. sell woolen fabric", "B. deceive or mislead them", "C. give them spectacles", "D. protect them from cold", 1,
            "To 'pull the wool over someone's eyes' means to deceive or trick someone.", "1985:Q62", "Lexis: Idioms"))
        list.add(q("idm_34", "The student was *skating on thin ice* when he challenged the examiner.",
            "A. engaging in winter sports", "B. taking great risks; doing something perilous", "C. sliding smoothly", "D. demonstrating courage", 1,
            "To be 'skating on thin ice' means to take big risks or put oneself in a precarious situation.", "1985:Q64", "Lexis: Idioms"))
        list.add(q("idm_35", "The new law *smacked of* authoritarian control.",
            "A. slapped the citizens", "B. gave a strong suggestion or hint of", "C. sounded like music", "D. lacked taste", 1,
            "To 'smack of' something means to suggest or have a strong hint of that quality.", "1993:Q66", "Lexis: Idioms"))
        list.add(q("idm_36", "The minister was caught *napping* by the sudden revolt.",
            "A. sleeping in his bed", "B. off guard and unprepared", "C. taking an afternoon rest", "D. snoring loudly", 1,
            "To be caught 'napping' means to be caught unawares or unprepared.", "1994:Q46", "Lexis: Idioms"))
        list.add(q("idm_37", "The judge advised the litigant to *hold his horses* before filing the suit.",
            "A. tie his animals", "B. wait patiently and be cautious", "C. ride fast", "D. hire horses", 1,
            "To 'hold one's horses' means to wait, slow down, or be patient.", "1994:Q51", "Lexis: Idioms"))
        list.add(q("idm_38", "She decided to *take the bull by the horns* and confront her landlord.",
            "A. wrestle livestock", "B. face a difficult situation directly and boldly", "C. run away from trouble", "D. call the police", 1,
            "To 'take the bull by the horns' means to confront a difficult situation directly and decisively.", "1994:Q56", "Lexis: Idioms"))
        list.add(q("idm_39", "The two colleagues are *at loggerheads* over the promotion.",
            "A. cutting wood together", "B. in strong disagreement and dispute", "C. collaborating happily", "D. sharing logs", 1,
            "To be 'at loggerheads' means in violent dispute or stubborn disagreement.", "1995:Q61", "Lexis: Idioms"))
        list.add(q("idm_40", "The old man gave up the ghost yesterday evening.",
            "A. saw a phantom", "B. died", "C. screamed loudly", "D. prayed for ancestors", 1,
            "To 'give up the ghost' is an idiom meaning to die.", "1995:Q69", "Lexis: Idioms"))

        // 41 - 65
        list.add(q("idm_41", "He had an *axe to grind* with the committee chairman.",
            "A. sharp tool to fix", "B. private grievance or selfish reason for involvement", "C. wood to cut", "D. gift to present", 1,
            "To have 'an axe to grind' means to have a private motive or dispute to pursue.", "1997:Q55", "Lexis: Idioms"))
        list.add(q("idm_42", "The trader made money *hand over fist* during the festival.",
            "A. by boxing opponents", "B. at a very fast and abundant rate", "C. by hand gestures", "D. in coins only", 1,
            "'Hand over fist' means at a remarkably rapid pace, usually referring to profits or earnings.", "1997:Q62", "Lexis: Idioms"))
        list.add(q("idm_43", "The girl was the *apple of her father's eye*.",
            "A. eating fruits with him", "B. cherished and loved above all others", "C. having ocular defects", "D. very small in stature", 1,
            "The 'apple of one's eye' refers to someone who is cherished and deeply loved.", "1997:Q67", "Lexis: Idioms"))
        list.add(q("idm_44", "The chairman told the speaker to *cut to the chase*.",
            "A. stop running", "B. come directly to the main point without waste of time", "C. edit the film", "D. end the session", 1,
            "To 'cut to the chase' means to get directly to the essential point.", "1997:Q71", "Lexis: Idioms"))
        list.add(q("idm_45", "The new invention *caught on* very quickly among youth.",
            "A. was trapped", "B. became popular and widely accepted", "C. was arrested", "D. failed completely", 1,
            "To 'catch on' means to become popular, fashionable, or widely embraced.", "1998:Q56", "Lexis: Idioms"))
        list.add(q("idm_46", "She *spilled the beans* about the surprise party.",
            "A. dropped the food", "B. revealed the secret prematurely", "C. cooked the beans", "D. cancelled the event", 1,
            "To 'spill the beans' means to disclose confidential information or a secret.", "1998:Q74", "Lexis: Idioms"))
        list.add(q("idm_47", "The two rivals decided to *cross swords* in court.",
            "A. fight with real blades", "B. engage in legal dispute or debate", "C. make peace", "D. trade weapons", 1,
            "To 'cross swords' means to engage in a dispute, argument, or confrontation.", "1999:Q38", "Lexis: Idioms"))
        list.add(q("idm_48", "The team was *on pins and needles* waiting for the announcement.",
            "A. sewing clothes", "B. extremely anxious and tense in anticipation", "C. injured on the legs", "D. jumping joyfully", 1,
            "To be 'on pins and needles' means to be in a state of nervous anticipation or suspense.", "1999:Q41", "Lexis: Idioms"))
        list.add(q("idm_49", "The corrupt officer was caught with his fingers in the till.",
            "A. farming in the soil", "B. stealing money from his employer", "C. counting cash", "D. locking the cash register", 1,
            "To have one's 'fingers in the till' means to be stealing money from where one works.", "1999:Q44", "Lexis: Idioms"))
        list.add(q("idm_50", "The young writer *rose to the occasion* and delivered a masterpiece.",
            "A. stood up on stage", "B. performed successfully under challenging circumstances", "C. arrived early", "D. celebrated lavishly", 1,
            "To 'rise to the occasion' means to perform exceptionally well when faced with a difficult challenge.", "1999:Q48", "Lexis: Idioms"))
        list.add(q("idm_51", "The politician tried to *curry favor* with the traditional rulers.",
            "A. cook spicy sauce", "B. seek to gain advantage or praise through flattery", "C. give them horses", "D. demand their votes", 1,
            "To 'curry favor' means to try to ingratiate oneself through flattery or servile behavior.", "2000:Q83", "Lexis: Idioms"))
        list.add(q("idm_52", "The man was a *jack of all trades* in his village.",
            "A. master of card games", "B. person competent in many various skills", "C. professional builder", "D. lazy wanderer", 1,
            "A 'jack of all trades' is a person who can do many different types of work.", "2000:Q89", "Lexis: Idioms"))
        list.add(q("idm_53", "The news of the increment in salary *fell on deaf ears*.",
            "A. deafened the workers", "B. was ignored or disregarded completely", "C. sounded pleasant", "D. was heard clearly", 1,
            "To 'fall on deaf ears' means to be ignored, disregarded, or unheeded.", "2000:Q92", "Lexis: Idioms"))
        list.add(q("idm_54", "The lawyer was asked to *bark up the wrong tree*.",
            "A. climb a fruit tree", "B. pursue a mistaken course of action or blame the wrong person", "C. make dog sounds", "D. defend criminals", 1,
            "To 'bark up the wrong tree' means to follow a false lead or pursue a misguided course.", "2000:Q97", "Lexis: Idioms"))
        list.add(q("idm_55", "The doctor advised him to *burn the candle at both ends* no longer.",
            "A. stop lighting two wicks", "B. stop exhausting himself by working too hard day and night", "C. buy cheaper candles", "D. sleep with lights on", 1,
            "To 'burn the candle at both ends' means to exhaust one's energy by working excessively early and late.", "2001:Q34", "Lexis: Idioms"))
        list.add(q("idm_56", "The project *went down the drain* due to poor management.",
            "A. was washed into sewage", "B. was completely wasted or ruined", "C. was flooded by rain", "D. flowed smoothly", 1,
            "To 'go down the drain' means to be totally wasted or lost.", "2001:Q47", "Lexis: Idioms"))
        list.add(q("idm_57", "The young athlete was *in the limelight* throughout the games.",
            "A. bathed in green light", "B. at the center of public attention and fame", "C. sitting on the bench", "D. eating citrus fruits", 1,
            "To be 'in the limelight' means to be the center of public attention.", "2002:Q54", "Lexis: Idioms"))
        list.add(q("idm_58", "The manager asked him to *toe the line* or face sanctions.",
            "A. draw a line with chalk", "B. conform strictly to established rules and standards", "C. walk barefoot", "D. resign immediately", 1,
            "To 'toe the line' means to conform strictly to rules or directives.", "2003:Q51", "Lexis: Idioms"))
        list.add(q("idm_59", "The two friends decided to *part ways* after the dispute.",
            "A. build a junction", "B. end their relationship or association", "C. share their money", "D. walk together", 1,
            "To 'part ways' means to end a partnership, friendship, or collaboration.", "2003:Q56", "Lexis: Idioms"))
        list.add(q("idm_60", "The sudden tax increase *broke the camel's back*.",
            "A. injured the animal", "B. was the final small burden that made the whole situation unbearable", "C. created wealth", "D. was widely celebrated", 1,
            "The 'straw that broke the camel's back' is the final problem in a series that causes total collapse.", "2003:Q60", "Lexis: Idioms"))
        list.add(q("idm_61", "The speaker decided to *bite the bullet* and announce the budget cuts.",
            "A. swallow ammunition", "B. face a difficult or painful situation with courage", "C. cancel the meeting", "D. accuse the cabinet", 1,
            "To 'bite the bullet' means to endure a painful or difficult situation that is unavoidable.", "2004:Q50", "Lexis: Idioms"))
        list.add(q("idm_62", "The accountant made a *slip of the pen* in the register.",
            "A. dropped his fountain pen", "B. committed an unintentional minor mistake in writing", "C. broke the nib", "D. signed illegibly", 1,
            "A 'slip of the pen' is an unintentional minor error in writing.", "2005:Q49", "Lexis: Idioms"))
        list.add(q("idm_63", "The governor *put his foot down* against unauthorized spending.",
            "A. stamped on the floor", "B. took a firm, resolute stand against something", "C. walked fast", "D. injured his ankle", 1,
            "To 'put one's foot down' means to use one's authority to stop something happening.", "2006:Q73", "Lexis: Idioms"))
        list.add(q("idm_64", "The criminal was *at large* for three weeks before his arrest.",
            "A. in a big room", "B. uncaptured and free from custody", "C. very fat", "D. locked in solitary", 1,
            "To be 'at large' means (of a criminal or dangerous animal) escaped and not yet captured.", "2007:Q59", "Lexis: Idioms"))
        list.add(q("idm_65", "The new principal began his tenure with a *clean slate*.",
            "A. clean blackboard", "B. fresh start with past offenses or records disregarded", "C. blank paper", "D. strict reprimand", 1,
            "A 'clean slate' means a fresh start where previous faults or debts are wiped clean.", "2008:Q64", "Lexis: Idioms"))

        // 66 - 90
        list.add(q("idm_66", "The project was *put on the back burner* during the crisis.",
            "A. placed near fire", "B. postponed or given lower priority", "C. cooked slowly", "D. completed quickly", 1,
            "To put something 'on the back burner' means to treat it as low priority or postpone it.", "2009:Q55", "Lexis: Idioms"))
        list.add(q("idm_67", "The young writer was *born under a lucky star*.",
            "A. born in astronomy lab", "B. exceptionally fortunate and blessed in life", "C. born at night", "D. famous from childhood", 1,
            "To be 'born under a lucky star' means to be destined for good fortune.", "2009:Q56", "Lexis: Idioms"))
        list.add(q("idm_68", "The union leader decided to *take the floor* at the congress.",
            "A. sit on the carpet", "B. speak formally to the assembled audience", "C. dance gracefully", "D. clean the hall", 1,
            "To 'take the floor' means to stand up and speak in an assembly or debate.", "2010:Q51", "Lexis: Idioms"))
        list.add(q("idm_69", "The company gave him *carte blanche* to reorganize the branch.",
            "A. white menu card", "B. complete freedom and full discretionary power", "C. warning letter", "D. promotion certificate", 1,
            "'Carte blanche' means complete freedom to act as one wishes or sees fit.", "2010:Q52", "Lexis: Idioms"))
        list.add(q("idm_70", "The allegations against the director *hold no water*.",
            "A. leak moisture", "B. lack validity, logic, or truth", "C. contain no fluid", "D. sound convincing", 1,
            "To 'hold no water' means to fail to be logical, valid, or substantiated.", "2010:Q53", "Lexis: Idioms"))
        list.add(q("idm_71", "The young man was *green with envy* when his brother bought a car.",
            "A. painted in green", "B. intensely jealous and envious", "C. feeling sick", "D. very proud", 1,
            "'Green with envy' means extremely jealous or covetous.", "2011:Q51", "Lexis: Idioms"))
        list.add(q("idm_72", "The sudden question *threw him off balance*.",
            "A. pushed him down", "B. confused and unsettled him mentally", "C. caused physical injury", "D. made him laugh", 1,
            "To 'throw someone off balance' means to confuse, disorient, or catch them unprepared.", "2011:Q52", "Lexis: Idioms"))
        list.add(q("idm_73", "The diplomat was adept at *pouring oil on troubled waters*.",
            "A. spilling kerosene", "B. pacifying a tense dispute and restoring peace", "C. fishing skillfully", "D. causing riots", 1,
            "To 'pour oil on troubled waters' means to smooth over a dispute and calm agitated feelings.", "2011:Q53", "Lexis: Idioms"))
        list.add(q("idm_74", "The soldiers decided to *dig their heels in* during negotiations.",
            "A. make holes in the soil", "B. stubbornly refuse to alter their position or compromise", "C. wear high boots", "D. run away", 1,
            "To 'dig one's heels in' means to obstinately refuse to yield or change one's mind.", "2012:Q51", "Lexis: Idioms"))
        list.add(q("idm_75", "The new manager *cleared the decks* for tomorrow's audit.",
            "A. swept the floors", "B. prepared for action by removing all obstacles and clutter", "C. cancelled the audit", "D. built wooden platforms", 1,
            "To 'clear the decks' means to prepare for immediate action by getting rid of unnecessary things.", "2012:Q52", "Lexis: Idioms"))
        list.add(q("idm_76", "He told us a *cock and bull story* about why he missed the examination.",
            "A. fable about animals", "B. ridiculous, improbable, and fabricated excuse", "C. funny folk tale", "D. true historical event", 1,
            "A 'cock and bull story' is an absurd, unbelievable, and concocted tale or excuse.", "2012:Q53", "Lexis: Idioms"))
        list.add(q("idm_77", "The president was advised to *weather the storm* patiently.",
            "A. stay indoors during rain", "B. endure and survive a difficult period safely", "C. study meteorology", "D. resign promptly", 1,
            "To 'weather the storm' means to survive a crisis or difficult period successfully.", "2013:Q51", "Lexis: Idioms"))
        list.add(q("idm_78", "The team was *back to square one* after the proposal was rejected.",
            "A. standing in the courtyard", "B. back at the very beginning with no progress made", "C. winning the first round", "D. calculating geometry", 1,
            "To be 'back to square one' means back to the starting point without having made progress.", "2013:Q52", "Lexis: Idioms"))
        list.add(q("idm_79", "She decided to *spill her guts* to the investigator.",
            "A. vomit in the room", "B. confess everything completely and hold nothing back", "C. undergo surgery", "D. refuse to talk", 1,
            "To 'spill one's guts' means to disclose all the secrets, thoughts, or facts one knows.", "2013:Q53", "Lexis: Idioms"))
        list.add(q("idm_80", "The young boxer was *saved by the bell* when the round ended.",
            "A. rang the church chime", "B. rescued from difficulty at the very last moment by a timely interruption", "C. knocked down flat", "D. crowned champion", 1,
            "'Saved by the bell' means rescued from imminent failure by a timely intervention.", "2014:Q51", "Lexis: Idioms"))
        list.add(q("idm_81", "The company had to *tighten its belt* during the inflation.",
            "A. wear smaller trousers", "B. economize and cut down on expenditures", "C. purchase leather belts", "D. increase salaries", 1,
            "To 'tighten one's belt' means to reduce one's spending and live more frugally.", "2014:Q52", "Lexis: Idioms"))
        list.add(q("idm_82", "He told his son to *play his cards close to his chest*.",
            "A. hold game cards near", "B. keep his plans and intentions strictly secret", "C. gamble wisely", "D. deal cards honestly", 1,
            "To 'play one's cards close to one's chest' means to be secretive about one's intentions.", "2014:Q53", "Lexis: Idioms"))
        list.add(q("idm_83", "The politician was *caught between Scylla and Charybdis*.",
            "A. lost in Greek islands", "B. faced with two equally perilous or undesirable alternatives", "C. sailing on smooth waters", "D. praised by two rivals", 1,
            "To be 'between Scylla and Charybdis' means choosing between two equally hazardous dangers.", "2015:Q51", "Lexis: Idioms"))
        list.add(q("idm_84", "The new software is *the icing on the cake* for our system.",
            "A. sweet bakery cream", "B. an attractive addition that turns something already good into something even better", "C. an unnecessary decoration", "D. a complete redesign", 1,
            "'The icing on the cake' refers to an additional benefit that makes a good situation even better.", "2015:Q52", "Lexis: Idioms"))
        list.add(q("idm_85", "The manager told the staff to *burn the bridges* behind them.",
            "A. destroy civil infrastructure", "B. commit fully to a new course with no possibility of returning to the past", "C. repair old paths", "D. cross rivers safely", 1,
            "To 'burn one's bridges' means to take action that makes returning to a previous state impossible.", "2015:Q53", "Lexis: Idioms"))
        list.add(q("idm_86", "She decided to *keep her fingers crossed* while awaiting the exam results.",
            "A. tie her hands together", "B. hope earnestly for good luck and a positive outcome", "C. pray with rosary", "D. sign the paper", 1,
            "To 'keep one's fingers crossed' means to hope strongly that things will turn out well.", "2016:Q51", "Lexis: Idioms"))
        list.add(q("idm_87", "The young lawyer *made heads or tails of* the complex document.",
            "A. flipped a coin", "B. understood the meaning and structure of the document", "C. destroyed both ends", "D. summarized the heading", 1,
            "To 'make head or tail of' something means to comprehend or find meaningful sense in it.", "2016:Q52", "Lexis: Idioms"))
        list.add(q("idm_88", "The scandal was *swept under the carpet* by the board.",
            "A. cleaned with broom", "B. concealed deliberately from public knowledge", "C. investigated promptly", "D. published in newspapers", 1,
            "To 'sweep something under the carpet' means to hide or ignore an embarrassing problem.", "2016:Q53", "Lexis: Idioms"))
        list.add(q("idm_89", "The applicant *passed with flying colors* in the interview.",
            "A. wore colorful attire", "B. succeeded exceptionally well with distinction", "C. drew bright paintings", "D. failed narrowly", 1,
            "To pass 'with flying colors' means to achieve outstanding success.", "2016:Q54", "Lexis: Idioms"))
        list.add(q("idm_90", "The lecturer advised students not to *rest on their oars* after the mid-term test.",
            "A. stop rowing the canoe", "B. relax their efforts or become complacent after initial success", "C. sit on wooden benches", "D. celebrate prematurely", 1,
            "To 'rest on one's oars' means to relax one's efforts and become complacent after achieving success.", "2016:Q55", "Lexis: Idioms"))

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
            id = "remix_idm_$id",
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
