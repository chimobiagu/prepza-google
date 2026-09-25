package com.example.data.security

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import com.example.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.util.UUID

/**
 * Payment states representing the Squad checkout lifecycle in the Android client.
 */
enum class PaymentState {
    IDLE,
    INITIATING,
    WAITING_FOR_PAYMENT,
    VERIFYING,
    SUCCESSFUL,
    FAILED,
    CANCELLED
}

/**
 * Verification result returned by the backend payment service.
 */
sealed class SquadVerifyResult {
    data class Success(
        val reference: String,
        val amountKobo: Long = 50000L,
        val planName: String = "Prepza Plus (Premium)",
        val message: String = "Payment verified successfully by backend."
    ) : SquadVerifyResult()

    data class AlreadyClaimed(
        val message: String = "This payment reference has already been claimed on an account."
    ) : SquadVerifyResult()

    data class Failed(
        val message: String = "Payment verification could not be confirmed. Please ensure the transaction was completed on Squad."
    ) : SquadVerifyResult()

    data class Pending(
        val message: String = "Payment is pending. Please complete transaction on Squad."
    ) : SquadVerifyResult()
}

/**
 * Data model for a backend-initialized payment session.
 */
data class BackendPaymentSession(
    val reference: String,
    val checkoutUrl: String,
    val amountKobo: Long = 50000L,
    val currency: String = "NGN",
    val customerEmail: String = ""
)

/**
 * Clean, secure Squad Payment Manager (Squad by HabariPay / GTCO).
 *
 * ARCHITECTURAL INTEGRITY:
 * - NO Squad Secret Keys (`sk_...`) are stored or used in this Android client.
 * - The Android client communicates solely with the secure Prepza Backend API.
 * - The Prepza Backend alone holds the Squad Secret Key, calls Squad verification endpoints,
 *   enforces exact ₦500 (50,000 kobo) amount checks, currency verification (NGN), replay protection,
 *   and activates user entitlements server-side.
 */
object SquadPaymentManager {

    private const val TAG = "SquadPaymentManager"

    const val PLAN_NAME = "Prepza Plus"
    const val PLAN_PRICE_NGN = 500
    const val PLAN_AMOUNT_KOBO = 50000L // ₦500 in kobo
    const val PLAN_DURATION = "Unlimited UTME 2025/2026 Access"

    val PLAN_FEATURES = listOf(
        "Full Question Bank (20,000+ Past Questions & Detailed Solutions)",
        "Complete Literature Library (The Life Changer & Prescribed Texts)",
        "24/7 AI Tutor with Voice & Step-by-Step Problem Solving",
        "Realistic Timed CBT Mock Exams with Standard JAMB Scoring",
        "Offline Question Packs & Practice Mode"
    )

    // Squad Payment Link
    val SQUAD_PAYMENT_LINK: String
        get() {
            return try {
                val link = BuildConfig.SQUAD_PAYMENT_LINK
                if (!link.isNullOrBlank() && link != "dummy") link else "https://pay.squadco.com/link/EMVC5F"
            } catch (e: Throwable) {
                "https://pay.squadco.com/link/EMVC5F"
            }
        }

    // Secure Prepza Backend Endpoint URL
    val BACKEND_BASE_URL: String
        get() {
            return try {
                val url = BuildConfig.PREPZA_BACKEND_URL
                if (!url.isNullOrBlank() && url != "dummy") url.trimEnd('/') else "https://api.prepza.app"
            } catch (e: Throwable) {
                "https://api.prepza.app"
            }
        }

    private const val PREFS_NAME = "prepza_squad_security_store"
    private const val KEY_CLAIMED_REFERENCES = "claimed_squad_refs"
    private const val KEY_LAST_PENDING_REF = "last_pending_squad_ref"
    private const val KEY_LAST_PENDING_EMAIL = "last_pending_squad_email"

    /**
     * Generates a unique transaction reference for tracking.
     * Format: PRPZ-SQD-<timestamp>-<random6>
     */
    fun generateTransactionReference(): String {
        val timestamp = System.currentTimeMillis()
        val randomPart = UUID.randomUUID().toString().replace("-", "").take(6).uppercase()
        return "PRPZ-SQD-$timestamp-$randomPart"
    }

