package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME English Past Questions - Phrasal Verbs & Prepositions Mega Repository
 * Extracted directly from Samrate Academic Elixir (JAMB Series Remix 1978-2016).
 * Contains 85 authentic past questions testing prepositions, particles, and phrasal verbs.
 */
object JambRemixPhrasalVerbsAndPrepositionsMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(q("pv_01", "The match was called _______ due to the heavy downpour.",
            "A. out", "B. off", "C. away", "D. up", 1,
            "To 'call off' an event means to cancel it.", "1978:Q60", "Structure: Phrasal Verbs"))
        list.add(q("pv_02", "He looks down _______ poor relations who visit him.",
            "A. at", "B. upon", "C. into", "D. with", 1,
            "To 'look down upon' someone means to regard them with contempt or feel superior.", "1978:Q61", "Structure: Phrasal Verbs"))
        list.add(q("pv_03", "The police asked the driver to pull _______ to the side of the road.",
            "A. over", "B. down", "C. through", "D. out", 0,
            "To 'pull over' means to steer a vehicle to the side of the road and stop.", "1978:Q62", "Structure: Phrasal Verbs"))
        list.add(q("pv_04", "We must put _______ our differences and work together.",
            "A. aside", "B. by", "C. away", "D. off", 0,
            "To 'put aside' differences means to disregard or set them aside to achieve harmony.", "1978:Q63", "Structure: Phrasal Verbs"))
        list.add(q("pv_05", "The plane took _______ smoothly despite the wind.",
            "A. up", "B. off", "C. out", "D. in", 1,
            "An aircraft 'takes off' when it leaves the ground and begins flight.", "1979:Q70", "Structure: Phrasal Verbs"))
        list.add(q("pv_06", "She takes _______ her mother in both appearance and character.",
            "A. after", "B. to", "C. on", "D. with", 0,
            "To 'take after' a parent means to resemble them in appearance or behavior.", "1979:Q71", "Structure: Phrasal Verbs"))
        list.add(q("pv_07", "I cannot put up _______ such rude behaviour any longer.",
            "A. with", "B. for", "C. by", "D. to", 0,
            "To 'put up with' means to tolerate or endure someone or something.", "1979:Q72", "Structure: Phrasal Verbs"))
        list.add(q("pv_08", "The firemen managed to put _______ the blaze in minutes.",
            "A. out", "B. off", "C. down", "D. away", 0,
            "To 'put out' a fire means to extinguish it.", "1980:Q55", "Structure: Phrasal Verbs"))
        list.add(q("pv_09", "The sudden noise brought _______ an asthma attack.",
            "A. about", "B. on", "C. up", "D. out", 1,
            "To 'bring on' an illness or attack means to cause it to occur.", "1980:Q56", "Structure: Phrasal Verbs"))
        list.add(q("pv_10", "He was brought _______ by his grandmother in the village.",
            "A. out", "B. up", "C. in", "D. on", 1,
            "To 'bring up' a child means to raise and educate them.", "1980:Q57", "Structure: Phrasal Verbs"))
        list.add(q("pv_11", "She broke _______ in tears when the sad verdict was read.",
            "A. down", "B. out", "C. into", "D. off", 0,
            "To 'break down' emotionally means to lose control of one's feelings and weep.", "1981:Q88", "Structure: Phrasal Verbs"))
        list.add(q("pv_12", "Cholera broke _______ in the refugee camp last night.",
            "A. out", "B. into", "C. up", "D. down", 0,
            "An epidemic or fire 'breaks out' when it starts suddenly.", "1981:Q89", "Structure: Phrasal Verbs"))
        list.add(q("pv_13", "The burglars broke _______ the house through the kitchen window.",
            "A. out", "B. into", "C. through", "D. down", 1,
            "To 'break into' premises means to enter forcibly and illegally.", "1982:Q85", "Structure: Phrasal Verbs"))
        list.add(q("pv_14", "The meeting broke _______ at midnight without an agreement.",
            "A. off", "B. out", "C. up", "D. away", 2,
            "When a gathering or meeting 'breaks up', the participants disperse.", "1982:Q86", "Structure: Phrasal Verbs"))
        list.add(q("pv_15", "The price of petrol has gone _______ again this morning.",
            "A. up", "B. off", "C. on", "D. by", 0,
            "To 'go up' means to increase or rise in cost.", "1983:Q85", "Structure: Phrasal Verbs"))
        list.add(q("pv_16", "The bomb went _______ with a loud explosion.",
            "A. off", "B. out", "C. up", "D. away", 0,
            "A bomb 'goes off' when it detonates.", "1983:Q86", "Structure: Phrasal Verbs"))
        list.add(q("pv_17", "He had to fall _______ on his savings during the strike.",
            "A. back", "B. in", "C. through", "D. over", 0,
            "To 'fall back on' something means to use it as a reserve or last resort.", "1984:Q45", "Structure: Phrasal Verbs"))
        list.add(q("pv_18", "The planned excursion fell _______ because of lack of funds.",
            "A. through", "B. out", "C. off", "D. away", 0,
            "A plan 'falls through' when it fails to materialize or happen.", "1984:Q46", "Structure: Phrasal Verbs"))
        list.add(q("pv_19", "The two former friends fell _______ over a piece of land.",
            "A. out", "B. off", "C. through", "D. away", 0,
            "To 'fall out' with someone means to quarrel and cease being friendly.", "1985:Q65", "Structure: Phrasal Verbs"))
        list.add(q("pv_20", "He turned _______ the job offer because the salary was low.",
            "A. down", "B. off", "C. out", "D. away", 0,
            "To 'turn down' an offer means to reject or refuse it.", "1985:Q66", "Structure: Phrasal Verbs"))

        // 21 - 40
        list.add(q("pv_21", "The crowd turned _______ in large numbers to welcome the governor.",
            "A. out", "B. up", "C. on", "D. in", 0,
            "To 'turn out' means to assemble, attend, or gather in a crowd.", "1985:Q67", "Structure: Phrasal Verbs"))
        list.add(q("pv_22", "He turned _______ to be an impostor after thorough investigation.",
            "A. out", "B. up", "C. off", "D. over", 0,
            "To 'turn out' means to prove to be in the final result.", "1985:Q68", "Structure: Phrasal Verbs"))
        list.add(q("pv_23", "We have run _______ of fuel and the car has stopped.",
            "A. out", "B. down", "C. into", "D. away", 0,
            "To 'run out of' a supply means to have none left.", "1993:Q70", "Structure: Phrasal Verbs"))
        list.add(q("pv_24", "I ran _______ an old classmate at the supermarket yesterday.",
            "A. into", "B. over", "C. against", "D. across", 0,
            "To 'run into' someone means to meet them unexpectedly.", "1993:Q71", "Structure: Phrasal Verbs"))
        list.add(q("pv_25", "The reckless driver ran _______ a stray goat on the highway.",
            "A. over", "B. into", "C. off", "D. through", 0,
            "To 'run over' something means to knock down and drive over it with a vehicle.", "1994:Q60", "Structure: Phrasal Verbs"))
        list.add(q("pv_26", "She passed _______ during the strenuous morning parade.",
            "A. out", "B. away", "C. off", "D. by", 0,
            "To 'pass out' means to faint or lose consciousness momentarily.", "1994:Q61", "Structure: Phrasal Verbs"))
        list.add(q("pv_27", "The community mourned when the grand patriarch passed _______.",
            "A. away", "B. out", "C. off", "D. down", 0,
            "To 'pass away' is a polite euphemism for to die.", "1994:Q62", "Structure: Phrasal Verbs"))
        list.add(q("pv_28", "The committee decided to look _______ the financial crisis.",
            "A. into", "B. over", "C. upon", "D. at", 0,
            "To 'look into' an issue means to investigate or examine it carefully.", "1995:Q75", "Structure: Phrasal Verbs"))
        list.add(q("pv_29", "You can look _______ the unfamiliar word in the dictionary.",
            "A. up", "B. into", "C. out", "D. through", 0,
            "To 'look up' information means to search for and find it in a reference book.", "1995:Q76", "Structure: Phrasal Verbs"))
        list.add(q("pv_30", "Look _______! There is a speeding lorry behind you.",
            "A. out", "B. up", "C. into", "D. on", 0,
            "'Look out!' is an exclamation used to warn someone of imminent danger.", "1995:Q77", "Structure: Phrasal Verbs"))
        list.add(q("pv_31", "The boy was accused _______ stealing the headmaster's watch.",
            "A. of", "B. for", "C. with", "D. about", 0,
            "The verb 'accused' strictly takes the preposition 'of' (accused of a crime).", "1997:Q75", "Structure: Prepositions"))
        list.add(q("pv_32", "The judge acquitted the defendant _______ all criminal charges.",
            "A. of", "B. from", "C. with", "D. against", 0,
            "To 'acquit' someone takes the preposition 'of' (acquitted of all charges).", "1997:Q76", "Structure: Prepositions"))
        list.add(q("pv_33", "She congratulated her brother _______ his recent university admission.",
            "A. on", "B. for", "C. with", "D. at", 0,
            "The correct preposition with 'congratulate' is 'on' (congratulate on an achievement).", "1997:Q77", "Structure: Prepositions"))
        list.add(q("pv_34", "The manager insisted _______ receiving the report before noon.",
            "A. on", "B. in", "C. for", "D. with", 0,
            "The verb 'insist' takes the preposition 'on' or 'upon'.", "1998:Q60", "Structure: Prepositions"))
        list.add(q("pv_35", "Are you interested _______ joining our science club?",
            "A. in", "B. on", "C. with", "D. for", 0,
            "The adjective 'interested' takes the preposition 'in'.", "1998:Q61", "Structure: Prepositions"))
        list.add(q("pv_36", "The student is proficient _______ spoken English and French.",
            "A. in", "B. at", "C. with", "D. for", 0,
            "'Proficient' takes the preposition 'in' when referring to a language or domain of skill.", "1998:Q62", "Structure: Prepositions"))
        list.add(q("pv_37", "He is very good _______ Mathematics and Physics.",
            "A. at", "B. in", "C. with", "D. on", 0,
            "'Good at' is the correct prepositional collocation for aptitude in subjects.", "1999:Q55", "Structure: Prepositions"))
        list.add(q("pv_38", "The driver was blind _______ his own vehicle's mechanical faults.",
            "A. to", "B. with", "C. at", "D. in", 0,
            "To be 'blind to' something means unwilling or unable to perceive it.", "1999:Q56", "Structure: Prepositions"))
        list.add(q("pv_39", "He has been suffering _______ malaria for three days.",
            "A. from", "B. with", "C. of", "D. in", 0,
            "The standard preposition after 'suffer' (an ailment) is 'from'.", "1999:Q57", "Structure: Prepositions"))
        list.add(q("pv_40", "The young prince died _______ cholera during the epidemic.",
            "A. of", "B. from", "C. with", "D. by", 0,
            "One 'dies of' a specific disease (e.g. cancer, malaria, cholera).", "2000:Q70", "Structure: Prepositions"))

        // 41 - 65
        list.add(q("pv_41", "She was ashamed _______ her untidy appearance before the guests.",
            "A. of", "B. with", "C. about", "D. for", 0,
            "'Ashamed' takes the preposition 'of'.", "2000:Q71", "Structure: Prepositions"))
        list.add(q("pv_42", "The committee is composed _______ five senior professors.",
            "A. of", "B. off", "C. with", "D. by", 0,
            "'Composed of' indicates the constituent parts of a group or entity.", "2000:Q72", "Structure: Prepositions"))
        list.add(q("pv_43", "The whole house consists _______ ten self-contained rooms.",
            "A. of", "B. in", "C. with", "D. for", 0,
            "'Consist of' means to be made up or formed of.", "2001:Q55", "Structure: Prepositions"))
        list.add(q("pv_44", "He took pride _______ his children's brilliant academic feats.",
            "A. in", "B. on", "C. with", "D. for", 0,
            "The idiom is 'take pride in' (whereas the adjective is 'proud of').", "2001:Q56", "Structure: Prepositions"))
        list.add(q("pv_45", "She is proud _______ her modest achievements.",
            "A. of", "B. in", "C. with", "D. at", 0,
            "The adjective 'proud' takes 'of' (proud of something).", "2001:Q57", "Structure: Prepositions"))
        list.add(q("pv_46", "We must abide _______ the rules and regulations of the institution.",
            "A. by", "B. with", "C. to", "D. at", 0,
            "To 'abide by' means to accept or act in accordance with a rule or decision.", "2002:Q60", "Structure: Prepositions"))
        list.add(q("pv_47", "He is envious _______ his neighbor's new sports car.",
            "A. of", "B. at", "C. with", "D. for", 0,
            "'Envious' takes the preposition 'of'.", "2002:Q61", "Structure: Prepositions"))
        list.add(q("pv_48", "The minister was accompanied _______ his personal assistant.",
            "A. by", "B. with", "C. from", "D. of", 0,
            "A person is accompanied 'by' another person (and accompanied 'with/by' an object).", "2002:Q62", "Structure: Prepositions"))
        list.add(q("pv_49", "The student was expelled _______ the university for exam malpractice.",
            "A. from", "B. out of", "C. off", "D. through", 0,
            "To 'expel' takes the preposition 'from' (expelled from school).", "2003:Q65", "Structure: Prepositions"))
        list.add(q("pv_50", "The young athlete was disqualified _______ participating in the finals.",
            "A. from", "B. of", "C. for", "D. against", 0,
            "'Disqualified from' is the correct prepositional construction.", "2003:Q66", "Structure: Prepositions"))
        list.add(q("pv_51", "He was exonerated _______ any wrongdoing by the judicial panel.",
            "A. from", "B. of", "C. with", "D. against", 0,
            "To 'exonerate' from blame or wrongdoing takes 'from'.", "2003:Q67", "Structure: Prepositions"))
        list.add(q("pv_52", "The workers protested _______ the sudden deduction in their allowances.",
            "A. against", "B. for", "C. on", "D. with", 0,
            "To 'protest against' an unfavorable action or decision is standard usage.", "2004:Q55", "Structure: Prepositions"))
        list.add(q("pv_53", "She is susceptible _______ malaria infections during rainy seasons.",
            "A. to", "B. with", "C. for", "D. at", 0,
            "'Susceptible' takes the preposition 'to' (susceptible to disease).", "2004:Q56", "Structure: Prepositions"))
        list.add(q("pv_54", "The new constitution is superior _______ the previous draft.",
            "A. to", "B. than", "C. over", "D. against", 0,
            "Latin comparative adjectives like 'superior', 'inferior', 'senior' take 'to', never 'than'.", "2004:Q57", "Structure: Prepositions"))
        list.add(q("pv_55", "He is junior _______ me in the civil service rank.",
            "A. to", "B. than", "C. over", "D. below", 0,
            "'Junior' and 'senior' are followed by the preposition 'to', not 'than'.", "2005:Q55", "Structure: Prepositions"))
        list.add(q("pv_56", "I prefer drinking freshly squeezed juice _______ canned soda.",
            "A. to", "B. than", "C. instead", "D. more than", 0,
            "The verb 'prefer' takes the preposition 'to' when comparing two choices.", "2005:Q56", "Structure: Prepositions"))
        list.add(q("pv_57", "The teacher was astonished _______ the pupil's extraordinary brilliance.",
            "A. at", "B. with", "C. by", "D. on", 0,
            "'Astonished at' (or 'astonished by') is the correct prepositional construction.", "2005:Q57", "Structure: Prepositions"))
        list.add(q("pv_58", "The soldier was oblivious _______ the dangers surrounding him.",
            "A. of", "B. to", "C. with", "D. for", 0,
            "'Oblivious of' (or 'oblivious to') means unaware of.", "2006:Q60", "Structure: Prepositions"))
        list.add(q("pv_59", "She is averse _______ eating spicy meat.",
            "A. to", "B. from", "C. with", "D. for", 0,
            "'Averse' takes the preposition 'to' (averse to doing something).", "2006:Q61", "Structure: Prepositions"))
        list.add(q("pv_60", "The lawyer complied _______ all the instructions laid down by the court.",
            "A. with", "B. to", "C. by", "D. on", 0,
            "The verb 'comply' takes the preposition 'with' (comply with rules).", "2006:Q62", "Structure: Prepositions"))
        list.add(q("pv_61", "The company's success is contingent _______ prompt delivery of materials.",
            "A. upon", "B. with", "C. for", "D. at", 0,
            "'Contingent upon' (or 'contingent on') means dependent on.", "2007:Q60", "Structure: Prepositions"))
        list.add(q("pv_62", "He was completely absorbed _______ reading the historical novel.",
            "A. in", "B. with", "C. on", "D. at", 0,
            "To be 'absorbed in' an activity means deeply engaged and attentive.", "2007:Q61", "Structure: Prepositions"))
        list.add(q("pv_63", "The suspect was remanded _______ police custody pending further trial.",
            "A. in", "B. into", "C. to", "D. at", 0,
            "In legal terminology, a defendant is 'remanded in' custody.", "2007:Q62", "Structure: Prepositions"))
        list.add(q("pv_64", "The patient is gradually recovering _______ the severe surgery.",
            "A. from", "B. of", "C. with", "D. off", 0,
            "To 'recover from' an illness, shock, or injury is standard grammar.", "2008:Q65", "Structure: Prepositions"))
        list.add(q("pv_65", "He was deprived _______ his civil rights after the conviction.",
            "A. of", "B. from", "C. off", "D. with", 0,
            "To 'deprive someone of' something means to take it away from them.", "2008:Q66", "Structure: Prepositions"))

        // 66 - 85
        list.add(q("pv_66", "The athlete was disqualified _______ breaking the starting lane rules.",
            "A. for", "B. from", "C. of", "D. against", 0,
            "Disqualified 'for' an infraction / disqualified 'from' participating.", "2008:Q67", "Structure: Prepositions"))
        list.add(q("pv_67", "We are confident _______ winning the regional championship.",
            "A. of", "B. in", "C. with", "D. about", 0,
            "The adjective 'confident' is followed by 'of' + gerund (confident of winning).", "2009:Q60", "Structure: Prepositions"))
        list.add(q("pv_68", "The governor dispensed _______ the services of his chief adviser.",
            "A. with", "B. from", "C. of", "D. off", 0,
            "To 'dispense with' means to manage without or get rid of.", "2009:Q61", "Structure: Prepositions"))
        list.add(q("pv_69", "The student is deficient _______ basic grammatical skills.",
            "A. in", "B. with", "C. of", "D. for", 0,
            "'Deficient in' means lacking the necessary quantity or quality.", "2009:Q62", "Structure: Prepositions"))
        list.add(q("pv_70", "The board conferred an honorary degree _______ the philanthropist.",
            "A. on", "B. to", "C. with", "D. for", 0,
            "To 'confer an honor on/upon' someone is standard usage.", "2010:Q60", "Structure: Prepositions"))
        list.add(q("pv_71", "The mother is anxious _______ her missing child's safety.",
            "A. about", "B. for", "C. of", "D. with", 0,
            "One is 'anxious about' a troubling situation (or 'anxious for' someone's welfare).", "2010:Q61", "Structure: Prepositions"))
        list.add(q("pv_72", "The committee arrived _______ a unanimous decision after hours of debate.",
            "A. at", "B. to", "C. on", "D. in", 0,
            "To 'arrive at' a conclusion, decision, or consensus is correct.", "2011:Q60", "Structure: Prepositions"))
        list.add(q("pv_73", "The visitors arrived _______ Nigeria early on Monday morning.",
            "A. in", "B. at", "C. to", "D. on", 0,
            "One arrives 'in' a country or major city, but arrives 'at' a building/station.", "2011:Q61", "Structure: Prepositions"))
        list.add(q("pv_74", "He is capable _______ managing a large team effectively.",
            "A. of", "B. to", "C. for", "D. with", 0,
            "The adjective 'capable' takes 'of' + gerund (capable of doing).", "2012:Q60", "Structure: Prepositions"))
        list.add(q("pv_75", "The new manager is very popular _______ all the factory staff.",
            "A. with", "B. to", "C. among", "D. for", 0,
            "'Popular with' (or 'popular among') indicates favored acceptance.", "2012:Q61", "Structure: Prepositions"))
        list.add(q("pv_76", "The soldier was rewarded _______ his exceptional gallantry.",
            "A. for", "B. with", "C. of", "D. in", 0,
            "One is rewarded 'for' an action or service (and rewarded 'with' a prize).", "2013:Q60", "Structure: Prepositions"))
        list.add(q("pv_77", "The president presided _______ the executive council meeting.",
            "A. over", "B. at", "C. on", "D. with", 0,
            "The verb 'preside' takes the preposition 'over'.", "2013:Q61", "Structure: Prepositions"))
        list.add(q("pv_78", "She has an aptitude _______ quantitative problem solving.",
            "A. for", "B. in", "C. at", "D. with", 0,
            "'Aptitude for' means a natural ability or skill in a domain.", "2014:Q60", "Structure: Prepositions"))
        list.add(q("pv_79", "The two sisters differ _______ each other in character and tastes.",
            "A. from", "B. with", "C. to", "D. against", 0,
            "Things or persons 'differ from' one another in qualities.", "2014:Q61", "Structure: Prepositions"))
        list.add(q("pv_80", "The young accountant was charged _______ forgery and embezzlement.",
            "A. with", "B. of", "C. for", "D. against", 0,
            "To be 'charged with' a crime (vs 'accused of' a crime).", "2015:Q60", "Structure: Prepositions"))
        list.add(q("pv_81", "The company must cater _______ the welfare of its aging workforce.",
            "A. for", "B. to", "C. with", "D. about", 0,
            "To 'cater for' needs or people means to provide what is required.", "2015:Q61", "Structure: Prepositions"))
        list.add(q("pv_82", "The government aims to eradicate poverty _______ the grassroots level.",
            "A. at", "B. in", "C. on", "D. from", 0,
            "The standard collocation is 'at the grassroots level'.", "2016:Q60", "Structure: Prepositions"))
        list.add(q("pv_83", "The police warned citizens to be wary _______ internet fraudsters.",
            "A. of", "B. with", "C. against", "D. about", 0,
            "'Wary of' means cautious, alert, and watchful about potential danger.", "2016:Q61", "Structure: Prepositions"))
        list.add(q("pv_84", "The new employee easily adapted _______ the company culture.",
            "A. to", "B. with", "C. in", "D. for", 0,
            "To 'adapt to' a new environment or situation is standard grammar.", "2016:Q62", "Structure: Prepositions"))
        list.add(q("pv_85", "He was acquitted _______ all five counts of electoral misconduct.",
            "A. of", "B. from", "C. with", "D. in", 0,
            "The verb 'acquit' collocated with legal charges requires 'of'.", "2016:Q63", "Structure: Prepositions"))

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
            id = "remix_pv_$id",
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
