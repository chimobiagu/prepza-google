package com.example.data.security

import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Base64
import java.util.concurrent.ConcurrentHashMap

sealed class ValidationResult {
    object Valid : ValidationResult()
    data class Invalid(val reason: String) : ValidationResult()
}

sealed class FileValidationResult {
    object Valid : FileValidationResult()
    data class Invalid(val reason: String) : FileValidationResult()
}

object SecurityUtils {

    private val secureRandom = SecureRandom()
    private const val SALT_LENGTH = 16
    private const val HASH_ITERATIONS = 5000

    // =========================================================================
    // 1. Password Hashing (Salted SHA-256 with constant-time equality check)
    // =========================================================================

    fun generateSalt(): String {
        val saltBytes = ByteArray(SALT_LENGTH)
        secureRandom.nextBytes(saltBytes)
        return Base64.getEncoder().encodeToString(saltBytes)
    }

    fun hashPassword(password: String, existingSalt: String? = null): String {
        val salt = existingSalt ?: generateSalt()
        val md = MessageDigest.getInstance("SHA-256")
        var hashBytes = (salt + password).toByteArray(Charsets.UTF_8)
        
        for (i in 0 until HASH_ITERATIONS) {
            md.reset()
            hashBytes = md.digest(hashBytes)
        }

        val base64Hash = Base64.getEncoder().encodeToString(hashBytes)
        return "$salt:$base64Hash"
    }

    fun verifyPassword(plainPassword: String, storedHash: String?): Boolean {
        if (storedHash.isNullOrBlank() || !storedHash.contains(":")) {
            return false
        }
        val parts = storedHash.split(":")
        if (parts.size != 2) return false
        val salt = parts[0]
        val expectedHash = parts[1]

        val computed = hashPassword(plainPassword, salt)
        val computedHash = computed.split(":")[1]

        // Constant-time comparison to prevent side-channel timing attacks
        return MessageDigest.isEqual(
            expectedHash.toByteArray(Charsets.UTF_8),
            computedHash.toByteArray(Charsets.UTF_8)
        )
    }

    // =========================================================================
    // 2. Cryptographically Secure Session Tokens
    // =========================================================================

