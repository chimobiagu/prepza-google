package com.example.ui.components

import android.content.Context
import androidx.compose.animation.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.security.PaymentState
import com.example.data.security.SquadPaymentManager
import com.example.data.security.SquadVerifyResult
import com.example.ui.theme.*
import kotlinx.coroutines.launch

@Composable
fun PrepzaPlusUpgradeDialog(
    daysRemaining: Int,
    isMandatoryExpired: Boolean = false,
    studentName: String = "",
    studentPhone: String = "",
    studentEmail: String = "",
    onUpgradeSuccess: () -> Unit,
    onSimulateDays: (Int) -> Unit = {},
    onResetTrial: () -> Unit = {},
    onOpenReferrals: () -> Unit = {},
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    var paymentState by remember { mutableStateOf(PaymentState.IDLE) }
    var activeReference by remember { mutableStateOf("") }
    var userEmailState by remember {
        mutableStateOf(
            if (studentEmail.isNotBlank()) studentEmail else "student@prepza.app"
        )
    }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    val squadCoral = Color(0xFFE84E36)
    val squadDark = Color(0xFF1E293B)
    val squadBlue = Color(0xFF2563EB)

    Dialog(
        onDismissRequest = {
            if (paymentState != PaymentState.VERIFYING) {
                onDismiss()
            }
        },
        properties = DialogProperties(
            dismissOnBackPress = paymentState != PaymentState.VERIFYING,
            dismissOnClickOutside = paymentState != PaymentState.VERIFYING,
            usePlatformDefaultWidth = false
        )
    ) {
        Surface(
            shape = RoundedCornerShape(24.dp),
            color = SurfaceWhite,
            shadowElevation = 16.dp,
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .wrapContentHeight()
                .testTag("prepza_plus_upgrade_dialog")
        ) {
            when (paymentState) {
                // 1. SUCCESSFUL STATE
                PaymentState.SUCCESSFUL -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(28.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = PaleGreenBg,
                            modifier = Modifier.size(72.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(48.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Payment Successful!",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreenDark,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Your Prepza Plus subscription is active. You now have full unlimited access to all verified questions, full literature texts, 24/7 AI tutoring, and timed CBT mocks.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = TextSecondary,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Surface(
                            color = AppBackground,
                            shape = RoundedCornerShape(8.dp),
                            border = BorderStroke(1.dp, BorderSubtle)
                        ) {
                            Text(
                                text = "Ref: $activeReference",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = {
                                onUpgradeSuccess()
                                onDismiss()
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = PrimaryGreen,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("continue_to_prepza_button")
                        ) {
                            Text(
                                text = "Continue to Prepza",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        }
                    }
                }

                // 2. VERIFYING STATE
                PaymentState.VERIFYING -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CircularProgressIndicator(
                            color = squadCoral,
                            strokeWidth = 3.dp,
                            modifier = Modifier.size(56.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "Verifying with Squad...",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Connecting to Squad API to confirm your payment. Please wait a moment...",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                // 3. WAITING FOR PAYMENT (Checkout opened in Squad)
                PaymentState.WAITING_FOR_PAYMENT, PaymentState.INITIATING -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                            .padding(24.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    shape = CircleShape,
                                    color = squadCoral.copy(alpha = 0.15f),
                                    modifier = Modifier.size(34.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.Default.CreditCard,
                                            contentDescription = null,
                                            tint = squadCoral,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = "Squad Checkout",
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                    Text(
                                        text = "₦500 • Full UTME Access",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = squadCoral,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            IconButton(onClick = {
                                paymentState = PaymentState.CANCELLED
                            }) {
                                Icon(Icons.Default.Close, contentDescription = "Close", tint = TextSecondary)
                            }
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        // Status Info Box
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = AppBackground,
                            border = BorderStroke(1.dp, BorderSubtle),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = "Squad Payment Link Opened",
                                    fontWeight = FontWeight.Bold,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = TextPrimary
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "Complete your ₦500 payment on the Squad checkout page. Once payment is confirmed by Squad, your account will be activated immediately.",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextSecondary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Transaction Reference Input (Pre-filled, editable)
                        OutlinedTextField(
                            value = activeReference,
                            onValueChange = { activeReference = it },
                            label = { Text("Squad Transaction Reference") },
                            placeholder = { Text("e.g. SQD-PRPZ-...") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10.dp),
                            singleLine = true,
                            leadingIcon = {
                                Icon(Icons.Default.Tag, contentDescription = null, tint = squadCoral)
                            }
                        )

                        if (errorMessage != null) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = IncorrectRed.copy(alpha = 0.08f),
                                border = BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.3f)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ErrorOutline,
                                        contentDescription = null,
                                        tint = IncorrectRed,
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = errorMessage ?: "",
                                        color = IncorrectRed,
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        // Strict Automated Verification Trigger
                        Button(
                            onClick = {
                                errorMessage = null
                                paymentState = PaymentState.VERIFYING
                                coroutineScope.launch {
                                    val userId = if (studentPhone.isNotBlank()) studentPhone else "student_${studentName.filter { it.isLetterOrDigit() }.take(10)}"
                                    val result = SquadPaymentManager.verifyPaymentWithBackend(
                                        context = context,
                                        rawReference = activeReference,
                                        userId = userId
                                    )
                                    when (result) {
                                        is SquadVerifyResult.Success -> {
                                            // STRICT: Only grant access upon verified backend success
                                            onUpgradeSuccess()
                                            paymentState = PaymentState.SUCCESSFUL
                                        }
                                        is SquadVerifyResult.AlreadyClaimed -> {
                                            errorMessage = result.message
                                            paymentState = PaymentState.WAITING_FOR_PAYMENT
                                        }
                                        is SquadVerifyResult.Failed -> {
                                            errorMessage = result.message
                                            paymentState = PaymentState.WAITING_FOR_PAYMENT
                                        }
                                        is SquadVerifyResult.Pending -> {
                                            errorMessage = result.message
                                            paymentState = PaymentState.WAITING_FOR_PAYMENT
                                        }
                                    }
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = squadCoral,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("verify_payment_button")
                        ) {
                            Icon(Icons.Default.Verified, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Confirm & Activate Prepza Plus",
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        // Re-open checkout option if student closed tab
                        OutlinedButton(
                            onClick = {
                                SquadPaymentManager.openSquadCheckout(
                                    context = context,
                                    reference = activeReference,
                                    customerEmail = userEmailState
                                )
                            },
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Icon(Icons.Default.OpenInNew, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Re-open Squad Payment Page")
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        TextButton(
                            onClick = {
                                paymentState = PaymentState.CANCELLED
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Cancel Payment", color = TextSecondary)
                        }
                    }
                }

                // 4. FAILED STATE
                PaymentState.FAILED -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(28.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = IncorrectRed.copy(alpha = 0.12f),
                            modifier = Modifier.size(72.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.ErrorOutline,
                                    contentDescription = null,
                                    tint = IncorrectRed,
                                    modifier = Modifier.size(44.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Payment Unsuccessful",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = errorMessage ?: "Your payment could not be confirmed. If you completed payment, please check your connection and try again.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = TextSecondary,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = {
                                errorMessage = null
                                paymentState = PaymentState.IDLE
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = PrimaryGreen,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                        ) {
                            Text("Try Again", fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        TextButton(
                            onClick = onDismiss,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Dismiss", color = TextSecondary)
                        }
                    }
                }

                // 5. CANCELLED STATE
                PaymentState.CANCELLED -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(28.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = AppBackground,
                            modifier = Modifier.size(64.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Info,
                                    contentDescription = null,
                                    tint = TextSecondary,
                                    modifier = Modifier.size(36.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Payment Cancelled",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "No subscription has been activated. You can upgrade anytime.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = TextSecondary,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = {
                                errorMessage = null
                                paymentState = PaymentState.IDLE
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = squadCoral,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                        ) {
                            Text("Try Again", fontWeight = FontWeight.Bold)
                        }
                    }
                }

                // 6. DEFAULT IDLE STATE (Squad Plan & Checkout Initiation)
                PaymentState.IDLE -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                            .padding(22.dp)
                    ) {
                        // Header Bar
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    shape = CircleShape,
                                    color = PrimaryGreen,
                                    modifier = Modifier.size(36.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.Default.Bolt,
                                            contentDescription = null,
                                            tint = Color.White,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = SquadPaymentManager.PLAN_NAME,
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                    Text(
                                        text = "Official Squad (HabariPay) Checkout",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = squadCoral,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            IconButton(onClick = onDismiss) {
                                Icon(Icons.Default.Close, contentDescription = "Close", tint = TextSecondary)
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        // Plan Details Card
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = SoftEmeraldBg,
                            border = BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 18.dp, vertical = 14.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = SquadPaymentManager.PLAN_DURATION,
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = PrimaryGreenDark
                                    )
                                    Text(
                                        text = "One-time payment • Instant activation",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary
                                    )
                                }
                                Text(
                                    text = "₦${SquadPaymentManager.PLAN_PRICE_NGN}",
                                    style = MaterialTheme.typography.headlineSmall,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = PrimaryGreenDark
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Features List
                        Text(
                            text = "WHAT'S INCLUDED",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = TextSecondary,
                            letterSpacing = 1.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        SquadPaymentManager.PLAN_FEATURES.forEach { feature ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = feature,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextPrimary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        // Student Email Field
                        OutlinedTextField(
                            value = userEmailState,
                            onValueChange = { userEmailState = it },
                            label = { Text("Student Email (for Squad Receipt)") },
                            placeholder = { Text("student@example.com") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10.dp),
                            singleLine = true,
                            leadingIcon = {
                                Icon(Icons.Default.Email, contentDescription = null, tint = squadCoral)
                            }
                        )

                        Spacer(modifier = Modifier.height(18.dp))

                        // Squad Pay Now Button
                        Button(
                            onClick = {
                                val emailToUse = if (userEmailState.isNotBlank()) userEmailState.trim() else "student@prepza.app"
                                val userId = if (studentPhone.isNotBlank()) studentPhone else "student_${studentName.filter { it.isLetterOrDigit() }.take(10)}"
                                paymentState = PaymentState.INITIATING

                                coroutineScope.launch {
                                    val session = SquadPaymentManager.createPaymentSession(
                                        context = context,
                                        customerEmail = emailToUse,
                                        userId = userId
                                    )
                                    activeReference = session.reference
                                    paymentState = PaymentState.WAITING_FOR_PAYMENT
                                    SquadPaymentManager.openSquadCheckout(
                                        context = context,
                                        reference = session.reference,
                                        customerEmail = emailToUse
                                    )
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = squadCoral,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .testTag("squad_pay_now_button")
                        ) {
                            Icon(Icons.Default.CreditCard, contentDescription = null, modifier = Modifier.size(20.dp))
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Pay ₦500 via Squad",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        // Recovery verification link for students who already completed payment
                        TextButton(
                            onClick = {
                                activeReference = SquadPaymentManager.getPendingReference(context) ?: ""
                                paymentState = PaymentState.WAITING_FOR_PAYMENT
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Already paid? Confirm with receipt reference",
                                style = MaterialTheme.typography.labelMedium,
                                color = squadCoral
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                tint = TextSecondary,
                                modifier = Modifier.size(12.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Secured 256-bit encrypted checkout by Squad (GTCO)",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary,
                                fontSize = 11.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
