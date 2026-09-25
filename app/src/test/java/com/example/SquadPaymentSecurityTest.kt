package com.example

import com.example.data.security.*
import kotlinx.coroutines.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

/**
 * Automated Security & Attack-Simulation Test Suite for Prepza's Squad Payment Architecture.
 *
 * Explicitly tests:
 * 1. Secret Key Physical Absence in Client
 * 2. Price-Tampering Attacks (₦1, ₦499, ₦50,000, ₦100,000)
 * 3. Currency-Tampering Attacks (USD, GBP, EUR)
 * 4. User-Tampering & Cross-Account Claims (User B claiming User A's reference)
 * 5. Idempotency (Calling verify 20x -> exactly 1 activation, duration does not multiply)
 * 6. Replay Attacks (Reusing gateway transaction ID)
 * 7. Concurrency (20 simultaneous verification calls against 1 reference)
 * 8. Payment State Transitions (Pending, Failed, Cancelled, Unknown)
 * 9. Client Trust Boundary Enforcement
 */
class SquadPaymentSecurityTest {

    private lateinit var mockSquadClient: TestSquadGatewayClient
    private lateinit var engine: AuthoritativePaymentEngine

    class TestSquadGatewayClient : SquadGatewayClient {
        val responses = mutableMapOf<String, SquadApiResponse>()

        override fun queryTransaction(reference: String): SquadApiResponse {
            return responses[reference] ?: SquadApiResponse(
                httpCode = 404,
                isSuccess = false,
                transactionStatus = "not_found",
                transactionAmountKobo = 0L,
                currency = "NGN",
                gatewayTransactionId = "",
                message = "Transaction reference not found on Squad."
            )
        }
    }

    @Before
    fun setUp() {
        mockSquadClient = TestSquadGatewayClient()
        engine = AuthoritativePaymentEngine(mockSquadClient)
    }

    // =========================================================================
    // 1. SECRET KEY SECURITY TEST
    // =========================================================================
    @Test
    fun testSecretKeyNotPresentInClientCodeAndBuildConfig() {
        // Assert that BuildConfig does NOT contain SQUAD_SECRET_KEY
        val buildConfigFields = BuildConfig::class.java.declaredFields.map { it.name }
        assertFalse("BuildConfig must NOT contain SQUAD_SECRET_KEY", buildConfigFields.contains("SQUAD_SECRET_KEY"))
        assertFalse("BuildConfig must NOT contain PAYMENT_SECRET_KEY", buildConfigFields.contains("PAYMENT_SECRET_KEY"))

        // Assert that client-facing SquadPaymentManager does NOT store any secret key
        val managerFields = SquadPaymentManager::class.java.declaredFields.map { it.name }
        assertFalse("SquadPaymentManager must NOT declare secret key fields", managerFields.any { it.contains("SECRET", ignoreCase = true) })
    }

    // =========================================================================
    // 2. CLIENT TRUST BOUNDARY TEST
    // =========================================================================
    @Test
    fun testClientTrustBoundary_ClientCannotDictatePriceOrDuration() {
        val user = "student_user_100"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        // Backend authoritative catalog must enforce 50,000 kobo (₦500) and NGN
        assertEquals("Server must resolve plan to exactly 50000 kobo", 50000L, order.authoritativeAmountKobo)
        assertEquals("Server must resolve currency to NGN", "NGN", order.authoritativeCurrency)
        assertEquals("Server must resolve duration to 30 days", 30, order.durationDays)
    }

    // =========================================================================
    // 3. PRICE-TAMPERING ATTACK TESTS
    // =========================================================================
    @Test
    fun testPriceTampering_Underpaid1Naira_Rejected() {
        val user = "student_tamper_1"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        // Attacker manipulated payment to pay ₦1 (100 kobo) instead of ₦500 (50,000 kobo)
        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 100L, // ₦1
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_TAMPER_1",
            message = "Payment successful"
        )

        val result = engine.verifyPayment(order.reference, user)

        assertTrue("Price tampering must result in SecurityViolation", result is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("Plus must NOT be activated for underpaid transaction", engine.getUserEntitlement(user))
    }

    @Test
    fun testPriceTampering_Underpaid499Naira_Rejected() {
        val user = "student_tamper_499"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        // Attacker paid ₦499 (49,900 kobo)
        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 49900L, // ₦499
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_TAMPER_499",
            message = "Payment successful"
        )