    /**
     * Stores the currently active reference awaiting payment confirmation.
     */
    fun setPendingPayment(context: Context, reference: String, email: String) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit()
            .putString(KEY_LAST_PENDING_REF, reference.trim())
            .putString(KEY_LAST_PENDING_EMAIL, email.trim())
            .apply()
    }

    /**
     * Retrieves the last pending reference.
     */
    fun getPendingReference(context: Context): String? {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getString(KEY_LAST_PENDING_REF, null)
    }

    /**
     * Clears pending reference once resolved or cancelled.
     */
    fun clearPendingPayment(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit()
            .remove(KEY_LAST_PENDING_REF)
            .remove(KEY_LAST_PENDING_EMAIL)
            .apply()
    }

    /**
     * Initializes a payment session through the Prepza Backend.
     * Backend generates and locks the session, returning the checkout URL and reference.
     */
    suspend fun createPaymentSession(
        context: Context,
        customerEmail: String,
        userId: String
    ): BackendPaymentSession = withContext(Dispatchers.IO) {
        val clientRef = generateTransactionReference()
        val cleanEmail = if (customerEmail.isNotBlank()) customerEmail.trim() else "student@prepza.app"

        try {
            val endpoint = URL("$BACKEND_BASE_URL/api/v1/payments/initialize")
            val conn = (endpoint.openConnection() as HttpURLConnection).apply {
                requestMethod = "POST"
                connectTimeout = 6000
                readTimeout = 6000
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept", "application/json")
            }

            val payload = JSONObject().apply {
                put("userId", userId)
                put("email", cleanEmail)
                put("amountKobo", PLAN_AMOUNT_KOBO)
                put("currency", "NGN")
                put("plan", PLAN_NAME)
                put("clientReference", clientRef)
            }

            OutputStreamWriter(conn.outputStream).use { it.write(payload.toString()) }

            if (conn.responseCode == 200 || conn.responseCode == 201) {
                val reader = BufferedReader(InputStreamReader(conn.inputStream))
                val respStr = reader.use { it.readText() }
                conn.disconnect()

                val json = JSONObject(respStr)
                val serverRef = json.optString("reference", clientRef)
                val checkoutUrl = json.optString("checkoutUrl", buildSquadCheckoutUrl(serverRef, cleanEmail))

                setPendingPayment(context, serverRef, cleanEmail)
                return@withContext BackendPaymentSession(
                    reference = serverRef,
                    checkoutUrl = checkoutUrl,
                    amountKobo = PLAN_AMOUNT_KOBO,
                    currency = "NGN",
                    customerEmail = cleanEmail
                )
            }
            conn.disconnect()
        } catch (e: Exception) {
            Log.d(TAG, "Backend initialization fallback: ${e.message}")
        }

        // Standard direct checkout URL generation
        val checkoutUrl = buildSquadCheckoutUrl(clientRef, cleanEmail)
        setPendingPayment(context, clientRef, cleanEmail)
        BackendPaymentSession(
            reference = clientRef,
            checkoutUrl = checkoutUrl,
            amountKobo = PLAN_AMOUNT_KOBO,
            currency = "NGN",
            customerEmail = cleanEmail
        )
    }

    /**
     * Builds the official Squad payment checkout URL.
     */
    fun buildSquadCheckoutUrl(reference: String, email: String): String {
        val baseUrl = SQUAD_PAYMENT_LINK
        val encodedEmail = if (email.isNotBlank()) URLEncoder.encode(email.trim(), "UTF-8") else ""
        val encodedRef = URLEncoder.encode(reference.trim(), "UTF-8")

        return buildString {
            append(baseUrl)
            if (!baseUrl.contains("?")) {
                append("?")
            } else {
                append("&")
            }
            append("transaction_ref=").append(encodedRef)
            if (encodedEmail.isNotBlank()) {
                append("&email=").append(encodedEmail)
            }
        }
    }

    /**
     * Launches the official Squad payment checkout in the user's browser / Custom Tab.
     */
    fun openSquadCheckout(
        context: Context,
        reference: String,
        customerEmail: String
    ) {
        setPendingPayment(context, reference, customerEmail)
        val checkoutUrl = buildSquadCheckoutUrl(reference, customerEmail)

        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(checkoutUrl)).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            val fallbackIntent = Intent(Intent.ACTION_VIEW, Uri.parse(SQUAD_PAYMENT_LINK)).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(fallbackIntent)
        }
    }

    /**
     * Verifies payment STRICTLY through the Prepza Backend.
     * The backend holds the Squad Secret Key, checks exact amount (₦500), currency (NGN),
     * transaction status, and replay protection.
     */
    suspend fun verifyPaymentWithBackend(
        context: Context,
        rawReference: String,
        userId: String
    ): SquadVerifyResult = withContext(Dispatchers.IO) {
        val cleanRef = rawReference.trim()
        if (cleanRef.isBlank()) {
            return@withContext SquadVerifyResult.Failed("Transaction reference cannot be empty.")
        }

        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val claimedRefs = prefs.getStringSet(KEY_CLAIMED_REFERENCES, emptySet()) ?: emptySet()

        // 1. REPLAY / DUPLICATE PROTECTION: Check if reference was already claimed locally
        if (claimedRefs.contains(cleanRef.uppercase())) {
            return@withContext SquadVerifyResult.AlreadyClaimed(
                "This payment reference ($cleanRef) has already been used on an account."
            )
        }

        // 2. QUERY SECURE PREPZA BACKEND VERIFICATION ENDPOINT
        try {
            val endpoint = URL("$BACKEND_BASE_URL/api/v1/payments/verify")
            val conn = (endpoint.openConnection() as HttpURLConnection).apply {
                requestMethod = "POST"
                connectTimeout = 10000
                readTimeout = 10000
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept", "application/json")
            }

            val payload = JSONObject().apply {
                put("reference", cleanRef)
                put("userId", userId)
                put("expectedAmountKobo", PLAN_AMOUNT_KOBO)
                put("expectedCurrency", "NGN")
            }

            OutputStreamWriter(conn.outputStream).use { it.write(payload.toString()) }

            val responseCode = conn.responseCode
            Log.d(TAG, "Backend verification HTTP $responseCode")

            if (responseCode == 200) {
                val reader = BufferedReader(InputStreamReader(conn.inputStream))
                val respStr = reader.use { it.readText() }
                conn.disconnect()

                val json = JSONObject(respStr)
                val status = json.optString("status", "").uppercase()
                val isPlusActivated = json.optBoolean("isPlusActivated", false)
                val amount = json.optLong("amountKobo", PLAN_AMOUNT_KOBO)
                val message = json.optString("message", "Payment verified successfully by backend.")

                if (status == "SUCCESS" && isPlusActivated && amount == PLAN_AMOUNT_KOBO) {
                    // Record reference to prevent reuse
                    val updatedSet = claimedRefs.toMutableSet()
                    updatedSet.add(cleanRef.uppercase())
                    prefs.edit()
                        .putStringSet(KEY_CLAIMED_REFERENCES, updatedSet)
                        .apply()
                    clearPendingPayment(context)

                    return@withContext SquadVerifyResult.Success(
                        reference = cleanRef,
                        amountKobo = amount,
                        planName = PLAN_NAME,
                        message = message
                    )
                } else if (status == "ALREADY_CLAIMED") {
                    return@withContext SquadVerifyResult.AlreadyClaimed(message)
                } else if (status == "PENDING") {
                    return@withContext SquadVerifyResult.Pending(message)
                } else {
                    return@withContext SquadVerifyResult.Failed(message)
                }
            } else {
                val errorStream = conn.errorStream ?: conn.inputStream
                val errStr = errorStream?.let { BufferedReader(InputStreamReader(it)).use { r -> r.readText() } } ?: ""
                conn.disconnect()
                Log.d(TAG, "Backend verification error ($responseCode): $errStr")
            }
        } catch (e: Exception) {
            Log.w(TAG, "Backend connection note: ${e.message}")
        }

        // Return failed/pending status prompting the student to ensure payment was completed
        SquadVerifyResult.Failed(
            "Squad payment confirmation not yet received from backend for reference: $cleanRef. Please ensure you completed payment on the checkout page."
        )
    }

    /**
     * Checks if a reference has already been claimed.
     */
    fun isReferenceClaimed(context: Context, reference: String): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val claimedRefs = prefs.getStringSet(KEY_CLAIMED_REFERENCES, emptySet()) ?: emptySet()
        return claimedRefs.contains(reference.trim().uppercase())
    }
}
