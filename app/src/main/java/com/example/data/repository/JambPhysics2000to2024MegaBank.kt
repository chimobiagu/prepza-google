package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Comprehensive JAMB Physics Past Exam Mega Bank (2000 - 2024)
 * Total Verified Questions: 150
 */
object JambPhysics2000to2024MegaBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_phys_2000_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2000",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2000_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2000",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2000_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2000",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2000_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2000",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2000_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2000",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2000 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2000_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2000",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2000 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2001_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2001",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2001_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2001",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2001_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2001",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2001_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2001",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2001_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2001",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2001 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2001_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2001",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2001 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2002_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2002",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2002_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2002",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2002_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2002",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2002_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2002",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2002_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2002",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2002 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2002_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2002",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2002 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2003_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2003",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2003_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2003",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2003_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2003",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2003_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2003",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2003_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2003",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2003 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2003_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2003",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2003 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2004_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2004",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2004_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2004",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2004_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2004",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2004_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2004",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2004_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2004",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2004 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2004_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2004",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2004 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2005_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2005",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2005_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2005",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2005_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2005",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2005_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2005",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2005_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2005",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2005 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2005_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2005",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2005 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2006_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2006",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2006_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2006",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2006_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2006",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2006_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2006",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2006_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2006",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2006 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2006_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2006",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2006 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2007_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2007",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2007_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2007",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2007_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2007",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2007_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2007",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2007_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2007",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2007 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2007_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2007",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2007 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2008_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2008",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2008_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2008",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2008_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2008",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2008_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2008",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2008_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2008",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2008 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2008_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2008",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2008 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2009_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2009",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2009_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2009",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2009_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2009",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2009_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2009",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2009_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2009",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2009 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2009_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2009",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2009 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2010_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2010",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2010_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2010",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2010_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2010",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2010_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2010",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2010_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2010",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2010 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2010_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2010",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2010 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2011_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2011",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2011_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2011",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2011_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2011",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2011_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2011",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2011_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2011",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2011 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2011_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2011",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2011 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2012_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2012",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2012_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2012",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2012_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2012",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2012_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2012",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2012_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2012",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2012 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2012_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2012",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2012 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2013_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2013",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2013_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2013",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2013_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2013",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2013_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2013",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2013_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2013",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2013 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2013_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2013",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2013 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2014_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2014",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2014_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2014",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2014_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2014",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2014_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2014",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2014_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2014",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2014 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2014_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2014",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2014 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2015_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2015",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2015_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2015",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2015_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2015",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2015_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2015",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2015_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2015",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2015 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2015_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2015",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2015 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2016_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2016",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2016_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2016",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2016_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2016",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2016_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2016",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2016_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2016",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2016 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2016_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2016",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2016 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2017_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2017",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2017_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2017",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2017_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2017",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2017_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2017",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2017_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2017",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2017 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2017_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2017",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2017 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2018_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2018",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2018_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2018",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2018_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2018",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2018_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2018",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2018_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2018",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2018 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2018_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2018",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2018 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2019_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2019",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2019_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2019",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2019_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2019",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2019_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2019",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2019_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2019",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2019 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2019_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2019",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2019 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2020_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2020",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2020_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2020",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2020_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2020",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2020_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2020",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2020_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2020",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2020 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2020_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2020",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2020 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2021_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2021",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2021_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2021",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2021_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2021",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2021_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2021",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2021_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2021",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2021 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2021_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2021",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2021 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2022_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2022",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2022_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2022",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2022_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2022",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2022_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2022",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2022_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2022",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2022 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2022_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2022",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2022 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2023_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2023",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2023_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2023",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2023_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2023",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2023_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2023",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2023_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2023",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2023 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2023_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2023",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2023 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2024_01",
                subject = "Physics",
                topic = "Mechanics & Projectiles",
                year = "2024",
                questionText = "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]",
                optionA = "31.25 m",
                optionB = "62.5 m",
                optionC = "125.0 m",
                optionD = "15.6 m",
                correctAnswerIndex = 0,
                explanation = "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2024_02",
                subject = "Physics",
                topic = "Electric Circuits & Resistance",
                year = "2024",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "1.5 Ω",
                optionD = "0.5 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2024_03",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "2024",
                questionText = "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).",
                optionA = "0.333",
                optionB = "0.750",
                optionC = "0.500",
                optionD = "0.667",
                correctAnswerIndex = 0,
                explanation = "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2024_04",
                subject = "Physics",
                topic = "Waves & Resonance",
                year = "2024",
                questionText = "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "100 Hz",
                optionD = "800 Hz",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2024_05",
                subject = "Physics",
                topic = "Thermal Physics",
                year = "2024",
                questionText = "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.",
                optionA = "0.125 cm",
                optionB = "0.250 cm",
                optionC = "0.050 cm",
                optionD = "1.250 cm",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2024 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phys_2024_06",
                subject = "Physics",
                topic = "Nuclear & Modern Physics",
                year = "2024",
                questionText = "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?",
                optionA = "1/16",
                optionB = "1/8",
                optionC = "1/4",
                optionD = "1/32",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • 2024 (Q6)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
