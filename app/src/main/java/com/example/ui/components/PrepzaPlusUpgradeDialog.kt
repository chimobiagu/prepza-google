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
import com.example.data.security.ActivationPinManager
import com.example.data.security.PinRedemptionResult
import com.example.data.security.PaystackVerificationResult
import com.example.ui.theme.*

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
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var selectedPaymentTab by remember { mutableStateOf("paystack") } // "paystack" or "transfer"
    var userEmailState by remember { mutableStateOf(if (studentEmail.isNotBlank()) studentEmail else "") }
    var voucherCode by remember { mutableStateOf("") }
    var voucherError by remember { mutableStateOf<String?>(null) }
    var isProcessing by remember { mutableStateOf(false) }
    var showSuccessState by remember { mutableStateOf(false) }
    var paystackReferenceInput by remember { mutableStateOf("") }
    var paystackError by remember { mutableStateOf<String?>(null) }
    var copiedAccount by remember { mutableStateOf(false) }
    val clipboardManager = androidx.compose.ui.platform.LocalClipboardManager.current

    val paystackBlue = Color(0xFF0BA4DB)
    val paystackDark = Color(0xFF092540)

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            dismissOnBackPress = true,
            dismissOnClickOutside = true,
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
            if (showSuccessState) {
                // Clean Success State
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
                                modifier = Modifier.size(44.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Prepza Plus Activated!",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreenDark,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Your ₦500 lifetime access is now active. All CBT mocks and past questions are fully unlocked.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = TextSecondary,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Button(
                        onClick = {
                            onUpgradeSuccess()
                            onDismiss()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = TextPrimary),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                    ) {
                        Text("Continue", fontWeight = FontWeight.Bold)
                    }
                }
            } else {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                        .padding(20.dp)
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
                                modifier = Modifier.size(34.dp)
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
                                    text = "Prepza Plus",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                                Text(
                                    text = "₦500 • Lifetime Access",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = PrimaryGreen,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        IconButton(onClick = onDismiss) {
                            Icon(Icons.Default.Close, contentDescription = "Close", tint = TextSecondary)
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Clean Plan Summary
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = SoftEmeraldBg,
                        border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(
                                    text = "Lifetime Access",
                                    fontWeight = FontWeight.Bold,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = PrimaryGreenDark
                                )
                                Text(
                                    text = "All CBT Mocks & Past Questions",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = TextSecondary
                                )
                            }
                            Text(
                                text = "₦500",
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreenDark
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Tab Selector
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = if (selectedPaymentTab == "paystack") paystackBlue else AppBackground,
                            border = androidx.compose.foundation.BorderStroke(1.dp, if (selectedPaymentTab == "paystack") paystackBlue else BorderSubtle),
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .clickable { selectedPaymentTab = "paystack" }
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.CreditCard,
                                    contentDescription = null,
                                    tint = if (selectedPaymentTab == "paystack") Color.White else TextPrimary,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Paystack",
                                    fontWeight = FontWeight.Bold,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = if (selectedPaymentTab == "paystack") Color.White else TextPrimary
                                )
                            }
                        }

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = if (selectedPaymentTab == "transfer") PrimaryGreen else AppBackground,
                            border = androidx.compose.foundation.BorderStroke(1.dp, if (selectedPaymentTab == "transfer") PrimaryGreen else BorderSubtle),
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .clickable { selectedPaymentTab = "transfer" }
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.AccountBalance,
                                    contentDescription = null,
                                    tint = if (selectedPaymentTab == "transfer") Color.White else TextPrimary,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Bank Transfer",
                                    fontWeight = FontWeight.Bold,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = if (selectedPaymentTab == "transfer") Color.White else TextPrimary
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    if (selectedPaymentTab == "paystack") {
                        // PAYSTACK CONTENT
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            OutlinedTextField(
                                value = userEmailState,
                                onValueChange = { userEmailState = it },
                                label = { Text("Email Address") },
                                placeholder = { Text("your.email@example.com") },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(10.dp),
                                singleLine = true
                            )

                            Button(
                                onClick = {
                                    ActivationPinManager.openPaystackCheckout(context, userEmailState)
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = paystackBlue, contentColor = Color.White),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(46.dp)
                                    .testTag("paystack_pay_btn")
                            ) {
                                Icon(Icons.Default.OpenInNew, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Pay ₦500 on Paystack", fontWeight = FontWeight.Bold)
                            }

                            Spacer(modifier = Modifier.height(4.dp))
                            HorizontalDivider(color = BorderSubtle)
                            Spacer(modifier = Modifier.height(4.dp))

                            OutlinedTextField(
                                value = paystackReferenceInput,
                                onValueChange = {
                                    paystackReferenceInput = it
                                    paystackError = null
                                },
                                label = { Text("Paystack Reference Code") },
                                placeholder = { Text("Enter reference code after payment") },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(10.dp),
                                singleLine = true
                            )

                            if (paystackError != null) {
                                Text(
                                    text = paystackError ?: "",
                                    color = IncorrectRed,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                            Button(
                                onClick = {
                                    if (paystackReferenceInput.trim().isBlank()) {
                                        paystackError = "Please enter your Paystack reference code."
                                        return@Button
                                    }

                                    isProcessing = true
                                    val result = ActivationPinManager.verifyPaystackReference(context, paystackReferenceInput)
                                    isProcessing = false

                                    when (result) {
                                        is PaystackVerificationResult.Success -> {
                                            onUpgradeSuccess()
                                            showSuccessState = true
                                        }
                                        is PaystackVerificationResult.AlreadyUsed -> {
                                            paystackError = result.message
                                        }
                                        is PaystackVerificationResult.Invalid -> {
                                            paystackError = result.message
                                        }
                                    }
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = TextPrimary, contentColor = Color.White),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(46.dp)
                            ) {
                                if (isProcessing) {
                                    CircularProgressIndicator(color = Color.White, modifier = Modifier.size(18.dp))
                                } else {
                                    Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Verify & Activate", fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    } else {
                        // BANK TRANSFER & WHATSAPP CONTENT
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            // Bank Details Card
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = AppBackground,
                                border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column {
                                            Text(
                                                text = "OPay Account",
                                                style = MaterialTheme.typography.labelSmall,
                                                color = TextSecondary
                                            )
                                            Text(
                                                text = ActivationPinManager.ADMIN_OPAY_ACCOUNT,
                                                style = MaterialTheme.typography.titleLarge,
                                                fontWeight = FontWeight.Bold,
                                                color = PrimaryGreenDark
                                            )
                                        }

                                        OutlinedButton(
                                            onClick = {
                                                clipboardManager.setText(androidx.compose.ui.text.AnnotatedString(ActivationPinManager.ADMIN_OPAY_ACCOUNT))
                                                copiedAccount = true
                                            },
                                            shape = RoundedCornerShape(8.dp),
                                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                                        ) {
                                            Icon(
                                                imageVector = if (copiedAccount) Icons.Default.Check else Icons.Default.ContentCopy,
                                                contentDescription = "Copy",
                                                modifier = Modifier.size(14.dp)
                                            )
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Text(if (copiedAccount) "Copied" else "Copy", fontSize = 12.sp)
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = "Name: Prepza UTME / Admin  •  Amount: ₦500",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary
                                    )
                                }
                            }

                            Button(
                                onClick = {
                                    ActivationPinManager.openWhatsAppReceipt(
                                        context = context,
                                        studentName = studentName,
                                        studentPhone = studentPhone,
                                        senderAccountName = ""
                                    )
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(46.dp)
                            ) {
                                Icon(Icons.Default.Send, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Send Receipt to WhatsApp", fontWeight = FontWeight.Bold)
                            }

                            Spacer(modifier = Modifier.height(4.dp))
                            HorizontalDivider(color = BorderSubtle)
                            Spacer(modifier = Modifier.height(4.dp))

                            OutlinedTextField(
                                value = voucherCode,
                                onValueChange = {
                                    voucherCode = it.uppercase()
                                    voucherError = null
                                },
                                label = { Text("Activation PIN from Admin") },
                                placeholder = { Text("Enter PIN received on WhatsApp") },
                                leadingIcon = {
                                    Icon(Icons.Default.Key, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(18.dp))
                                },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(10.dp),
                                singleLine = true
                            )

                            if (voucherError != null) {
                                Text(
                                    text = voucherError ?: "",
                                    color = IncorrectRed,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                            Button(
                                onClick = {
                                    if (voucherCode.trim().isBlank()) {
                                        voucherError = "Please enter the PIN from WhatsApp."
                                        return@Button
                                    }

                                    isProcessing = true
                                    val result = ActivationPinManager.redeemPin(context, voucherCode)
                                    isProcessing = false

                                    when (result) {
                                        is PinRedemptionResult.Success -> {
                                            onUpgradeSuccess()
                                            showSuccessState = true
                                        }
                                        is PinRedemptionResult.AlreadyUsed -> {
                                            voucherError = result.message
                                        }
                                        is PinRedemptionResult.Invalid -> {
                                            voucherError = result.message
                                        }
                                    }
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = TextPrimary, contentColor = Color.White),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(46.dp)
                                    .testTag("confirm_upgrade_pay_btn")
                            ) {
                                if (isProcessing) {
                                    CircularProgressIndicator(color = Color.White, modifier = Modifier.size(18.dp))
                                } else {
                                    Icon(Icons.Default.Verified, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Activate Prepza Plus", fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// Milestone Reminder Modal Dialog (Fired at 20, 10, 5, 2 days remaining)
@Composable
fun TrialMilestoneReminderDialog(
    milestoneDaysLeft: Int,
    onUpgradeClick: () -> Unit,
    onDismissReminder: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismissReminder,
        icon = {
            Surface(
                shape = CircleShape,
                color = if (milestoneDaysLeft <= 5) IncorrectRedBg else WarningAmberBg,
                modifier = Modifier.size(48.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = if (milestoneDaysLeft <= 5) Icons.Default.Warning else Icons.Default.Schedule,
                        contentDescription = null,
                        tint = if (milestoneDaysLeft <= 5) IncorrectRed else WarningAmber,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        },
        title = {
            Text(
                text = "Prepza Plus Trial",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        },
        text = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "$milestoneDaysLeft days left in free trial",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = if (milestoneDaysLeft <= 5) IncorrectRed else WarningAmber,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Upgrade for ₦500 to keep unlimited access to all CBT mocks and past questions.",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    textAlign = TextAlign.Center
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    onDismissReminder()
                    onUpgradeClick()
                },
                colors = ButtonDefaults.buttonColors(containerColor = TextPrimary),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("Upgrade (₦500)", fontWeight = FontWeight.Bold)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismissReminder) {
                Text("Later", color = TextSecondary)
            }
        }
    )
}
