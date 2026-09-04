package com.example.data.repository

data class LifeChangerChapter(
    val chapterNumber: Int,
    val title: String,
    val summary: String,
    val keyQuotes: List<String>,
    val fullText: String
)

data class LiteraryDeviceItem(
    val category: String,
    val deviceName: String,
    val example: String,
    val contextAndAnalysis: String
)

data class CharacterProfile(
    val name: String,
    val role: String,
    val traits: List<String>,
    val description: String,
    val keyMoments: String
)

data class NovelThemeItem(
    val title: String,
    val description: String,
    val occurrencesInNovel: String,
    val utmeTakeaway: String
)

data class LifeChangerQuizQuestion(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

object TheLifeChangerCompleteBook {

    val title = "The Life Changer"
    val author = "Khadijat Abubakar Jalli"
    val publisher = "Academy Press Plc. Lagos (2020)"
    val dedication = "For my beloved children: Zahra, Najwa, Basma, Sadiq and Farha"
    val aboutTheBook = """
The Life Changer is a debut novel that changes the narrative of life on campus. Laced with underlining optimism, this book upholds the tenets of hope and redemption in the life of our youth. This is Khadijat Abubakar Jalli's first publication and she seems to be saying that the female voice is making a rebound on the parapet of African literary scene. The story follows the escapades of Salma and her roommates in the University as they swim in the turbulent and seamy tides of academia.

About the Author:
Khadijat Abubakar Jalli holds a B.Sc (Ed) in Mathematics. She is an entrepreneur and the CEO of She's Boutique Afrique. Khadijat Abubakar Jalli is married with children.
    """.trimIndent()

    val chapters: List<LifeChangerChapter> = listOf(
        LifeChangerChapter(
            chapterNumber = 1,
            title = "Chapter One: The French Encounter & Omar's Admission",
            summary = "The story begins in the family compound where Ummi's children (Omar, Teemah, Jamila, and five-year-old Bint) are waiting for their father under a mango tree. Bint recounts how she intelligently outsmarted her social studies teacher, Mallam Salihu, during a French lesson on 'Bonjour' and 'C'est tres bien'. Soon, Omar arrives in high spirits with his JAMB admission letter to study Law at the Kongo Campus of Ahmadu Bello University (ABU), Zaria. The family celebrates and discusses how university admission is a true 'life changer'.",
            keyQuotes = listOf(
                "\"What you teach a child is like writing on a rock and when dried, it would be difficult to erase.\"",
                "\"Education is a life changer... it changes your life and it also changes you.\"",
                "\"In the school we call each other My Learned Colleague. So you call me My Learned Brother!\""
            ),
            fullText = """
They were waiting for Daddy.
We were.
I paused outside their door.
The laughter was cheerful. It was also infectious. It began as a silent chuckle, then slowly it turned into a mirthful but stilted giggle. Now, it had finally transformed into a full fledged chortle. I stopped awhile to listen. My plan was not to eavesdrop. God forbid that I should be that kind of mother who surreptitiously listened on her children's private conversation. But there was something about the laughter that was compelling and arresting.

Bint, my five year old daughter, appeared to be the narrative voice. She was telling her two sisters the story of her classroom encounter with their meddlesome Social Studies teacher the previous week. The narration was so vivid you could actually visualize what transpired. The teacher believed he knew a little bit about every subject under the sun, especially French which most of the students found strange. Bint herself was new in the school. French was an optional subject even at this level of primary school education. We however encouraged her to take the option since we believed that language acquisition at an early age came relatively easy and with minimal effort. And, in any case, French was second to English in the ranking of international languages, we reckoned.

So it was that the first question the teacher asked was, "Who can tell me how to say Good Morning in French?"
Everybody was silent in the classroom.
"You mean none of you knows how to say Good Morning in French?"
Hesitatingly, not without trepidation, Bint raised her hand.
"Yes?" he pointed at her.
Slowly, she stood up.
"What is your name?" the teacher asked.
"My name is Bint."
"So, tell us, Bint, how do you say Good Morning in French?"
"Bonjour," Bint said.
"That's very good," the teacher said, speaking English.
"And how do you say that's very good in French, teacher?" Bint asked innocently.
"What?" The teacher jerked his head off as if stung by a bee. Then, within a flash, he bolted out of the classroom only to come back a few minutes later with the French Mistress of the senior classes.
"Ask her," he told Bint simply.
"How do you say that's very good in French, Aunty?" Bint asked reverentially.
"C'est tres bien," the French Mistress replied.
"C'est tres bien," Bint repeated confidently.
The class began clapping and laughing at the same time. The class teacher followed the French Mistress out and didn't come back till after the break.

Meanwhile the whole class as one surrounded Bint and started clapping and singing going round her in cheer and joy. They seemed to have known instinctively that Bint was destined for bigger things. Who else but a genius would ask a question the teacher could not answer?
"I got them. I really got them," Bint was saying excitedly to her siblings.

I found myself laughing silently. Before I got carried away, I let myself unobtrusively into the room.
They were used to my impromptu barging. One reason I used to go in unannounced was to keep them on their toes where issues of personal hygiene were concerned. The second reason was that we were used to keeping each other company. These formed the rationale for my periodic checking of their room - to ensure that they learned the basic norms of maintaining the cleanliness of their room at an early age and to get used to my presence. My own grandmother used to tell us when we were young that what you teach a child is like writing on a rock and when dried, it would be difficult to erase. I seldom miss an opportunity to make them see the lesson in an experience. They learned to respect my opinion over most of their matters and I tried not to be unnecessarily didactic when it came to correction or giving instructions. This cemented our mutual trust.

"I am so proud of you, Bint," I said as I wedged myself between Bint and Jamila, her immediate elder sister. They were all seated by the edge of the bed and looked up at me as if my intrusion had all along been anticipated.
"Thank you, mummy." Bint said as she nestled even closer to me. She was my last child and consequently the darling of the entire family. My first child was Omar. He was the first child and only male. Between Omar and Bint there is such great affinity that no one dared frown at her intransigence, no matter how great, if he was around.

And all of them called me mummy. They didn't call me Mama, a title every child in my community used for their mother. They couldn't call me Ummi, which was my name at home, which incidentally also meant mummy. It actually translated to My Mother in Arabic, because I was named after my paternal grandmother. So I was Ummi to everybody else, and Mummy to my children and their friends. Except Omar who insisted on calling me Mum. I was never particular about how I was addressed. What I always insisted was respect for each other, and for one another.

"Listen, young girls, all Mallam Salihu was trying to do was to practice his small French thereby trying to perfect it. You should give him a break. Moreover, he is humble enough to accept that he does not know. Another teacher would frown his face and tell you au revoir means welcome whether you like it or not. Your knowledge to the contrary would mean nothing to him."
"But au revoir means 'goodbye until we meet again', mummy." Bint was quick to point out.
"I know my dear, but if the teacher is angry he can tell you any word means whatever he wants it to mean."
"That would not be fair."
"It is also not fair to push your teachers beyond what they know."
"They are the ones who act as if they know everything, mummy."

When our conversation got that animated, my children seemed to forget that I was also a teacher. I never bothered reminding them. The spontaneity of the discussion was what made it interesting. And if you attempted to interrupt, you would destroy the flow of the discussion.
Teemah, my second child, opened her mouth to say something and paused.
Just then, there was this loud knock on the door.
Before he was asked to come in, Omar pushed open the door and jumped on me.
"I made it, mum, I made it!"
His sisters all stood up as one and began asking, "What did you make?"
"I made it to the university, dears. Bint, your big brother is a university student."
They screamed and shouted and ululated.

The news came as a pleasant surprise to them. And especially to me. Nobody knew where Omar was going when he left home earlier that morning. To say the truth, he was looking rather anxious when he came to greet me in the morning. He was dressed in blue jeans and white shirt. His skin cut hair style contrasted beautifully with his side burns which he kept clean and trim. He had always been a precocious child. To look at him, you would think he was well into his twenties. But Omar was just eighteen. My singular thrill with Omar was that he was always decently dressed and clean. This pleased me beyond measure.

Now, I was even more pleased when he thrust the admission letter from Joint Admissions and Matriculation Board to me. The Board was popularly known by its acronym, JAMB. Indeed, even at my time it was not inconceivable that there were some undergraduate students who never knew what the acronym stood for. Let alone now. Anyhow, I took the letter and read it. My son was given admission to study Law at the Kongo Campus of Ahmadu Bello University, Zaria.

This was exhilarating. This was all his father dreamt of. My husband had wanted to read Law himself but providence dictated he read accounting.
"Big Bros, what course did they give you?" Teemah, my first daughter, and therefore Omar's immediate younger sister asked.
"Look here, young lady, call me with respect. To you, and everybody in this house, except mum and dad of course, all of you should now call me My Learned Brother. In the school we call each other My Learned Colleague. So, since you are not my colleagues you call me My Learned Brother!"
"Indeed! This is called running before learning to crawl!" Teemah laughed.
"Can you hear yourself?" Jamila said to her brother.
"Just call yourself Omar Esquire," Teemah said.
"Mum, your daughters are plain jealous."
"Indeed," Teemah managed to muster all the affectionate sarcasm in that single word.
"Big Bros, congratulations," Bint said, turning to her brother to give him a hug.
"Thank you, my dear. For you there is an exception. Call me whatever you want. But those belligerent sisters of yours... let me just catch them calling my name anyhow. We will take them to court."
They all burst into laughter.

"Wow, I am really so happy for you. Let your father come home. There would be a grand celebration today," I said tactlessly.
I knew my utterance was tactless because as soon as I said that, my face was besieged by eight expectant ears, all wanting to know what I had in mind and how the celebration was going to be and when.
"First, let us wait for your father's return. He closes at five o'clock in the evening and arrives home later. You know that his is the only bank in this community."
"It's okay, mum. But tell your children, especially that blabbermouth called Teemah, that nobody should tell Dad about this admission before me," Omar said.
"Why is that?" I asked.
"He promised to upgrade my torchlight phone to a smart android phone."
"That's not true, mum," Teemah said. "There's no way Daddy would promise him smart phone while he leaves us with this torch light phone!"
Teemah's protest elicited such laughter that for a moment I forgot what the bickering was about.
"Mum, you see plain jealousy. Envy. That's what's stopping Teemah from growing tall."

I allowed them to chastise one another a while before ruling that whatever their father's decision would be, either on the celebration or on the purported phone purchase, would have to wait till the owner of the house arrived.
"All I asked is that nobody should rush to tell him before hand," Omar repeated his request.
"Okay," I said. "Nobody would be the one to tell him first. As soon as he arrives, you would go and tell him the good news yourself."
"Thank you, mum."
"You are welcome, Omar."

The room was getting stuffy because we did not turn on the fan. What was I saying? We did not have light for two days now and the generator was in need of repairs.
"Let's go outside and sit under the mango tree in the courtyard," Jamila said, wrenching the words out of my mouth, "it is very hot in here."
We trooped out and went to the courtyard. White plastic chairs were already there and Bint and Jamila began dusting them with an old piece of clothing.

*******

"Mummy?"
"Yes, Bint. What is it?"
"I want to drink zobo."
"I can buy that for everybody," Omar said. "Teemah, bring five bottles of zobo."
"Bring the money first."
Omar turned to look balefully at me. "You see, mum. Teemah does not even trust me."
I just sat there smiling.
"When it comes to money, Omar," Teemah said, "do you, even you, do you trust yourself?"
"I sure do."
"How many times did you take my zobo without paying?"
"That was different. I was not an undergraduate then. Now, you are talking to a potential lawyer. See, young girl? You'd better watch it. You could be in trouble one day and your only brother here would be called upon to defend you. I would remind you of this day, believe me."
"Teemah, go and get the zobo," I said, "I would pay."
"Thank you, mum."

By this time Bint and Jamila were done cleaning the chairs. We sat as close to each other as the white plastic chairs would allow and waited for Teemah to bring the zobo. There was a very joyous atmosphere in the air and nobody wanted to spoil it.
Then all of a sudden Bint said, "Mummy, tell us a story?"
Before I could answer, Teemah was back with five bottles of zobo on a plastic tray and squatted to serve us. That got me thinking. Bint wanted me to tell them a story. But it was a different story that came to my mind. Omar was going to a new environment. Until now, he had been ensconced in this Lafayette community of ours. He was going to town. The university was a civilized community, different from ours. And with so much freedom one didn't know what to do with it. Maybe I should tell them about my experiences in the university.

"You see, mum," Omar told me even as his siblings listened. "There is always a silver lining in the cloud. After I passed SSCE examinations, by no means a small feat, even if I am saying it..."
"What do you mean by that immodest remark? By no means a small feat! Well done William Shakespeare." That was Teemah, always looking for her brother's trouble, as they say.
"Mum, tell this big mouth to stop interrupting a lawyer when he is speaking." Then he turned to address Teemah herself. "Don't you know how many of my colleagues had their exams sat for? Don't you know how many parents paid big money to these so called Miracle Centres where no candidate fails their exams? Don't you think I have a right to boast of my achievement when I scored seven credits including English and Mathematics at the very first attempt in my WAEC examination? It is by no means a small feat, my dear sister."

Teemah sensed Omar was slightly hurt. She stopped taunting him. And he went on with his story.
"After the WAEC results were out, we purchased the JAMB form, filled it online and submitted. While people were running helter-skelter from one school to another looking for whom to assist them with their children's admission, I prayed that I should pass the matriculation exams well. I scored two hundred and thirty out of four hundred."
"We know that too. And we never slept the day the result was announced." That was from Jamila.
Omar ignored her.
"Two days ago my friends called and advised me to check the admission online," he paused to look empathically at me. I braced up, knowing what was coming.
"Mum, you see why smart phones are important? Most of my friends knew of their admissions from the comfort of their bedrooms by simply browsing on their phones. Me? I had to wait two days. So let Daddy know that. Anyhow, it was worth the wait. I went to the internet café today to check on my admission status and found my name among the successful candidates. The experience was really thrilling."

"It is okay, my son," I said. "We would see about that phone when Daddy comes back."
"Meanwhile, do you know the implication of this admission in your life?"
"Sure. It means I have arrived. It means I am at one with members of the intelligentsia."
I smiled at my son's naivety. Just an admission letter and he had already become a member of the intelligentsia. The young, mhm.
"Listen, my son. This admission is a life changer for you."
"Life changer?"
"Yes."
"What does that mean, Mum?"
"It means it changes your life" Teemah said.
"It means more than that, my dear. It means it also changes you."
"How can it change me?"
"Well, I may not be able to categorically tell you how it can change you. But I know how my admission changed me."
"How, mum?"
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 2,
            title = "Chapter Two: Registration, Salma & Dr. Samuel Johnson",
            summary = "Ummi recounts her entry into the university twenty years ago. She describes the freedom of dress on campus compared to secondary school uniforms. At the faculty registration queue, she encounters Salma Mohammed—a haughty, provocative girl who belittles university lecturers and claims they are just like bribe-seeking policemen. Ironically, the young man Salma attempts to bribe in queue turns out to be the screening lecturer. Later, Ummi visits her HOD, Dr. Samuel Johnson (Dr. Samjohn), where awkward misunderstandings occur. At home, Ummi discovers Dr. Samjohn is her husband's close friend who assisted her admission.",
            keyQuotes = listOf(
                "\"Money moves mountains,\" Salma said.",
                "\"You don't know these lecturers as I do... With lecturers you do not even know where you stand. As a boy they would ask you for money; as a girl they would ask you for a date.\"",
                "\"Actually, he was the one who assisted me with your admission.\""
            ),
            fullText = """
It was a bright sunny day and all the people of Lafayette were happy that their daughter, Ummi, was going to the university. That was more than twenty years ago. My father agreed on the condition that I got married before I graduated. That was another story. My husband, your father, agreed we should marry even before I went for my registration. So for me and members of the community, it was double celebration of sorts.

I didn't know how right my husband was until I set foot into the university. The first thing that struck me was the carefree attitude of the people there. Everybody was going about their business without apparent care in the world. What was even more striking was that it was difficult to tell who was a student and who was a teacher. In mean, in my secondary school we all had uniforms as students. Only the teachers were allowed to come in their private dresses.
"Wait, mum. You mean I would not be required to wear uniforms again."
"Sadly, not for you, my learned friend. You people at the Faculty of Law have what they call dress code which comprises black trousers, white shirts and black neckties for boys and ditto for girls except that in place of trousers, the girls wear skirts. But even that is during classes only."
"It is not so bad after all."
"No, it isn't. And, really, it makes you kind of stand out of the crowd. It makes you special in a sense."

"Salma was a fair complexioned girl, tall, slim and rather busty. That last was obvious to see even to some of us who were recently married. The tight-fitting clothes she wore made you wonder how long it took her to wiggle herself into them. She had on very dark sunshades which accentuated her formidable appearance. The young men around were openly ogling her while the few of us ladies belonging to the old school even then, pretended not to notice her.
We were at the Faculty registration office. The lecturer in charge had taken ages to come and when he did he was taking eternity to start. No one entered the office after him and we stood in the queue for like an hour without movement.

This Salma of a girl had come barely fifteen minutes and she was all over the place grumbling about the ineptitude of the registration officers, the so called university lecturers. "They are, all of them, inconsiderate," she declared. "They are so heartless it is hard to imagine they have children at home."
She was last on the queue but would not stay at her place. One young man addressed her politely and said, "Young lady, some of these people have been here for far longer than you have been and are patient enough to wait for the lecturer to get ready so they could all proceed to the next level of the registration exercise."
"You don't know these people as I do," Salma said. "If you wait here that is how they would keep you till dusk doing nothing. They have nothing to do but to frustrate you. They are like the policeman at the checkpoint. If they stop you with unnecessary queries, it is not so much because they want bribe, this is a given, but sometimes they want to delay you as long as possible to keep them company till the next vehicle arrives. It can be so lonely manning the road as a policeman."

"You mean there is no difference between your lecturers and the policemen on the road?" the young man asked.
"They are all the same. In fact you are better off with the policeman because at once you know where you are with him. Whether you are right or wrong, just grease his palms and he would allow you to pass. With lecturers you do not even know where you stand. As a boy they would ask you for money; as a girl they would ask you for a date."
"Just like that?"
"What do you mean just like that? Of course, it is in return for a favour desired. Like the monkey in this office, whoever he is... I mean, you cannot just leave people standing on the queue while you are inside doing nothing. So if I have the opportunity, I would just go in, give him two or three thousand naira to pocket and he would attend to me."
"You are sure about that, my dear?"
"Sure. But why are you asking me so many questions?" Salma removed her sunshades and looked intently at the young man interrogating her.
"I just find your allegation a trifle sweeping. Too general, if you ask me."
"You don't know these lecturers as I do. This is not my first university, you know."
"I can imagine," the man said.
"Just now, you were saying if we allow you to go in you could influence the man to get the registration process started?"
"Yes, please. Money moves mountains," Salma said.
"I thought it was faith, in the original."
"Never mind," Salma said, putting her glasses back on.
The man cleared his throat and addressed us, "Ladies and gentlemen, can we please allow this... What is your name?" He turned to Salma.
"Salma Mohammed."
"Ladies and gentlemen, can we please allow Salma Mohammed here to precede us to see the lecturer so that the registration can get started?"
"Yes." We all answered in unison.

Just then, the lecturer's door opened and the man inside came out with a wet duster in his hand. He turned and locked the office.
We all kept quiet. Baffled.
"The office is ready now, sir," the man said, turning to address no other person than the young man who had been engaging Salma in conversation.
I did not understand what was happening at first. No one did. Meanwhile, Salma had removed her glasses for the second time and was looking at the young man strangely. Speechlessly.
Comprehension dawned on us almost at once. Everybody kept quiet. The man with the duster stretched out his hand and gave the young man the office key.
"Thank you, John," the young man said.
"Is there anything more you want me to do, sir?"
"No, John. Just try to be faster with the cleaning job. It is not good to keep our new students waiting, you know."
"I am sorry, sir. I am sorry, my dear students." John turned and hurriedly walked away from the scene.
All eyes were now on the young lecturer who had all along been staying with us and was enduring what we were going through as his office was being cleaned. As for Salma, she just stood there shivering like some rain drenched chicken.
The man calmly walked by us, opened his office and before he entered said, "Please be orderly. We would soon be done with the screening exercise. Maintain the first come, first served order. Thank you." He disappeared into the office. All eyes now turned to Salma. She was suddenly bereft of words. She was fidgeting and was busy looking at the design of her shoes all the remaining period till my turn came and I entered to be screened.

*******

I went in and was shocked to find that the HOD here was also a very young person. He sat resplendent behind his mighty desk and was scribbling away on some paper as I entered.
He stopped writing and looked up. I saw at once that he had tribal marks which were rare in these times. They betrayed his ancestral origin. He was obviously an Igala person or Yoruba. I had no doubt about that. The crucifix dangling across his chest from the necklace he wore told me his religious inclination. I was instantly filled with apprehension without knowing why.
"Yes, young lady, what can I do for you?" he asked.
"I am a new student, sir. I came for my matric number." I was still standing.
"Sit down, my dear."
I sat down. I know that I would always pass a test on etiquette. You are in a person's office, you never sit down even if there are a hundred other unoccupied seats until you are invited to sit. For some reason, I found his endearing salutation slightly discomforting. You do not just go about calling everybody your dear. Unless he meant something. I was immediately on my guard.

The name pennon on his desk said simply, SAMUEL JOHNSON, PhD.
"You are among the first to report for registration," he said.
"Yes, sir." I responded, wishing he would just assign me my number and get done with it.
"What is your name?" he asked as he pulled a file towards himself. We were still analogue then.
"My name is Ummi Ahmad," I said.
He nodded into his file then casually asked me if I needed something to drink.
"No, thank you sir," I said rather too quickly.
Suddenly the office was becoming oppressive. I developed an instant, irrepressible feeling of claustrophobia. Why would your Head of Department offer you a drink just because you went for registration? This was how it got started. I decided to tell him I was married but I quickly changed my mind. One thing I learnt in life is never to volunteer information unless specifically asked.
"You look beautiful and decent in your attire," he said as he stood up to come and sit on the sofa near the visitor's chair, where I was seated.
This was too much, I thought. Why would he be trying to make conversation with me when all I wanted was the matric number? Suddenly the image of Salma loomed over my face. I could hear her saying all lecturers are the same. If you are a boy they ask you for money, and if you are a girl they ask you for a date.

"Our students should emulate your style of dressing. I hope you are as intelligent upstairs as you are decent in appearance. You are better than I imagined."
"Sir, please can I have my matric number now? I am pressed." That last was a lie. I just wanted him to let me go. His response shocked me.
"No problem, my dear, you can use my toilet."
"No, sir. It is not allowed,"
"Who disallowed it? This is my office, remember?"
"Unless of course if you were not pressed in the first place."
"No, I was...I am. Ok. Thank you, sir." I was totally confused. I knew it was improper what I said. And now I was committed.
He stood up and went and sat behind his desk, perchance to give me room to manoeuvre and enter the toilet. I mustered enough courage and entered the toilet.
I came out a few moments later after flushing the toilet. It made a satisfactory gurgling noise which to my ear convinced the man that I must have discharged something. Still the feeling was uncomfortable.

"Here is your matric number," he said, as if reading my thoughts. "You are UG0001. I pray as you are the first here, you would be the first in everything."
"Thank you," I said almost rudely and made my way out of the office.

When he returned, I waited for him to eat and rest and I was about to start narrating the story of my first day in the university when he said, "You just can't be too sure with people these days."
"What is his name?" my husband asked.
"Is it Dr. Samuel Johnson?"
I was shocked. "Yes," I said, simply.
"Is his face scarified? I mean, does he have tribal marks on his face?"
"Yes, he has. He looks like an Igala or a Yoruba man. Do you know him?"
My husband doubled up in feats of laughter, he almost fell out of his chair. Then he got hold of himself and affected a seriousness which I knew he did not feel and looked almost pitifully at me.
"He is Yoruba," he said. "That is Dr. Samjohn, alright. He is my friend."
I stared open-mouthed at my husband.
He saw the surprise on my face and added, "Actually, he was the one who assisted me with your admission."
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 3,
            title = "Chapter Three: The Story of the Quiet One (Talle)",
            summary = "Ummi recounts the story of Talle ('The Quiet One') from her hometown of Lafayette. Born after his parents sought fertility remedies from a traditional herbalist (boka), Talle grew up exceptionally quiet, pious, and reserved, working as a Local Government driver. However, when grocers notice Talle buying double rations of food, suspicions arise. The District Head (Hakimi) summons him. Suddenly, armed police vans arrive with Zaki in chains. It is revealed that Talle harbored a kidnapped 13-year-old boy in his home for ransom. Talle and Zaki are sentenced to hard labor. Ummi uses this to warn Omar that appearances can be deceptive and to never trust blindly.",
            keyQuotes = listOf(
                "\"Never judge a book by its cover. And you must learn to trust sparingly.\"",
                "\"Inna lillahi wa inna ilaihir raji'un — from Allah we came and unto him is our returning.\"",
                "\"The silence of the quiet one was not a virtue. He had better speak.\""
            ),
            fullText = """
There was a long interminable silence in my narration. I could sense my children wanted to ask a thousand and one questions. But each and every one of them was lost in their own thoughts. In fact their silence reminded me of my own silence twenty years ago when my husband made that revelation.

"Mum, what about the quiet one?" Omar asked.
"The quiet one? Oh, the story my husband told me about our neighbour?"
"Yes, mummy let's hear that one." All my girls seemed eager to hear that story.
I stood up to let the blood circulate to my lower limbs then resumed my seat and recounted to them the story of the quiet one as my husband told me.
I looked at Omar in the face and told him that the tale I was about to tell would be more relevant to him since he was the one leaving our tiny community to a bigger city. He should not judge people on the face value. Never judge a book by its cover. And he must learn to trust sparingly. You do not just trust everybody you meet.

I reminded them that in our little town, almost everyone knew everyone else. In Lafayette, the tradition had since been established that no stranger was hosted or given accommodation without the knowledge and approval of the District Head, the Hakimi. The wisdom of this tradition was to ensure that no criminal or fugitive from justice was harboured or accommodated in the village. Our culture of neighbourliness was superlative. This was contrary to what obtained in the town. In the town everybody came and went as they pleased. Indeed, it was not inconceivable that two people living on the same street, or even next door neighbours could live for years without knowing who the other person was. In Lafayette the story was different. Everybody knew everybody else. In the case of the quiet one, everybody knew when he was born, or more precisely the circumstance of his birth.

His parents were bona fide citizens of Lafayette and they were known to be a very pious and humble couple. For several years after they were married they did not have children. It appeared, so the elders said, when they were about giving up, they consulted the services of a formidable boka, a traditional medicine man, and their wishes were granted. People give different interpretations to what actually transpired. While some believed that the boka gave them some potent concoction for instant fertility, others believed that he was indeed the one who fathered the child. In either case, Talle was the result. He was called Talle on account that shortly after his birth, his mother died. Thus the secret of how he was fathered remained a secret. His father married another woman who also did not give birth to any child. So she helped in the upbringing of Talle.

Talle was not called the quiet one at birth. It was his reticent nature while growing up that earned him the title. He was never known to have engaged in fisticuffs with anyone even as a young lad. He withdrew into himself. And this silent character stood him in good stead whenever issues of responsibility arose in the community. He was barely twenty years old when he lost both his father and stepmother in a car accident. This compounded his state and he withdrew further into himself.
Talle was alone. Literally alone. He had no one to consult or to speak to. No one knew what he did with his evenings and nights, but from eight o'clock in the morning to four o'clock in the evening, he would go to work at the Local Government Office, where he served as a driver. At the office, he was always on the first row during prayers. He was so dedicated to his piety that people actually believed that there was something about him that indicated holiness. Talle never argued on any issues; he hardly disagreed with anyone even if he was right. He never raised his voice on any one. That was how he got the appellation of the quiet one.

Then one day, just one day, things stopped being quiet for Talle.
He had unwittingly established a pattern in his market purchases over the years to the extent that the grocery stores he patronized knew at once what he was coming to buy. It thus became curious when suddenly the grocers discovered for over a week now, Talle's requirement doubled. The people knew he was alone and could not possibly consume all the items he was buying all by himself. One of them thought it was wise to call the attention of the District Head.

When Talle was summoned, he gave himself away by his very inability to answer the simple questions put forward by the Hakimi, the District Head. The session began ordinarily but ended with a sad dramatic twist.
"What did you buy in the market today, Talle?" the Hakimi asked.
"It was, er, a few, er, a few measures of rice and some palm oil." Talle was fidgety and seemed suddenly ill at ease.
"What precisely did you need a few measures of rice for? Your customer here said you used to buy just a measure which lasts you a few days. The measure of gari you also used to buy suddenly doubled."
"Yes, Your Highness. But I just thought I should buy plenty so I would not suffer want in the event I have no money."
"So where do you get all the money to make these purchases now?"
Talle bowed his head and studiously looked at the ground, the posture of an archaeologist who suddenly had a gut feeling that something precious was hidden under the very ground he stood on. He stood there mute.
The people were getting restless. They seemed to think as one that this was the one moment when the silence of the quiet one was not a virtue. He had better speak.

Just then there was a loud commotion coming from outside the gate of the District Head. There was a loud siren, as of a police vehicle or that of a military escort which came to stop outside the entrance of the Hakimi's residence. In fact, it was not one, but three police vans that came to stop outside the gate.
The villagers were first mesmerised by this rare forceful movement and they became alarmed. It was an unholy sight. And given the speed with which they came and parked before the entrance of the Hakimi's residence, the whole thing spelt something ominous. This had never happened in the history of Lafayette community. People thus surged to find out what was going on.

On hearing the siren from outside, Talle sprang up and bolted into the Hakimi's house. The courtiers pursued him and brought him back. This act of attempting to run, confirmed to the people that if nothing else, Talle was guilty of something. But guilty of what? Nobody knew.
"What's wrong with you man? Why are you suddenly scared of a siren?" one of the courtiers asked.
Before Talle could respond, three policemen, armed to the teeth, barged in on the Hakimi and his courtiers.
"Is this the palace of Hakimin Lafayette?" one of the mean looking policemen asked.
"Yes." The Hakimi replied simply and added, "I am the Hakimi."
"We are looking for one of your subjects in connection with kidnapping, armed robbery and extortion."
"That is impossible," the Hakimi said. "We are a quiet and peace loving people here. Our community has never apprehended even a common thief, let alone a kidnapper."
"Well, well, we learnt differently." The policeman turned to one of his colleagues and said, "Go and bring Zaki in here."
"Zaki?" Everybody was shocked as Talle repeated the name. He swooned and fell. Those who observed at close range noticed that he actually urinated on his person.

"Do you have a person named Talle in this village?"
"Inna lillahi wa inna ilaihir raji'un." The Courtier said.
"We did not ask you for any supplication, the police officer said sarcastically.
"That was more of a pious resignation to reality," the Hakimi said and added, "It means from Allah we came and unto him is our returning."
"Let your man spare me his Arabic lessons. Do you have a guy named Talle here or don't you? And why is this guy sprawled on the floor?" the policeman was impatience personified. He did not even give the Hakimi the respect strangers were supposed to accord him.
"That is the Talle you are asking after?" one of the courtiers volunteered.
"Oh, in that case our search is over." The policeman now turned to the Hakimi and said, "Who can take us to his house?"
"He will do that himself. But what is all this about?"
"We told you that this man is an accessory to kidnapping and extortion."

Just then, the other policeman that was sent to bring Zaki came back dragging an obviously battered Zaki who was chained arms and legs. On the sight of the chained and manacled Zaki, Talle doubled over and, if that were possible, fainted a second time.
"Get up, my friend," the policeman said curtly brandishing a kick at Talle's middle.
Talle staggered up and immediately began declaring his innocence.
"Believe me, officer, I am innocent." Talle said. "It was Zaki's idea. He was the one who said they had a neighbour in town..."
"Shut up, my friend. Nobody asked you anything. Just take us to the house, your house" the policeman growled.

Once there, the policemen followed Talle into the house and shortly thereafter came out with a young boy of no more than thirteen years old.
Talle was already handcuffed. He was hoisted unto the waiting vehicle where Zaki was and the boy sat in the front seat with the leading police officer who obviously was the IPO, the Investigating Police Officer. The vehicles zoomed off and left Lafayette as hurriedly as they entered. That was the last anybody in the community saw of Talle. There was a rumour going on some years later that he was sighted in the border town up north where smuggling thrived. This rumour was however unconfirmed and it fizzled out as fast as it started.

Of course the Hakimi reported that the IPO sent a message detailing what happened in the Talle saga. Talle and his fellow conspirators were sentenced to some years of imprisonment with hard labour for kidnapping and extortion.
The story the police told was intriguing in its simplicity. Talle was pressed for money and he went to town on a weekend and he met Zaki. Zaki had a better idea. He told Talle that at the GRA, there was this businessman friend of his who would always be seen driving with his son in his car. If they could abduct the son, Zaki was sure the father would pay anything for ransom. Somehow the boy was drugged and abducted and in the middle of the night they brought the boy to Talle's house in Lafayette and kept him for one week before the police came and freed the boy. The boy's father had been contacted and warned never to involve the police. The father reasoned that the kidnappers were amateurs since their asking price was one million and later came down to two hundred and fifty thousand naira. Zaki was arrested at the point of collecting the ransom.

"Wow. That is some story, mum." Omar said. "It appears to be a general admonition to all of us. Why do you say it is of particular interest to me?"
I smiled and said, "My son, you are like that young boy in the story. You are going to the university. Do not trust anyone."
"Surely, mum..."
"I understand. Of course you will make friends and all that. Just be careful."
"If he likes, let him trust everybody," Teemah said.
"Mum, I'll..."
"Yes, I know what you will do. But whatever you would do, don't get mixed with bad company."
"Like kidnappers, mum?"
"Nope. Like cultists and those who engage in EMAL."
"E-MAIL?"
"EMAL. Exams malpractice."
"Oh, it was an acronym too?"
"It has many names."
"Surely, I will avoid that."
"You remember Salma?"
Bint raised her hand as if attempting to answer a question in the classroom.
"Yes, my dear?"
"Salma is that student who embarrassed herself during your registration."
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 4,
            title = "Chapter Four: Professor Dabo, Queen Amina Hall & The Benz",
            summary = "Salma encounters Professor Dabo during her 100-level registration. Overcome by lust, Dabo asks to know her 'more intimately'. Salma vehemently rejects and insults him, leaving Dabo remorseful and praying for forgiveness. Salma settles into Queen Amina Hall with three roommates: Tomiwa (from Ibadan, Yoruba, aspiring singer), Ngozi (from Umunze in Imo State, Igbo, quiet and generous), and Ada (from Benue State, Middle Belt). They bond warmly over food (Indomie, snails vs rats, Danwake). One evening, Salma is offered a ride in a black Mercedes Benz by Labaran and Honourable Habib Lawal (Speaker of State House). Salma gives Tomiwa's name and contact number instead of her own.",
            keyQuotes = listOf(
                "\"If the bird chooses to fly in a cloudy weather, it should expect its flight to be cut by the rain.\"",
                "\"Sisters was the correct expression here. They were cooking in turns.\"",
                "\"When there are two men in a car and one appears too voluble... either he is the one who has the car or he is the one who is interested in you.\""
            ),
            fullText = """
Salma casually walked into the office holding her registration files firmly across her chest. She was barely twenty years old then and doubtless in the prime of her youth. She was endowed as a woman and was too willing to flaunt her elegance. She was always dressed in tight-fitting jeans trousers and body hugs top that stopped just short of being indecent. Salma was a reckless dresser and she was all too aware of the femininity she exuded and the effect this had on members of the opposite sex. She revelled in the hunger she saw in the eyes of men as they shamelessly ogled her body when she walked past them. This was called freedom. She thought. The university had a lot of this and no one could reprimand you for daring to dress the way you wanted so long as your attire stopped just this side of decency.

Doctor Dabo was a highly disciplined lecturer and he was never heard to engage in any form of underhandedness with any female student, or any student for that matter. Today, however, as Salma walked towards him with her registration files across her chest, he felt a lump rise in his throat. He had never seen a girl look so alluring and beautiful. He swallowed hard and chided himself not to disgrace himself. He must not put his reputation on the line. He had been in the university for more than a decade and many students graduated in his hands. They all had singular respect for him. He ensured that he treated his students justly. He was a stickler for time. Consequently, he was always punctual to lectures. His rule was very simple, "Don't come in after me." If he entered the class before you, you did not bother entering. The students knew this. In fact, his punctuality was phenomenal to the extent that the graduating students warned the incoming students beforehand that there was a no-nonsense lecturer who never allowed students into his class once he was there before them.

As for consorting with the female students, God banish the thought. It had never happened. So when this fateful day Salma walked into his office looking seductive and all, Dabo could not explain the sudden palpitation of his heart. The weather was cold outside, but he was sweating inside. What was happening to me? He asked himself. He cleared his throat and promised himself to dispose of her registration case as quickly as he could before he did something he would regret for the rest of his life.

"What can I do for you?" he asked briskly.
"I am a 100Level student coming for registration. They said you are the Level Coordinator and that you are to sign my forms."
Dabo marvelled at the confidence of the girl. 100Level and she was exuding such confidence. She must be a special breed. Almost sassy, he thought inwardly. Dabo's heart was still beating fast.
"Yes. I am the Level Coordinator. Have you been screened?"
"Yes, sir. I was screened. It was from there that they directed me to your office."
"All right then. Let's see if the forms are complete."
She handed him the forms and he studied them carefully. They were complete. He signed the appropriate columns on the forms and reluctantly pushed the files to Salma.

She hesitated before standing up and walking towards the door.
It could have been her sheer beauty, her physical appearance, or some other inexplicable signal the devil had sent to Dabo's mind. Whatever it was, instead of allowing her to go, Dabo heard himself say, "Wait."
She turned slowly and faced him.
"Sit down, please. Just want to ask you a few questions." Surely that last sentence was not complete. But he wasn't bothered.
Salma sat down.
"Where are you from?"
"I am from the north. Is there a problem, sir?"
"No," Dabo said and hesitated.
It was not normal for him to be short of words. But he seemed suddenly tongue-tied today.
The girl waited.
"May I know you, please?" he said. Even to his ears that sounded clumsy.
"I am a student here, sir. I think that should be knowledge enough."
"I mean I want to know you more intimately."

Salma instinctively knew all along that this was coming. Why it had to come from this sleazy looking lecturer who had nothing to offer was what surprised her. Indeed, it made her angry. What kind of intimate nonsense was he talking about? University lecturer? From what she heard about the man, they said he was highly disciplined and serious. It was never in his character to have anything to do with his students particularly the female students. So why her? And for God's sake, why now? Well, you never know with men.

"What do you mean more intimately?"
"Don't get me wrong. I simply mean I want us to be friends."
"It most certainly didn't come out like that."
"I know," he said. "So can we be friends?"
"No, sir. With all due respect, that is not what my parents sent me here to do. In fact, you should be ashamed of yourself asking me out. You are old enough to be my father. So what kind of morality are you guys inculcating in your students when you cannot see a beautiful girl pass by without you making advances at her?."
Dabo was pained beyond measure. He hated himself for his display of masculine weakness and hated her even more for reminding him of that weakness. But the fault was his.
"I am sorry," he said.
"You had better be." Salma hissed and added, "Even if the world is bereft of men, I would never go out with a man such as you. What kind of girl do you think I am?" she stormed out of the office, leaving him in confusion.

Dabo was in deep thought long after Salma had gone.
What kind of trial was this, oh God? Something I have never done! What drove me into disgracing myself like this? For more than ten years I struggled and overcame this temptation, now such a small girl was sent to try us. What kind of life was this? Please, God, let this cup pass over me. Please God, let her not talk. She was so cheeky, this girl. She could do almost anything. Luckily, Dabo thought, I did not do anything that would warrant a serious chastisement from the school authority. I didn't even ask her out. He told himself. He just said he wanted to be friends. What was wrong with that? Everything was wrong with that, an inner voice answered him. Then he remembered he used the word intimacy. Now, that one was serious. How do you defend yourself before a committee when they asked you to explain what you meant by wanting to know someone more intimately? God, please, let it never come to this. What kind of devil prompted me to let my guard low so?

But the insult...The insult was painful. It was deep and painful. But he had it coming. If the bird chooses to fly in a cloudy weather, it should expect its flight to be cut by the rain.
For a long time after Salma left, Dabo was lost in supplication. Please, God, clothe me in the garb of your holy prophets. Let not this mishap have impact on my life. If you guard me from this, Lord, I promise to be more dedicated and pious in the discharge of my duties and responsibilities as a moral custodian of our children here. Now and in the future. Thank you, Lord, for answered prayers.

On her own part, Salma did not even spare a thought to the fumbling old man who could not even articulate himself properly when trying to ask a girl out. He did not belong to her class. People with no confidence in themselves hardly fit the category of those she would consider her friends.
So, as she went out of Dabo's office, so did his thought go out of her head. She walked briskly to the hostel and concluded her accommodation registration.

*******

The registration for the hostel accommodation itself had its own problems. She discovered that she did not take to any of her three roommates in the beginning. There were four girls in the room, Salma herself from the North, Tomiwa from the West, specifically from Ibadan, Ngozi from Umunze in Imo State and Ada from Benue State or Middle Belt as she insisted people called her place of birth.
In the beginning Salma did not want to stay in the room. No, it wasn't because the hostel was not beautiful; it was the most coveted. It was the famous Queen Amina Hall. It was every female student's dream. It housed girls with savvy. Happening babes, as they called themselves. Sophisticated ladies. It was not the hostel she did not like. It was the room.

What Salma particularly did not like about the room she was allocated was the composition of her roommates. It was as if there was a deliberate design to offend every ounce of her accommodating sensibility.
So, understandably, when her accommodation registration was done, she was wondering what accursed devil chose her roommates for her. She hated chance and happenstance, but she knew, that no one deliberately worked out whom she should share her room with. The room allocation procedure was simple really. The student was required to make the payment online and indicate their chosen hostel depending on availability and their chosen room. You just clicked the yes button on your chosen room. And the computer screen would show transaction completed, if you secured a room, or transaction cancelled if the rooms were occupied. It followed then that the roommates were not any the wiser whom they had chosen by that simple click to be their roommates. Therefore, you were stuck with whoever you chose for the next two semesters. At least.

By the time she brought her things into the hostel and the school calendar resumed in earnest, Salma discovered that her roommates were not so disagreeable after all. Tomiwa was the brightest in the room and perhaps in her class. She was also the cleanest. Tomiwa's ambition was to become a singer. So she was always abreast with the latest information on the musical and the entertainment scene in general. She was in the know of the latest and craziest fashion outfit. Salma became close to her.

Ngozi on the other hand was quiet and reticent. She appeared to have never left her village, spiritually speaking. She was always reserved and withdrawn. But she was also generous to a fault. She would never cook food just for herself alone. Whether her roommates ate or not, she would still invite them to come and join her while she was having dinner. Sometimes they would decline, other times they obliged her. When they saw that this attitude of sharing her food with them would not stop, they gave in and they started cooking as one small family. This cemented their relationship and they became their sisters' keepers. Sisters was the correct expression here.

They were cooking in turns. The day it was Ada's turn to cook for the first time, Salma said she wanted to see all the ingredients she was going to use to make the indomie jollof. This indomie jollof was a sort of staple food among students irrespective of sex or parental status. It was a noodles meal prepared in such a way that within ten minutes it was ready for consumption. Because it was easy to prepare and cheap to acquire, it became students' favourite.
"There is nothing special that we are using," Ada said.
"You don't understand," Salma said, "we do not want to find a leg of rat in our indomie."
All of them laughed it off and Ada knew that Salma was teasing her as rat is her people's delicacy. It was their loss, she said.
Tomiwa on the other hand asked if they would like her village food for the kings"
"What is that?"
"Snail."
"Snail? You mean you people eat snails?"
"It is not the kind of infantry snail you see up north. In the west, they grow real big. And they are a special delicacy. We actually farm them."
Ngozi said, "We eat snails where I came from too."
"Well, in this room, no one eats snail. But we can do it this way, any day any one of you misses home and she feels like eating mama's food, you can warn us in advance so we would make our own arrangement for feeding that day."
They all agreed to this.

As God would have it, and as time went on, the only thing they as a group did not gang up to eat was rat, which in any case was never readily available in the school. As for the snail, they all indulged in its delicacy whenever Tomiwa's parents came visiting. Again that was also not frequent, because she was from Oyo State, more than eight hours drive from the Ahmadu Bello University, Zaria.
Salma on her own only introduced them to the danwake delicacy which was delicious and also easy to prepare. It was a special delicacy of the Hausa up-landers. All you need is flour, the normal flour they used for bread be it from wheat or maize, mash it into a paste using ground baobab leaves to mix, then you drop it into the boiling water in small balls where it would harden and a few minutes later, it was ready for eating. You could use either groundnut oil or stew to eat the danwake with.

It sounded strange and looked even stranger to the eyes of her roommates. But the day Salma prepared the dish, they knew that sometimes there was no proportional relationship between what the eyes saw and what the mouth tasted. That northern delicacy was delicious.
Food was therefore the common factor that strengthened the bond of friendship between Salma and her friends. In spite of their diversity, they came to discover that there was more in their humanity that held them together than those things that pulled them apart.

Salma and Tomiwa were Muslims while Ada and Ngozi were Christians. But this was never an issue. They did everything as one. Of course there was the funny incident that happened that almost separated the intimacy Salma shared with Tomiwa. But on the intervention of Ada and Ngozi, it was resolved amicably.

*******

Salma was coming back from home one evening. It was actually late in the evening. It was around eight o'clock in the evening. There were no vehicles. A black Mercedes Benz car slid to the sidewalk where Salma was standing and stopped.
Salma did not budge from where she was standing.
The driver engaged the reverse gear and came to stop just beside Salma. He pressed the control button and the passenger window slid down. "Are you going our way, beautiful?"
Salma saw that there were two men in the car and she was not comfortable. It had nothing to do with their dressing. They looked decent and affluent. Indeed, if they had not stopped to offer her a ride, she would have said they were almost responsible. Still she was not very comfortable. If it was just one man in the car, maybe...maybe... just maybe. But this one that there were two of them? Well, thankfully, the distance from here to the school was not far. They could not try anything. She had nothing to lose. She shrugged.
"I said are you going our way, princess?"
When there are two men in a car and one appears too voluble, you can rest assured of two things; either he is the one who has the car or he is the one who is interested in you. They would have discussed that before they stopped. Salma did not answer. She just opened the door behind the passenger seat and entered. She closed the door gently behind her.

"Good evening, gentlemen," she said. "I do not know where you are going. But this is Kwangila and I am going to my school, Ahmadu Bello University Zaria."
"Then it is our way you are going. My name is Labaran." The man behind the wheel said, as he changed gear to drive and move on.
"You have not told us your name."
"I will tell you when I am getting off."
About ten minutes later, the car stopped at the Main Gate of Ahmadu Bello University.
"Or would you prefer we take you right in?"
"Sure. If you do not mind, that is."
"Habib, what do you think?"
"By all means let's take her in."

Habib appeared to be less voluble than Labaran and Salma instantly decided if any of them was the owner of that car, it must be Habib. Not that she was particularly thrilled by the prospect of being asked out by Benz owner. But it would certainly be a story worth telling that a certain big man in a big Mercedes Benz had asked her out and she declined. That would make additional name in the entries of the influential people she had consciously turned down. So now, it was immaterial who asked her out, she knew she would say no. To hell with their flashy and expensive car. What kind of girl were they thinking she was? You just gave someone a ride and you were looking for a relationship that would last eternity? Big deal.

The Benz pulled to a stop outside Queen Amina Hall, but none of the male occupants attempted to step out and open the door for Salma. This bravado, stupidity actually, that exemplified who the gentleman was in Europe had no place in Africa. How can a lady whose limbs are in perfect working condition wait for someone to step out of a car, come round to open the door for her before she steps out? The whole thing smirks of waste of time. In any case, Salma was not expecting them to open the door for her. She was actually in a hurry to get out and meet her roommates.

"You promised to tell us your name before alighting?" Habib's tone was calm and gentle.
"My name is Tomiwa." Salma heard herself say.
"I am pleased to meet you. My name is Habib."
"It's okay."
"May I have your number?"
Again without hesitation, Salma called out Tomiwa's number off hand.
"You are too fast," Habib said. "Call the number again."
She did and Habib saved the number on his phone. He attempted calling but there was no response.
"It is telling me the line is switched off."
"I left the phone in the hostel. Maybe the battery has run down."
"Okay. We will be here tomorrow at about this time. Would you be in?"
"Yes," Salma replied curtly as she stepped out of the car. She heaved a big sigh of relief when the call to Tomiwa's did not go through. It wouldn't have been a nice experience. She needed a little time to warn Tomiwa on what to say. If the strange men insisted on coming tomorrow, let them. It was none of her business. They had fuel to burn and time to waste. And come to think of it, they were all old enough to be her fathers. The men had no shame. Men had no shame. Or, maybe it was us girls who were irresponsible.
"Goodnight, Tommy." Habib was waving his hand as she walked past the car into the hostel.
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 5,
            title = "Chapter Five: Tomiwa's Date, The Frizzlers Outing & The 50k",
            summary = "The following evening, Honourable Habib Lawal calls Tomiwa's phone. Intrigued, Tomiwa decides to go on the date. Labaran and Habib drive her to Frizzlers fast food restaurant near the 'Faculty of Suya'. Habib notices immediately that Tomiwa is not the girl from yesterday, but admires her intelligence, poise, and honesty. Tomiwa speaks critically of Nigerian politicians ('They are like a spindle'). Impressed, Habib buys provisions, suya, chicken, and gifts her 50,000 Naira (10,000 each for her roommates and 20,000 for Tomiwa). Back at Queen Amina Hall, the roommates rejoice, but Salma is consumed by bitter jealousy ('Finders, keepers'). Ngozi and Ada reconcile the room, cementing their sisterhood.",
            keyQuotes = listOf(
                "\"Politicians are like a spindle. Nobody knows the direction they are facing. They lie a lot.\"",
                "\"Finders, keepers. It was me they gave ride to. Tomiwa, you are not a good friend at all.\"",
                "\"The herd instinct was indeed real. A situation which no entreaty could settle, was suddenly resolved by a single knock on the door.\""
            ),
            fullText = """
By eight o'clock in the evening the next day, Tomiwa's phone rang.
She jumped at the first ring as if she was not expecting it. The truth was that she had been waiting for that call all through the day. She had never been on a blind date before and she never knew how she was expected to behave. The whole thing sounded crazy. But she was curious. In spite of her apparent social exposure and her confidence which was borne out of her desire to become a celebrity, Tomiwa was emotionally empty. She was beautiful no doubt about it. Indeed she could beat Salma in a contest except that she was dark where Salma was fair. Otherwise they were slim, busty and definitely attractive. So how was it that no boy ever attempted to go out with Tomiwa? The answer could be summed up in one word – overconfidence. She exuded such charismatic air around her that people, both males and females alike, rated her far above her station. Which station nobody knew. Consequently all of them felt intimidated in her presence. And she was an expensive dresser. It was not that the materials she sewed were out of this world, it was the style. That was definitely out of this world.

Her phone rang again for the second time.
"Hello," she said turning on the speaker so that her roommates, all the three of them, could hear what was being said.
"Is this Tomiwa?"
"Yes, who is speaking, please?"
She looked up at her roommates and they gave her the thumbs up sign, indicating that she was doing well.
"My name is Habib. We gave you a ride yesterday from Kwangila?"
Tomiwa paused, unsure whether to go ahead with the lie or to tell the truth and forget the whole thing.
"Hello?" the voice at the other end was hesitant. "Are you still there?"
"Yes, I am."
"Can you come out, please?"
"Okay. Where are you?"
"We are parked where we dropped you yesterday."
"Er, er, yes. Okay. I will be with you."
There was silence at the other end.
"Go, my friend. They won't eat you. If I know men, they may not even know the difference between you and me." Salma was very confident.

Tomiwa on the other hand was hesitant. Indeed she started developing cold feet about the whole thing. What if they turned out to be some kidnappers or cultists? Who would come to her rescue if she entered a car with total strangers who formed the habit of visiting girls in the hostel only when it was night time? These thoughts were passing through her mind even as she picked her handbag and casually walked out of the room to meet her unknown visitors.

She saw the black Mercedes Benz parked directly in front of the hostel. The passenger side was empty so she went and entered the car without prompting. It was strange. There were supposed to be two people in the car. "Where is your friend?"
"Oh, my beauty, I am here," Labaran said from the back seat. "I made space for you in the front so you can seat near your heartthrob."
Far from being reassuring, this unexpected utterance and seating arrangement made Tomiwa even more uncomfortable. She had read so many thriller stories, particularly Mario Puzo's Godfather and she knew how enemies were easily garrotted when they are made to sit in the passenger side while unbeknownst to them their killers were seated directly behind them in the car. She did not let her fear show. Instead, she just opened the front seat, stepped out of the car and asked Labaran to come to the front seat. Meekly, he obeyed.
As she entered the back seat, Habib took a long look at her and seemed to be convinced that there was something wrong about the lady who just entered their car. She was more resolute and a trifle more confident than the girl of the previous night. But he told himself, he would wait and see. There was a game plan somewhere, and he did not want to spoil it.

"Shall we move from here? It is rather too open."
"Where are we going?"
"To a restaurant."
"I am not hungry." Tomiwa was really ill disposed with the whole set up.
She felt the stab of Habib's long stare as she entered the car and she knew the man was not dumb even before he said anything.

"Let's go to Frizzlers then." Habib said this as he manoeuvred the car to face where it came from so they could drive quietly to the Fast Food Restaurant which was surrounded by many grocery shops within the school.
He parked the car near the shop of a man who proclaimed his shop the Faculty of Suya. This meant that his shop was the best place where steaks are made and sold. As they parked, Habib asked Labaran to go out and get them fried rice, chicken, milk, tea, beverages, sugar, and any other thing that he considered important to a boarding student.

"Yes, Honourable." He went out of the car without collecting money from Habib. This Tomiwa noted as strange. But she also knew instantly that authority had been established. She knew now who was the boss. Salma was wrong. Labaran may own the car, but he most certainly was not the one calling the shots. Habib was. And he appeared very perceptive. Tomiwa instinctively knew that Habib was not the kind of person you trifled with.
"You are not Tomiwa." Habib said this categorically when Labaran was out of earshot.
For some reason the statement made Tomiwa angry. "Look here, Mr. Honourable. I do not care who you think you are. But you cannot just wake up this evening and declare my name fake. That is very insulting. If you had said, “Hey, you are not the girl I picked yesterday.” I would gladly say, “Yes, I was not. Since you are an expert at picking girls by the roadside. My name is Tomiwa. And I am not the girl you gave ride to yesterday.” She added this last to soften the venom she knew her words must have caused.

"I am sorry, my dear. I didn't mean to sound like that. And believe me picking girls is not my habit. As you can see, it was Labaran's idea. He is my driver."
"I do not have any issue with you or your driver. I would not insult you for anything if you do not look down on me."
"I said I am sorry."
"Okay. Just so long as we understand each other."
"I think I like you already."
She didn't say anything to this.
"So, tell me what happened?"
"Nothing happened. My friend didn't feel like giving you her number so she gave you mine instead. I was supposed to reject your call or tell you wrong number, but my curiosity got the better part of me. I decided to come and see who it was that had my number."
"And...?"
"And here we are."
"I just declared that I liked you."
"I heard you."
"And what are you saying to that."
"Nothing."
"Why?"
"Because I do not go about declaring likeness or otherwise to people whose faces I can hardly recognise in the daytime?"
"Fine. That means you want to see me tomorrow in the afternoon."
"Yes."
"Is that why you told my driver to come to the front seat?"
"No. I just did not want to take chances. What of if he sprang on me and strangled me from behind?"
"You have a very wild imagination."
"Thank you."

There was another long silence.
"If we have nothing left to say to each other, I guess I should be going in," Tomiwa said.
"You didn't even ask me who I am."
"Your friend or is it your driver has said who you are. Indeed, I am not sure if I like politicians," Tomiwa was in her element. She never gave a thought to what she was saying. If it went down well with her listeners, fine. If it did not, also fine.
"Why don't you like politicians?" Habib asked.
"They are like a spindle. Nobody knows the direction they are facing. They lie a lot. A lot of misguided people think the politicians are the solutions to our problems."
"Are they not?"
"On the contrary. They are the problem."
"And on a personal level?"
"I do not judge a person based on his affiliations."
"You don't?"
"No. I get to know who you are and judge you as such."
"So there is hope for me, after all?"
"Hope for what?"
"For becoming your friend."
"I wouldn't be sitting in your car if there wasn't."
Habib was so elated, he laughed out loud.
"How many of you are in the room?"
"Four. Why?"
"You take this." He handed over to her a bundle of five hundred naira bills.
She collected the money slowly and placed it on her laps.
"Put it in your bag. I do not want Labaran to see it."
"He won't."
"Ten thousand for each of your roommates and twenty thousand for you."
"Thank you. We really appreciate this gesture."

Labaran came with so much provisions and beverages that Tomiwa thought they were buying things for their children in the boarding school. But no. Habib said it was for her and her roommates.
Tomiwa was gratitude personified. She thanked Habib profusely and did not know when she started calling him Alhaji. Habib too was very happy. He drove her to the entrance and promised to call her regularly.

*******

As soon as Tomiwa entered the room, they started shouting and ululating. The shout turned into a scream of joy when they saw what she brought. It was Ngozi who had the presence of mind to stand up and lock the door. This simple act is one of the most valued rituals of students who cook in the hostel. It effectively blocks out all those professional hangers who go about with spoon in their purses looking for the pot that had just been brought down from the stove. Before you start eating you lock the door and if it was night, you switched off the light. If they knocked you ignore. When Ngozi came back from the door, they opened the bags and saw what was almost beyond belief. Even if they had come to the school with nothing, what the Alhaji had bought for them would have lasted them through another semester. They jumped some more and were embracing Tomiwa. And thanking her.

When the excitement died down, Salma said, "You guys should be thanking me. It was I who brought this matter here, you know?"
"But if we had followed your counsel we would all be without these. It is Tomiwa we should thank. It is her boyfriend who supplied all these."
Somehow Salma was not happy with the turn of events. "Stop disgracing yourselves like this my friends. Is it suya that you have not seen or chicken or beverages?"
"Or these?" Tomiwa said dramatically as she dropped the bundle of fifty thousand naira before them.
They were all stunned. For one brief moment there was total silence in the room. Tomiwa savoured the moment and used it to divide the money the way she was instructed. Ten thousand naira for each occupant. And she held unto the remaining twenty thousand.

This was all too much for Salma. In the silence that followed, she was heard to have whispered, "It is not fair. It is not fair. Finders, keepers. It was me they gave ride to. Tomiwa, you are not a good friend at all. I just showed you a guy and you went ahead to make him your boyfriend. You behave like a chameleon and can therefore adapt to any situation to meet your personal desires."
"This is not a fair comment, Salma," Ngozi said.
"You shut up there, money monger. All this one that you are standing for Tomiwa, is it not for the money she brought? We have been in this room for how long now? Yet, we have never seen you display so much love and camaraderie towards Tomiwa as you are doing this evening. If not the money, what else is accounting for this sudden friendliness? You do not even have shame all of you."
"Salma, you do not have to be this aggressive, you know." Ada tried to be conciliatory.
"You too shut up. How are you different from them all?"
"It is not about being different, it is about being rational."

All this while Ngozi had been fuming silently. She knew what Salma said was unreasonable. Was there any man on earth who did not like money?
"Ada, allow Salma to finish disgracing herself and displaying her foolishness. Who else but a daft person would see money by the wayside and instead of picking it, he would show someone else the money to pick, yet when that person picks the money he would start raining abuses on the person? Who else?" Ngozi hissed.
Ada was suddenly concerned. "Please, let this matter not degenerate into something else. We have been living in peace all this while. I do not see why these sentiments should be raising their heads in our midst. I thought the essence of education was for us to live as one and seek out what unites us rather than what separates us?"

Suddenly, there came a knock on the door.
All those speaking kept quiet. There was complete silence in the room. They did not say anything. Neither did they move. The person outside knocked some more. The roommates refused to budge.
When they heard the footsteps of the knocker receding, they sat down quietly around the roasted meat and chicken Tomiwa came in with. At a signal from Salma, Ada went and switched off the light in the room. Thereafter, they used light from the inbuilt torch on their phones to see what they were eating. It was strange to see this total cooperation among the people who a few seconds before were at each other's throat. The herd instinct was indeed real. A situation which no entreaty could settle, was suddenly resolved by a single knock on the door.
They ate silently and for a long time.
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 6,
            title = "Chapter Six: Moral Philosophy Exam & EMAL Apprehension",
            summary = "In their final year, Salma sits for the General Studies Moral Philosophy exam. Having neglected her studies because the lecturer historically recycled questions, Salma is stunned to find brand-new, challenging questions. Desperate, she uses 'student magic' to communicate with Kolawole Abdul, the class genius. Kola passes her coded cheat notes ('Notes of Salvation'). A female invigilator catches Salma in the act. Security is called, and Salma is forced to sign the Examination Malpractice (EMAL) Form with Kola as a witness, referring them to the Disciplinary Committee.",
            keyQuotes = listOf(
                "\"Notes of Salvation, the euphemism they had for Cheat Notes.\"",
                "\"Rules are rules, my son. If you do not want to get caught, then don't break them.\"",
                "\"Doctor, prepare the documents for the Exams and Ethics Committee for further processing. I am sure you know this is beyond me.\""
            ),
            fullText = """
I took a sip of my zobo and continued with the tale.
Teemah was hardly moving. Indeed, she was hardly breathing. That was how much she loved stories. I looked directly at her and reminded her that Moral Philosophy was usually one of the easiest subjects in the university and it was also a general studies course taken to the end of the examination timetable. In the case of Salma and her mates, it was the very last paper. It was considered easy because the course content involved all those things that their parents had been telling them since they were children. This, plus what their imams taught them in the mosque or their pastors preached to them in the church. Moral Philosophy was sure going to be a walk-over. Maybe that was why the school authority took it to the last part of the time table. To kind of pacify the students, if you will.

Surprisingly, it was also this same Moral Philosophy that Salma found very difficult. She never attended the classes because she believed, as most students did, that they could pass even without going to class. What further guaranteed her passing the course was that for three years going, the lecturer had been foolishly recycling the same questions with very minor modifications.
This year they resolved to tackle the subject head on and had series of tutorial discussions concerning all the topics. Indeed they were so well prepared that they knew the answers of virtually all the past questions off hand.

On the day of the examination, Salma came out more stunning than all other days and looking ravishing and decidedly more beautiful. Her roommates had asked her what the occasion was, she told them that her course mates had planned on final class pictures to be shot with most of the lecturers after the paper. And she wanted to come out looking her best.
She picked her examinations card and went, as the law required, thirty minutes before the examination time. They were all searched and allowed into the examination hall.
As soon as the question papers were distributed, Salma knew she was in deep trouble. It was strange. It was not true. It was unbelievable. It was impossible. None of the topics for which they spent the whole night preparing had come out.

She looked around and was further dismayed to see her other course mates furiously writing on the answer scripts. It was as if they had all along been prepared for the eventuality of that happening. They must have read beyond the questions they practiced.
The guy next to her, Kolawole Abdul, famed to be the brightest was downloading pages upon pages of information from his head to the answer script. Salma on the other hand could not write anything. She kept looking from the invigilator to her paper and helplessly to Kola.

The invigilator was female and she made a studious note of avoiding eye contact with Salma. Unknown to Salma, she was the only one not writing. Consequently she arrested the attention of the lecturer. Her outrageous dressing did nothing to endear her to the heart of the teacher. On the contrary, the teacher felt silently intimidated by the ostentatious appearance of Salma. She took an instant dislike in Salma. But she did not show it.

As time wore on, Salma was able to use the student magic on Kola. The student magic was a trick students developed of speaking to the next person without moving their lips. The strangest thing was that the person spoken to could hear or more precisely infer what was being said and act accordingly.
Kola was not just academically smart, he was also ever conscious of his life in the university. He did not want anything or anybody to jeopardize his career as a student. Especially not now, when it was this last paper that stood between him and graduation. All the others had been a walk-over. This one too would be. He did not like the way Salma was disturbing him. He stole a glance at the invigilator and noticed that she was not paying attention to them. He wished Salma would stop.
But Salma was persistent. So Kola scribbled some coded responses to the first two questions and stealthily, surreptitiously, slipped it into her hands.
The lecturer did not notice this movement.

As fate would have it, however, the teacher made a show of going out briefly only to come back immediately. That moment she went out was all that Salma wanted. She opened the paper Kola slipped into her hands and furiously began deciphering the code and writing on her answer booklet. She was so deep in this unholy act that she did not notice the lecturer had come back.

Now, the female teacher was amused to see that Salma who had not been writing for more than thirty minutes had suddenly received inspiration to start writing like there was no tomorrow.
She walked quietly and calmly to Salma's desk and stood behind her. For about two minutes Salma was engrossed with the business at hand, she did not notice that someone was standing behind her. She was busy copying from Notes of Salvation, the euphemism they had for Cheat Notes.
The teacher touched Kola silently.
He almost died.
Then she touched Salma.
Salma heard herself shouting, "What is it? What have I done? Did you see me with anything?"
Meanwhile, the cheat note was still in her hands.
The teacher turned to the front of the class and addressed the man in security uniform, asking him to bring the EMAL form.

"That is the Examinations Malpractice Form," Teemah said.
"Yes. Big Mouth. Mum had told us the meaning earlier," Omar said.
"I just mentioned it for some Salma brained listeners who might have forgotten." Teemah was making faces at her older brother.
I ignored them. But I was glad nonetheless to discover that they were all following the story.

By the time the security man brought the EMAL form, the teacher had confiscated the cheat note from Salma.
Salma was asked to fill in the form and Kola was to sign as witness. At this point Kola felt an instant surge of relief since the teacher did not actually see him hand over the note to Salma. Now exams malpractice was one offence. Failing to fill the EMAL form was another offence all together. When Salma finished her long harangue about her innocence and refused to sign, she was persuaded to sign by the security man who assured her that no one would stop her from continuing to write her paper. And that he was sure they would resolve the matter at the office of the Head of Department.
After she signed, some calm was restored in the examination hall and all the students wrote till they finished.

When they were done writing the Moral Philosophy paper, Salma followed the teacher to the HOD's office.
As they entered, he looked at the invigilating lecturer and said, with coldness in his voice, "Doctor, prepare the documents for the Exams and Ethics Committee for further processing. I am sure you know this is beyond me."
"Okay, sir." She said and went out.

"I can just imagine." Omar was beside himself with excitement. "Mum, this reads like a story of fiction. Honestly, if you were not the one telling us, I would have said you made it all up."
I smiled at my son without saying a word.
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 7,
            title = "Chapter Seven: The Duping by Mohammed Kabir & Expulsion",
            summary = "Facing the Examination Malpractice and Ethics Committee (EMEC), Salma seeks help from Honourable Habib Lawal. Habib offers financial assistance but demands intimacy, which Salma accepts in desperation. However, instead of approaching the real committee chairman, Salma is swindled by a smooth-talking laboratory technician named Mohammed Kabir, who impersonates the chairman in a hotel room and takes 100,000 Naira from her. When Salma faces the real panel, she realizes Dr. Kabir is a fraud. In panic, she implicates Kolawole Abdul, leading to the expulsion of both students.",
            keyQuotes = listOf(
                "\"When it comes to money, every man has his price.\"",
                "\"Dr Kabir was not a member of the Committee. She looked again... I have been duped. She told herself and began to cry.\"",
                "\"It was also not fair what men were doing to her. No man ever treated her for her essence; they all related to her based on her looks.\""
            ),
            fullText = """
When she was summoned by the Examination Malpractice and Ethics Committee vide a letter asking her to report to the committee in a week's time, she tried to do what every law breaker usually attempted to do when caught; she tried to find ways around the rules. She couldn't. The established law of EMAL was so clear that most students when caught would simply pack their belongings and leave the school and go and sit for another qualifying exams to another university. That is, they would seek admission again through JAMB to another school. Most did not even bother to honour the summons of the Examinations and Ethics Committee. They would just leave since in the end they knew the outcome. Most universities had zero tolerance for examinations malpractices.

But when you were in the last semester of your final year, the desperation goes deeper than that. Leaving the school would literally have to be the last thing you would want to do.
Salma therefore went and met Tomiwa and confided in her her predicament. Tomiwa was genuinely sympathetic and asked Salma what they should do under the circumstance.
"I was thinking of talking to Labaran to talk to Habib who would put a word for me in ears of the Committee Chairman or the Vice Chancellor or someone higher up. You know these politicians, they have their ways. They are very influential."
Tomiwa nodded, knowing indeed that Salma's condition was desperate at the same time doubting whether the strategy would work. Somebody higher up? Could she be referring to the Visitor to the University? That is the President for crying out loud! But in her situation one would try almost anything. Desperate measures, so said the sage, required desperate remedies.

Salma did as she told Tomiwa she would. Habib asked Labaran to bring her to his office.
It was the first time she was there. Tomiwa herself had been to the office only a few times. As she sat on the sofa opposite him, Salma took in the magnificent office in one glance. It was simply luxurious. It was tastefully furnished and had so much space, Salma wondered what they would be doing there. Then she espied a collapsible conference table linked to the wall facing the office entrance. The name on his desk read, HABIB LAWAL, SPEAKER.

Salma heaved a sigh of relief. Habib was indeed no ordinary honourable. He was the Speaker of the House. After the State Governor and Deputy Governor, he was the next most influential figure in the state. And to imagine that this was the man she gave fake number to and settled for his driver? God, what kind of bad spirit was pursuing me?
He sat resplendent behind the huge mahogany desk and was turning from left to right and then left again on his executive swivel chair. Salma could not help admiring the power and influence behind that desk. She reckoned, if anybody was going to get me off the hook, this guy would.

"I understand. You see, the only person I know, who can assist us is Professor Dabo."
Salma felt her stomach sink. She fought the overriding desire to rush to the toilet and empty her bladder. Why must this Professor Dabo keep appearing and reappearing in her life like a recurring decimal?
"Honourable," she began and paused.
"Yes?"
"There has to be someone else."
"Like who do you have in mind?" the honourable reclined on his chair and took a long look at Salma. Then a thin, mischievous smile played across the corners of his lips.
"Like the Chairman of the EMEC, that is, the Chairman of the Exams Malpractice and Ethics Committee. He is a professor of Biological Sciences."
"What makes you think he would agree to our request?"
"Because they said the man likes money a lot."
"Chairman of the University Ethics Committee being susceptible to financial underhandedness? That is a laugh." Honourable Habib actually laughed out loud.
"When it comes to money, every man has his price," Salma said, laughing with him.
He stood up from his chair and came to sit on the three long sofa nearest to Salma.
"I like that philosophy about every man having his price," he said. "But what of every woman."
"Ours is a given. But sometimes who is doing the pricing matters," she said meaningfully.

"So like how much do you think we could offer him?"
"Two, may be three hundred thousand."
"And if I give you that amount, what do I expect in return?"
"When I gave you Tomiwa, what did you give me in return?"
"You didn't give me Tomiwa, remember? She was to be your escape route because you didn't like me. It turned out that she did not mind going out with me. So the benefit is all hers. Now, the deal is different."
"How different?" Salma asked.
"You want two or three hundred thousand naira. And I said what do I get in return?"
"Don't be mischievous, Honourable. First, you know that the money is not for me. Secondly you know how we are with Labaran, your friend. And thirdly you know my relationship with Tomiwa, your girlfriend. So if what I suspect you are asking is true, you would know that it is not proper."
"We are not talking about propriety here, my dear. However else you choose to look at it, it is me who is going to lose money... Sure, if you cooperate."
"But your door is open, Honourable."
"No. It is locked."
Salma was surprised.

*******

The most interesting thing was that even after she got the money from Honourable Habib, Salma found it hard put to give it to the Chairman directly. She met one of the members of the committee who introduced her to the chairman outside the school. The chairman asked her if she was guilty. She said she was guilty but that she wanted him to temper justice with mercy.
The chairman agreed and asked her to meet him at a designated rendezvous, a hotel very far away from the school. She went there all right, but declined sleeping with him. She however offered to ransom herself.
"Just how much do you think you are worth under the circumstance?"
"You tell me, sir."
"You know that I am not the only member of the committee. There are four other members. And their palms would also need greasing."
"Maybe two hundred thousand would do," the Chairman said.
"I would give you one hundred thousand. And it had better work. If it does not, I would so scream and you would not hear the last of this. Remember, you have more to lose than me, when the chips are down."
"No problem. But subtle threats would not help you under this circumstance. I just agreed to the sum because I know you are a student who needs help."
She dipped her hand into the handbag she carried and gave him the money. He collected it, divided the bundle into two and thrust them in his trouser pockets.

Suddenly a strange thought occurred to her and she voiced it out.
"Sir, I do not even know your name."
He laughed. "Of what use would my name be to you?"
"If you are not divulging your name, then we might as well..."
"Okay, okay. Dr Kabir. Mohammed Kabir."
"Okay. I would be leaving now."
"Be seeing you," he said and opened his arms for a hug.
She declined and offered her hand for a handshake instead. Thereafter, she walked calmly out of the hotel and went home.

*******

When she was called to defend herself before the committee, she was first shocked to see that the person seated on the chair facing her, was not the person to whom she had given the money in the hotel.
Dr Kabir was not a member of the Committee.
This was not possible. She looked again, peering closely and without shame at each member of the committee, still she could not see him. She did not start crying until she discovered that the man whom she hardly knew, who claimed to also be a member of the committee and who introduced her to Dr Kabir was also not there.
I have been duped. She told herself and began to cry.

The man who was at the helm of affairs and other members of the committee mistook her tears for remorse and perhaps repentance. They advised her to calm down and narrate what transpired at the examination hall that day. She calmed herself and told them the whole story.
In the heat of her agitation, she did not know when she told them that she actually received the cheat notes from Kolawole Abdul.
"And who is Kolawole Abdul?" a member of the committee asked.
"He is my classmate."
"Is that all? Just a classmate? And he would risk his academic career, discounting the possibility of rustication, for just a classmate?"
Salma's stomach sank. In fact she did not know the implication of dropping Kolawole's name. Why did she make a slip like that?

It was also not fair what men were doing to her. No man ever treated her for her essence; they all related to her based on her looks. And all they ever seemed to want from her was dating her. That included Kolawole. She mentally ran the whole gamut of the men she knew in her life and came to the conclusion that except for her father, no man, indeed no man, was worthy of being called a man. So to hell with Kolawole, and Habib, and Labaran, Dr Kabir and all the others who claimed they were helping her by exploiting her.

"Yes, I do."
"Well, that is about all for now. You may go."
Salma hesitated.
"You will hear from us," the chairman said.
Salma walked out solemnly though she managed to walk out with a gait of desperate dignity.
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 8,
            title = "Chapter Eight: Mohammed Kabir's Den, Retribution & Salma's Transformation",
            summary = "Mohammed Kabir is revealed to be a mere laboratory technologist (LT) and compulsive gambler. Habib dispatches his enforcer Zaki to track Kabir. Zaki corners Kabir in a smoky gambling joint just after Kabir wins 300,000 Naira humming Kenny Rogers' song 'The Gambler'. Zaki beats off another thug (Gumuzu) and retrieves the money, but Labaran deceives Habib by pocketing 250,000 Naira and giving Zaki 50,000. Meanwhile, Salma loses her father, undergoes deep remorse and spiritual transformation, and becomes engaged to a serious suitor named Salim.",
            keyQuotes = listOf(
                "\"You've got to know when to hold 'em / Know when to fold 'em / Know when to walk away / And know when to run.\"",
                "\"There simply is no justice on this earth... Justice was just ice. Frozen.\"",
                "\"There are three things wrong with your observation. The first is that we do not bury people. We bury corpses.\""
            ),
            fullText = """
Mohammed Kabir was not a medical doctor. In fact, he did not even hold a PhD. But almost everyone who knew him addressed him as doctor. It was a nickname he had since he was in secondary school and it stuck. When he was employed as an LT, a Laboratory Technologist, in the university, almost everyone was calling him doctor. When his HOD asked him his proper name, he said it was Mohammed Kabir. "I am pleased to meet you, Dr Kabir." The HOD extended his hand for a handshake. And since then he became Dr Kabir to all. And when he wore his oversized lab coat, the verisimilitude with a genuine doctor was uncanny.

He was a very friendly and intrusive sort of person. He had a way with people, that before you knew he would come real close to you. He was virtually on intimate terms with almost anyone who mattered in the school. This ranged from the Vice Chancellor, the Faculty Deans down to the Heads of Departments. Kabir's friendliness cut across religion and tribe. Everyone was his friend, male or female. The only blemish he had on his character was that he had weakness for easy money. And most of his colleagues did not know this. So it never bothered them.
It was true that Kabir was friendly, but he was also almost always moody. His state of permanent impecuniosity attested to this. In the school, people could not explain this oxymoron of someone being moody and cheerful at the same time. Most of them however were never close enough to him to know of his financial affairs. Rumour had it that no matter how much money he had, he would always lose it at the cards. He was more of a compulsive gambler than a habitual one since the money was not regular in coming. Consequently, he was reclusive.

By the time Labaran finished supplying this information to Habib, it was all Habib could do to stop himself from laughing out loud.
"You are telling me that the person who duped your girlfriend was a common lab attendant?"
"It looks like it Honourable."
"And a common gambler?"
"Yes, sir."
"How did you get all this information about him then?"
"When Salma left the committee and came to me crying for justice, I said you were the only person who could help us. So through our campus pimp, I traced and found the person who gave Salma Kabir's name. We gave him a little working over and threatened to expose him to the school authority for the racket, or is it syndicate, they are superintending in the university. He opened up and sang like a canary."
"So, how do you intend to deal with the matter?"
"Zaki, of course."

Honourable Habib was quiet for a long while. He was not comfortable with Zaki at all. The last time he was instructed to deal with Alhaji Adamu by kidnapping his son, he bungled it. He had to involve the services of one inexperienced villager and together they got themselves arrested...

So Zaki was contacted and he trailed Kabir to one of his regular gambling joints. Zaki waited in the suffocating and densely smoky gambling hall till it was late in the night when they were almost done with their dealings. He entertained himself by mentally running over in his mind the chorus he knew off hand from the song of late Kenny Rogers, The Gambler:

You've got to know when to hold 'em
Know when to fold 'em
Know when to walk away
And know when to run
You never count your money
When you're sittin' at the table
There'll be time enough countin'
When the dealin's done.

Maybe Kabir was aware of the song, maybe he was not. What was instructive was that, by some indirect telepathic instigation, after the time he cleared a major win, contrary to expectations of all gamblers, including himself, he said he had had enough for the night. He came to the arena with less than fifty thousand naira and now he was three hundred thousand naira richer. To the consternation and chagrin of all those who respect the cards more than their God, they watched solemnly as Kabir stood up to go. This was simply against the norm. No gambler worthy of the name left the table after winning. They were often known to leave after losing. Or when the game was off.

The Kartagi, that is the leader of the gambling group, reputed to be inconsiderate, tough and definitely merciless, winked surreptitiously at a thug seated opposite him to correct this anomaly. The anomaly of a gambler leaving the table after winning when the game was still on. The thug nodded, stood up and began following Kabir at safe distance. But the distance was not safe enough.
For Zaki also was following Kabir though the thug was between them and unaware of this fact. At the time, though, Zaki himself did not know that the thug was following Kabir. It was after a series of turns that brought them to an unlit alley that Zaki believed that someone else was following his prey.

Before he could take a turn to the brighter side of town, the thug hurried up and tackled Kabir from behind, making him fall. The thug was not even hooded, but Kabir did not have time to immediately recognise or identify who fell him. Before he could make sense of what was happening, he felt the weight of another man on top of them. The three of them sprawled on the floor fighting and kicking at one another.
"Gumuzu? You mean this is how you guys operate? I have never won anything as substantial as this in my entire life, and now you can't even allow me to keep it? Is it you or Kartagi?"
"It is your mother!" Zaki said as he landed Kabir a very deafening blow. Gumuzu saw that he was no match for Zaki and attempted to back off. He almost succeeded but Zaki gave him a heavy karate kick that landed in the groin. This made Gumuzu to yelp and scream out loud. He doubled up in pain and held his groin with his two hands... and at the slightest sight of escape opportunity, he ran down the alley and disappeared into the darkness.

Zaki now had his hands round Kabir's neck trying to choke him. When he was certain Kabir got the message, he eased up the pressure and asked, "Where is the money?"
"Here, here. It is in my inner pockets. Please don't kill me. Tell Kartagi, I would never set my foot in the gambling hall again."
"And what are you?" Zaki said sarcastically, as he slowly retrieved the money from Kabir's pocket.
"I am a decent employee of the university."
Zaki slapped him hard, across his face and spat, "Indeed. And do you know one Salma?"
Kabir sat up groggily feeling the pain all over his body. "Salma?" he repeated uncertainly.
"Well then, this is for her, for the money you collected from her, for lying to her and for coming to gamble with her money. And indeed for all the girls you have been deceiving by impersonating one officer of the university or another."
"That is my comeuppance," strangely that was what Kabir heard in his head before he passed out.

*******

Zaki took the money to Labaran. By the time Labaran counted the money and saw there was three hundred thousand naira, he counted fifty thousand and gave to Zaki and held unto the rest. He had no intention of handing the money over to Habib... It was simply convenience. And this was certainly convenient to him.

*******

On the eighth day after the funeral, Salma came to the hostel all the worse for wear. She was really looking haggard. It became obvious to anyone who cared to observe that the girl was in mourning. Her friends and roommates, Ngozi, Ada and Tomiwa had collectively gone to commiserate with her for her loss.
Ngozi however could not resist asking her the all-important question that had been at the back of her mind since the death took place.
"Why are you people always in a hurry to bury your dead?"
Tomiwa picked up the gauntlet. "There are three things wrong with your observation. The first is that we do not bury people. We bury corpses. As soon as a person is pronounced dead, his personality automatically ceases with his last expiry of breath. The second thing is, we are not eager to bury our dead. We were anxious for them to get well when they were ill, but the moment they die, our anxiety ends and their own begins as creatures bound for a rendezvous with their Creator. We do not want to delay the meeting."

After she lost her father, Salma decided to change her ways. She became decent and very serious. When Salim talked to her, he told her straight up that he wanted to marry her. And the courtship began. When I saw the level of her seriousness and commitment, that was when I allowed her into my life and I was always admonishing her on how to conduct herself.
            """.trimIndent()
        ),
        LifeChangerChapter(
            chapterNumber = 9,
            title = "Chapter Nine: Salim's Smartphone Ordeal & The Conclusion",
            summary = "Salim purchases a fancy Samsung Note smartphone and becomes engrossed in social media dating apps. Despite warnings from his friend Lawal about scammers and catfishing, Salim is lured by 'Natasha' to an isolated cul-de-sac at night. He is ambushed by armed robbers (Roger and partner) who force their way into his SUV. Thinking fast, Salim starts the car, accelerates at breakneck speed, and swerves violently into mud, causing the robbers to leap out in panic. Salim escapes unharmed and learns a hard lesson on modern technology. Back under the mango tree, Ummi concludes her story as the family prepares to celebrate Omar's admission with their father.",
            keyQuotes = listOf(
                "\"Like all other advancements in technology, there are advantages in owning a Smartphone and there are also disadvantages.\"",
                "\"You've got to know when to hold 'em... escape or death.\"",
                "\"We will tell Daddy together. We sit here and wait for him to come back... waiting for Daddy.\""
            ),
            fullText = """
It was not too long ago that Salim bought his first smartphone. It was the Samsung brand and it had this wide screen that responded to a stylus touch as well as the fingers of the owner. They called it the Note Series. It was really unique and he was so proud of it. Of course, it was expensive. But for someone whose marriage had not been fixed, even Salma herself encouraged him to enjoy his money before marriage responsibilities ensnared him.

He hearkened to her advice and said he was going to use the phone. He discovered several dating sites and downloaded the applications. In the beginning Salma was not aware of this. The social media was awash with many of these chat rooms and all one needed to do was to download the application of a particular chat group and one would be linked up to whoever one desired.
Salim was into all conceivable instant and distant relationship social outlets. I think they still abound. He was on Facebook, Tweeter, Instagram, WhatsApp, Badoo, 2Go, WeChat all these plus so many others that Salma could not remember their names. He told her all this after his nasty experience.

One day, Salim had gone to his friend, Lawal, all excited, and told him he had a new girlfriend.
Lawal was sitting in the living room watching his inevitable wrestling programme. He muted the sound from the remote control in his hand to better listen to his friend.
"Salim, I don't know what is wrong with you. You have Salma as fiancée and now you are talking about a girlfriend. What kind of life is this?"
"Point of correction, my friend. Salma is technically my wife. We are just waiting for the day to be fixed. But you know man must be allowed some moment of unchecked rascality before becoming another woman's personal property or slave."
"I guess you found yet another girl that seems to catch your fancy. Where did you meet her?"
"My friend, stop joking. You have not met her before. But you will now. See? Come and have a look." Salim brought out his phone and showed a particular picture to Lawal.

"You did not tell me you now like Indian women." Lawal said.
"You see? She is that beautiful. She is not Indian. She said she is Fulani."
"When did you see her?"
Salim hesitated and shrugged. "I did not really meet her physically. But we have been chatting for over one week now."
"And you are convinced that she is who she has claimed to be?"
"Sure. Why should I doubt that?"
"Why not? My friend, you are being deceived by social media. People use fake DP pictures."

Salim did not take Lawal's advice. Natasha sent him a friend request and they started chatting. More than half of her pictures were semi-nude and extremely attractive. When she invited him to come visiting, he did not hesitate.
She described their house to him at the back of the school, insisting he come between eight and nine in the night.
I drove my car slowly down the alley she described. I followed the description till I came to a place where there was very little illumination and she asked me to stop there. The place was actually a cul-de-sac. Characteristically, you know, I always parked my car military style fashion—facing the direction I would go when leaving so I would just enter and drive off.

And Natasha came out. She was even more beautiful than she appeared in her pictures, highly endowed and flaunting those endowments. She motioned me to come in. She declined coming into the car, then suddenly I heard the passenger door open!
I turned to see a very hefty stranger pointing a gun at me.
"Do not say a word," the man with a gun said. "Just hand over the car keys and come to the back seat."
A second armed robber jumped in from behind.

"Natasha followed, her body shaking, whispering, 'Please don't hurt him. And you my dear, give them whatever they want.'"
Of course I noticed the self-distancing in her first sentence. Don't hurt him. My eyes instantly cleared. I knew instantly that she was part of the conspiracy. She was the bait used to lure susceptible men into dark alleys.
"He instructed his companion whom he addressed as Roger to start the car. Strangely enough the car would not start. Roger did his best but the car would not start.
When the car refused to pick, I was asked to start it.
When I sat behind the driving wheel, I touched the gear lever and discovered that it was still engaged in Drive. Since the car was an automatic transmission, the ignition would not pick so long as the gear is engaged. I returned the lever to Park and turned on the ignition. The car started. Then I was ordered to let Roger drive. But Roger could not engage the gear. The robber shouted, 'Let this lover boy drive the car himself to the office.'

From the moment I once again sat behind the wheel, there was only one thought: escape or death. I started driving slowly then when I came near another turn, I ignored them. The man with the gun kept threatening he would waste me. Impulsively, I decided to waste all of us in the car. I pressed hard on the accelerator pedal and the car gathered momentum and flew ahead at breakneck speed.
I swerved to the right when I saw that the only vehicle coming was from my left. As I swerved, my right front wheel got momentarily stuck in the mud but I accelerated and it became unstuck.
While this was going on, I looked to my right and discovered that the man wielding the gun earlier had disappeared from the vehicle. I turned around. There was nobody at the back seat either. Roger and Natasha seemed to have disappeared into thin air!
They must have jumped out and disappeared into the darkness, no doubt sustaining bruises. Since I was alive and healthy, I drove straight home."

*******

And it never happened again. Shortly after that incident which he narrated to Lawal, Salim got engaged to Salma.
Teemah turned her chair and looked at Omar. "So, Mr Smartphone, you have heard what you are getting yourself into. Even older people who had more sense than you escaped the evil of social media by the skin of their teeth. What guarantee do you have that you would be good?"
"Mum?"
"Omar, I do not have anything against your phone. You deserve it. Just be careful about the negative effect of the social media."
"I will, Mum, I will."
"So would you tell Teemah not to be in a hurry to tell Dad?"
"I have a better idea," I said.
"What is it, mummy?" all the girls asked as in a chorus.
"We will tell Daddy together. We sit here and wait for him to come back and as soon as he enters we would all jump and let the news come out loudly that Omar has gotten admission. That way he would be so excited whatever you ask, you would get."
"That is superb. You really know your man." The girls said all excited already.
"We will wait for Daddy," I said.
So we all remained seated there under the tree, waiting for Daddy.
            """.trimIndent()
        )
    )

    val literaryDevices: List<LiteraryDeviceItem> = listOf(
        LiteraryDeviceItem(
            category = "Figures of Speech",
            deviceName = "Simile",
            example = "\"They are like the policeman at the checkpoint...\"",
            contextAndAnalysis = "Salma explicitly compares university lecturers to roadside police officers who delay motorists to extract bribes or alleviate boredom. Also: 'shivering like some rain drenched chicken' (Salma's humiliation when the man in the queue turns out to be the screening lecturer), and 'They are like a spindle' (Tomiwa describing dishonest politicians)."
        ),
        LiteraryDeviceItem(
            category = "Figures of Speech",
            deviceName = "Metaphor & Euphemism",
            example = "\"Notes of Salvation\" & \"Faculty of Suya\"",
            contextAndAnalysis = "'Notes of Salvation' is a metaphorical euphemism for smuggled examination cheat notes (EMAL). 'Faculty of Suya' is a metaphor for the popular campus suya steak stand. 'Justice was just ice. Frozen.' metaphorically compares earthly justice to unmelting ice."
        ),
        LiteraryDeviceItem(
            category = "Literary Techniques",
            deviceName = "Situational & Dramatic Irony",
            example = "Salma attempting to bribe the young lecturer in the queue",
            contextAndAnalysis = "1. Salma loudly mocks the screening lecturer while standing in the registration queue, offering to bribe the young man beside her to bypass him—only for that young man to be the actual lecturer.\n2. Salma insults Prof. Dabo for making romantic advances, but later visits Speaker Habib Lawal to beg for academic intervention using the same seductive power.\n3. Salma gives Habib Tomiwa's number as a trick, which leads to Habib showering Tomiwa with cash and provisions, triggering intense jealousy in Salma.\n4. Salma pays 100k bribe to 'Dr. Kabir' to escape expulsion, only to discover Kabir is an ordinary lab technician and gambler."
        ),
        LiteraryDeviceItem(
            category = "Allusions & Cultural References",
            deviceName = "Literary & Musical Allusion",
            example = "Kenny Rogers' 'The Gambler', Mario Puzo's 'The Godfather', William Shakespeare",
            contextAndAnalysis = "1. Kenny Rogers' country song 'The Gambler' is alluded to in Chapter 8 as Kabir plays cards in the smoky gambling den.\n2. Mario Puzo's crime novel 'The Godfather' is referenced by Tomiwa in Chapter 5 when she fears being garrotted from the back seat of the Mercedes Benz.\n3. William Shakespeare and Aristotle are alluded to playfully in sibling banter by Teemah and Omar in Chapter 1."
        ),
        LiteraryDeviceItem(
            category = "Idioms & Proverbs",
            deviceName = "Proverbs & Idiomatic Expressions",
            example = "\"What you teach a child is like writing on a rock and when dried it would be difficult to erase.\"",
            contextAndAnalysis = "Emphasizes the indelible impact of early moral upbringing. Other idioms include: 'Running before learning to crawl' (boasting prematurely), 'Money moves mountains' (the corrupt belief in the power of wealth), 'A bird that chooses to fly in cloudy weather should expect its flight to be cut by rain' (taking reckless risks invites doom)."
        ),
        LiteraryDeviceItem(
            category = "Structure & Narrative Technique",
            deviceName = "Frame Story / Story-Within-a-Story",
            example = "Ummi narrating tales to her children under the mango tree",
            contextAndAnalysis = "The novel employs a classic frame narrative structure: Ummi sits in the courtyard with Omar, Bint, Teemah, and Jamila awaiting their father, while weaving internal retrospective narratives (her university days, Talle's saga, Salma's downfall, and Salim's car robbery)."
        )
    )

    val characters: List<CharacterProfile> = listOf(
        CharacterProfile(
            name = "Ummi Ahmad",
            role = "The Narrator & Mother",
            traits = listOf("Wise", "Moral", "Patient", "Educated", "Supportive"),
            description = "A mother of four and seasoned teacher who uses personal anecdotes and moral tales to prepare her son Omar and daughters for the outside world.",
            keyMoments = "Securing admission to ABU Zaria 20 years earlier as matric number UG0001 under Dr. Samuel Johnson; narrating the stories under the mango tree."
        ),
        CharacterProfile(
            name = "Omar",
            role = "Ummi's 18-year-old First Son",
            traits = listOf("Precocious", "Ambitious", "Neat", "Eager to Learn"),
            description = "Scores 230 in JAMB and 7 credits in WAEC to gain admission into Law at Kongo Campus, ABU Zaria. Nicknames himself 'My Learned Brother' / 'Omar Esquire'.",
            keyMoments = "Bringing home his admission letter; bargaining with his parents for a smartphone; absorbing the vital life lessons from his mother's stories."
        ),
        CharacterProfile(
            name = "Salma Mohammed",
            role = "The Central Protagonist / Tragic Heroine",
            traits = listOf("Proud", "Ostentatious", "Seductive", "Vulnerable", "Redeemed"),
            description = "A sophisticated student whose excessive pride, provocative dressing, and examination cheating lead to expulsion, financial duping, and eventual moral redemption.",
            keyMoments = "Humiliating Prof. Dabo; giving Habib Tomiwa's number; getting caught copying cheat notes in Moral Philosophy; being swindled by Kabir; repenting after her father's death."
        ),
        CharacterProfile(
            name = "Honourable Habib Lawal",
            role = "Speaker of the State House of Assembly",
            traits = listOf("Affluent", "Influential", "Opportunistic", "Politically Astute"),
            description = "A wealthy politician who cruises in a black Mercedes Benz with his driver Labaran. He dates Tomiwa and attempts to help Salma in exchange for favours.",
            keyMoments = "Picking up Tomiwa; showering Queen Amina Hall roommates with 50k and provisions; sending Zaki to recover Salma's stolen money from Kabir."
        ),
        CharacterProfile(
            name = "Mohammed Kabir (Dr. Kabir)",
            role = "The Fraudulent Laboratory Technologist",
            traits = listOf("Deceptive", "Friendly", "Gambler", "Impecunious"),
            description = "An LT lab assistant at the university nicknamed 'Doctor', who poses as the Exams and Ethics Committee Chairman to swindle 100,000 Naira from desperate Salma.",
            keyMoments = "Meeting Salma at an off-campus hotel; pocketing 100k; winning 300k at Kartagi's gambling joint before being beaten and robbed by Zaki."
        ),
        CharacterProfile(
            name = "Talle ('The Quiet One')",
            role = "Lafayette Local Government Driver",
            traits = listOf("Pious", "Taciturn", "Naive", "Easily Influenced"),
            description = "A quiet, devout villager in Lafayette whose double food purchases reveal he harbored a kidnapped 13-year-old boy for Zaki.",
            keyMoments = "Fainting when police vans arrive; being sentenced to hard labour for accessory to kidnapping and extortion."
        ),
        CharacterProfile(
            name = "Tomiwa, Ngozi & Ada",
            role = "Queen Amina Hall Roommates",
            traits = listOf("United", "Diverse", "Supportive", "Academically Focused"),
            description = "Tomiwa (from Ibadan, ambitious singer), Ngozi (from Umunze in Imo State, generous with food), and Ada (from Benue State) form a harmonious sisterhood.",
            keyMoments = "Cooking Indomie, snail, and Danwake together; sharing Habib's 50k gift; maintaining friendship throughout their 4-year undergraduate journey."
        ),
        CharacterProfile(
            name = "Salim & Natasha",
            role = "Salim (Salma's suitor) & Natasha (Social media bait)",
            traits = listOf("Salim: Tech-curious, Resilient", "Natasha: Deceptive, Seductive lure"),
            description = "Salim's online infatuation with Natasha leads him into an armed carjacking ambush in a dark cul-de-sac, from which he escapes by driving recklessly into mud.",
            keyMoments = "Salim outsmarting the robbers by operating the automatic transmission; turning away from social media vices to marry reformed Salma."
        )
    )

    val themes: List<NovelThemeItem> = listOf(
        NovelThemeItem(
            title = "Morality, Integrity and Upbringing",
            description = "The central thesis that moral character outweighs intellectual arrogance. Upbringing and early home discipline serve as an unbreakable anchor against university temptations.",
            occurrencesInNovel = "Ummi's teachings to her children; Ummi's refusal to bypass the registration line; the proverb of writing on rock.",
            utmeTakeaway = "UTME questions often focus on parental guidance and how moral grounding shields students from campus decadence."
        ),
        NovelThemeItem(
            title = "Examination Malpractice (EMAL) & Its Consequences",
            description = "The severe repercussions of academic dishonesty. Cheating destroys future prospects, resulting in rustication, betrayal, and lasting regret.",
            occurrencesInNovel = "Salma neglecting Moral Philosophy and copying Kolawole's 'Notes of Salvation'; signing the EMAL form; their eventual expulsion.",
            utmeTakeaway = "Key questions focus on the EMAL form, the role of Kolawole as witness/accomplice, and the zero-tolerance policy of tertiary institutions."
        ),
        NovelThemeItem(
            title = "Appearance versus Reality (Deception & False Facades)",
            description = "Things and people are rarely what they appear on the surface. Deceptive appearances lead to catastrophic blunders when people rely on outward impressions.",
            occurrencesInNovel = "Talle appearing saintly while hiding a kidnap victim; Kabir wearing a lab coat and posing as an exam committee chairman; Natasha using alluring photos to set up armed robberies.",
            utmeTakeaway = "A frequent UTME focus: 'Never judge a book by its cover' and the irony of characters who look pious or prestigious."
        ),
        NovelThemeItem(
            title = "Dangers of Social Media & Technological Advancements",
            description = "Smartphones and online dating platforms offer speed and convenience but expose naive users to blackmail, extortion, catfishing, and physical harm.",
            occurrencesInNovel = "Salim's experience on 2Go/Badoo/Facebook; being lured into a cul-de-sac by fake DP photos and semi-nude bait.",
            utmeTakeaway = "Relates directly to modern UTME comprehension passages on the double-edged sword of digital technology."
        ),
        NovelThemeItem(
            title = "Unity in Cultural & Religious Diversity",
            description = "In a multi-ethnic society, tolerance, mutual respect, and shared humanity bridge cultural divides.",
            occurrencesInNovel = "The harmonious cohabitation of Salma (Hausa Muslim), Tomiwa (Yoruba Muslim), Ngozi (Igbo Christian), and Ada (Middle Belt Christian) in Queen Amina Hall.",
            utmeTakeaway = "Highlights national integration, mutual accommodation of ethnic cuisines (Danwake, Snail, Indomie), and religious harmony."
        ),
        NovelThemeItem(
            title = "Repentance, Transformation & Redemption",
            description = "Even after profound failure, genuine remorse and humility can restore a person's life trajectory.",
            occurrencesInNovel = "Salma's complete turnaround after losing her father and facing expulsion; Professor Dabo repenting after his brief moral lapse.",
            utmeTakeaway = "Focuses on why the novel is titled 'The Life Changer'—how adversity and education fundamentally transform human personality."
        )
    )

    val quizQuestions: List<LifeChangerQuizQuestion> = listOf(
        LifeChangerQuizQuestion(
            id = 1,
            question = "In 'The Life Changer', what course was Omar admitted to study at Ahmadu Bello University (ABU), Zaria?",
            options = listOf(
                "A) Accounting",
                "B) Law",
                "C) Medicine & Surgery",
                "D) French Studies"
            ),
            correctIndex = 1,
            explanation = "Omar was admitted to study Law at the Kongo Campus of Ahmadu Bello University (ABU), Zaria."
        ),
        LifeChangerQuizQuestion(
            id = 2,
            question = "What score did Omar achieve in his Joint Admissions and Matriculation Board (JAMB) UTME examination?",
            options = listOf(
                "A) 210 out of 400",
                "B) 230 out of 400",
                "C) 275 out of 400",
                "D) 310 out of 400"
            ),
            correctIndex = 1,
            explanation = "Omar scored 230 out of 400 in his UTME exams and achieved 7 credits in his WAEC at first sitting."
        ),
        LifeChangerQuizQuestion(
            id = 3,
            question = "Why was Talle known as 'The Quiet One' in the village of Lafayette?",
            options = listOf(
                "A) He was born mute and could not speak",
                "B) He had an extremely reserved, non-confrontational, and pious disposition",
                "C) The Hakimi ordered him never to speak to strangers",
                "D) He worked as a silent night watchman"
            ),
            correctIndex = 1,
            explanation = "Talle was naturally quiet, never engaged in fights, and retreated further into piety and silence after losing his parents in a road accident."
        ),
        LifeChangerQuizQuestion(
            id = 4,
            question = "What crime was Talle found guilty of in the Lafayette community?",
            options = listOf(
                "A) Embezzling local government funds",
                "B) Stealing cattle from the Hakimi's palace",
                "C) Acting as an accessory to kidnapping and extortion by harboring a 13-year-old boy",
                "D) Operating an illegal gambling den"
            ),
            correctIndex = 2,
            explanation = "Talle harbored an abducted 13-year-old boy in his house for one week on behalf of Zaki for a ransom of 250,000 Naira."
        ),
        LifeChangerQuizQuestion(
            id = 5,
            question = "What name and phone number did Salma give to Honourable Habib Lawal when he offered her a ride in his Mercedes Benz?",
            options = listOf(
                "A) Her own real name and number",
                "B) Ummi's contact details",
                "C) Her roommate Tomiwa's name and telephone number",
                "D) A fake imaginary identity"
            ),
            correctIndex = 2,
            explanation = "Salma gave her roommate Tomiwa's name and phone number off-hand to avoid giving her own details to the men in the Benz."
        ),
        LifeChangerQuizQuestion(
            id = 6,
            question = "What euphemistic term did university students in the novel use for examination cheat notes?",
            options = listOf(
                "A) Holy Scrolls",
                "B) Notes of Salvation",
                "C) Golden Passports",
                "D) Miracle Tablets"
            ),
            correctIndex = 1,
            explanation = "Students used the euphemism 'Notes of Salvation' to refer to smuggled cheat notes into examination halls."
        ),
        LifeChangerQuizQuestion(
            id = 7,
            question = "Who passed the cheat notes to Salma during the final Moral Philosophy examination?",
            options = listOf(
                "A) Honourable Habib",
                "B) Kolawole Abdul",
                "C) Mohammed Kabir",
                "D) Professor Dabo"
            ),
            correctIndex = 1,
            explanation = "Kolawole Abdul, the brightest student in the class, succumbed to Salma's persistent whispers and slipped her coded answers."
        ),
        LifeChangerQuizQuestion(
            id = 8,
            question = "What was Mohammed Kabir's real profession at the university?",
            options = listOf(
                "A) Professor of Biological Sciences and Committee Chairman",
                "B) Laboratory Technologist (LT) / lab attendant and compulsive gambler",
                "C) Dean of the Faculty of Arts",
                "D) Senior Security Officer"
            ),
            correctIndex = 1,
            explanation = "Mohammed Kabir was not a medical doctor or PhD holder, but an ordinary Laboratory Technologist (LT) and compulsive gambler."
        ),
        LifeChangerQuizQuestion(
            id = 9,
            question = "Which country song does Zaki recall while trailing Kabir in the gambling den?",
            options = listOf(
                "A) 'The Gambler' by Kenny Rogers",
                "B) 'Take Me Home, Country Roads' by John Denver",
                "C) 'Ring of Fire' by Johnny Cash",
                "D) 'Coat of Many Colors' by Dolly Parton"
            ),
            correctIndex = 0,
            explanation = "Zaki mentally recites the chorus of Kenny Rogers' classic song 'The Gambler' ('You've got to know when to hold 'em...')."
        ),
        LifeChangerQuizQuestion(
            id = 10,
            question = "How did Salim escape the armed robbers (Roger and partner) in the dark cul-de-sac?",
            options = listOf(
                "A) He disarmed the robber with martial arts",
                "B) He shifted the automatic gear to Park, started the car, accelerated violently and swerved into mud",
                "C) The police arrived with sirens in time",
                "D) Natasha turned against the robbers and shot them"
            ),
            correctIndex = 1,
            explanation = "Salim realized the automatic transmission was in gear, put it in Park, started the SUV, accelerated at top speed, and swerved into mud causing the robbers to leap out."
        )
    )
}
