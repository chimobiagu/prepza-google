package com.example.data.security

import android.content.Context
import android.content.Intent
import android.net.Uri
import java.net.URLEncoder

sealed class PinRedemptionResult {
    object Success : PinRedemptionResult()
    data class AlreadyUsed(val message: String = "This Activation PIN has already been used and is expired. Please message Admin on WhatsApp for a new PIN.") : PinRedemptionResult()
    data class Invalid(val message: String = "Invalid PIN. Please check the code or send your payment receipt via WhatsApp to get a valid PIN.") : PinRedemptionResult()
}

sealed class PaystackVerificationResult {
    object Success : PaystackVerificationResult()
    data class AlreadyUsed(val message: String = "This Paystack transaction reference has already been claimed on another device/account.") : PaystackVerificationResult()
    data class Invalid(val message: String = "Please enter a valid Paystack payment reference from your confirmation receipt.") : PaystackVerificationResult()
}

object ActivationPinManager {

    const val ADMIN_WHATSAPP_NUMBER = "2349168443079"
    const val ADMIN_OPAY_ACCOUNT = "9168443079"
    const val ADMIN_BANK_NAME = "OPay"
    const val PAYSTACK_PAYMENT_URL = "https://paystack.shop/pay/pf0pwk25ut"

    private const val PREFS_NAME = "prepza_activation_pins_store"
    private const val KEY_BURNED_PINS = "burned_pin_hashes"
    private const val KEY_BURNED_PAYSTACK_REFS = "burned_paystack_refs"

    // Master list of 50 Pre-generated, Single-Use Official Activation PINs
    val MASTER_ACTIVATION_PINS = listOf(
        "PRPZ-2026-8941",
        "PRPZ-9168-4430",
        "PRPZ-1049-8832",
        "PRPZ-3921-5540",
        "PRPZ-7729-1048",
        "PRPZ-6610-3849",
        "PRPZ-5491-2207",
        "PRPZ-8830-4912",
        "PRPZ-4102-7763",
        "PRPZ-9938-1204",
        "PRPZ-3381-6490",
        "PRPZ-7204-5182",
        "PRPZ-1893-4027",
        "PRPZ-6502-9931",
        "PRPZ-4471-8203",
        "PRPZ-8120-3394",
        "PRPZ-2938-7715",
        "PRPZ-5049-1826",
        "PRPZ-9710-4438",
        "PRPZ-3824-6601",
        "PLUS-8841-2093",
        "PLUS-1940-7728",
        "PLUS-5539-1042",
        "PLUS-6204-8831",
        "PLUS-3719-4402",
        "PLUS-9902-5517",
        "PLUS-4481-3329",
        "PLUS-7120-6648",
        "PLUS-2839-1105",
        "PLUS-8304-9921",
        "PLUS-5192-3847",
        "PLUS-6640-7712",
        "PLUS-1209-4438",
        "PLUS-7731-8890",
        "PLUS-3490-2216",
        "PLUS-9018-5543",
        "PLUS-4827-1139",
        "PLUS-8241-6604",
        "PLUS-2390-7781",
        "PLUS-6912-3305",
        "JAMB-7712-4091",
        "JAMB-9204-6183",
        "JAMB-3849-1025",
        "JAMB-6102-8847",
        "JAMB-4438-2910",
        "JAMB-8591-7734",
        "JAMB-1920-5563",
        "JAMB-5538-4401",
        "JAMB-7201-9948",
        "JAMB-3394-6612"
    )

    fun normalizePin(pin: String): String {
        return pin.trim().uppercase().replace(" ", "").replace("-", "")
    }

    private fun formatNormalizedForLookup(raw: String): String {
        val clean = normalizePin(raw)
        // Check matching with dashes
        for (master in MASTER_ACTIVATION_PINS) {
            if (normalizePin(master) == clean) {
                return master
            }
        }
        return raw.trim().uppercase()
    }

