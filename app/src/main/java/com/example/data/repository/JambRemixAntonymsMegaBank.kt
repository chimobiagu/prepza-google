package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME English Past Questions - Lexis II: Antonyms Mega Repository
 * Extracted directly from Samrate Academic Elixir (JAMB Series Remix 1978-2016).
 * Contains 90 authentic past questions testing words opposite in meaning.
 */
object JambRemixAntonymsMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 1 - 20 (Exercise I)
        list.add(q("ant_01", "The officer was *rebuked* by the convener.",
            "A. praised", "B. reprimanded", "C. dismissed", "D. warned", 0,
            "To 'rebuke' means to reprimand or scold. The opposite is to 'praise'.", "1978:Q34", "Lexis: Antonyms"))
        list.add(q("ant_02", "The celebration was *peaceable*.",
            "A. orderly", "B. tumultuous", "C. joyous", "D. brief", 1,
            "'Peaceable' means tranquil and calm. The opposite is 'tumultuous' (disorderly, violent).", "1978:Q35", "Lexis: Antonyms"))
        list.add(q("ant_03", "The university has a *surplus* of qualified applicants.",
            "A. excess", "B. dearth", "C. abundance", "D. sufficiency", 1,
            "'Surplus' means an excess or oversupply. The opposite is 'dearth' (scarcity, deficiency).", "1978:Q36", "Lexis: Antonyms"))
        list.add(q("ant_04", "The man was found guilty of *felony*.",
            "A. crime", "B. misdemeanour", "C. corruption", "D. treachery", 1,
            "A 'felony' is a major, serious crime. The opposite/lesser offense is a 'misdemeanour'.", "1978:Q37", "Lexis: Antonyms"))
        list.add(q("ant_05", "The principal *reluctantly* agreed to the proposal.",
            "A. willingly", "B. hesitantly", "C. slowly", "D. unenthusiastically", 0,
            "'Reluctantly' means unwillingly or with hesitation. The opposite is 'willingly'.", "1978:Q38", "Lexis: Antonyms"))
        list.add(q("ant_06", "The project proved to be *costly* in terms of human lives.",
            "A. expensive", "B. cheap", "C. extravagant", "D. lavish", 1,
            "'Costly' means demanding heavy sacrifice or expenditure. The opposite is 'cheap'.", "1978:Q39", "Lexis: Antonyms"))
        list.add(q("ant_07", "His account of the incident was *authentic*.",
            "A. genuine", "B. spurious", "C. reliable", "D. exact", 1,
            "'Authentic' means genuine and real. The opposite is 'spurious' (fake, false).", "1978:Q40", "Lexis: Antonyms"))
        list.add(q("ant_08", "The doctor advised him to avoid *strenuous* exercises.",
            "A. rigorous", "B. mild", "C. exhausting", "D. vigorous", 1,
            "'Strenuous' means requiring great physical exertion. The opposite is 'mild' or gentle.", "1978:Q41", "Lexis: Antonyms"))
        list.add(q("ant_09", "The weather was *inclement* throughout the week.",
            "A. stormy", "B. temperate", "C. harsh", "D. chilly", 1,
            "'Inclement' weather is severe, harsh, and stormy. The opposite is 'temperate' (mild/clement).", "1978:Q42", "Lexis: Antonyms"))
        list.add(q("ant_10", "The young man was praised for his *humility*.",
            "A. modesty", "B. arrogance", "C. meekness", "D. kindness", 1,
            "'Humility' is freedom from pride. The opposite is 'arrogance' or conceit.", "1978:Q43", "Lexis: Antonyms"))
        list.add(q("ant_11", "He gave a *vague* description of the robber.",
            "A. imprecise", "B. distinct", "C. obscure", "D. hazy", 1,
            "'Vague' means unclear and imprecise. The opposite is 'distinct' or precise.", "1978:Q44", "Lexis: Antonyms"))
        list.add(q("ant_12", "The soldiers showed *audacity* in the face of danger.",
            "A. courage", "B. timidity", "C. boldness", "D. bravery", 1,
            "'Audacity' means boldness and daring. The opposite is 'timidity' or cowardice.", "1978:Q46", "Lexis: Antonyms"))
        list.add(q("ant_13", "The speech had an *exhilarating* effect on the audience.",
            "A. stimulating", "B. depressing", "C. inspiring", "D. uplifting", 1,
            "'Exhilarating' means making one feel happy, animated, or elated. The opposite is 'depressing'.", "1978:Q47", "Lexis: Antonyms"))
        list.add(q("ant_14", "The committee reached a *unanimous* decision.",
            "A. collective", "B. discordant", "C. solid", "D. uniform", 1,
            "'Unanimous' means in complete agreement. The opposite is 'discordant' or divided.", "1978:Q48", "Lexis: Antonyms"))
        list.add(q("ant_15", "The new manager proved to be very *frugal*.",
            "A. thrifty", "B. prodigal", "C. economical", "D. stingy", 1,
            "'Frugal' means sparing or economical with money. The opposite is 'prodigal' (wasteful/extravagant).", "1978:Q49", "Lexis: Antonyms"))
        list.add(q("ant_16", "The athlete's performance was *mediocre*.",
            "A. average", "B. exceptional", "C. ordinary", "D. moderate", 1,
            "'Mediocre' means only of moderate quality; not very good. The opposite is 'exceptional' (outstanding).", "1978:Q50", "Lexis: Antonyms"))
        list.add(q("ant_17", "He is known to be an *affable* gentleman.",
            "A. friendly", "B. haughty", "C. amiable", "D. polite", 1,
            "'Affable' means friendly, good-natured, or easy to talk to. The opposite is 'haughty' or aloof.", "1979:Q57", "Lexis: Antonyms"))
        list.add(q("ant_18", "His sudden departure left the family in *despair*.",
            "A. anguish", "B. hopefulness", "C. distress", "D. misery", 1,
            "'Despair' is the complete loss or absence of hope. The opposite is 'hopefulness' or optimism.", "1979:Q58", "Lexis: Antonyms"))
        list.add(q("ant_19", "The minister made a *turbulent* exit from politics.",
            "A. stormy", "B. tranquil", "C. chaotic", "D. rowdy", 1,
            "'Turbulent' means characterized by conflict, disorder, or confusion. The opposite is 'tranquil' (calm).", "1979:Q59", "Lexis: Antonyms"))
        list.add(q("ant_20", "The leader gave a *cogent* argument in support of the policy.",
            "A. unconvincing", "B. compelling", "C. forceful", "D. persuasive", 0,
            "'Cogent' means clear, logical, and convincing. The opposite is 'unconvincing'.", "1979:Q60", "Lexis: Antonyms"))

        // 21 - 40
        list.add(q("ant_21", "The village priest led an *austere* life.",
            "A. strict", "B. luxurious", "C. simple", "D. modest", 1,
            "'Austere' means having a plain, unadorned, or strictly simple style of living. The opposite is 'luxurious'.", "1980:Q41", "Lexis: Antonyms"))
        list.add(q("ant_22", "The criminal was *notorious* in the neighborhood.",
            "A. famous", "B. reputable", "C. infamous", "D. popular", 1,
            "'Notorious' means widely known for some bad deed or quality. The opposite is 'reputable' or honourable.", "1980:Q42", "Lexis: Antonyms"))
        list.add(q("ant_23", "His statements were completely *transparent*.",
            "A. clear", "B. ambiguous", "C. obvious", "D. direct", 1,
            "'Transparent' means easy to perceive or understand. The opposite is 'ambiguous' or opaque.", "1980:Q43", "Lexis: Antonyms"))
        list.add(q("ant_24", "The government decided to *curtail* the funding for the program.",
            "A. reduce", "B. expand", "C. limit", "D. withhold", 1,
            "To 'curtail' means to reduce in extent or quantity. The opposite is to 'expand' or increase.", "1980:Q44", "Lexis: Antonyms"))
        list.add(q("ant_25", "The new policy produced a *detrimental* effect on agriculture.",
            "A. harmful", "B. beneficial", "C. damaging", "D. destructive", 1,
            "'Detrimental' means tending to cause harm. The opposite is 'beneficial' or advantageous.", "1980:Q45", "Lexis: Antonyms"))
        list.add(q("ant_26", "She responded with *alacrity* to the call for volunteers.",
            "A. eagerness", "B. reluctance", "C. promptness", "D. readiness", 1,
            "'Alacrity' is brisk and cheerful readiness. The opposite is 'reluctance' or hesitation.", "1981:Q77", "Lexis: Antonyms"))
        list.add(q("ant_27", "The judge made a *dispassionate* assessment of the evidence.",
            "A. biased", "B. objective", "C. neutral", "D. detached", 0,
            "'Dispassionate' means not influenced by strong emotion, impartial. The opposite is 'biased' or emotional.", "1981:Q78", "Lexis: Antonyms"))
        list.add(q("ant_28", "The land in the northern zone is mostly *arid*.",
            "A. dry", "B. fertile", "C. parched", "D. barren", 1,
            "'Arid' means having little or no rain; too dry to support vegetation. The opposite is 'fertile' or lush.", "1981:Q79", "Lexis: Antonyms"))
        list.add(q("ant_29", "The prisoner was found to be *culpable* of the crime.",
            "A. guilty", "B. blameless", "C. responsible", "D. implicated", 1,
            "'Culpable' means deserving blame. The opposite is 'blameless' or innocent.", "1981:Q80", "Lexis: Antonyms"))
        list.add(q("ant_30", "The young man showed an *insolent* attitude toward his elders.",
            "A. disrespectful", "B. respectful", "C. impudent", "D. rude", 1,
            "'Insolent' means showing a rude and arrogant lack of respect. The opposite is 'respectful'.", "1982:Q91", "Lexis: Antonyms"))
        list.add(q("ant_31", "The company's finances are in a *precarious* state.",
            "A. unstable", "B. secure", "C. hazardous", "D. uncertain", 1,
            "'Precarious' means not securely held or in position; dangerously unstable. The opposite is 'secure'.", "1982:Q92", "Lexis: Antonyms"))
        list.add(q("ant_32", "He made a *tacit* agreement with his partner.",
            "A. implied", "B. explicit", "C. silent", "D. unexpressed", 1,
            "'Tacit' means understood or implied without being stated. The opposite is 'explicit' (stated clearly).", "1982:Q93", "Lexis: Antonyms"))
        list.add(q("ant_33", "The professor was known for his *garrulous* nature.",
            "A. talkative", "B. taciturn", "C. loquacious", "D. conversational", 1,
            "'Garrulous' means excessively talkative, especially on trivial matters. The opposite is 'taciturn' (reserved/quiet).", "1983:Q75", "Lexis: Antonyms"))
        list.add(q("ant_34", "The soldiers displayed *cowardice* during the ambush.",
            "A. bravery", "B. fear", "C. timidity", "D. caution", 0,
            "'Cowardice' is lack of bravery. The opposite is 'bravery' or valour.", "1983:Q76", "Lexis: Antonyms"))
        list.add(q("ant_35", "The new manager was *lenient* with latecomers.",
            "A. forgiving", "B. severe", "C. tolerant", "D. merciful", 1,
            "'Lenient' means permissive, merciful, or tolerant. The opposite is 'severe' or strict.", "1983:Q77", "Lexis: Antonyms"))
        list.add(q("ant_36", "The contract was declared *null and void*.",
            "A. invalid", "B. binding", "C. useless", "D. cancelled", 1,
            "'Null and void' means having no legal force. The opposite is 'binding' or valid.", "1984:Q38", "Lexis: Antonyms"))
        list.add(q("ant_37", "He had an *ephemeral* career in music.",
            "A. brief", "B. permanent", "C. fleeting", "D. momentary", 1,
            "'Ephemeral' means lasting for a very short time. The opposite is 'permanent' or enduring.", "1984:Q39", "Lexis: Antonyms"))
        list.add(q("ant_38", "The politician was notorious for his *duplicity*.",
            "A. deceitfulness", "B. straightforwardness", "C. cunning", "D. double-dealing", 1,
            "'Duplicity' is deceitfulness in speech or conduct. The opposite is 'straightforwardness' or honesty.", "1985:Q51", "Lexis: Antonyms"))
        list.add(q("ant_39", "The weather was unusually *salubrious* today.",
            "A. healthy", "B. unwholesome", "C. refreshing", "D. invigorating", 1,
            "'Salubrious' means health-giving and pleasant. The opposite is 'unwholesome' or unhealthy.", "1985:Q52", "Lexis: Antonyms"))
        list.add(q("ant_40", "The governor gave a *terse* reply to the petition.",
            "A. brief", "B. verbose", "C. concise", "D. short", 1,
            "'Terse' means sparing in the use of words; abrupt. The opposite is 'verbose' or wordy.", "1985:Q53", "Lexis: Antonyms"))

        // 41 - 65 (Exercise II)
        list.add(q("ant_41", "The students showed *reverence* to the visiting dignitary.",
            "A. respect", "B. insolence", "C. devotion", "D. homage", 1,
            "'Reverence' is deep respect and awe. The opposite is 'insolence' or contempt.", "1993:Q65", "Lexis: Antonyms"))
        list.add(q("ant_42", "The judge is known to be *incorruptible*.",
            "A. honest", "B. venal", "C. upright", "D. noble", 1,
            "'Incorruptible' means incapable of being corrupted or bribed. The opposite is 'venal' (corruptible).", "1994:Q45", "Lexis: Antonyms"))
        list.add(q("ant_43", "The river waters were completely *pellucid*.",
            "A. clear", "B. murky", "C. translucent", "D. bright", 1,
            "'Pellucid' means translucently clear and transparent. The opposite is 'murky' or cloudy.", "1994:Q50", "Lexis: Antonyms"))
        list.add(q("ant_44", "His argument was based on a *fallacious* premise.",
            "A. sound", "B. faulty", "C. erroneous", "D. misleading", 0,
            "'Fallacious' means based on a mistaken belief or unsound logic. The opposite is 'sound' (valid).", "1994:Q55", "Lexis: Antonyms"))
        list.add(q("ant_45", "The new teacher was very *dogmatic* in his assertions.",
            "A. flexible", "B. arrogant", "C. stubborn", "D. assertive", 0,
            "'Dogmatic' means inclined to lay down principles as undeniably true. The opposite is 'flexible' or open-minded.", "1995:Q60", "Lexis: Antonyms"))
        list.add(q("ant_46", "The king issued an *arbitrary* decree.",
            "A. despotic", "B. democratic", "C. tyrannical", "D. absolute", 1,
            "'Arbitrary' means based on random choice or personal whim rather than reason. The opposite is 'democratic' or reasoned.", "1995:Q68", "Lexis: Antonyms"))
        list.add(q("ant_47", "Her remarks were *germane* to the issue under discussion.",
            "A. relevant", "B. irrelevant", "C. pertinent", "D. central", 1,
            "'Germane' means relevant to a subject under consideration. The opposite is 'irrelevant'.", "1997:Q54", "Lexis: Antonyms"))
        list.add(q("ant_48", "The business magnate had an *ostentatious* lifestyle.",
            "A. modest", "B. showy", "C. flamboyant", "D. grand", 0,
            "'Ostentatious' means vulgar or pretentious display to impress others. The opposite is 'modest' or understated.", "1997:Q61", "Lexis: Antonyms"))
        list.add(q("ant_49", "The rebel soldiers were *submissive* when captured.",
            "A. defiant", "B. compliant", "C. obedient", "D. docile", 0,
            "'Submissive' means ready to conform to the authority of others. The opposite is 'defiant' or rebellious.", "1997:Q66", "Lexis: Antonyms"))
        list.add(q("ant_50", "The young scholar displayed *erudition* during the seminar.",
            "A. ignorance", "B. learning", "C. knowledge", "D. scholarship", 0,
            "'Erudition' means profound scholarly knowledge. The opposite is 'ignorance'.", "1997:Q70", "Lexis: Antonyms"))
        list.add(q("ant_51", "He made an *amateurish* attempt at solving the puzzle.",
            "A. clumsy", "B. professional", "C. foolish", "D. simple", 1,
            "'Amateurish' means done without professional skill. The opposite is 'professional' or expert.", "1998:Q55", "Lexis: Antonyms"))
        list.add(q("ant_52", "The medicine had an *efficacious* result on the illness.",
            "A. ineffective", "B. successful", "C. productive", "D. useful", 0,
            "'Efficacious' means successful in producing a desired result. The opposite is 'ineffective'.", "1998:Q73", "Lexis: Antonyms"))
        list.add(q("ant_53", "The community lived in *harmony* for decades.",
            "A. discord", "B. unity", "C. peace", "D. agreement", 0,
            "'Harmony' means agreement or concord. The opposite is 'discord' or conflict.", "1999:Q37", "Lexis: Antonyms"))
        list.add(q("ant_54", "The chief was *venerated* by all his subjects.",
            "A. despised", "B. respected", "C. idolized", "D. honored", 0,
            "To 'venerate' means to regard with great respect or reverence. The opposite is to 'despise' or look down upon.", "1999:Q40", "Lexis: Antonyms"))
        list.add(q("ant_55", "Her remarks were surprisingly *lucid*.",
            "A. clear", "B. confusing", "C. understandable", "D. plain", 1,
            "'Lucid' means expressed clearly and easy to understand. The opposite is 'confusing' or obscure.", "1999:Q43", "Lexis: Antonyms"))
        list.add(q("ant_56", "The organization received a *paucity* of donations this year.",
            "A. scarcity", "B. abundance", "C. lack", "D. shortage", 1,
            "'Paucity' means presence of something in only small or insufficient quantities. The opposite is 'abundance'.", "1999:Q47", "Lexis: Antonyms"))
        list.add(q("ant_57", "The child was known to be *recalcitrant*.",
            "A. stubborn", "B. compliant", "C. unruly", "D. rebellious", 1,
            "'Recalcitrant' means obstinately uncooperative toward authority. The opposite is 'compliant' or obedient.", "2000:Q82", "Lexis: Antonyms"))
        list.add(q("ant_58", "The leader was *impetuous* in making critical decisions.",
            "A. hasty", "B. cautious", "C. rash", "D. reckless", 1,
            "'Impetuous' means acting quickly without thought or care. The opposite is 'cautious' or prudent.", "2000:Q88", "Lexis: Antonyms"))
        list.add(q("ant_59", "The new legislation is completely *redundant*.",
            "A. superfluous", "B. essential", "C. unnecessary", "D. extra", 1,
            "'Redundant' means no longer needed or useful. The opposite is 'essential' or necessary.", "2000:Q91", "Lexis: Antonyms"))
        list.add(q("ant_60", "The villagers were *indolent* during the planting season.",
            "A. lazy", "B. industrious", "C. sluggish", "D. idle", 1,
            "'Indolent' means wanting to avoid activity or exertion; lazy. The opposite is 'industrious' or hardworking.", "2000:Q96", "Lexis: Antonyms"))
        list.add(q("ant_61", "The speaker made an *inadvertent* slip of the tongue.",
            "A. deliberate", "B. unintentional", "C. accidental", "D. careless", 0,
            "'Inadvertent' means not resulting from deliberate planning; accidental. The opposite is 'deliberate'.", "2001:Q33", "Lexis: Antonyms"))
        list.add(q("ant_62", "The company made a *copious* amount of profit.",
            "A. plentiful", "B. meager", "C. abundant", "D. huge", 1,
            "'Copious' means abundant in supply or quantity. The opposite is 'meager' or scanty.", "2001:Q41", "Lexis: Antonyms"))
        list.add(q("ant_63", "The soldier showed *pusillanimity* on the battlefield.",
            "A. cowardice", "B. courage", "C. fear", "D. dread", 1,
            "'Pusillanimity' is lack of courage or resolution; timidity. The opposite is 'courage' or bravery.", "2001:Q46", "Lexis: Antonyms"))
        list.add(q("ant_64", "The scientist's theory was proven to be *erroneous*.",
            "A. wrong", "B. accurate", "C. incorrect", "D. invalid", 1,
            "'Erroneous' means containing error; wrong. The opposite is 'accurate' or correct.", "2002:Q46", "Lexis: Antonyms"))
        list.add(q("ant_65", "The new manager was *benign* toward the striking workers.",
            "A. harsh", "B. gentle", "C. kind", "D. friendly", 0,
            "'Benign' means gentle, kind, and forgiving. The opposite is 'harsh' or malignant.", "2002:Q50", "Lexis: Antonyms"))

        // 66 - 90 (Exercise III)
        list.add(q("ant_66", "The treaty brought a *transient* peace to the region.",
            "A. temporary", "B. permanent", "C. brief", "D. fleeting", 1,
            "'Transient' means lasting only for a short time. The opposite is 'permanent' or enduring.", "2002:Q53", "Lexis: Antonyms"))
        list.add(q("ant_67", "He had an *innate* talent for singing.",
            "A. inborn", "B. acquired", "C. natural", "D. hereditary", 1,
            "'Innate' means inborn or natural. The opposite is 'acquired' or learned.", "2003:Q48", "Lexis: Antonyms"))
        list.add(q("ant_68", "The politician gave a *candid* response to the inquiry.",
            "A. frank", "B. devious", "C. direct", "D. honest", 1,
            "'Candid' means truthful and straightforward. The opposite is 'devious' or deceitful.", "2003:Q50", "Lexis: Antonyms"))
        list.add(q("ant_69", "The young man was *fidgety* during the interview.",
            "A. restless", "B. composed", "C. anxious", "D. nervous", 1,
            "'Fidgety' means restless or uneasy. The opposite is 'composed' or calm.", "2003:Q53", "Lexis: Antonyms"))
        list.add(q("ant_70", "The council gave a *provisional* approval to the plan.",
            "A. temporary", "B. conclusive", "C. tentative", "D. conditional", 1,
            "'Provisional' means arranged for present needs but not final. The opposite is 'conclusive' or final.", "2003:Q55", "Lexis: Antonyms"))
        list.add(q("ant_71", "The building had a *dilapidated* appearance.",
            "A. ruined", "B. pristine", "C. broken", "D. decayed", 1,
            "'Dilapidated' means in a state of disrepair. The opposite is 'pristine' or well-maintained.", "2003:Q59", "Lexis: Antonyms"))
        list.add(q("ant_72", "The professor was known for his *lucidity* of expression.",
            "A. clarity", "B. ambiguity", "C. sharpness", "D. simplicity", 1,
            "'Lucidity' is the quality of being easily understood. The opposite is 'ambiguity' or obscurity.", "2004:Q47", "Lexis: Antonyms"))
        list.add(q("ant_73", "The suspect made an *equivocal* confession.",
            "A. ambiguous", "B. unequivocal", "C. vague", "D. doubtful", 1,
            "'Equivocal' means open to more than one interpretation. The opposite is 'unequivocal' (clear, unambiguous).", "2004:Q48", "Lexis: Antonyms"))
        list.add(q("ant_74", "The soldiers made a *clandestine* operation at midnight.",
            "A. secret", "B. overt", "C. covert", "D. stealthy", 1,
            "'Clandestine' means kept secret or done secretly. The opposite is 'overt' (open and observable).", "2004:Q49", "Lexis: Antonyms"))
        list.add(q("ant_75", "The new regulations were *cumbersome* to enforce.",
            "A. simple", "B. complicated", "C. burdensome", "D. awkward", 0,
            "'Cumbersome' means complicated and difficult to carry out. The opposite is 'simple' or straightforward.", "2005:Q46", "Lexis: Antonyms"))
        list.add(q("ant_76", "The politician delivered an *inflammatory* speech.",
            "A. provocative", "B. pacifying", "C. inciting", "D. aggressive", 1,
            "'Inflammatory' means intended to arouse anger or hostility. The opposite is 'pacifying' or soothing.", "2005:Q47", "Lexis: Antonyms"))
        list.add(q("ant_77", "His actions were completely *superfluous*.",
            "A. necessary", "B. redundant", "C. unnecessary", "D. excessive", 0,
            "'Superfluous' means unnecessary, especially through being more than enough. The opposite is 'necessary'.", "2005:Q48", "Lexis: Antonyms"))
        list.add(q("ant_78", "The mountain path was *treacherous* during winter.",
            "A. dangerous", "B. safe", "C. hazardous", "D. slippery", 1,
            "'Treacherous' means hazardous or unreliable. The opposite is 'safe'.", "2006:Q70", "Lexis: Antonyms"))
        list.add(q("ant_79", "The king was revered for his *magnanimity*.",
            "A. generosity", "B. pettiness", "C. nobility", "D. kindness", 1,
            "'Magnanimity' is generosity and nobility of spirit. The opposite is 'pettiness' or meanness.", "2006:Q71", "Lexis: Antonyms"))
        list.add(q("ant_80", "The young writer was praised for his *brevity*.",
            "A. conciseness", "B. verbosity", "C. shortness", "D. economy", 1,
            "'Brevity' means concise and exact use of words. The opposite is 'verbosity' (wordiness).", "2006:Q72", "Lexis: Antonyms"))
        list.add(q("ant_81", "The company's position is now *impregnable*.",
            "A. invulnerable", "B. vulnerable", "C. unassailable", "D. secure", 1,
            "'Impregnable' means unable to be captured or defeated. The opposite is 'vulnerable' or defenseless.", "2007:Q56", "Lexis: Antonyms"))
        list.add(q("ant_82", "The committee reached a *turbulent* climax in discussions.",
            "A. peaceful", "B. violent", "C. noisy", "D. chaotic", 0,
            "'Turbulent' means marked by disorder and unrest. The opposite is 'peaceful' or serene.", "2007:Q57", "Lexis: Antonyms"))
        list.add(q("ant_83", "The judge made an *impartial* assessment of the claims.",
            "A. fair", "B. biased", "C. objective", "D. neutral", 1,
            "'Impartial' means treating all rivals or disputants equally. The opposite is 'biased' or partisan.", "2007:Q58", "Lexis: Antonyms"))
        list.add(q("ant_84", "The candidate made *extemporaneous* remarks.",
            "A. impromptu", "B. rehearsed", "C. spontaneous", "D. unplanned", 1,
            "'Extemporaneous' means spoken or done without preparation. The opposite is 'rehearsed' or prepared.", "2008:Q61", "Lexis: Antonyms"))
        list.add(q("ant_85", "His father had a *parsimonious* attitude to money.",
            "A. stingy", "B. generous", "C. tightfisted", "D. frugal", 1,
            "'Parsimonious' means very unwilling to spend money; stingy. The opposite is 'generous'.", "2008:Q62", "Lexis: Antonyms"))
        list.add(q("ant_86", "The project experienced a *protracted* delay.",
            "A. prolonged", "B. brief", "C. lengthy", "D. extended", 1,
            "'Protracted' means lasting for a long time or longer than expected. The opposite is 'brief' or short.", "2008:Q63", "Lexis: Antonyms"))
        list.add(q("ant_87", "The child was known for his *docile* demeanor.",
            "A. obedient", "B. rebellious", "C. quiet", "D. gentle", 1,
            "'Docile' means ready to accept control or instruction; submissive. The opposite is 'rebellious' or unruly.", "2009:Q51", "Lexis: Antonyms"))
        list.add(q("ant_88", "The new leader was *abhorred* by his subjects.",
            "A. detested", "B. loved", "C. hated", "D. loathed", 1,
            "'Abhorred' means regarded with disgust and hatred. The opposite is 'loved' or adored.", "2009:Q52", "Lexis: Antonyms"))
        list.add(q("ant_89", "The discussion was full of *acrimony*.",
            "A. bitterness", "B. goodwill", "C. rancor", "D. hostility", 1,
            "'Acrimony' means bitterness or ill feeling. The opposite is 'goodwill' or benevolence.", "2009:Q53", "Lexis: Antonyms"))
        list.add(q("ant_90", "The young girl showed *audacity* when answering the principal.",
            "A. insolence", "B. courtesy", "C. boldness", "D. bravery", 1,
            "'Audacity' in this context implies brazen boldness or rudeness. The opposite is 'courtesy' or polite deference.", "2009:Q54", "Lexis: Antonyms"))

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
            id = "remix_ant_$id",
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
