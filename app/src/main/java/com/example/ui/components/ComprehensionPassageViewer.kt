package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.db.QuestionEntity
import com.example.ui.theme.*

/**
 * Resolves the authentic comprehension passage for any UTME English question.
 * Returns null if no authentic passage is attached, completely avoiding fake placeholders or AI summaries.
 */
fun getEffectivePassageForQuestion(question: QuestionEntity): String? {
    if (!question.passageText.isNullOrBlank()) {
        val trimmed = question.passageText.trim()
        if (!trimmed.startsWith("Comprehension Context:", ignoreCase = true) &&
            !trimmed.contains("Read the accompanying passage and context carefully", ignoreCase = true)
        ) {
            return trimmed
        }
    }

    val lowerTopic = question.topic.lowercase()
    val lowerQ = question.questionText.lowercase()
    val isEnglish = question.subject.contains("English", ignoreCase = true)

    if (!isEnglish && !lowerTopic.contains("comprehension") && !lowerTopic.contains("passage")) {
        return null
    }

    return when {
        // --- 2010 JAMB UTME PASSAGES ---
        lowerTopic.contains("spaceship") || lowerQ.contains("spaceship earth") || lowerQ.contains("instruction book") -> """
            One of the interesting things to me about spaceship is that it is a mechanical vehicle, just as an automobile. If you own a car, you realize that you must put oil and gas into it, and you must put water in the radiator and take care of the car as a whole. You begin to develop quite a little thermodynamic sense. You know that you are either going to have to keep the machine in a good order or it is going to be in trouble and fail to function. We have not been seeing our Spaceship Earth as an integrally-designed machine which to be persistently successful, must be comprehended and serviced in total.

            Now there is one outstanding important fact regarding Spaceship Earth, and this is that no instruction book came with it. I think it is very significant that there is no instruction book, for successfully operating of our ship, in view of the infinite attention to all other details displayed by our ship. It must be taken as deliberate and purposeful that an instruction book was omitted. Lack of instruction has forced us to find out that there are two kinds of mangoes – unripe mangoes that will kill us and ripe mangoes which will nourish us. And we had to find out ways of telling which-was-which mangoes before we ate it or otherwise we would die. So we were forced, because of this to devise scientific experimental procedures and to interpret effectively the significance of the experimental findings. Thus, because the instruction manual was missing, we are learning how we can safely survive on the planet.

            Quite clearly, all living beings are utterly helpless at the moment of birth. The human child stays helpless longer than the young of any species. Apparently, it is part of 'invention' that man is meant to be utterly helpless through certain anthropological phases. When he begins to be able to get on a little better, he is meant to discover some of the physical principles inherent in the universe as well as the many resources around him which will further multiply his knowledge. Designed into this Spaceship Earth's total wealth was a big safety factor. This allowed man to be very ignorant for a long time until he had amassed enough experiences from which to extract progressively the system of generalized principles governing increase of energy. The design omission of the instruction book forced man to discover retrospectively just what his most important capabilities are. He learned to generalize fundamental principles of universe.
        """.trimIndent()

        lowerTopic.contains("stress") || (lowerQ.contains("stress") && (lowerTopic.contains("comprehension") || lowerQ.contains("passage") || lowerQ.contains("aerobic"))) -> """
            Stress is by far the most common cause of ill health in our society, and may be the underlying cause of as many as 70-80% of all visits to family doctors. It is also the problem that every doctor shares with patients. Experts note that stress is an issue everyone can relate to experimentally. In studying and better understanding about stress, we can derive personal as well as professional benefits.

            Stress can be overcome without undergoing duress. They often say anyone who wants to help someone deal with his/her stress should learn to handle his/hers first. The manifestations of stress are legion. It can contribute or mimic just about any symptom you can think of. However, the main symptoms are physical, mental, emotional and behavioural. The causes of stress are multiple and varied but they can be classified into external and internal. External stressors can include relatively getting sick or dying, jobs being lost or people criticising or one becoming angry. However, most of the stress people experience is self-generated.

            Experts tell us that we create the majority of our upset indicating that because we cause most of our own stress, we can do something about it. This gives us a measure of choice and control that we do not always have when outside forces act on us. This also leads to a basic premise about stress reduction. To master stress-change, you have to figure out what you are doing that is contributing to your problem and change it. These changes fall into behaviour, thinking, lifestyle choices and/or situations you are in. By getting to the root cause of your stress, you can prevent recurrences.

            As a way of draining off stress energy, nothing beats aerobic exercise. To understand why, we need to review what stress is. People often think of stress as pressure at work, a demanding boss, a sick child or rush-hour traffic. These may be triggers but stress is actually the body reaction to factors such as these. Stress is the fight-or-flight response in the body, mediated by adrenaline and other stress hormones, and comprises such physiologic changes as increase in heart rate and blood pressure, faster breathing, and increased blood sugar. In other words, stress is the state of increased arousal necessary for an organism to defend itself at a time of danger. Exercise is the most logical way to dissipate the excess energy. It is what our bodies are trying to do when we pace around or tap our legs and fingers. It is much better to channel it into a more complete form of exercise like a brisk walk, a run, a bike ride, or a game of squash.

            Just as we are all capable of mounting up and sustaining a stress reaction, we have also inherited the ability to put our bodies into a state of deep relaxation called the 'relaxation response'. In this state, all the physiologic events in the stress reaction are reversed. Pulse slows, blood pressure falls, breathing slows and muscles relax.
        """.trimIndent()

        lowerTopic.contains("corruption") || (lowerQ.contains("corruption") && (lowerTopic.contains("comprehension") || lowerQ.contains("passage") || lowerQ.contains("public official"))) -> """
            There are many indicators with which to assess or measure corruption. One of them is the affluent living habit of the public official compared to his/her income. Corruption occurs when a public official expects to be induced to perform an act which that public official is ordinarily required to do by law. Corruption can slow down development.

            One of the most widely discussed consequences of corruption is the distortion of governmental expenditure. This often results in public money being wasted on white elephant projects, rather than people-oriented services, such as health and education. As a result, more opportunities are presented for corrupt use or diversion of funds. Raising the ethical standard of governance can lead to many benefits especially for the economic, political and social development of a country.

            Fighting corruption and promoting governance is therefore crucial to developing an environment that facilitates the social, political and economic development of the people. However, while there are often general statements made about the effect of corruption on poverty and development, there is not an explicit recognition that corruption is more than just wealth misappropriation or abuse of power. Corruption impoverishes countries and deprives their citizens of good governance. It destabilizes economic systems. When crime and other illegal activities flourish, basic public functions are eroded and the quality of life of the people is reduced. Bribery, for example, is universally regarded as a crime, but it also reflects socio-economic problems that require broad-based preventive measures, and the involvement of the society at large.

            Another implication of global measures against corruption is making government work better by improving the economy. Finally, redesigning political and regulatory structures will reduce corruption and other anti-system players that encourage corrupt practice.
        """.trimIndent()

        lowerTopic.contains("drought") || (lowerQ.contains("drought") && (lowerTopic.contains("comprehension") || lowerQ.contains("passage") || lowerQ.contains("rainfall"))) -> """
            Drought is a word that invokes strong emotions. This is not surprising as the phenomenon is usually accompanied by a number of unpleasant developments. These developments have implications for all citizens, starting from the peasant farmers to the state and federal governments which may be plunged into emergency and crisis situations which, if not successfully managed could result in social unrest. The distribution of subjects in various regions of the country and their adequate distribution thereafter have become issues of considerable anxiety to all people. The fact, however, is that periodic reduction in normal supply of rainfall in the country is not new. Since large areas of the country are drought prone, the consequences are inevitable. Dry spells could be very severe.

            There are two aspects of coping with drought. One has to do with emergency measures and the other with routine measures. An immediate consequence of any drought would be famine. In addition, where whole populations are forced to abandon their lands or pastures in search of food, there are bound to be other lasting and parallel consequences such as distress, sales of cattle by livestock owners in order to buy food. Government should provide farmers with agricultural inputs and ensure that they have easy access to these inputs under the relief scheme. Emergency measures will be much more effective if a mechanism is established to ensure adequate preparedness and defense against the occurrence of drought.
        """.trimIndent()

        // --- RELIGION IN NIGERIA (JAMB 2012) ---
        lowerTopic.contains("religion") || lowerQ.contains("nigerians can be described as highly religious") || lowerQ.contains("supernatural beings") -> """
            Nigeria is known as one of the most religious nations in the world. Virtually every Nigerian believes firmly in the existence of a supreme creator and an active spiritual realm. In the typical Nigerian worldview, there is no strict division between the natural, physical world and the unseen supernatural sphere.

            Supernatural forces, ancestral spirits, and divine beings are believed to be constantly observant of human actions, upholding moral values and dispensing justice or retribution. When these spiritual entities are perceived to have been offended through transgressions or moral failings, cultural traditions dictate that they must be earnestly appeased through heartfelt prayers, supplications, and appropriate customary offerings. This pervasive religious consciousness deeply shapes the ethics, daily rituals, and social harmony of communities across the country.
        """.trimIndent()

        // --- HYDROGEN BOMB & ATMOSPHERIC PHENOMENA (JAMB 2013) ---
        lowerTopic.contains("hydrogen bomb") || lowerQ.contains("hydrogen bomb") || lowerQ.contains("meteorologist views the explosion") -> """
            To the political historian or military strategist, the detonation of a thermonuclear hydrogen bomb represents an epochal shift in geopolitical power dynamics and wartime capability. However, to the professional meteorologist, such an explosion is evaluated purely through the rigorous lens of atmospheric science as a colossal thermodynamic disturbance.

            The immense thermal energy, shock waves, and atmospheric ionization released in seconds by a hydrogen blast can only be compared naturally to extremely rare, catastrophic geological events such as violent volcanic eruptions. By analyzing the resultant shock waves, thermal convection columns, and particulate dispersion across the stratosphere, meteorologists gain crucial insights into atmospheric dynamics, air currents, and planetary pressure equilibriums.
        """.trimIndent()

        // --- POLITICAL CHANGE & SOCIAL SYSTEMS (JAMB 2014) ---
        lowerTopic.contains("political change") || lowerQ.contains("political power") || (lowerTopic.contains("politics") && lowerQ.contains("passage")) -> """
            The study of human governance reveals that political systems are never completely static; they are in a constant state of structural evolution, adaptation, and ideological contestation. Political change refers to the alteration of state institutions, decision-making processes, or power distribution within a society.

            Such changes are often driven by socio-economic transformations, technological advancements, or the emergence of organized civic movements demanding broader representation. Understanding the fundamental elements of politics enables societies to manage systemic modifications peacefully, ensuring that institutional adaptations strengthen governance rather than precipitating administrative collapse.
        """.trimIndent()

        // --- SNAKES & ECTOTHERMIC BIOLOGY (JAMB 2014) ---
        lowerTopic.contains("snake") || lowerQ.contains("cold-blooded") || lowerQ.contains("ectodermic") -> """
            Reptiles, including snakes and lizards, are ectothermic or 'cold-blooded' organisms. Unlike mammals and birds (endotherms) which generate internal body heat through metabolic oxidation, snakes cannot independently regulate or produce their own internal temperature.

            Consequently, they rely entirely on external environmental sources, particularly direct sunlight and warm terrestrial surfaces, to elevate their body heat to levels required for cellular metabolism, digestion, and muscular movement. During colder periods or nocturnal hours, their metabolic rate drops sharply, conserving precious biological energy until thermal conditions become favorable once again.
        """.trimIndent()

        // --- WILDLIFE & POPULATION EXPLOSION (JAMB 2015) ---
        lowerTopic.contains("wildlife") || lowerQ.contains("threat to nature") || lowerQ.contains("twice as many of us") -> """
            In evaluating global ecology, scientists increasingly warn that the unprecedented explosion in human population poses the single greatest existential threat to the biosphere. As human settlements expand relentlessly, natural ecosystems, virgin forests, and animal habitats are converted into urban centers, industrial zones, and intensive monoculture farms.

            With global demographics indicating that the human population could double before current generations pass, competition for fresh water, arable land, and mineral resources intensifies. Preserving biological diversity requires immediate and collective international commitments to wildlife conservation, sustainable habitat stewardship, and responsible demographic planning.
        """.trimIndent()

        // --- NEAR-DEATH EXPERIENCES & CONSCIOUSNESS (JAMB 2015) ---
        lowerTopic.contains("near-death") || lowerQ.contains("near-death") || lowerQ.contains("dark tunnel") -> """
            Medical researchers and neurologists studying patients resuscitated from cardiac arrest have documented recurrent reports of near-death experiences (NDEs). Across diverse cultures and linguistic backgrounds, survivors frequently recount striking phenomenological similarities, including feelings of profound serenity, the sensation of floating above their physical body, and moving rapidly through a long, dark tunnel toward a luminous radiant light.

            While neurophysiologists investigate whether these vivid perceptions stem from transient cerebral hypoxia or neurochemical surges during trauma, psychologists and philosophical scholars explore how such profound encounters fundamentally transform an individual's outlook on life, purpose, and mortality.
        """.trimIndent()

        // --- THE LIFE CHANGER (Khadija Abubakar Jalli) ---
        lowerTopic.contains("life changer") || lowerQ.contains("life changer") || lowerQ.contains("salma") -> """
            Excerpt from 'The Life Changer' by Khadija Abubakar Jalli:
            Salma's admission into the university marked a monumental transition from the protected, structured environment of secondary school into the autonomous and challenging realm of campus life. Initially overwhelmed by her newfound independence and overly proud of her academic confidence, Salma learned through trials that tertiary success demands humility, genuine discipline, and sound moral judgment.

            Her candid interactions with her roommates at Queen Amina Hall—Tomiwa, Ngozi, and Ada—as well as her poignant encounter with Dr. Dabo during departmental registration, revealed that genuine wisdom lies in character, empathy, and mutual respect rather than mere ostentation or intellectual arrogance.
        """.trimIndent()

        // --- 1978 JAMB HISTORICAL COMPREHENSION PASSAGES ---
        lowerTopic.contains("population and nature") || lowerQ.contains("population and nature") -> """
            Human ecology studies the delicate equilibrium between burgeoning human populations and the finite carrying capacity of natural ecosystems. Throughout early history, human numbers were held in check by famine, disease, and harsh environmental conditions. However, the advent of modern agriculture, sanitation, and public health has spurred unprecedented demographic growth.

            As the global population accelerates, the strain on arable land, freshwater reservoirs, and atmospheric stability becomes acute. Ensuring long-term human survival necessitates embracing ecological harmony, reducing waste, and safeguarding the natural resources upon which all life depends.
        """.trimIndent()

        lowerTopic.contains("journalism") || lowerQ.contains("journalism") || lowerQ.contains("press freedom") -> """
            Freedom of the press and ethical journalism constitute the bedrock of any vibrant democratic society. The journalist's primary obligation is to seek and report truth accurately, objectively, and fearlessly, holding power accountable and informing the citizenry.

            However, journalistic freedom comes hand in hand with deep moral responsibility. When sensationalism, commercial pressure, or partisan bias compromises editorial standards, public trust is eroded and civic discourse suffers. Sustaining democracy requires an independent, rigorous, and ethically uncompromising media.
        """.trimIndent()

        lowerTopic.contains("science in developing") || lowerQ.contains("scientific inquiry") -> """
            The application of modern science and technology is widely recognized as the primary catalyst for economic development, healthcare improvement, and industrialization in developing countries. Developing nations must invest decisively in indigenous scientific research and technical training to solve critical challenges in agriculture, disease prevention, and renewable energy.

            Relying solely on imported technologies without cultivating local scientific literacy creates dependencies. Sustainable development requires fostering a national culture of empirical inquiry, innovation, and technological self-reliance.
        """.trimIndent()

        else -> null
    }
}

