package com.example.data.security

import java.util.UUID
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger

/**
 * Authoritative Server-Side Payment & Entitlement Models.
 * Represents the trusted backend architecture where secret keys, pricing, and entitlement
 * verification reside exclusively.
 */
enum class PaymentOrderStatus {
    PENDING,
    SUCCESS,
    FAILED,
    CANCELLED,
    ALREADY_CLAIMED
}

data class PlanDefinition(
    val planId: String,
    val displayName: String,
    val amountKobo: Long,
    val currency: String,
    val durationDays: Int
)

data class PaymentOrder(
    val orderId: String,
    val userId: String,
    val reference: String,
    val planId: String,
    val authoritativeAmountKobo: Long,
    val authoritativeCurrency: String,
    val durationDays: Int,
    var status: PaymentOrderStatus = PaymentOrderStatus.PENDING,
    var gatewayTransactionId: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    var verifiedAt: Long? = null,
    var plusActivatedAt: Long? = null
)

data class SquadApiResponse(
    val httpCode: Int,
    val isSuccess: Boolean,
    val transactionStatus: String,
    val transactionAmountKobo: Long,
    val currency: String,
    val gatewayTransactionId: String,
    val message: String
)

sealed class AuthoritativeVerifyResult {
    data class Success(
        val reference: String,
        val userId: String,
        val planId: String,
        val amountKobo: Long,
        val currency: String,
        val entitlementGrantedDays: Int,
        val message: String = "Payment verified and entitlement activated."
    ) : AuthoritativeVerifyResult()

    data class AlreadyVerified(
        val reference: String,
        val userId: String,
        val message: String = "This payment was already verified and credited."
    ) : AuthoritativeVerifyResult()

    data class SecurityViolation(
        val reason: String
    ) : AuthoritativeVerifyResult()

    data class Failed(
        val reason: String
    ) : AuthoritativeVerifyResult()

    data class Pending(
        val reason: String = "Payment is pending completion on gateway."
    ) : AuthoritativeVerifyResult()
}

/**
 * Interface representing the backend's server-side Squad API caller.
 * The Squad Secret Key is only accessible here in secure server environments.
 */
interface SquadGatewayClient {
    fun queryTransaction(reference: String): SquadApiResponse
}

/**
 * The Authoritative Payment Engine.
 * Implements strict server-side validation rules, idempotency, anti-replay, amount verification,
 * user binding, and atomic entitlement activation.
 */