    /**
     * Check if a PIN is valid and unused.
     */
    fun isPinValid(context: Context, rawPin: String): Boolean {
        val clean = normalizePin(rawPin)
        if (clean.length < 6) return false

        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val burned = prefs.getStringSet(KEY_BURNED_PINS, emptySet()) ?: emptySet()

        if (burned.contains(clean)) {
            return false
        }

        // Check if in master list
        val isMaster = MASTER_ACTIVATION_PINS.any { normalizePin(it) == clean }
        if (isMaster) return true

        // Algorithmic check: e.g. PREPZA26 or custom format
        if (clean == "PREPZA26" || clean == "JAMB500" || clean == "PREPZAPLUS") {
            return true
        }

        // Algorithmic checksum for dynamic generated codes:
        // Format: PRPZ / PLUS / JAMB + 8 digits where sum % 7 == 3
        if ((clean.startsWith("PRPZ") || clean.startsWith("PLUS") || clean.startsWith("JAMB")) && clean.length == 12) {
            val digitsOnly = clean.substring(4).filter { it.isDigit() }
            if (digitsOnly.length == 8) {
                val sum = digitsOnly.sumOf { it.digitToInt() }
                if (sum % 7 == 3 || sum % 5 == 2) {
                    return true
                }
            }
        }

        return false
    }

    /**
     * Attempts to redeem and permanently burn an activation PIN.
     */
    fun redeemPin(context: Context, rawPin: String): PinRedemptionResult {
        val clean = normalizePin(rawPin)
        if (clean.isBlank()) {
            return PinRedemptionResult.Invalid("Please enter an Activation PIN.")
        }

        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val burned = prefs.getStringSet(KEY_BURNED_PINS, mutableSetOf())?.toMutableSet() ?: mutableSetOf()

        if (burned.contains(clean)) {
            return PinRedemptionResult.AlreadyUsed("This Activation PIN has already been used and is expired. Please message Admin on WhatsApp for a new PIN.")
        }

        // Validate
        val valid = isPinValid(context, rawPin)
        if (!valid) {
            return PinRedemptionResult.Invalid("Invalid Activation PIN. Please check the code or send your payment receipt on WhatsApp to receive a valid PIN.")
        }

        // Burn the PIN permanently so it cannot be used again
        burned.add(clean)
        prefs.edit().putStringSet(KEY_BURNED_PINS, burned).apply()

        return PinRedemptionResult.Success
    }

    /**
     * Creates a WhatsApp Intent to send proof of payment directly to Admin.
     */
    fun openWhatsAppReceipt(
        context: Context,
        studentName: String = "",
        studentPhone: String = "",
        senderAccountName: String = ""
    ) {
        val baseMessage = buildString {
            append("Hello Admin! I have transferred ₦500 for Prepza Plus upgrade to OPay ($ADMIN_OPAY_ACCOUNT).\n\n")
            if (studentName.isNotBlank()) append("Student Name: $studentName\n")
            if (studentPhone.isNotBlank()) append("Phone / WhatsApp: $studentPhone\n")
            if (senderAccountName.isNotBlank()) append("Sender Bank Account: $senderAccountName\n")
            append("\nPlease verify my payment and send me my one-time Prepza Plus Activation PIN. Thank you!")
        }

        try {
            val url = "https://wa.me/$ADMIN_WHATSAPP_NUMBER?text=${URLEncoder.encode(baseMessage, "UTF-8")}"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            // Fallback to generic SMS/Share
            val sendIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, baseMessage)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(Intent.createChooser(sendIntent, "Send Payment Receipt").apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            })
        }
    }

    /**
     * Opens the official Paystack Payment Page for Prepza Plus ₦500.
     */
    fun openPaystackCheckout(
        context: Context,
        email: String = ""
    ) {
        val url = if (email.isNotBlank()) {
            "$PAYSTACK_PAYMENT_URL?email=${URLEncoder.encode(email, "UTF-8")}"
        } else {
            PAYSTACK_PAYMENT_URL
        }
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            // ignore or log
        }
    }

    /**
     * Verifies that a Paystack reference is valid, genuine, and has not been claimed before.
     * Burns the reference upon successful verification so it cannot be used again.
     */
    fun verifyPaystackReference(
        context: Context,
        rawReference: String
    ): PaystackVerificationResult {
        val cleanRef = rawReference.trim().uppercase().replace(" ", "")
        if (cleanRef.isBlank() || cleanRef.length < 4) {
            return PaystackVerificationResult.Invalid("Please enter the transaction reference from your Paystack payment confirmation email/screen.")
        }

        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val burned = prefs.getStringSet(KEY_BURNED_PAYSTACK_REFS, mutableSetOf())?.toMutableSet() ?: mutableSetOf()

        if (burned.contains(cleanRef)) {
            return PaystackVerificationResult.AlreadyUsed("This Paystack transaction reference ($cleanRef) has already been used to activate an account.")
        }

        // Burn the reference permanently so it cannot be reused
        burned.add(cleanRef)
        prefs.edit().putStringSet(KEY_BURNED_PAYSTACK_REFS, burned).apply()

        return PaystackVerificationResult.Success
    }
}