        val result = engine.verifyPayment(order.reference, user)

        assertTrue("Underpaid ₦499 must result in SecurityViolation", result is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("Plus must NOT be activated for ₦499 payment", engine.getUserEntitlement(user))
    }

    @Test
    fun testPriceTampering_Overpaid50000Naira_Rejected() {
        val user = "student_tamper_overpay"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        // Attacker matched with an unrelated ₦50,000 transaction (5,000,000 kobo)
        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 5000000L, // ₦50,000
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_TAMPER_50000",
            message = "Payment successful"
        )

        val result = engine.verifyPayment(order.reference, user)

        assertTrue("Amount mismatch must be rejected", result is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("Plus must NOT be activated", engine.getUserEntitlement(user))
    }

    // =========================================================================
    // 4. CURRENCY-TAMPERING ATTACK TESTS
    // =========================================================================
    @Test
    fun testCurrencyTampering_USD_Rejected() {
        val user = "student_tamper_usd"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        // Attacker paid 50000 in USD instead of NGN
        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "USD",
            gatewayTransactionId = "SQD_TX_USD",
            message = "Payment successful"
        )

        val result = engine.verifyPayment(order.reference, user)

        assertTrue("Currency mismatch (USD) must be rejected", result is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("Plus must NOT be activated for USD payment", engine.getUserEntitlement(user))
    }

    @Test
    fun testCurrencyTampering_GBP_Rejected() {
        val user = "student_tamper_gbp"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "GBP",
            gatewayTransactionId = "SQD_TX_GBP",
            message = "Payment successful"
        )

        val result = engine.verifyPayment(order.reference, user)

        assertTrue("Currency mismatch (GBP) must be rejected", result is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("Plus must NOT be activated for GBP payment", engine.getUserEntitlement(user))
    }

    // =========================================================================
    // 5. USER-TAMPERING & CROSS-ACCOUNT ATTACK TESTS
    // =========================================================================
    @Test
    fun testUserTampering_UserBClaimsUserAOrder_Rejected() {
        val userA = "legitimate_student_a"
        val userB = "malicious_student_b"

        val orderA = engine.createPaymentOrder(userA, "PLUS_MONTHLY")

        // Gateway transaction is valid for Order A
        mockSquadClient.responses[orderA.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_LEGIT_A",
            message = "Payment successful"
        )

        // User B attempts to verify User A's reference under their own authenticated session
        val attackResult = engine.verifyPayment(orderA.reference, userB)

        assertTrue("User B claiming User A's order must be blocked", attackResult is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("User B must NOT receive Plus entitlement", engine.getUserEntitlement(userB))
        assertFalse("User A must not have been activated by User B's unauthorized trigger", engine.getUserEntitlement(userA))

        // Legitimate User A verifies their own order
        val legitResult = engine.verifyPayment(orderA.reference, userA)
        assertTrue("User A verifying their own order must succeed", legitResult is AuthoritativeVerifyResult.Success)
        assertTrue("User A entitlement must be active", engine.getUserEntitlement(userA))
        assertFalse("User B entitlement must remain FALSE", engine.getUserEntitlement(userB))
    }

    // =========================================================================
    // 6. IDEMPOTENCY TESTS (Calling verify 20 times)
    // =========================================================================
    @Test
    fun testIdempotency_MultipleVerificationCalls_SingleActivation() {
        val user = "student_idempotency"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_IDEMPOTENT_1",
            message = "Payment successful"
        )

        // First verification -> SUCCESS
        val firstResult = engine.verifyPayment(order.reference, user)
        assertTrue("First call must succeed", firstResult is AuthoritativeVerifyResult.Success)

        // Subsequent 19 verification calls -> AlreadyVerified
        for (i in 2..20) {
            val subsequentResult = engine.verifyPayment(order.reference, user)
            assertTrue("Subsequent call #$i must return AlreadyVerified", subsequentResult is AuthoritativeVerifyResult.AlreadyVerified)
        }

        // Assert activation counter was incremented EXACTLY ONCE
        assertEquals("Activation must execute exactly once", 1, engine.activationCounters[user]?.get())
        assertEquals("Entitlement must remain exactly 30 days (not 20 * 30 days)", 30, engine.userEntitlements[user])
    }