class AuthoritativePaymentEngine(
    private val squadClient: SquadGatewayClient
) {
    // Authoritative Plan Catalog (Server-controlled only)
    companion object {
        val PLAN_CATALOG = mapOf(
            "PLUS_MONTHLY" to PlanDefinition(
                planId = "PLUS_MONTHLY",
                displayName = "Prepza Plus (Monthly)",
                amountKobo = 50000L, // Authoritative ₦500
                currency = "NGN",
                durationDays = 30
            ),
            "PLUS_UTME_SEASON" to PlanDefinition(
                planId = "PLUS_UTME_SEASON",
                displayName = "Prepza Plus (Full UTME 2025/2026)",
                amountKobo = 50000L, // Authoritative ₦500
                currency = "NGN",
                durationDays = 180
            )
        )
    }

    // In-memory backend storage for orders, entitlements, and burned gateway transaction IDs
    val ordersByReference = ConcurrentHashMap<String, PaymentOrder>()
    val consumedGatewayTxIds = ConcurrentHashMap<String, String>() // gatewayTxId -> userId
    val userEntitlements = ConcurrentHashMap<String, Int>() // userId -> activePlusDays
    val activationCounters = ConcurrentHashMap<String, AtomicInteger>() // userId -> activation count

    /**
     * 1. CREATE PAYMENT ORDER (Server-Side)
     * Resolves plan strictly from the server's authoritative catalog.
     * Client cannot specify amount, currency, or duration.
     */
    fun createPaymentOrder(
        userId: String,
        requestedPlanId: String
    ): PaymentOrder {
        require(userId.isNotBlank()) { "User ID cannot be empty" }

        val plan = PLAN_CATALOG[requestedPlanId]
            ?: PLAN_CATALOG["PLUS_MONTHLY"]!!

        val reference = "PRPZ-SQD-${System.currentTimeMillis()}-${UUID.randomUUID().toString().take(6).uppercase()}"
        val order = PaymentOrder(
            orderId = "ORD-${UUID.randomUUID()}",
            userId = userId,
            reference = reference,
            planId = plan.planId,
            authoritativeAmountKobo = plan.amountKobo,
            authoritativeCurrency = plan.currency,
            durationDays = plan.durationDays,
            status = PaymentOrderStatus.PENDING
        )

        ordersByReference[reference] = order
        return order
    }

    /**
     * 2. STRICT SERVER-SIDE VERIFICATION
     * Enforces:
     * - Order existence
     * - User ownership (User A cannot claim User B's order)
     * - Idempotency (Already verified orders do not duplicate entitlement)
     * - Squad API confirmation (Secret Key held by backend)
     * - Exact amount matching (50,000 kobo / ₦500)
     * - Exact currency matching (NGN)
     * - Gateway Transaction Replay Protection (Unconsumed transaction ID)
     * - Atomic entitlement grant
     */
    @Synchronized
    fun verifyPayment(
        reference: String,
        authenticatedUserId: String
    ): AuthoritativeVerifyResult {
        val order = ordersByReference[reference]
            ?: return AuthoritativeVerifyResult.SecurityViolation(
                "Order reference '$reference' not found in payment registry."
            )

        // Ownership Check
        if (order.userId != authenticatedUserId) {
            return AuthoritativeVerifyResult.SecurityViolation(
                "User ownership mismatch: Order $reference belongs to ${order.userId}, not $authenticatedUserId."
            )
        }

        // Idempotency Check
        if (order.status == PaymentOrderStatus.SUCCESS) {
            return AuthoritativeVerifyResult.AlreadyVerified(
                reference = reference,
                userId = authenticatedUserId,
                message = "Payment already verified. Entitlement is active."
            )
        }

        // Query Squad API via Server Client
        val squadResponse = squadClient.queryTransaction(reference)

        if (squadResponse.httpCode != 200 || !squadResponse.isSuccess) {
            return AuthoritativeVerifyResult.Failed(
                "Gateway verification failed (${squadResponse.httpCode}): ${squadResponse.message}"
            )
        }

        // Check Gateway Transaction Status
        val statusNormalized = squadResponse.transactionStatus.lowercase()
        if (statusNormalized == "pending" || statusNormalized == "processing") {
            return AuthoritativeVerifyResult.Pending("Transaction is currently pending on Squad.")
        }
        if (statusNormalized != "success" && statusNormalized != "successful") {
            order.status = PaymentOrderStatus.FAILED
            return AuthoritativeVerifyResult.Failed("Gateway transaction status is '$statusNormalized'")
        }

        // Price Tampering Protection: Exact Amount Verification
        if (squadResponse.transactionAmountKobo != order.authoritativeAmountKobo) {
            order.status = PaymentOrderStatus.FAILED
            return AuthoritativeVerifyResult.SecurityViolation(
                "Amount tampering detected: Expected ${order.authoritativeAmountKobo} kobo, but gateway reported ${squadResponse.transactionAmountKobo} kobo."
            )
        }

        // Currency Tampering Protection: Exact Currency Verification
        if (!squadResponse.currency.equals(order.authoritativeCurrency, ignoreCase = true)) {
            order.status = PaymentOrderStatus.FAILED
            return AuthoritativeVerifyResult.SecurityViolation(
                "Currency tampering detected: Expected ${order.authoritativeCurrency}, but gateway reported ${squadResponse.currency}."
            )
        }

        // Replay Protection: Gateway Transaction ID must not be consumed
        val gatewayTxId = squadResponse.gatewayTransactionId
        if (consumedGatewayTxIds.containsKey(gatewayTxId)) {
            order.status = PaymentOrderStatus.ALREADY_CLAIMED
            return AuthoritativeVerifyResult.SecurityViolation(
                "Replay attack blocked: Gateway transaction ID $gatewayTxId was already credited."
            )
        }

        // ATOMIC ENTITLEMENT ACTIVATION
        consumedGatewayTxIds[gatewayTxId] = authenticatedUserId
        order.gatewayTransactionId = gatewayTxId
        order.status = PaymentOrderStatus.SUCCESS
        order.verifiedAt = System.currentTimeMillis()
        order.plusActivatedAt = System.currentTimeMillis()

        // Increment entitlement exactly once
        userEntitlements[authenticatedUserId] = order.durationDays
        activationCounters.computeIfAbsent(authenticatedUserId) { AtomicInteger(0) }.incrementAndGet()

        return AuthoritativeVerifyResult.Success(
            reference = reference,
            userId = authenticatedUserId,
            planId = order.planId,
            amountKobo = order.authoritativeAmountKobo,
            currency = order.authoritativeCurrency,
            entitlementGrantedDays = order.durationDays
        )
    }

    /**
     * Authoritative Subscription Status Query (Source of truth for client).
     */
    fun getUserEntitlement(userId: String): Boolean {
        val days = userEntitlements[userId] ?: 0
        return days > 0
    }
}