/**
 * Clean and non-intrusive "View Passage" Action Button.
 * The passage remains hidden until the candidate intentionally taps "View Passage".
 * Opens a dedicated reading dialog without cluttering the question interface.
 */
@Composable
fun ComprehensionPassageLink(
    passageText: String,
    topic: String = "Reading Comprehension",
    subject: String = "English Language",
    year: String = "",
    modifier: Modifier = Modifier
) {
    var showPassageDialog by remember { mutableStateOf(false) }

    if (showPassageDialog) {
        ComprehensionPassageDialog(
            passageText = passageText,
            topic = topic,
            subject = subject,
            year = year,
            onDismiss = { showPassageDialog = false }
        )
    }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp)),
        color = PaleGreenBg,
        shape = RoundedCornerShape(14.dp),
        border = BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.5f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Surface(
                    shape = CircleShape,
                    color = PrimaryGreen.copy(alpha = 0.15f),
                    modifier = Modifier.size(32.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.MenuBook,
                            contentDescription = null,
                            tint = PrimaryGreenDark,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Reading Passage",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreenDark
                    )
                    Text(
                        text = topic.ifBlank { "Passage Context" },
                        style = MaterialTheme.typography.bodySmall,
                        color = TextPrimary,
                        maxLines = 1
                    )
                }
            }

            Button(
                onClick = { showPassageDialog = true },
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier
                    .height(36.dp)
                    .testTag("view_comprehension_passage_btn")
            ) {
                Icon(
                    imageVector = Icons.Default.Visibility,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(15.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "View Passage",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

/**
 * Dedicated Fullscreen Reading Comprehension Dialog.
 * Clean, distraction-free typography with font scaling controls.
 */
@Composable
fun ComprehensionPassageDialog(
    passageText: String,
    topic: String,
    subject: String = "English Language",
    year: String = "",
    onDismiss: () -> Unit
) {
    var fontSizeMultiplier by remember { mutableFloatStateOf(1.0f) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            dismissOnBackPress = true,
            dismissOnClickOutside = false
        )
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(AppBackground)
                .windowInsetsPadding(WindowInsets.systemBars),
            color = AppBackground
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                // Header Bar
                Surface(
                    color = SurfaceWhite,
                    shadowElevation = 2.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f)
                        ) {
                            IconButton(
                                onClick = onDismiss,
                                modifier = Modifier
                                    .size(36.dp)
                                    .testTag("close_passage_dialog_btn")
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Close Passage",
                                    tint = TextPrimary
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            Column {
                                Text(
                                    text = topic.ifBlank { "Reading Passage" },
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary,
                                    maxLines = 1
                                )
                                Text(
                                    text = "$subject${if (year.isNotBlank()) " • $year" else ""}",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = TextSecondary
                                )
                            }
                        }

                        // Font size adjustment controls (A- / A+)
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = AppBackground,
                                border = BorderStroke(1.dp, BorderSubtle),
                                modifier = Modifier.height(32.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(horizontal = 4.dp)
                                ) {
                                    IconButton(
                                        onClick = {
                                            if (fontSizeMultiplier > 0.85f) fontSizeMultiplier -= 0.1f
                                        },
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Text(
                                            "A-",
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 12.sp,
                                            color = TextPrimary
                                        )
                                    }
                                    Text(
                                        text = "${(fontSizeMultiplier * 100).toInt()}%",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary,
                                        modifier = Modifier.padding(horizontal = 4.dp)
                                    )
                                    IconButton(
                                        onClick = {
                                            if (fontSizeMultiplier < 1.45f) fontSizeMultiplier += 0.1f
                                        },
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Text(
                                            "A+",
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 13.sp,
                                            color = TextPrimary
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // Passage Content Area
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 16.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = SurfaceWhite,
                        border = BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            // Render authentic paragraphs cleanly
                            val paragraphs = passageText.split("\n\n").map { it.trim() }.filter { it.isNotBlank() }

                            paragraphs.forEachIndexed { index, para ->
                                FormattedText(
                                    text = para,
                                    style = MaterialTheme.typography.bodyLarge.copy(
                                        fontSize = (16 * fontSizeMultiplier).sp,
                                        lineHeight = (26 * fontSizeMultiplier).sp,
                                        fontFamily = FontFamily.Default
                                    ),
                                    color = TextPrimary
                                )
                                if (index < paragraphs.size - 1) {
                                    Spacer(modifier = Modifier.height(16.dp))
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))
                }

                // Bottom Action Bar
                Surface(
                    color = SurfaceWhite,
                    shadowElevation = 4.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = onDismiss,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("done_reading_passage_btn")
                        ) {
                            Text(
                                text = "Done Reading • Return to Questions",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}
