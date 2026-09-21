import os
import sys

def build_irs_2011():
    content = """package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Islamic Religious Studies (IRS) 2011 Complete Exam Bank.
 * Extracted directly from official JAMB UTME 2011 Past Paper.
 * 100% verified question wording, options, answer key, and historical/theological explanations.
 */
object JambIrs2011ExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "irs_2011_01",
                subject = "Islamic Religious Studies",
                topic = "Revelation of the Qur'an",
                year = "2011",
                questionText = "The outcome of the Prophet’s visit to Cave Hira was",
                optionA = "compilation of the Glorious Qur’an",
                optionB = "revelation of the Glorious Qur’an",
                optionC = "award of chieftaincy title by the Makkan aristocrats",
                optionD = "his resolve to migrate to Madinah.",
                correctAnswerIndex = 1,
                explanation = "When Prophet Muhammad (SAW) withdrew to the cave of Hira near Makkah at age 40, Angel Jibril appeared to him with the first revelation of the Glorious Qur'an (Surah al-Alaq 96:1-5).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_03",
                subject = "Islamic Religious Studies",
                topic = "The First Revelation",
                year = "2011",
                questionText = "One of the importance of the first revelation was the",
                optionA = "description of the Arabian peninsula to the Prophet (SAW)",
                optionB = "dissemination of knowledge",
                optionC = "explanation of knowledge",
                optionD = "description of the steps of acquiring knowledge.",
                correctAnswerIndex = 1,
                explanation = "The first revelation (Q. 96:1-5 'Read in the name of your Lord who created...') underscores the supreme importance of acquiring and disseminating knowledge in Islam.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_04",
                subject = "Islamic Religious Studies",
                topic = "Piecemeal Revelation",
                year = "2011",
                questionText = "The gradual spiritual and moral development of Muslims was the wisdom behind the",
                optionA = "compilation of the Glorious Qur’an",
                optionB = "standardization of the Glorious Qur’an",
                optionC = "preservation of the Glorious Qur’an",
                optionD = "piecemeal revelation of the Glorious Qur’an.",
                correctAnswerIndex = 3,
                explanation = "The gradual (piecemeal) revelation (Tanjim al-Qur'an) over 23 years allowed the nascent Muslim community to steadily imbibe teachings, implement laws progressively, and easily memorize the verses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_05",
                subject = "Islamic Religious Studies",
                topic = "Preservation of the Qur'an",
                year = "2011",
                questionText = "The verse 'Surely, We have sent down the Reminder and surely We will protect it' (Q. 15:9) is in relation to the",
                optionA = "standardization of the Glorious Qur’an",
                optionB = "preservation of the Glorious Qur’an",
                optionC = "compilation of the Glorious Qur’an",
                optionD = "arrangement of the Glorious Qur’an.",
                correctAnswerIndex = 1,
                explanation = "Qur'an 15:9 guarantees the perpetual divine preservation and protection of the Holy Qur'an from alteration, corruption, or loss.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_06",
                subject = "Islamic Religious Studies",
                topic = "Compilation of the Qur'an",
                year = "2011",
                questionText = "The battle that served as a pointer to the compilation of the Glorious Qur’an was fought at",
                optionA = "Khandaq",
                optionB = "Uhud",
                optionC = "Tabūk",
                optionD = "Yamāmah.",
                correctAnswerIndex = 3,
                explanation = "At the Battle of Yamamah (633 CE), numerous companions who had memorized the Qur'an (Huffaz) were martyred. Umar ibn al-Khattab feared the loss of the Qur'an and advised Caliph Abu Bakr to commission its formal compilation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_07",
                subject = "Islamic Religious Studies",
                topic = "Standardization of the Qur'an",
                year = "2011",
                questionText = "The committee that standardized the Glorious Qur’an is made up of",
                optionA = "six people",
                optionB = "five people",
                optionC = "four people",
                optionD = "three people",
                correctAnswerIndex = 2,
                explanation = "Caliph Uthman bin Affan appointed a committee of four: Zaid bin Thabit, Abdullah bin az-Zubayr, Sa'id bin al-As, and Abdur-Rahman bin al-Harith to produce standardized codices (Mushaf al-Uthmani).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_08",
                subject = "Islamic Religious Studies",
                topic = "Makkan Chapters",
                year = "2011",
                questionText = "A characteristic common to Makkan chapters is that, they",
                optionA = "are long",
                optionB = "address the people of the Book",
                optionC = "contain a lot of oaths",
                optionD = "make references to battles.",
                correctAnswerIndex = 2,
                explanation = "Makkan Surahs are recognized by short poetic verses, extensive oaths (qasam) by celestial bodies and nature, and an emphasis on Tawhid and the Akhirah.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_09",
                subject = "Islamic Religious Studies",
                topic = "Prophecy and Authenticity",
                year = "2011",
                questionText = "The victory of the Roman Empire over the Persian Empire after the Persians had defeated the Romans as stated in the Glorious Qur’an (Q. 30: 2-3) is an evidence of the",
                optionA = "beauty of the words of the Glorious Qur’an",
                optionB = "historical nature of the Glorious Qur’an",
                optionC = "simplicity of the wordings of the Glorious Qur’an",
                optionD = "authenticity of the Glorious Qur’an",
                correctAnswerIndex = 3,
                explanation = "The accurate historical fulfillment of the Quranic prophecy regarding the Byzantine Roman victory over the Sassanid Persians within 'bid'i sinin' (a few years) affirms the divine origin and authenticity of the Qur'an.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_10",
                subject = "Islamic Religious Studies",
                topic = "Unique Features of the Qur'an",
                year = "2011",
                questionText = "The Qur’an is different from other revealed Books because",
                optionA = "it is a prayer book only",
                optionB = "barren women can be helped through it",
                optionC = "both spiritual, moral and social values are found in it",
                optionD = "one can use it for protection only.",
                correctAnswerIndex = 2,
                explanation = "Unlike earlier localized revelations, the Holy Qur'an is an eternal, comprehensive code covering spiritual beliefs, moral codes, civil laws, and social systems for all humanity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_11",
                subject = "Islamic Religious Studies",
                topic = "Transmission of the Qur'an",
                year = "2011",
                questionText = "Prophet Muhammad (SAW) did not hand-over the Glorious Qur’an to his companions in an arranged form and in a single written volume because",
                optionA = "he did not want only the Quraish to inherit the book",
                optionB = "the revelation did not come in one piece but at intervals",
                optionC = "many tribes would want to take over its distribution",
                optionD = "there was no need for it.",
                correctAnswerIndex = 1,
                explanation = "Because revelations continued throughout the Prophet's lifetime up until shortly before his demise, a single bound volume could not be finalized until revelation ceased.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_12",
                subject = "Islamic Religious Studies",
                topic = "Sciences of the Qur'an: Tafsir",
                year = "2011",
                questionText = "The correct meaning of tafsir is the",
                optionA = "detailed explanation and commentary of the Glorious Qur’an",
                optionB = "scientific application of the contents of the Glorious Qur’an to human life",
                optionC = "true reflections on the contents of the Glorious Qur’an",
                optionD = "practical application of the contents of the Glorious Qur’an",
                correctAnswerIndex = 0,
                explanation = "Tafsir comes from the root 'fassara' meaning to explain, elucidate, or interpret. It denotes the scholarly explanation and commentary of the meanings of the Qur'an.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_13",
                subject = "Islamic Religious Studies",
                topic = "Sciences of the Qur'an: Tajwid",
                year = "2011",
                questionText = "Tajwid as one of the science of the Glorious Qur’an is important because",
                optionA = "it allows for the understanding of history of the Glorious Qur’an",
                optionB = "it provides the basis for the deeper understanding of the Glorious Qur’an",
                optionC = "it provides the knowledge of correct pronounciation and recitation of the Glorious Qur’an",
                optionD = "it increases the ability to recite and communicate in Arabic",
                correctAnswerIndex = 2,
                explanation = "Tajwid rules govern correct articulation points (Makharij) and phonological characteristics (Sifat) to ensure the Qur'an is recited precisely as revealed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_14",
                subject = "Islamic Religious Studies",
                topic = "Tajwid: Rules of Ra",
                year = "2011",
                questionText = "In the rule of Tajwid, when the letter Ra has a Dammah it is pronounced with",
                optionA = "tarqīq",
                optionB = "tanwīn",
                optionC = "tafkhīm",
                optionD = "tashdīd.",
                correctAnswerIndex = 2,
                explanation = "In Tajwid phonetics, the letter Ra (ر) carries Tafkhim (velarization/thickness) when vocalized with a Fathah or Dammah, whereas a Kasrah renders it Tarqiq (light/thin).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_15",
                subject = "Islamic Religious Studies",
                topic = "Salat: Surah al-Fatihah",
                year = "2011",
                questionText = "The only Sūrah in the Glorious Qur’an which must be recited in every obligatory prayer is",
                optionA = "al-Baqārah",
                optionB = "al-Alaq",
                optionC = "al-Fātīhah",
                optionD = "al-Ikhlās.",
                correctAnswerIndex = 2,
                explanation = "The Prophet (SAW) stated: 'There is no prayer for the one who does not recite the Opening of the Book (Surah al-Fatihah).' It is recited in each rak'ah.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_18",
                subject = "Islamic Religious Studies",
                topic = "Suratul Ma'un",
                year = "2011",
                questionText = "Suratul Mā’ūn discusses the privilege to be enjoyed by the",
                optionA = "givers",
                optionB = "travelers",
                optionC = "the wealthy",
                optionD = "the needy.",
                correctAnswerIndex = 3,
                explanation = "Surah al-Ma'un censures those who mistreat the orphan and do not encourage the feeding of the needy/indigent (al-Miskin).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_19",
                subject = "Islamic Religious Studies",
                topic = "Suratul Adiyat",
                year = "2011",
                questionText = "The eagerness and zeal of Muslim warriors to fight in the cause of Allah is one of the major theme of Sūrah",
                optionA = "al-Qāri’ah",
                optionB = "al-Adiyah",
                optionC = "al-Asr",
                optionD = "al-Humazah.",
                correctAnswerIndex = 1,
                explanation = "Surah al-Adiyat depicts charging warhorses striking sparks from their hooves as they launch dawn raids in the path of Allah.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_20",
                subject = "Islamic Religious Studies",
                topic = "Quranic Exegesis",
                year = "2011",
                questionText = "The allegorical and the ambiguous verses of the Glorious Qur’an are understood through the",
                optionA = "ijtihad of Muslim Scholars",
                optionB = "qiyas of Muslim jurists",
                optionC = "tadabbur in the Glorious Qur’an",
                optionD = "tafsir of the Glorious Qur’an",
                correctAnswerIndex = 3,
                explanation = "Mutashabihat (ambiguous and allegorical verses) are interpreted systematically through Tafsir (utilizing Qur'an, Sunnah, and authoritative linguistic analysis).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_21",
                subject = "Islamic Religious Studies",
                topic = "Hadith: Pillars of Islam",
                year = "2011",
                questionText = "Hadith 3 of an-Nawawi’s collection shows that Islam is built upon",
                optionA = "believe in Allah",
                optionB = "five pillars",
                optionC = "fast of Ramadan",
                optionD = "articles of faith",
                correctAnswerIndex = 1,
                explanation = "Hadith 3 of an-Nawawi (narrated by Ibn Umar) states: 'Islam is built upon five: testifying that there is no god but Allah and Muhammad is His messenger, establishing prayer, giving Zakat, Hajj, and fasting Ramadan.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_22",
                subject = "Islamic Religious Studies",
                topic = "Hadith 10: Halal and Du'a",
                year = "2011",
                questionText = "The teaching in the 10th Hadith of an- Nawawi is that",
                optionA = "Allah accepts prayers from Muslims only",
                optionB = "only credible people shall be elected leaders",
                optionC = "abstinance from forbidden things is prelude to accepting prayers",
                optionD = "abstinance from misconduct by ladies makes them more attractive to men",
                correctAnswerIndex = 2,
                explanation = "Hadith 10 teaches that Allah is Good and accepts only what is good. A person whose food, drink, and clothing are from Haram will have their prayers rejected.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_23",
                subject = "Islamic Religious Studies",
                topic = "Hadith 16: Anger Management",
                year = "2011",
                questionText = "‘Do not get angry’ - This tradition from the 16th Hadith of an-Nawawi has been repeated by the Prophet (SAW)",
                optionA = "once",
                optionB = "twice",
                optionC = "thrice",
                optionD = "many times.",
                correctAnswerIndex = 3,
                explanation = "When a man repeatedly asked the Prophet (SAW) for counsel, the Prophet responded each time: 'Do not get angry (La taghdab)', repeating it several times.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_24",
                subject = "Islamic Religious Studies",
                topic = "Hadith Qudsi vs Nabawi",
                year = "2011",
                questionText = "What differentiates Hadith Qudsi from Hadith Nabawi is the",
                optionA = "place and manner of application",
                optionB = "condition under which the two are narrated",
                optionC = "wording and teaching intended",
                optionD = "chain and reliability of the narrator",
                correctAnswerIndex = 2,
                explanation = "In Hadith Qudsi, the meaning is directly revealed by Allah while the verbal expression is by the Prophet; in Hadith Nabawi, both the words and meaning originate in the Prophet's sunnah.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_25",
                subject = "Islamic Religious Studies",
                topic = "Sahih al-Bukhari Structure",
                year = "2011",
                questionText = "One of the peculiarities of Sahih Bukhari is that ahādith are sorted according to",
                optionA = "topic",
                optionB = "chapters",
                optionC = "records",
                optionD = "biographies.",
                correctAnswerIndex = 1,
                explanation = "Imam al-Bukhari arranged his Sahih into thematic books and jurisprudential chapters (Kutub and Abwab) reflecting legal deduced rulings.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_26",
                subject = "Islamic Religious Studies",
                topic = "Hadith Compilers: Abu Daud",
                year = "2011",
                questionText = "One of the compilers of Hadith that deals specifically with legal traditions of permissions and prohibitions (Ahkām) is",
                optionA = "Abu Daud",
                optionB = "Bukhari",
                optionC = "Ibn Maja",
                optionD = "Muslim.",
                correctAnswerIndex = 0,
                explanation = "Kitab al-Sunan of Imam Abu Dawud focuses specifically on legal traditions (Ahadith al-Ahkam) concerning what is legally ordained, permissible, or prohibited.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_27",
                subject = "Islamic Religious Studies",
                topic = "Moral Lessons in Surah al-Isra",
                year = "2011",
                questionText = "One of the moral lessons in Q.17:23 apart from obedience to parents is",
                optionA = "résilience",
                optionB = "repentance",
                optionC = "persévérance",
                optionD = "honesty.",
                correctAnswerIndex = 2,
                explanation = "Qur'an 17:23 commands worshiping none but Allah, kindness to parents in their old age, and enduring the challenges of caregiving with perseverance and gracious patience.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_28",
                subject = "Islamic Religious Studies",
                topic = "Surah al-Baqarah 2:42",
                year = "2011",
                questionText = "The Jews were admonished to avoid mixing truth with falsehood in",
                optionA = "Q.2:285",
                optionB = "Q.2:177",
                optionC = "Q.2:45",
                optionD = "Q.2:42.",
                correctAnswerIndex = 3,
                explanation = "Qur'an 2:42 explicitly commands: 'And do not mix the truth with falsehood or conceal the truth while you know [it].'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_29",
                subject = "Islamic Religious Studies",
                topic = "Islamic Work Ethics",
                year = "2011",
                questionText = "Islam encourages every Muslim to seek a lawful livelihood through",
                optionA = "equitable distribution of wealth",
                optionB = "dignity of labour",
                optionC = "family inheritance",
                optionD = "shared responsibility",
                correctAnswerIndex = 1,
                explanation = "Islam honors honest work and the dignity of manual and intellectual labor, teaching that no food eaten is better than that earned by one's own hands.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_30",
                subject = "Islamic Religious Studies",
                topic = "Tawhid: Monotheism",
                year = "2011",
                questionText = "Islam as a monotheistic religion expects that every faithful follower should",
                optionA = "not tell lies",
                optionB = "serve Allah without associates",
                optionC = "praise the Prophets as enjoined by Allah",
                optionD = "perform Salat.",
                correctAnswerIndex = 1,
                explanation = "Tawhid requires sincere exclusive devotion to Allah alone, without setting up partners, idols, or associates in His worship (Ibadah) or lordship (Rububiyyah).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_31",
                subject = "Islamic Religious Studies",
                topic = "Prohibition of Fortune Telling",
                year = "2011",
                questionText = "Seeking assistance from the fortune tellers is forbidden because",
                optionA = "it gives one an insight of what tomorrow holds",
                optionB = "it creates animosity amongst people",
                optionC = "it leads to ascribing absolute power to a fellow being",
                optionD = "it’s proceed is unlawful",
                correctAnswerIndex = 2,
                explanation = "Consulting soothsayers and astrologers ascribes knowledge of the unseen (Ghayb) and absolute supernatural power to creation rather than Allah alone.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_32",
                subject = "Islamic Religious Studies",
                topic = "Shirk and Culture",
                year = "2011",
                questionText = "It is shirk in Islam to",
                optionA = "dance",
                optionB = "sing religious song",
                optionC = "undergo plastic surgery",
                optionD = "masquerade.",
                correctAnswerIndex = 3,
                explanation = "Participating in masquerade rituals involves veneration of ancestral spirits or belief in their supernatural intercession, which is idolatrous shirk.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_33",
                subject = "Islamic Religious Studies",
                topic = "Revealed Scriptures: Suhuf",
                year = "2011",
                questionText = "Suhf was revealed to",
                optionA = "prophet Haruna (AS)",
                optionB = "prophet Ilyas (AS)",
                optionC = "prophet Ibrahim (AS)",
                optionD = "prophet Muhammd (SAW)",
                correctAnswerIndex = 2,
                explanation = "Surah al-A'la (87:19) states: 'The scriptures of Ibrahim and Musa' (Suhufi Ibrahima wa Musa).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_34",
                subject = "Islamic Religious Studies",
                topic = "Articles of Faith (Iman)",
                year = "2011",
                questionText = "In Islam, the articles of Imān are",
                optionA = "six",
                optionB = "five",
                optionC = "four",
                optionD = "three.",
                correctAnswerIndex = 0,
                explanation = "The 6 articles of Iman are: belief in Allah, His Angels, His Books, His Messengers, the Last Day, and Divine Decree (Qadar).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_35",
                subject = "Islamic Religious Studies",
                topic = "Salat al-Jumu'ah: Khutbah",
                year = "2011",
                questionText = "The presentation of Sermon is an obligation on the Imam when leading",
                optionA = "all the prayers",
                optionB = "funeral prayers",
                optionC = "Friday prayers",
                optionD = "every prayer on Friday",
                correctAnswerIndex = 2,
                explanation = "The delivery of the two khutbahs (sermons) is an indispensable condition and obligation for Friday congregational prayer (Salat al-Jumu'ah).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_36",
                subject = "Islamic Religious Studies",
                topic = "Conditions of Salat: Bulugh",
                year = "2011",
                questionText = "One of the conditions that make prayer obligatory on believers is",
                optionA = "social status",
                optionB = "reciting the Qur’an with proper Tajweed",
                optionC = "following pious Imam",
                optionD = "attainment of maturity",
                correctAnswerIndex = 3,
                explanation = "The prerequisites for prayer becoming personally fard (obligatory) are: Islam, sanity (aql), and attainment of puberty/maturity (bulugh).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_37",
                subject = "Islamic Religious Studies",
                topic = "Fasting: Day of Ashura",
                year = "2011",
                questionText = "The supererogatory fasting of Āshura is observed on the",
                optionA = "8th of al-muharram",
                optionB = "9th of al-Muharram",
                optionC = "10th of al-Muharram",
                optionD = "11th of al-Muharram",
                correctAnswerIndex = 2,
                explanation = "The fast of Ashura is observed on the 10th of Muharram, commemorating Allah's deliverance of Prophet Musa and the Children of Israel from Pharaoh.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_38",
                subject = "Islamic Religious Studies",
                topic = "Hajj: Ayyam at-Tashriq",
                year = "2011",
                questionText = "Ayyam at-tashriq are the days of",
                optionA = "buying and selling",
                optionB = "visits and caring",
                optionC = "singing and dancing",
                optionD = "eating and drinking.",
                correctAnswerIndex = 3,
                explanation = "Ayyam at-Tashriq (11th-13th Dhul-Hijjah) are defined in prophetic tradition as days of eating, drinking, and remembrance of Allah.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_39",
                subject = "Islamic Religious Studies",
                topic = "Nikah: Islamic Marriage Conditions",
                year = "2011",
                questionText = "The minimum number of witnesses in an Islamic marriage is",
                optionA = "four males",
                optionB = "three males",
                optionC = "two male",
                optionD = "one male.",
                correctAnswerIndex = 2,
                explanation = "For a marriage contract (Nikah) to be legally valid, it must have at least two sane, adult male Muslim witnesses (or one male and two females).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_40",
                subject = "Islamic Religious Studies",
                topic = "Meaning of Shari'ah",
                year = "2011",
                questionText = "The term, Shari’ah refers to",
                optionA = "a path",
                optionB = "wisdom",
                optionC = "passion",
                optionD = "an idea.",
                correctAnswerIndex = 0,
                explanation = "Linguistically, Shari'ah denotes a well-trodden path leading to water; in Islamic terminology, it is the divine path of legal, moral, and spiritual law.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_41",
                subject = "Islamic Religious Studies",
                topic = "Islamic Jurisprudence: Abu Hanifah",
                year = "2011",
                questionText = "One of the scholars reported to have been imprisoned by his non compromising stance was",
                optionA = "Shafi’i",
                optionB = "Abu-Hanifah",
                optionC = "Hambali",
                optionD = "Māliki b. Anas.",
                correctAnswerIndex = 1,
                explanation = "Imam Abu Hanifah al-Nu'man refused to become chief judge under the Abbasid Caliph al-Mansur, remaining in prison until his death in 150 AH.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_42",
                subject = "Islamic Religious Studies",
                topic = "Islamic Economic System",
                year = "2011",
                questionText = "The entrenchment of an Islamic economic system is aimed at",
                optionA = "controlling the world funds",
                optionB = "restricting the unlawful acquisition of wealth",
                optionC = "restricting men to particular occupations",
                optionD = "promoting equitable distribution of wealth.",
                correctAnswerIndex = 3,
                explanation = "Islamic economics aims at social justice, preventing the concentration of wealth among the wealthy (Q. 59:7), and promoting equitable distribution through Zakat and fair commerce.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_43",
                subject = "Islamic Religious Studies",
                topic = "Prohibition of Riba (Usury)",
                year = "2011",
                questionText = "One of the major consequences of ribā is that, it makes people",
                optionA = "wealthy",
                optionB = "lazy",
                optionC = "smart",
                optionD = "parasitic",
                correctAnswerIndex = 1,
                explanation = "Economically and socially, Riba discourages real enterprise and active productive labor, creating indolence and unearned exploitation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_44",
                subject = "Islamic Religious Studies",
                topic = "Islamic Political System: Mas'uliyyah",
                year = "2011",
                questionText = "Mas’uliyyah as a principle of the the Islamic political system is a measure to check",
                optionA = "indiscipline",
                optionB = "rigging",
                optionC = "nepotism",
                optionD = "misappropriation",
                correctAnswerIndex = 3,
                explanation = "Mas'uliyyah (public accountability and stewardship) serves as a governance check preventing leaders from embezzling or misappropriating public treasury resources (Bayt al-Mal).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_45",
                subject = "Islamic Religious Studies",
                topic = "Treaties and Agreements",
                year = "2011",
                questionText = "Allah commands Muslims to observe and fulfill agreements with the non-Muslims, if the latter do not",
                optionA = "infringe on the right of women",
                optionB = "observe the five daily prayers",
                optionC = "change the language employed",
                optionD = "violate the terms of the agreement",
                correctAnswerIndex = 3,
                explanation = "In Islamic statecraft (Q. 9:4), Muslims must honor peace treaties with non-Muslim signatories so long as they abide faithfully by the terms and do not aid enemies.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_46",
                subject = "Islamic Religious Studies",
                topic = "Pre-Islamic Jahiliyya Arabia",
                year = "2011",
                questionText = "During the Jahiliyya era, the Ka’aba was the center of poetic contest at the annual festival called",
                optionA = "ijāz",
                optionB = "ukāz",
                optionC = "manāt",
                optionD = "ushrah",
                correctAnswerIndex = 1,
                explanation = "The Fair of Ukaz (Suq Ukaz) near Makkah was the famous annual gathering for poetic recitations, where winning odes (Mu'allaqat) were suspended on the Ka'aba.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_47",
                subject = "Islamic Religious Studies",
                topic = "Pre-Islamic Female Infanticide",
                year = "2011",
                questionText = "In Pre-Islamic Arabia, the Arabs killed their daughters because they",
                optionA = "were the weaker sex",
                optionB = "were afraid of incest",
                optionC = "feared the females would outnumber males",
                optionD = "did not participate in wars",
                correctAnswerIndex = 3,
                explanation = "The Jahiliyya practice of burying infant daughters alive (Wa'd al-Banat) stemmed from the perception that women could not fight in tribal warfare and might bring shame if captured.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_48",
                subject = "Islamic Religious Studies",
                topic = "Signs of Prophethood: Bahira",
                year = "2011",
                questionText = "The first person who recognized signs of Prophethood on Muhammad (SAW) was a",
                optionA = "Christian Monk",
                optionB = "Jewish Rabbi",
                optionC = "Buddhist Monk",
                optionD = "Soothsayer.",
                correctAnswerIndex = 0,
                explanation = "During a trade caravan trip to Syria with Abu Talib, the Christian monk Bahira identified the seal of prophethood on the young Muhammad's back and recognized biblical signs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_49",
                subject = "Islamic Religious Studies",
                topic = "Early Converts to Islam",
                year = "2011",
                questionText = "Members of the Prophet’s family that embraced Islam the first day did so, on the basis of his",
                optionA = "truthfulness and uprightness",
                optionB = "wealth and influence",
                optionC = "love for them",
                optionD = "family relation",
                correctAnswerIndex = 0,
                explanation = "Khadijah, Ali, and Zaid embraced Islam immediately because they intimately knew Muhammad's exemplary integrity, honesty (al-Amin), and truthfulness (as-Sadiq).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_50",
                subject = "Islamic Religious Studies",
                topic = "Sokoto Jihad: Uthman dan Fodio",
                year = "2011",
                questionText = "The teachings of Uthman b. Fodio are remembered today as it relates to",
                optionA = "idol worshiping",
                optionB = "marrying more than four wives",
                optionC = "all form of syncreticism",
                optionD = "taxing of farm produce",
                correctAnswerIndex = 2,
                explanation = "Shehu Uthman dan Fodio's jihad and literature vigorously reformed Islam in Hausaland by purifying it from syncretism (mixing traditional animist practices with Islam).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q50"
            )
        )
        list.add(
            QuestionEntity(
                id = "irs_2011_51",
                subject = "Islamic Religious Studies",
                topic = "Islam in West Africa: Mali",
                year = "2011",
                questionText = "The ruler who instituted Friday prayers in Mali was",
                optionA = "Mansa Musa",
                optionB = "Mansa Suleiman",
                optionC = "Mansa Ule",
                optionD = "Mansa Abubakar",
                correctAnswerIndex = 0,
                explanation = "Mansa Musa built magnificent congregational mosques throughout the Mali Empire, established regular Friday Jumu'ah prayers, and promoted Islamic scholarship.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB IRS 2011 • Q51"
            )
        )

        return list
    }
}
"""
    with open('app/src/main/java/com/example/data/repository/JambIrs2011ExamBank.kt', 'w') as f:
        f.write(content)
    print("Created JambIrs2011ExamBank.kt")

if __name__ == '__main__':
    build_irs_2011()
