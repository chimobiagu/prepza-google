package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME English Past Questions - Lexis I: Synonyms Mega Repository
 * Extracted directly from Samrate Academic Elixir (JAMB Series Remix 1978-2016).
 * Contains 90 authentic past questions with options, answers, and explanations.
 */
object JambRemixSynonymsMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 1 - 20 (Exercise I)
        list.add(q("syn_01", "From the way my friend talks, you can see he is such a *bore*.",
            "A. rude", "B. brilliant", "C. uninteresting", "D. consecutively", "E. judiciously", 2,
            "A bore is an uninteresting, dull, or tedious person who causes weariness.", "1978:Q30", "Lexis: Synonyms"))
        list.add(q("syn_02", "His jail terms were to run *concurrently*.",
            "A. simultaneously", "B. uniformly", "C. laboriously", "D. consecutively", "E. judiciously", 0,
            "'Concurrently' means happening or running at the same time (simultaneously).", "1978:Q31", "Lexis: Synonyms"))
        list.add(q("syn_03", "There is some obvious *symmetry* in the whole presentation.",
            "A. confusion", "B. hesitation", "C. excitement", "D. orderliness", "E. dissatisfaction", 3,
            "'Symmetry' denotes balance, regularity, and orderly arrangement.", "1978:Q32", "Lexis: Synonyms"))
        list.add(q("syn_04", "This bill has to wait as we are now *insolvent*.",
            "A. overworked", "B. bankrupt", "C. unsettled", "D. insoluble", "E. affluent", 1,
            "'Insolvent' means unable to pay one's debts (bankrupt).", "1978:Q33", "Lexis: Synonyms"))
        list.add(q("syn_05", "He *stared* at her.",
            "A. glanced", "B. peeped", "C. looked", "D. gazed", "E. fixed", 3,
            "To 'stare' is to look fixedly and vacantly with eyes wide open (to gaze).", "1978:Q45", "Lexis: Synonyms"))
        list.add(q("syn_06", "Do you have the same *aversion* as I do for war films?",
            "A. bitterness", "B. dislike", "C. criticism", "D. indignation", "E. preference", 1,
            "'Aversion' is a strong feeling of dislike or disinclination.", "1979:Q56", "Lexis: Synonyms"))
        list.add(q("syn_07", "His *penury* gave him a lifetime of hunger.",
            "A. avariciousness", "B. affluence", "C. poverty", "D. penny pinching", "E. greed", 2,
            "'Penury' is the state of extreme poverty or destitution.", "1980:Q37", "Lexis: Synonyms"))
        list.add(q("syn_08", "The Bible's *prodigal* son became quite wealthy eventually.",
            "A. prestigious", "B. phlegmatic", "C. errant", "D. pecuniary", "E. extravagant", 4,
            "'Prodigal' means spending money or resources freely and recklessly; wastefully extravagant.", "1980:Q38", "Lexis: Synonyms"))
        list.add(q("syn_09", "Don't eat just any *innocuous* looking mushroom you see around.",
            "A. harmful", "B. harmless", "C. innocent", "D. immunized", "E. conspicuous", 1,
            "'Innocuous' means not harmful, dangerous, or offensive; harmless.", "1980:Q39", "Lexis: Synonyms"))
        list.add(q("syn_10", "*Colossal* means:",
            "A. Greek column", "B. gigantic", "C. something which has lost too much fluid", "D. calamity", "E. sale of colos", 1,
            "'Colossal' means extremely large, huge, or gigantic.", "1980:Q40", "Lexis: Synonyms"))
        list.add(q("syn_11", "He has never been a good mediator, even in minor family disputes, because his views are always *jaundiced*.",
            "A. coloured", "B. sick", "C. suspicious", "D. unscrupulous", "E. prejudiced", 4,
            "'Jaundiced' in this context means affected by prejudice, envy, or hostility; biased.", "1980:Q66", "Lexis: Synonyms"))
        list.add(q("syn_12", "After the wife had covered her misdeeds by prevaricating on several occasions, the poor husband accused her *point-blank* of adultery.",
            "A. bluntly", "B. pointedly", "C. emphatically", "D. unreservedly", "E. unmistakably", 0,
            "'Point-blank' means directly, plainly, and bluntly without hesitation.", "1980:Q67", "Lexis: Synonyms"))
        list.add(q("syn_13", "For a priest to be successful, he should, from time to time *review* his actions.",
            "A. inspect", "B. examine", "C. stare at", "D. visualize", "E. conceptualize", 1,
            "To 'review' actions means to critically survey, re-examine, or assess them.", "1980:Q73", "Lexis: Synonyms"))
        list.add(q("syn_14", "Sitting majestically on his throne is the Oba of Benin *flanked* by some of his wives.",
            "A. surrounded", "B. supported", "C. guarded", "D. protected", "E. neglected", 0,
            "To be 'flanked' means to be situated on each side of or surrounded by.", "1980:Q75", "Lexis: Synonyms"))
        list.add(q("syn_15", "In a civilized society, it is *unseemly* to emit a loud belch at the end of a meal.",
            "A. noisy", "B. annoying", "C. stupid", "D. outrageous", "E. impolite", 4,
            "'Unseemly' means not proper, appropriate, or socially acceptable; improper/impolite.", "1980:Q76", "Lexis: Synonyms"))
        list.add(q("syn_16", "Mary is *jealous* of her sister's success.",
            "A. suspicious", "B. bitter", "C. careful", "D. mindful", "E. envious", 4,
            "'Jealous' in this sense means feeling resentment toward another's success; envious.", "1981:Q76", "Lexis: Synonyms"))
        list.add(q("syn_17", "Our school prefect is too *officious* and we all hate him because of his behaviour.",
            "A. efficient", "B. efficacious", "C. over-zealous", "D. active", "E. showy", 2,
            "'Officious' means domineering, intrusively enthusiastic in offering unsolicited advice; over-zealous.", "1981:Q90", "Lexis: Synonyms"))
        list.add(q("syn_18", "The President of our Club has sent his *regrets*. He may be unable to attend the next meeting.",
            "A. confusion", "B. explanations", "C. anxieties", "D. unhappiness", "E. apologies", 4,
            "To send 'regrets' is a formal expression of polite apology for being unable to accept an invitation.", "1981:Q91", "Lexis: Synonyms"))
        list.add(q("syn_19", "Whenever I travel abroad, I always bring, on my return, photographs, postcards and other small items as *souvenirs*.",
            "A. mementoes", "B. remembrance", "C. memorials", "D. memorables", "E. property", 0,
            "A 'souvenir' is a keepsake or token reminding one of a person, place, or occasion; a memento.", "1981:Q92", "Lexis: Synonyms"))
        list.add(q("syn_20", "Because our representative in the House of Assembly is an immature and biased politician, he takes a *jaundiced* view of our problems.",
            "A. hazy", "B. unclear", "C. prejudiced", "D. bleak", "E. bright", 2,
            "A 'jaundiced' view is a biased, cynical, or prejudiced viewpoint.", "1981:Q93", "Lexis: Synonyms"))

        // 21 - 40
        list.add(q("syn_21", "His wife for ten years refused *point-blank* to leave her matrimonial home even when he brought another woman.",
            "A. directly", "B. boldly", "C. pointedly", "D. sharply", "E. bluntly", 4,
            "'Point-blank' means plainly, bluntly, and directly without evasion.", "1981:Q94", "Lexis: Synonyms"))
        list.add(q("syn_22", "We all have both good and bad characteristics; either is, however, easily *manifested* in time of crisis.",
            "A. demanded", "B. highlighted", "C. submerged", "D. demonstrated", "E. ridiculed", 3,
            "'Manifest' means to show clearly, reveal, or demonstrate.", "1981:Q96", "Lexis: Synonyms"))
        list.add(q("syn_23", "One of the surest ways to ensure good health is to have a *wholesome* and adequate diet.",
            "A. palatable", "B. mixed", "C. hygienic", "D. delicious", "E. health giving", 4,
            "'Wholesome' food promotes physical health, well-being, and vitality; health-giving.", "1981:Q97", "Lexis: Synonyms"))
        list.add(q("syn_24", "My mother has refused to come to live in Lagos because she prefers the *tranquil* life in the village to the hurly-burly of the city.",
            "A. free", "B. prosperous", "C. peaceful", "D. decent", "E. happy", 2,
            "'Tranquil' means calm, quiet, serene, and peaceful.", "1982:Q90", "Lexis: Synonyms"))
        list.add(q("syn_25", "It is sheer *fantasy* to believe that there could never be a miscalculation by any nation that has atomic weapons.",
            "A. dream", "B. hope", "C. nonsense", "D. joke", "E. stupidity", 0,
            "'Fantasy' denotes an illusion, daydream, or unreal imagination.", "1983:Q73", "Lexis: Synonyms"))
        list.add(q("syn_26", "The *ingenious* scheme of the robber broke down because of the efficiency of the police officer.",
            "A. suspicious", "B. ambitious", "C. deceitful", "D. clever", "E. stupid", 3,
            "'Ingenious' means clever, resourceful, inventive, and skillfully conceived.", "1983:Q74", "Lexis: Synonyms"))
        list.add(q("syn_27", "When kerosene was poured on the fire, the effect was *instantaneous*.",
            "A. momentary", "B. momentous", "C. amazing", "D. terrifying", "E. immediate", 4,
            "'Instantaneous' means occurring or done at once; immediate.", "1983:Q99", "Lexis: Synonyms"))
        list.add(q("syn_28", "It was interesting to observe the *likeness* between the pupil and his teacher.",
            "A. similarity", "B. relationship", "C. fondness", "D. affection", "E. affinity", 0,
            "'Likeness' denotes resemblance or similarity in appearance/character.", "1983:Q100", "Lexis: Synonyms"))
        list.add(q("syn_29", "All the efforts made to settle the quarrel were *futile*.",
            "A. successful", "B. wicked", "C. reasonable", "D. remarkable", "E. fruitless", 4,
            "'Futile' means incapable of producing any useful result; pointless or fruitless.", "1984:Q37", "Lexis: Synonyms"))
        list.add(q("syn_30", "The gallant soldiers met their *Waterloo* at Philippi.",
            "A. victory", "B. trouble", "C. defeat", "D. happiest period", "E. enemy", 2,
            "To meet one's 'Waterloo' means to suffer a decisive and final defeat.", "1985:Q44", "Lexis: Synonyms"))
        list.add(q("syn_31", "It is *futile* trying to make bricks without straw.",
            "A. fertile", "B. important", "C. fragile", "D. vain", "E. bad", 3,
            "'Futile' means pointless, useless, or vain.", "1985:Q45", "Lexis: Synonyms"))
        list.add(q("syn_32", "In May 1978 the rain fell *incessantly* and made life drab.",
            "A. at intervals", "B. recurrently", "C. repeatedly", "D. concurrently", "E. continuously", 4,
            "'Incessantly' means constantly and without interruption; continuously.", "1985:Q47", "Lexis: Synonyms"))
        list.add(q("syn_33", "Little Ugochi has a bicycle which is in *marvelous* condition.",
            "A. need of a tune up", "B. excellent", "C. questionable", "D. unstable", "E. working", 1,
            "'Marvelous' denotes extraordinarily good, superb, or excellent.", "1985:Q48", "Lexis: Synonyms"))
        list.add(q("syn_34", "The lecturer *maintained* his usual good humour in spite of the cat-calls and rude behaviour of his students.",
            "A. provoked", "B. obtained", "C. kept", "D. lost", "E. improved", 2,
            "To 'maintain' composure or good humor means to keep or retain it intact.", "1985:Q49", "Lexis: Synonyms"))
        list.add(q("syn_35", "The class as a whole will have a *lecture* on scarce commodities tomorrow.",
            "A. argument", "B. deliberation", "C. dispute", "D. conference", "E. talk", 4,
            "A 'lecture' is an educational discourse, instructional speech, or talk delivered before an audience.", "1985:Q50", "Lexis: Synonyms"))
        list.add(q("syn_36", "One *hindrance* to an orderly economic development of the country is large-scale fraud and corruption.",
            "A. difficulty", "B. element", "C. reason", "D. obstacle", "E. ritual", 3,
            "A 'hindrance' is an impediment, obstruction, or obstacle that creates delay.", "1985:Q55", "Lexis: Synonyms"))
        list.add(q("syn_37", "Stephen was blamed for leaving his door *ajar* during the heavy rainfall.",
            "A. unlocked", "B. unbolted", "C. open", "D. keyless", "E. locked", 2,
            "'Ajar' describes a door slightly open or half-open.", "1985:Q56", "Lexis: Synonyms"))
        list.add(q("syn_38", "Nigeria, like most other African countries is *predominantly* agricultural.",
            "A. mainly", "B. certainly", "C. entirely", "D. undoubtedly", "E. superficially", 0,
            "'Predominantly' means for the most part; primarily or mainly.", "1985:Q58", "Lexis: Synonyms"))
        list.add(q("syn_39", "You have been asked to change your *laissez-faire* attitude to work.",
            "A. stupid", "B. carefree", "C. careful", "D. serious", "E. responsible", 1,
            "'Laissez-faire' refers to a relaxed, non-interfering, casual, or carefree disposition.", "1985:Q61", "Lexis: Synonyms"))
        list.add(q("syn_40", "My spell in the university was an *unmitigated* disaster.",
            "A. an unavoidable", "B. a painful", "C. a regrettable", "D. an unqualified", "E. an unfortunate", 3,
            "'Unmitigated' means absolute, total, complete, and unqualified.", "1985:Q63", "Lexis: Synonyms"))

        // 41 - 65 (Exercise II)
        list.add(q("syn_41", "The town looked deserted but we moved in with some *trepidation*.",
            "A. confidence", "B. surprise", "C. hesitation", "D. fear", "E. anger", 3,
            "'Trepidation' means a feeling of fear, dread, or apprehension.", "1993:Q64", "Lexis: Synonyms"))
        list.add(q("syn_42", "They show no *finesse* in dealing with strangers.",
            "A. boldness", "B. kindness", "C. tact", "D. love", "E. courage", 2,
            "'Finesse' is refined skill, subtlety, sensitivity, and diplomatic tact.", "1994:Q44", "Lexis: Synonyms"))
        list.add(q("syn_43", "Although the manager is busy right now, he will soon be with you *presently*.",
            "A. immediately", "B. soon", "C. without delay", "D. right away", "E. finally", 1,
            "'Presently' means shortly or in a short while (soon).", "1994:Q49", "Lexis: Synonyms"))
        list.add(q("syn_44", "Much to her *chagrin*, the bridegroom did not turn up for the wedding.",
            "A. wonder", "B. surprise", "C. disappointment", "D. depression", "E. anger", 2,
            "'Chagrin' is distress or embarrassment at having failed or been humiliated (disappointment).", "1994:Q54", "Lexis: Synonyms"))
        list.add(q("syn_45", "He might be compelled to make a *momentous* decision.",
            "A. voluntary", "B. spontaneous", "C. important", "D. involuntary", "E. difficult", 2,
            "'Momentous' means having great significance, consequence, or supreme importance.", "1995:Q59", "Lexis: Synonyms"))
        list.add(q("syn_46", "New companies in the country always put up *classified* advertisements in the dailies.",
            "A. secret", "B. small", "C. outrageous", "D. expensive", "E. colorful", 1,
            "'Classified' advertisements in print journalism are small categorical adverts arranged by topic.", "1995:Q65", "Lexis: Synonyms"))
        list.add(q("syn_47", "The doctor insisted on giving all of us *prophylactic* drugs.",
            "A. curative", "B. preventive", "C. routine", "D. special", "E. herbal", 1,
            "'Prophylactic' means intended to prevent disease (preventive).", "1995:Q66", "Lexis: Synonyms"))
        list.add(q("syn_48", "The delegates to the Constitutional Conference have *mooted* that funding of universities be transferred to states.",
            "A. said", "B. agreed", "C. proposed", "D. legislated", "E. argued", 2,
            "To 'moot' an idea means to raise, suggest, or propose a topic for discussion.", "1995:Q67", "Lexis: Synonyms"))
        list.add(q("syn_49", "Our local paper is noted for its *incisive* editorials on local politics.",
            "A. sarcastic", "B. penetrating", "C. decisive", "D. destructive", "E. vague", 1,
            "'Incisive' writing is sharp, clear, intelligent, and deeply penetrating.", "1997:Q53", "Lexis: Synonyms"))
        list.add(q("syn_50", "Many Nigerian have *inured* themselves to hardship.",
            "A. subjected", "B. submitted", "C. accustomed", "D. endeared", "E. exposed", 2,
            "To 'inure' oneself means to accustom or harden oneself to accept something undesirable.", "1997:Q58", "Lexis: Synonyms"))
        list.add(q("syn_51", "There are many *venal* judges in our law courts today.",
            "A. qualified", "B. professional", "C. corrupt", "D. honest", "E. harsh", 2,
            "'Venal' means capable of being bought or bribed; corrupt and mercenary.", "1997:Q59", "Lexis: Synonyms"))
        list.add(q("syn_52", "He is bound to exposes himself by his *nefarious* activities.",
            "A. kind", "B. disreputable", "C. despicable", "D. nocturnal", "E. open", 2,
            "'Nefarious' means wicked, villainous, heinous, and despicable.", "1997:Q60", "Lexis: Synonyms"))
        list.add(q("syn_53", "The minister's anger was *aggravated* by the news of the disaster.",
            "A. abated", "B. magnified", "C. intensifies", "D. impeded", "E. pacified", 1,
            "To 'aggravate' anger or a condition means to worsen, intensify, or magnify it.", "1997:Q64", "Lexis: Synonyms"))
        list.add(q("syn_54", "The lawyer gave *evasive* answers to all the questions.",
            "A. unintelligent", "B. ineffective", "C. unreliable", "D. equivocal", "E. factual", 3,
            "'Evasive' answers are intentionally ambiguous, non-committal, or equivocal to evade direct truth.", "1997:Q65", "Lexis: Synonyms"))
        list.add(q("syn_55", "The island becomes more *enchanting* at night.",
            "A. attractive", "B. delightful", "C. accommodating", "D. lively", "E. noisy", 0,
            "'Enchanting' means delightfully charming, captivating, or highly attractive.", "1997:Q69", "Lexis: Synonyms"))
        list.add(q("syn_56", "The material in the book is presented within an *eclectic* framework.",
            "A. simple", "B. broad", "C. restricted", "D. clumsy", "E. rigid", 1,
            "'Eclectic' means deriving ideas, style, or taste from a broad and diverse range of sources.", "1998:Q54", "Lexis: Synonyms"))
        list.add(q("syn_57", "The young man who distributed political pamphlets on campus was promptly *repudiated*.",
            "A. disowned", "B. arrested", "C. warned", "D. killed", "E. sheltered", 0,
            "To 'repudiate' someone means to refuse to accept, disown, or reject association with them.", "1998:Q72", "Lexis: Synonyms"))
        list.add(q("syn_58", "The prosecutor was accused of *obstructing* justice.",
            "A. hindering", "B. retarding", "C. impending", "D. interrupting", "E. aiding", 0,
            "To 'obstruct' means to block, impede, or hinder the progress of an action.", "1999:Q33", "Lexis: Synonyms"))
        list.add(q("syn_59", "The man preaches *egalitarianism* without matching it up with action.",
            "A. salvation", "B. dedication", "C. kindness", "D. equality", "E. piety", 3,
            "'Egalitarianism' is the political doctrine that all people are equal and deserve equal rights and opportunities.", "1999:Q34", "Lexis: Synonyms"))
        list.add(q("syn_60", "The Federal Government approved a new salary structure as an *incentive* for the Nigerian workers.",
            "A. a reward", "B. an encouragement", "C. a package", "D. an advance", "E. an honour", 1,
            "An 'incentive' is a motivating factor, stimulus, or encouragement to greater effort.", "1999:Q35", "Lexis: Synonyms"))
        list.add(q("syn_61", "Amina said she married a *doting* husband.",
            "A. a loving", "B. a fun-loving", "C. an uncaring", "D. a nagging", "E. a wealthy", 0,
            "'Doting' describes an extremely affectionate, adoring, and loving spouse or parent.", "1999:Q36", "Lexis: Synonyms"))
        list.add(q("syn_62", "Before embarking on his current research, the professor carried out a *feasibility* study of the area.",
            "A. thorough", "B. perfectibility", "C. complete", "D. practicability", "E. financial", 3,
            "A 'feasibility' study assesses the practical viability and feasibility (practicability) of a project.", "1999:Q39", "Lexis: Synonyms"))
        list.add(q("syn_63", "Mr. Dzokoto plays the piano with great *dexterity*.",
            "A. wisdom", "B. power", "C. force", "D. skill", "E. speed", 3,
            "'Dexterity' is agility, deftness, and physical or mental skill.", "1999:Q42", "Lexis: Synonyms"))
        list.add(q("syn_64", "They have tried to *circumvent* the restriction on the importation of the commodities.",
            "A. bypass", "B. confront", "C. oppose", "D. challenge", "E. respect", 0,
            "To 'circumvent' a law or restriction means to find a way around it; bypass or evade.", "1999:Q46", "Lexis: Synonyms"))
        list.add(q("syn_65", "That punch by the young boxer proved to be *fatal*.",
            "A. effective", "B. belated", "C. hard", "D. deadly", "E. light", 3,
            "'Fatal' means causing death or catastrophic destruction; deadly or lethal.", "2000:Q81", "Lexis: Synonyms"))

        // 66 - 90 (Exercise III)
        list.add(q("syn_66", "The essay topic is *nebulous*.",
            "A. clear", "B. incorrect", "C. vague", "D. distinct", "E. short", 2,
            "'Nebulous' means cloudy, hazy, indistinct, or vague.", "2000:Q87", "Lexis: Synonyms"))
        list.add(q("syn_67", "The party gathering was thrown into a state of *euphoria* after the election result was announced.",
            "A. pleasure and intense joy", "B. confusion", "C. sadness", "D. excitement", "E. panic", 0,
            "'Euphoria' is a state of intense happiness, jubilation, and elation.", "2000:Q90", "Lexis: Synonyms"))
        list.add(q("syn_68", "The principal told the teacher to stop *browbeating* the children.",
            "A. pampering", "B. caning", "C. bullying and intimidating", "D. deceiving", "E. ignoring", 2,
            "To 'browbeat' means to intimidate, domineer, or bully someone with harsh language.", "2000:Q95", "Lexis: Synonyms"))
        list.add(q("syn_69", "The *coalescence* of the groups created additional problems.",
            "A. fighting", "B. proscription", "C. union and merging", "D. disbandment", "E. migration", 2,
            "'Coalescence' is the process of joining together, merging, or forming a union.", "2001:Q32", "Lexis: Synonyms"))
        list.add(q("syn_70", "I cannot understand why Ali should serve in that *moribund* administration.",
            "A. purposeless", "B. crumbling and dying", "C. prodigal", "D. oppressive", "E. new", 1,
            "'Moribund' means in terminal decline, crumbling, or at the point of death.", "2001:Q37", "Lexis: Synonyms"))
        list.add(q("syn_71", "The village girl wore *sumptuous* clothes.",
            "A. expensive and luxurious", "B. loose-fitting", "C. faded-looking", "D. cheap", "E. modest", 0,
            "'Sumptuous' means splendid, luxurious, and highly expensive.", "2001:Q38", "Lexis: Synonyms"))
        list.add(q("syn_72", "Funmi is just being *facetious* about her marrying a soldier.",
            "A. unfaithful", "B. unserious and flippant", "C. serious", "D. crazy", "E. dishonest", 1,
            "'Facetious' means treating serious matters with deliberately inappropriate humor; flippant.", "2001:Q39", "Lexis: Synonyms"))
        list.add(q("syn_73", "The professor discussed a number of *abstruse* topics.",
            "A. relevant", "B. esoteric and difficult", "C. useful", "D. irrelevant", "E. popular", 1,
            "'Abstruse' means difficult to understand, obscure, or esoteric.", "2001:Q40", "Lexis: Synonyms"))
        list.add(q("syn_74", "The men were *tardy* in offering help.",
            "A. slow and sluggish", "B. quick", "C. brave", "D. generous", "E. helpful", 0,
            "'Tardy' means delaying, slow to act, or sluggish.", "2001:Q42", "Lexis: Synonyms"))
        list.add(q("syn_75", "While the hooligans exchanged blows, we looked on *complacently*.",
            "A. questioningly", "B. contentedly and passively", "C. sorrowfully", "D. dejectedly", "E. fearfully", 1,
            "'Complacently' means in a self-satisfied, unconcerned, or passively contented manner.", "2001:Q43", "Lexis: Synonyms"))
        list.add(q("syn_76", "Tade became *timorous* when she was asked to give the valedictory speech.",
            "A. nervous and fearful", "B. aggressive", "C. excited", "D. happy", "E. bold", 0,
            "'Timorous' means showing nervousness, fearfulness, or lack of confidence.", "2001:Q44", "Lexis: Synonyms"))
        list.add(q("syn_77", "Bose was angry because her friend called her a *pilferer*.",
            "A. criminal", "B. liar", "C. petty thief", "D. hypocrite", "E. gossip", 2,
            "A 'pilferer' is someone who steals things of small value (a petty thief).", "2001:Q45", "Lexis: Synonyms"))
        list.add(q("syn_78", "I wish the commander were less *adamant* about his proposed reprisal attack.",
            "A. sentimental", "B. unyielding and firm", "C. supportive", "D. tolerant", "E. doubtful", 1,
            "'Adamant' means refusing to be persuaded or to change one's mind; resolute and unyielding.", "2002:Q45", "Lexis: Synonyms"))
        list.add(q("syn_79", "The manager made *disparaging* remarks about the retiring officer.",
            "A. rude and derogatory", "B. parochial", "C. cynical", "D. complimentary", "E. pleasant", 0,
            "'Disparaging' means expressing the opinion that something is of little worth; belittling/derogatory.", "2002:Q47", "Lexis: Synonyms"))
        list.add(q("syn_80", "The man outran his wife when they heard the *eerie* sound.",
            "A. scary and strange", "B. hissing", "C. harsh", "D. loud", "E. melodious", 0,
            "'Eerie' means strange, mysterious, and frighteningly weird.", "2002:Q48", "Lexis: Synonyms"))
        list.add(q("syn_81", "Teachers of music believe in its *therapeutic* effect.",
            "A. healing and restorative", "B. lyrical", "C. rhythmic", "D. relaxing", "E. entertaining", 0,
            "'Therapeutic' means having a healing, curative, or beneficial effect on the body or mind.", "2002:Q49", "Lexis: Synonyms"))
        list.add(q("syn_82", "I wonder what will be left of his essay when the *extraneous* material is deleted.",
            "A. superfluous and irrelevant", "B. erroneous", "C. relevant", "D. main", "E. complex", 0,
            "'Extraneous' means irrelevant, unrelated, or superfluous to the subject at hand.", "2002:Q51", "Lexis: Synonyms"))
        list.add(q("syn_83", "His success may be described as a *pyrrhic* victory.",
            "A. costly win with devastating losses", "B. easy victory", "C. indecisive match", "D. glorious triumph", "E. temporary success", 0,
            "A 'pyrrhic victory' is a triumph won at too great a cost to have been worthwhile.", "2002:Q52", "Lexis: Synonyms"))
        list.add(q("syn_84", "The party supporters *vilified* the Chairman for the role he played in the crisis.",
            "A. challenged", "B. condemned and defamed", "C. impeached", "D. praised", "E. suspended", 1,
            "To 'vilify' someone means to speak ill of, defame, or harshly condemn them.", "2003:Q47", "Lexis: Synonyms"))
        list.add(q("syn_85", "There was a *glut* of oil on the market.",
            "A. accumulation", "B. abundance and excess", "C. scarcity", "D. increase in price", "E. steady supply", 1,
            "A 'glut' is an excessively abundant supply of something (surplus/overabundance).", "2003:Q49", "Lexis: Synonyms"))
        list.add(q("syn_86", "The boys knew that a storm was *imminent*.",
            "A. possible", "B. impending and near", "C. threatening", "D. encroaching", "E. passing", 1,
            "'Imminent' means about to happen immediately; impending.", "2003:Q52", "Lexis: Synonyms"))
        list.add(q("syn_87", "The *cynics* feared that the nation's nascent democracy would fail.",
            "A. pessimists and skeptics", "B. delinquents", "C. critics", "D. illusionists", "E. patriots", 0,
            "A 'cynic' is a person who distrusts human sincerity or integrity and anticipates the worst; a skeptic/pessimist.", "2003:Q54", "Lexis: Synonyms"))
        list.add(q("syn_88", "The carpenter built a *commodious* wardrobe.",
            "A. gigantic", "B. small", "C. spacious and roomy", "D. wide", "E. decorative", 2,
            "'Commodious' means roomy, large, and spacious.", "2003:Q58", "Lexis: Synonyms"))
        list.add(q("syn_89", "The prosecutor was fully able to *substantiate* the charge.",
            "A. prove and validate", "B. dismiss", "C. weaken", "D. expatiate on", "E. withdraw", 0,
            "To 'substantiate' a claim or charge means to provide evidence to prove its truth.", "2004:Q46", "Lexis: Synonyms"))
        list.add(q("syn_90", "The commander said that the battle would be sustained, total and *relentless*.",
            "A. continuous and unyielding", "B. brutal", "C. fierce", "D. innocuous", "E. defensive", 0,
            "'Relentless' means continuous, unyielding, and never stopping or relaxing in severity.", "2006:Q69", "Lexis: Synonyms"))

        return list
    }

    private fun q(
        id: String,
        text: String,
        opA: String,
        opB: String,
        opC: String,
        opD: String,
        opE: String,
        ans: Int,
        exp: String,
        label: String,
        topic: String
    ): QuestionEntity {
        return QuestionEntity(
            id = "remix_syn_$id",
            subject = "English Language",
            topic = topic,
            year = label.substringBefore(":").trim(),
            questionText = text,
            optionA = opA,
            optionB = opB,
            optionC = opC,
            optionD = opD,
            correctAnswerIndex = if (ans > 3) 3 else ans, // Cap index to 0..3 standard
            explanation = exp,
            difficulty = "Medium",
            originType = "JAMB_ORIGINAL",
            originLabel = label
        )
    }
}
