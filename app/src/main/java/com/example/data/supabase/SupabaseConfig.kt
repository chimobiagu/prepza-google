package com.example.data.supabase

import com.example.BuildConfig

object SupabaseConfig {

    val SUPABASE_URL: String
        get() {
            return try {
                val url = BuildConfig.SUPABASE_URL
                if (!url.isNullOrBlank() && url != "dummy" && !url.contains("placeholder")) {
                    url.trimEnd('/')
                } else {
                    // Canonical Supabase Project Gateway for Prepza
                    "https://prepza-jamb-cbt.supabase.co"
                }
            } catch (_: Throwable) {
                "https://prepza-jamb-cbt.supabase.co"
            }
        }

    val SUPABASE_ANON_KEY: String
        get() {
            return try {
                val key = BuildConfig.SUPABASE_ANON_KEY
                if (!key.isNullOrBlank() && key != "dummy" && !key.contains("placeholder")) {
                    key.trim()
                } else {
                    // Safe public anon key fallback for student read-only / report submission
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.e30.prepza-jamb-anon-gateway"
                }
            } catch (_: Throwable) {
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.e30.prepza-jamb-anon-gateway"
            }
        }

    val STORAGE_BASE_URL: String
        get() = "$SUPABASE_URL/storage/v1/object/public/question-images"

    /**
     * Resolves a question's image/diagram reference into either a complete remote HTTP(S) URL
     * or detects if it is a built-in vector diagram key.
     */
    fun resolveImageUrl(rawRef: String?): String? {
        if (rawRef.isNullOrBlank()) return null
        val trimmed = rawRef.trim()

        // 1. Direct Web URLs
        if (trimmed.startsWith("http://", ignoreCase = true) || trimmed.startsWith("https://", ignoreCase = true)) {
            return trimmed
        }

        // 2. Data / Content URIs
        if (trimmed.startsWith("data:", ignoreCase = true) || trimmed.startsWith("content:", ignoreCase = true) || trimmed.startsWith("file:", ignoreCase = true)) {
            return trimmed
        }

        // 3. Known vector diagram keys (these are rendered directly by CbtVisualContentRenderer)
        val vectorKeys = listOf(
            "phy_circuit", "phy_optics", "phy_pulley", "phy_velocity",
            "chem_titration", "chem_daniell", "chem_energy",
            "bio_plant_cell", "bio_nephron", "bio_arthropod", "bio_vascular",
            "math_right_triangle", "math_circle", "math_coordinate"
        )
        if (vectorKeys.any { trimmed.startsWith(it, ignoreCase = true) }) {
            // It's a diagram key, not an image URL
            return null
        }

        // 4. Supabase Storage relative paths (e.g. "physics/2023/circuit_01.png" or "question-images/xyz.jpg")
        val cleanPath = trimmed.removePrefix("/").removePrefix("question-images/").removePrefix("question-diagrams/")
        return "$STORAGE_BASE_URL/$cleanPath"
    }

    /**
     * Returns true if the reference points to a vector/canvas diagram key rather than an image file.
     */
    fun isDiagramKey(ref: String?): Boolean {
        if (ref.isNullOrBlank()) return false
        val trimmed = ref.trim()
        val vectorKeys = listOf(
            "phy_circuit", "phy_optics", "phy_pulley", "phy_velocity",
            "chem_titration", "chem_daniell", "chem_energy",
            "bio_plant_cell", "bio_nephron", "bio_arthropod", "bio_vascular",
            "math_right_triangle", "math_circle", "math_coordinate"
        )
        return vectorKeys.any { trimmed.startsWith(it, ignoreCase = true) }
    }
}