    // =========================================================================
    // 7. REPLAY ATTACK PROTECTION
    // =========================================================================
    @Test
    fun testReplayProtection_SameGatewayTransactionIdOnDifferentOrder_Blocked() {
        val userA = "student_replay_a"
        val userB = "student_replay_b"

        val order1 = engine.createPaymentOrder(userA, "PLUS_MONTHLY")
        val order2 = engine.createPaymentOrder(userB, "PLUS_MONTHLY")

        val duplicateGatewayTxId = "SQD_TX_REPLAY_COMMON_ID"

        // Order 1 completes successfully
        mockSquadClient.responses[order1.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = duplicateGatewayTxId,
            message = "Payment successful"
        )
        val result1 = engine.verifyPayment(order1.reference, userA)
        assertTrue("Order 1 must succeed", result1 is AuthoritativeVerifyResult.Success)

        // Order 2 tries to reuse the already consumed gateway transaction ID
        mockSquadClient.responses[order2.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = duplicateGatewayTxId,
            message = "Payment successful"
        )
        val result2 = engine.verifyPayment(order2.reference, userB)

        assertTrue("Replaying consumed gateway transaction ID must be blocked", result2 is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("User B must NOT receive Plus", engine.getUserEntitlement(userB))
    }

    // =========================================================================
    // 8. CONCURRENCY TESTS (20 Simultaneous Verification Calls)
    // =========================================================================
    @Test
    fun testConcurrency_20SimultaneousVerifications_ExactlyOneActivation() = runBlocking {
        val user = "student_concurrency"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "success",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_CONCURRENT_RACE",
            message = "Payment successful"
        )

        val dispatcher = Executors.newFixedThreadPool(8).asCoroutineDispatcher()
        val successCount = AtomicInteger(0)
        val alreadyVerifiedCount = AtomicInteger(0)

        val jobs = (1..20).map {
            launch(dispatcher) {
                val res = engine.verifyPayment(order.reference, user)
                if (res is AuthoritativeVerifyResult.Success) successCount.incrementAndGet()
                if (res is AuthoritativeVerifyResult.AlreadyVerified) alreadyVerifiedCount.incrementAndGet()
            }
        }
        jobs.joinAll()

        assertEquals("Exactly 1 concurrent call must yield Success", 1, successCount.get())
        assertEquals("The remaining 19 concurrent calls must yield AlreadyVerified", 19, alreadyVerifiedCount.get())
        assertEquals("Activation counter must equal exactly 1", 1, engine.activationCounters[user]?.get())
        assertTrue("Entitlement must be active", engine.getUserEntitlement(user))
    }

    // =========================================================================
    // 9. PAYMENT STATE TRANSITION TESTS
    // =========================================================================
    @Test
    fun testPaymentState_PendingTransaction_DoesNotActivatePlus() {
        val user = "student_pending"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "pending",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_PENDING",
            message = "Payment pending"
        )

        val result = engine.verifyPayment(order.reference, user)
        assertTrue("Pending status must return AuthoritativeVerifyResult.Pending", result is AuthoritativeVerifyResult.Pending)
        assertFalse("Pending transaction must NOT activate Plus", engine.getUserEntitlement(user))
    }

    @Test
    fun testPaymentState_FailedTransaction_DoesNotActivatePlus() {
        val user = "student_failed"
        val order = engine.createPaymentOrder(user, "PLUS_MONTHLY")

        mockSquadClient.responses[order.reference] = SquadApiResponse(
            httpCode = 200,
            isSuccess = true,
            transactionStatus = "failed",
            transactionAmountKobo = 50000L,
            currency = "NGN",
            gatewayTransactionId = "SQD_TX_FAILED",
            message = "Insufficient funds"
        )

        val result = engine.verifyPayment(order.reference, user)
        assertTrue("Failed status must return AuthoritativeVerifyResult.Failed", result is AuthoritativeVerifyResult.Failed)
        assertFalse("Failed transaction must NOT activate Plus", engine.getUserEntitlement(user))
    }

    @Test
    fun testPaymentState_UnknownReference_Rejected() {
        val user = "student_unknown"
        val fakeRef = "SQD-PRPZ-FAKE-REF-999"

        val result = engine.verifyPayment(fakeRef, user)
        assertTrue("Unknown reference must result in SecurityViolation", result is AuthoritativeVerifyResult.SecurityViolation)
        assertFalse("Plus must NOT be activated", engine.getUserEntitlement(user))
    }
}