    fun generateSecureSessionToken(): String {
        val bytes = ByteArray(32)
        secureRandom.nextBytes(bytes)
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes)
    }

    // =========================================================================
    // 3. Input Validation
    // =========================================================================

    private val EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}$".toRegex()
    private val PHONE_REGEX = "^(\\+?234|0)[789][01]\\d{8}$".toRegex() // Standard Nigerian / International phone pattern

    fun validateEmail(email: String): ValidationResult {
        val clean = email.trim()
        if (clean.isBlank()) return ValidationResult.Invalid("Email address is required")
        if (clean.length > 254) return ValidationResult.Invalid("Email is too long")
        if (!EMAIL_REGEX.matches(clean)) return ValidationResult.Invalid("Invalid email format (e.g. candidate@domain.com)")
        return ValidationResult.Valid
    }

    fun validatePassword(password: String): ValidationResult {
        if (password.length < 6) return ValidationResult.Invalid("Password must be at least 6 characters")
        if (password.length > 128) return ValidationResult.Invalid("Password exceeds maximum allowed length")
        return ValidationResult.Valid
    }

    fun validatePhoneNumber(phone: String): ValidationResult {
        val clean = phone.replace("\\s|-".toRegex(), "")
        if (clean.isBlank()) return ValidationResult.Invalid("Phone number is required")
        if (!PHONE_REGEX.matches(clean) && clean.length < 10) {
            return ValidationResult.Invalid("Please enter a valid mobile number (e.g. 08012345678)")
        }
        return ValidationResult.Valid
    }

    fun validateTargetScore(score: Int): ValidationResult {
        if (score !in 100..400) {
            return ValidationResult.Invalid("Target score must be between 100 and 400")
        }
        return ValidationResult.Valid
    }

    val ALLOWED_JAMB_SUBJECTS = setOf(
        "Use of English", "English Language", "Mathematics", "Physics", "Chemistry",
        "Biology", "Economics", "Government", "Literature in English", "Literature",
        "CRS", "Commerce", "Principles of Accounts", "Principles of Account", "Financial Accounting",
        "Geography", "History", "Islamic Religious Studies (IRS)", "IRS", "Islamic Studies", "IRK",
        "Further Mathematics"
    )

    fun validateSubjects(csv: String): ValidationResult {
        val list = csv.split(",").map { it.trim() }.filter { it.isNotEmpty() }
        if (list.isEmpty()) return ValidationResult.Invalid("Please select at least 1 subject")
        if (list.size > 4) return ValidationResult.Invalid("JAMB UTME permits a maximum of 4 subjects")
        val invalid = list.filter { sub -> ALLOWED_JAMB_SUBJECTS.none { it.equals(sub, ignoreCase = true) } }
        if (invalid.isNotEmpty()) {
            return ValidationResult.Invalid("Unsupported subject(s): ${invalid.joinToString(", ")}")
        }
        return ValidationResult.Valid
    }

    // =========================================================================
    // 4. Input Sanitization & HTML/XSS Escaping
    // =========================================================================

    fun sanitizeUserInput(input: String, maxLength: Int = 1000): String {
        return input.take(maxLength)
            .replace("\u0000", "") // Strip null bytes
            .trim()
    }

    fun escapeHtml(text: String): String {
        return buildString {
            for (ch in text) {
                when (ch) {
                    '&' -> append("&amp;")
                    '<' -> append("&lt;")
                    '>' -> append("&gt;")
                    '"' -> append("&quot;")
                    '\'' -> append("&#x27;")
                    '/' -> append("&#x2F;")
                    else -> append(ch)
                }
            }
        }
    }

    // =========================================================================
    // 5. File Upload Restrictions & Validation
    // =========================================================================

    private val ALLOWED_IMAGE_EXTENSIONS = setOf("png", "jpg", "jpeg", "webp")
    private const val MAX_FILE_SIZE_BYTES = 5 * 1024 * 1024L // 5 MB

    fun validateFileUpload(fileName: String, sizeBytes: Long): FileValidationResult {
        if (sizeBytes > MAX_FILE_SIZE_BYTES) {
            return FileValidationResult.Invalid("File size exceeds 5 MB limit")
        }
        val ext = fileName.substringAfterLast('.', "").lowercase()
        if (!ALLOWED_IMAGE_EXTENSIONS.contains(ext)) {
            return FileValidationResult.Invalid("Only PNG, JPG, JPEG, and WEBP files are allowed")
        }
        return FileValidationResult.Valid
    }

    // =========================================================================
    // 6. Sensitive Data Masking (For Logs and Displays)
    // =========================================================================

    fun maskApiKey(key: String): String {
        if (key.length <= 8) return "••••••••"
        return key.take(4) + "••••••••" + key.takeLast(4)
    }

    fun maskEmail(email: String): String {
        if (!email.contains("@")) return "••••••••"
        val parts = email.split("@")
        val name = parts[0]
        val maskedName = if (name.length > 2) name.take(2) + "•••" else "••"
        return "$maskedName@${parts[1]}"
    }

    // =========================================================================
    // 7. Row-Level Security & Field Tampering Protection
    // =========================================================================

    fun verifyRowOwnership(activeUserId: String, resourceUserId: String): Boolean {
        if (activeUserId.isBlank()) return false
        // Allow if resource explicitly belongs to active user or is marked open/legacy ("")
        return resourceUserId.isBlank() || activeUserId == resourceUserId
    }

    // =========================================================================
    // 8. API Response Trimmer & Sanitizer
    // =========================================================================

    fun trimAndSanitizeApiResponse(raw: String): String {
        return raw.trim()
            .removePrefix("```json")
            .removePrefix("```markdown")
            .removePrefix("```")
            .removeSuffix("```")
            .trim()
    }
}

