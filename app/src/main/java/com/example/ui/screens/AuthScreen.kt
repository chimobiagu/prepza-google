package com.example.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.PrepzaButton
import com.example.ui.theme.*

enum class AuthMode {
    LOGIN, SIGN_UP
}

enum class AuthMethod {
    EMAIL, GOOGLE, PHONE
}

@Composable
fun AuthScreen(
    onLoginWithEmail: (email: String, password: String) -> Unit,
    onSignUpWithEmail: (name: String, email: String, password: String, referralCode: String?) -> Unit,
    onLoginWithGoogle: (name: String, email: String, referralCode: String?) -> Unit,
    onLoginWithPhone: (phoneNumber: String, name: String, referralCode: String?) -> Unit,
    onLoginAsGuest: () -> Unit = {},
    errorMessage: String? = null,
    isLoading: Boolean = false
) {
    var authMode by remember { mutableStateOf(AuthMode.SIGN_UP) }
    var authMethod by remember { mutableStateOf(AuthMethod.EMAIL) }

    // Form inputs
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var referralCode by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(AppBackground, PaleGreenBg, SoftGreenBg)
                )
            )
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                // Brand Pill
                Surface(
                    color = SurfaceWhite,
                    shape = RoundedCornerShape(20.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier.padding(bottom = 12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Nigeria's #1 UTME CBT Platform",
                            style = MaterialTheme.typography.labelMedium,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Prepza",
                    style = MaterialTheme.typography.displayLarge.copy(fontSize = 36.sp),
                    fontWeight = FontWeight.Black,
                    color = PrimaryGreenDark,
                    letterSpacing = (-0.5).sp
                )

                Text(
                    text = if (authMode == AuthMode.SIGN_UP) "Create your student account to save streaks, CBT mocks & progress" else "Welcome back! Continue your JAMB preparation",
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextSecondary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Mode Switcher (Sign Up / Log In)
                Surface(
                    color = BorderSubtle.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(14.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(modifier = Modifier.padding(4.dp)) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (authMode == AuthMode.SIGN_UP) SurfaceWhite else Color.Transparent)
                                .clickable { authMode = AuthMode.SIGN_UP }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Create Account",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = if (authMode == AuthMode.SIGN_UP) FontWeight.Bold else FontWeight.Medium,
                                color = if (authMode == AuthMode.SIGN_UP) TextPrimary else TextSecondary
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (authMode == AuthMode.LOGIN) SurfaceWhite else Color.Transparent)
                                .clickable { authMode = AuthMode.LOGIN }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Log In",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = if (authMode == AuthMode.LOGIN) FontWeight.Bold else FontWeight.Medium,
                                color = if (authMode == AuthMode.LOGIN) TextPrimary else TextSecondary
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Error Message Card if any
                if (!errorMessage.isNullOrBlank()) {
                    Surface(
                        color = IncorrectRedBg,
                        shape = RoundedCornerShape(12.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.3f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Info, contentDescription = null, tint = IncorrectRed, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(errorMessage, style = MaterialTheme.typography.bodySmall, color = IncorrectRed)
                        }
                    }
                }

                // Auth Form Card
                Surface(
                    color = SurfaceWhite,
                    shape = RoundedCornerShape(24.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                    shadowElevation = 2.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        // Quick Methods Bar
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            // Google One-Tap
                            OutlinedButton(
                                onClick = {
                                    val finalReferral = referralCode.trim().ifBlank { null }
                                    onLoginWithGoogle(
                                        if (name.isNotBlank()) name else "Chinedu Okafor",
                                        if (email.isNotBlank()) email else "student.utme@gmail.com",
                                        finalReferral
                                    )
                                },
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("google_login_btn"),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = TextPrimary),
                                border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text("G", fontWeight = FontWeight.Black, fontSize = 16.sp, color = Color(0xFFEA4335))
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Google", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                }
                            }

                            // Phone SMS OTP
                            OutlinedButton(
                                onClick = { authMethod = if (authMethod == AuthMethod.PHONE) AuthMethod.EMAIL else AuthMethod.PHONE },
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("phone_auth_toggle_btn"),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.outlinedButtonColors(
                                    containerColor = if (authMethod == AuthMethod.PHONE) PaleGreenBg else Color.Transparent,
                                    contentColor = if (authMethod == AuthMethod.PHONE) PrimaryGreen else TextPrimary
                                ),
                                border = androidx.compose.foundation.BorderStroke(
                                    1.dp,
                                    if (authMethod == AuthMethod.PHONE) PrimaryGreen else BorderSubtle
                                )
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Outlined.Phone, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Phone", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            HorizontalDivider(modifier = Modifier.weight(1f), color = BorderSubtle)
                            Text(
                                text = if (authMethod == AuthMethod.PHONE) "Or with Phone" else "Or with Email",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextMuted,
                                modifier = Modifier.padding(horizontal = 10.dp)
                            )
                            HorizontalDivider(modifier = Modifier.weight(1f), color = BorderSubtle)
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        if (authMethod == AuthMethod.EMAIL) {
                            if (authMode == AuthMode.SIGN_UP) {
                                OutlinedTextField(
                                    value = name,
                                    onValueChange = { name = it },
                                    label = { Text("Full Name") },
                                    placeholder = { Text("e.g. Chinedu Okafor") },
                                    leadingIcon = { Icon(Icons.Outlined.Person, contentDescription = null, tint = TextSecondary) },
                                    singleLine = true,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("auth_name_input"),
                                    shape = RoundedCornerShape(12.dp)
                                )

                                Spacer(modifier = Modifier.height(12.dp))
                            }

                            OutlinedTextField(
                                value = email,
                                onValueChange = { email = it },
                                label = { Text("Email Address") },
                                placeholder = { Text("student@gmail.com") },
                                leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = null, tint = TextSecondary) },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                                singleLine = true,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("auth_email_input"),
                                shape = RoundedCornerShape(12.dp)
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            OutlinedTextField(
                                value = password,
                                onValueChange = { password = it },
                                label = { Text("Password") },
                                placeholder = { Text("••••••••") },
                                leadingIcon = { Icon(Icons.Outlined.Lock, contentDescription = null, tint = TextSecondary) },
                                trailingIcon = {
                                    IconButton(onClick = { showPassword = !showPassword }) {
                                        Icon(
                                            imageVector = if (showPassword) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                            contentDescription = if (showPassword) "Hide password" else "Show password",
                                            tint = TextSecondary
                                        )
                                    }
                                },
                                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                singleLine = true,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("auth_password_input"),
                                shape = RoundedCornerShape(12.dp)
                            )
                        } else {
                            // Phone Auth
                            if (authMode == AuthMode.SIGN_UP) {
                                OutlinedTextField(
                                    value = name,
                                    onValueChange = { name = it },
                                    label = { Text("Full Name") },
                                    placeholder = { Text("e.g. Fatima Bello") },
                                    leadingIcon = { Icon(Icons.Outlined.Person, contentDescription = null, tint = TextSecondary) },
                                    singleLine = true,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("auth_phone_name_input"),
                                    shape = RoundedCornerShape(12.dp)
                                )

                                Spacer(modifier = Modifier.height(12.dp))
                            }

                            OutlinedTextField(
                                value = phoneNumber,
                                onValueChange = { phoneNumber = it },
                                label = { Text("Nigerian Phone Number") },
                                placeholder = { Text("+234 801 234 5678") },
                                leadingIcon = { Icon(Icons.Outlined.Phone, contentDescription = null, tint = TextSecondary) },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                                singleLine = true,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("auth_phone_number_input"),
                                shape = RoundedCornerShape(12.dp)
                            )
                        }

                        // Optional Referral / Referee Code during Registration
                        if (authMode == AuthMode.SIGN_UP) {
                            Spacer(modifier = Modifier.height(12.dp))
                            OutlinedTextField(
                                value = referralCode,
                                onValueChange = { referralCode = it.uppercase() },
                                label = { Text("Referee / Study Code (Optional)") },
                                placeholder = { Text("e.g. PRZ-4301") },
                                leadingIcon = { Icon(Icons.Default.CardGiftcard, contentDescription = null, tint = PrimaryGreen) },
                                singleLine = true,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("auth_referral_input"),
                                shape = RoundedCornerShape(12.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        PrepzaButton(
                            text = if (isLoading) "Please wait..." else if (authMode == AuthMode.SIGN_UP) "Continue to Subject Selection →" else "Log In to Prepza →",
                            onClick = {
                                val finalReferral = referralCode.trim().ifBlank { null }
                                if (authMethod == AuthMethod.PHONE) {
                                    val finalPhone = if (phoneNumber.isBlank()) "+2348012345678" else phoneNumber
                                    val finalName = if (name.isBlank()) "UTME Candidate" else name
                                    onLoginWithPhone(finalPhone, finalName, finalReferral)
                                } else {
                                    val finalEmail = if (email.isBlank()) "student.prepza@gmail.com" else email
                                    val finalPass = if (password.isBlank()) "prepza2026" else password
                                    val finalName = if (name.isBlank()) "Chinedu Okafor" else name

                                    if (authMode == AuthMode.SIGN_UP) {
                                        onSignUpWithEmail(finalName, finalEmail, finalPass, finalReferral)
                                    } else {
                                        onLoginWithEmail(finalEmail, finalPass)
                                    }
                                }
                            },
                            enabled = !isLoading,
                            modifier = Modifier.testTag("auth_submit_btn")
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        OutlinedButton(
                            onClick = { onLoginAsGuest() },
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("auth_guest_login_btn"),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = TextSecondary
                            ),
                            border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Bolt,
                                    contentDescription = null,
                                    tint = WarningAmber,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Continue as Guest Candidate",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            // Bottom Policy & Trust Note
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Text(
                    text = "Secure Local & Persistent Student Profile",
                    style = MaterialTheme.typography.labelSmall,
                    color = TextMuted
                )
                Text(
                    text = "Your streaks, CBT scores, and bookmarks are linked to your account.",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