// =============================================================================
// Rate Limiter & Brute-Force Bot Protection
// =============================================================================

object LoginRateLimiter {
    private data class AttemptTracker(
        var failedAttempts: Int = 0,
        var lastAttemptTimeMs: Long = 0L,
        var lockedUntilMs: Long = 0L
    )

    private val trackers = ConcurrentHashMap<String, AttemptTracker>()
    private const val MAX_FAILED_ATTEMPTS = 5
    private const val BASE_LOCKOUT_DURATION_MS = 60_000L // 1 minute lockout after 5 fails
    private const val WINDOW_MS = 300_000L // 5 minutes attempt window

    /**
     * Checks if the given key (e.g. email or IP) is currently locked out.
     * Returns 0 if allowed, or remaining seconds until unlock if locked.
     */
    fun isRateLimited(key: String): Long {
        val now = System.currentTimeMillis()
        val tracker = trackers[key.lowercase().trim()] ?: return 0L
        if (tracker.lockedUntilMs > now) {
            val remainingSec = ((tracker.lockedUntilMs - now) / 1000L).coerceAtLeast(1L)
            return remainingSec
        }
        return 0L
    }

    fun recordFailedAttempt(key: String): Long {
        val cleanKey = key.lowercase().trim()
        val now = System.currentTimeMillis()
        val tracker = trackers.compute(cleanKey) { _, existing ->
            val tr = existing ?: AttemptTracker()
            if (now - tr.lastAttemptTimeMs > WINDOW_MS) {
                tr.failedAttempts = 1
            } else {
                tr.failedAttempts++
            }
            tr.lastAttemptTimeMs = now

            if (tr.failedAttempts >= MAX_FAILED_ATTEMPTS) {
                val multiplier = (tr.failedAttempts - MAX_FAILED_ATTEMPTS + 1).coerceAtMost(5)
                tr.lockedUntilMs = now + (BASE_LOCKOUT_DURATION_MS * multiplier)
            }
            tr
        }!!

        return if (tracker.lockedUntilMs > now) {
            ((tracker.lockedUntilMs - now) / 1000L).coerceAtLeast(1L)
        } else {
            0L
        }
    }

    fun recordSuccess(key: String) {
        trackers.remove(key.lowercase().trim())
    }
}

// =============================================================================
// Device Protection & Anti-Abuse Manager
// =============================================================================

sealed class ReferralValidationResult {
    object Valid : ReferralValidationResult()
    data class Blocked(val reason: String) : ReferralValidationResult()
}

sealed class AccountCreationCheck {
    object Allowed : AccountCreationCheck()
    data class ExistingAccountPrompt(val existingEmail: String, val message: String) : AccountCreationCheck()
    data class RateLimited(val message: String) : AccountCreationCheck()
}

object DeviceProtectionManager {
    private const val PREFS_NAME = "prepza_device_security"
    private const val KEY_DEVICE_ID = "device_fingerprint_id"
    private const val KEY_REGISTERED_EMAILS = "device_registered_emails"
    private const val KEY_CLAIMED_REFERRALS = "device_claimed_referrals"
    private const val KEY_DEVICE_OWNED_REFERRAL_CODES = "device_owned_referral_codes"
    private const val KEY_LAST_REGISTRATION_TIMESTAMP = "device_last_reg_ts"

    private fun getPrefs(context: android.content.Context): android.content.SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, android.content.Context.MODE_PRIVATE)
    }

    fun getOrCreateDeviceId(context: android.content.Context): String {
        val prefs = getPrefs(context)
        var deviceId = prefs.getString(KEY_DEVICE_ID, null)
        if (deviceId.isNullOrBlank()) {
            deviceId = "dev_" + java.util.UUID.randomUUID().toString().take(12)
            prefs.edit().putString(KEY_DEVICE_ID, deviceId).apply()
        }
        return deviceId
    }

    /**
     * Checks if this device already has registered accounts and warns against duplicate creation.
     */
    fun checkAccountCreation(context: android.content.Context, newEmail: String): AccountCreationCheck {
        val prefs = getPrefs(context)
        val cleanEmail = newEmail.trim().lowercase()
        val registeredEmails = prefs.getStringSet(KEY_REGISTERED_EMAILS, emptySet()) ?: emptySet()

        if (registeredEmails.contains(cleanEmail)) {
            return AccountCreationCheck.ExistingAccountPrompt(
                existingEmail = cleanEmail,
                message = "An account with this email is already registered on this device. Please log in."
            )
        }

        val lastTs = prefs.getLong(KEY_LAST_REGISTRATION_TIMESTAMP, 0L)
        val now = System.currentTimeMillis()
        // If creating more than 4 accounts in a single hour from same device, rate limit
        if (registeredEmails.size >= 4 && (now - lastTs) < 3600_000L) {
            return AccountCreationCheck.RateLimited(
                "Multiple accounts were recently created on this device. Please log in to your existing account."
            )
        }

        return AccountCreationCheck.Allowed
    }

    /**
     * Strictly verifies referral codes against self-referral, device-looping, and multi-account farming.
     */
    fun validateReferral(
        context: android.content.Context,
        referralCode: String?,
        candidateEmail: String,
        candidateOwnCode: String?
    ): ReferralValidationResult {
        if (referralCode.isNullOrBlank()) return ReferralValidationResult.Valid

        val cleanCode = referralCode.trim().uppercase()
        val prefs = getPrefs(context)

        // 1. Self referral on own code
        if (!candidateOwnCode.isNullOrBlank() && cleanCode.equals(candidateOwnCode.trim(), ignoreCase = true)) {
            return ReferralValidationResult.Blocked("You cannot use your own referral code.")
        }

        // 2. Code created on this device previously (prevent device-level self referral)
        val ownedCodes = prefs.getStringSet(KEY_DEVICE_OWNED_REFERRAL_CODES, emptySet()) ?: emptySet()
        if (ownedCodes.contains(cleanCode)) {
            return ReferralValidationResult.Blocked("This referral code belongs to an account on this device. Self-referrals are not eligible.")
        }

        return ReferralValidationResult.Valid
    }

    fun recordAccountRegistration(context: android.content.Context, email: String, myReferralCode: String, usedReferralCode: String?) {
        val prefs = getPrefs(context)
        val cleanEmail = email.trim().lowercase()
        val currentEmails = (prefs.getStringSet(KEY_REGISTERED_EMAILS, emptySet()) ?: emptySet()).toMutableSet()
        currentEmails.add(cleanEmail)

        val ownedCodes = (prefs.getStringSet(KEY_DEVICE_OWNED_REFERRAL_CODES, emptySet()) ?: emptySet()).toMutableSet()
        if (myReferralCode.isNotBlank()) {
            ownedCodes.add(myReferralCode.trim().uppercase())
        }

        val editor = prefs.edit()
            .putStringSet(KEY_REGISTERED_EMAILS, currentEmails)
            .putStringSet(KEY_DEVICE_OWNED_REFERRAL_CODES, ownedCodes)
            .putLong(KEY_LAST_REGISTRATION_TIMESTAMP, System.currentTimeMillis())

        if (!usedReferralCode.isNullOrBlank()) {
            val claimed = (prefs.getStringSet(KEY_CLAIMED_REFERRALS, emptySet()) ?: emptySet()).toMutableSet()
            claimed.add(usedReferralCode.trim().uppercase())
            editor.putStringSet(KEY_CLAIMED_REFERRALS, claimed)
        }

        editor.apply()
    }

    fun getPrimaryExistingEmail(context: android.content.Context): String? {
        val prefs = getPrefs(context)
        val emails = prefs.getStringSet(KEY_REGISTERED_EMAILS, emptySet()) ?: emptySet()
        return emails.firstOrNull()
    }
}

