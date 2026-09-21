package com.example.ui.screens

import android.content.Context
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.data.db.UserAccountEntity
import com.example.ui.components.PrepzaButton
import com.example.ui.theme.*
import com.example.ui.viewmodel.AuthErrorType
import com.example.ui.viewmodel.AuthUiState

enum class AuthMode {
    LOGIN, SIGN_UP
}

enum class AuthMethod {
    EMAIL, PHONE
}

@Composable
fun AuthScreen(
    authUiState: AuthUiState = AuthUiState.Idle,
    savedAccounts: List<UserAccountEntity> = emptyList(),
    onLoginWithEmail: (email: String, password: String) -> Unit,
    onSignUpWithEmail: (name: String, email: String, password: String, referralCode: String?) -> Unit,
    onLoginWithGoogle: (name: String, email: String, referralCode: String?) -> Unit,
    onLoginWithPhone: (phoneNumber: String, name: String, referralCode: String?) -> Unit,
    onLoginAsGuest: () -> Unit = {},
    onSwitchToSavedAccount: (accountId: String) -> Unit = {},
    onRequestPasswordReset: (email: String, onSent: (Boolean, String) -> Unit) -> Unit = { _, _ -> },
    onResetPasswordWithCode: (email: String, newPass: String, onDone: (Boolean, String) -> Unit) -> Unit = { _, _, _ -> },
    onClearError: () -> Unit = {},
    errorMessage: String? = null,
    isLoading: Boolean = false
) {
    var authMode by remember { mutableStateOf(AuthMode.SIGN_UP) }
    var authMethod by remember { mutableStateOf(AuthMethod.EMAIL) }

    // Form inputs
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var referralCode by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var showConfirmPassword by remember { mutableStateOf(false) }
    var rememberMe by remember { mutableStateOf(true) }

    // Modals
    var showForgotPasswordDialog by remember { mutableStateOf(false) }
    var showCustomGmailDialog by remember { mutableStateOf(false) }
    var localErrorMessage by remember { mutableStateOf<String?>(null) }
    var infoFeedbackMessage by remember { mutableStateOf<String?>(null) }

    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    val effectiveLoading = isLoading || authUiState is AuthUiState.Loading
    val stateError = if (authUiState is AuthUiState.Error) authUiState.message else errorMessage ?: localErrorMessage
    val stateErrorType = if (authUiState is AuthUiState.Error) authUiState.errorType else AuthErrorType.GENERAL

    // Email Domain Quick Suggestions
    val emailDomains = listOf("@gmail.com", "@yahoo.com", "@outlook.com", "@icloud.com")

    // Password strength evaluation
    val isPasswordLengthOk = password.length >= 6
    val hasLettersAndNumbers = password.any { it.isLetter() } && password.any { it.isDigit() }
    val isPasswordStrong = password.length >= 8 && hasLettersAndNumbers && password.any { !it.isLetterOrDigit() }
    val isPasswordMedium = isPasswordLengthOk && hasLettersAndNumbers
    val isPasswordWeak = password.isNotEmpty() && !isPasswordMedium

    val passwordMatch = authMode != AuthMode.SIGN_UP || (password.isNotEmpty() && password == confirmPassword)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(AppBackground, PaleGreenBg, SoftGreenBg)
                )
            )
            .windowInsetsPadding(WindowInsets.systemBars)
            .imePadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(12.dp))

                // Brand Pill
                Surface(
                    color = SurfaceWhite,
                    shape = RoundedCornerShape(20.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                    shadowElevation = 1.dp,
                    modifier = Modifier.padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = PrimaryGreen,
                            modifier = Modifier.size(8.dp)
                        ) {}
                        Text(
                            text = "Nigeria's #1 UTME CBT Platform • 2026 Ready",
                            style = MaterialTheme.typography.labelMedium,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Text(
                    text = "PREPZA",
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Black,
                    color = PrimaryGreenDark,
                    letterSpacing = 2.sp
                )
                Text(
                    text = if (authMode == AuthMode.SIGN_UP) "Join 50,000+ candidates scoring 300+ in JAMB" else "Welcome back! Continue your UTME mastery",
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextSecondary,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Toggle Auth Mode (Sign Up vs Log In)
                Surface(
                    color = SurfaceWhite,
                    shape = RoundedCornerShape(16.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (authMode == AuthMode.SIGN_UP) PaleGreenBg else Color.Transparent)
                                .clickable {
                                    localErrorMessage = null
                                    infoFeedbackMessage = null
                                    onClearError()
                                    authMode = AuthMode.SIGN_UP
                                }
                                .padding(vertical = 10.dp)
                                .testTag("tab_create_account"),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Create Account",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = if (authMode == AuthMode.SIGN_UP) FontWeight.Bold else FontWeight.Medium,
                                color = if (authMode == AuthMode.SIGN_UP) PrimaryGreenDark else TextSecondary
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (authMode == AuthMode.LOGIN) PaleGreenBg else Color.Transparent)
                                .clickable {
                                    localErrorMessage = null
                                    infoFeedbackMessage = null
                                    onClearError()
                                    authMode = AuthMode.LOGIN
                                }
                                .padding(vertical = 10.dp)
                                .testTag("tab_login"),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Log In",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = if (authMode == AuthMode.LOGIN) FontWeight.Bold else FontWeight.Medium,
                                color = if (authMode == AuthMode.LOGIN) PrimaryGreenDark else TextSecondary
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Saved Accounts Banner (Fast 1-Tap Login)
                if (savedAccounts.isNotEmpty() && authMode == AuthMode.LOGIN) {
                    Surface(
                        color = SurfaceWhite,
                        shape = RoundedCornerShape(16.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "SAVED ACCOUNTS ON THIS DEVICE",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = TextMuted,
                                    letterSpacing = 0.5.sp
                                )
                                Icon(
                                    imageVector = Icons.Default.Devices,
                                    contentDescription = null,
                                    tint = TextMuted,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            savedAccounts.take(3).forEach { account ->
                                Surface(
                                    color = AppBackground,
                                    shape = RoundedCornerShape(12.dp),
                                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 4.dp)
                                        .clickable {
                                            onSwitchToSavedAccount(account.id)
                                        }
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 12.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                                            modifier = Modifier.weight(1f)
                                        ) {
                                            Surface(
                                                shape = CircleShape,
                                                color = PaleGreenBg,
                                                modifier = Modifier.size(36.dp)
                                            ) {
                                                Box(contentAlignment = Alignment.Center) {
                                                    Text(
                                                        text = account.name.take(1).uppercase(),
                                                        fontWeight = FontWeight.Bold,
                                                        color = PrimaryGreen
                                                    )
                                                }
                                            }
                                            Column {
                                                Text(
                                                    text = account.name,
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontWeight = FontWeight.Bold,
                                                    color = TextPrimary,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis
                                                )
                                                Text(
                                                    text = account.email ?: account.phoneNumber ?: "Local Student",
                                                    style = MaterialTheme.typography.labelSmall,
                                                    color = TextSecondary,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis
                                                )
                                            }
                                        }
                                        Button(
                                            onClick = { onSwitchToSavedAccount(account.id) },
                                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                                            shape = RoundedCornerShape(8.dp),
                                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                                            modifier = Modifier.height(32.dp)
                                        ) {
                                            Text("Resume", style = MaterialTheme.typography.labelSmall, color = Color.White)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                // Error Message Card if any
                if (!stateError.isNullOrBlank()) {
                    Surface(
                        color = IncorrectRedBg,
                        shape = RoundedCornerShape(14.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.35f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.Info, contentDescription = null, tint = IncorrectRed, modifier = Modifier.size(20.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = stateError,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = IncorrectRed,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier.weight(1f)
                                )
                            }

                            // Smart Action Suggestion based on centralized AuthErrorType
                            if (stateErrorType == AuthErrorType.EMAIL_ALREADY_EXISTS && authMode == AuthMode.SIGN_UP) {
                                Spacer(modifier = Modifier.height(8.dp))
                                Button(
                                    onClick = {
                                        localErrorMessage = null
                                        onClearError()
                                        authMode = AuthMode.LOGIN
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                                    shape = RoundedCornerShape(8.dp),
                                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                                    modifier = Modifier.height(32.dp)
                                ) {
                                    Text("Switch to Log In", style = MaterialTheme.typography.labelSmall, color = Color.White)
                                }
                            } else if (stateErrorType == AuthErrorType.ACCOUNT_NOT_FOUND && authMode == AuthMode.LOGIN) {
                                Spacer(modifier = Modifier.height(8.dp))
                                Button(
                                    onClick = {
                                        localErrorMessage = null
                                        onClearError()
                                        authMode = AuthMode.SIGN_UP
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                                    shape = RoundedCornerShape(8.dp),
                                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                                    modifier = Modifier.height(32.dp)
                                ) {
                                    Text("Create an Account", style = MaterialTheme.typography.labelSmall, color = Color.White)
                                }
                            }
                        }
                    }
                }

                // Info Message Card if any
                if (!infoFeedbackMessage.isNullOrBlank()) {
                    Surface(
                        color = PaleGreenBg,
                        shape = RoundedCornerShape(14.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.35f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.CheckCircle, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = infoFeedbackMessage!!,
                                style = MaterialTheme.typography.bodySmall,
                                color = PrimaryGreenDark,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.weight(1f)
                            )
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

                        // PROMINENT GOOGLE / GMAIL SIGN IN BUTTON
                        OutlinedButton(
                            onClick = {
                                localErrorMessage = null
                                onClearError()
                                val finalReferral = referralCode.trim().ifBlank { null }
                                onLoginWithGoogle(
                                    if (name.isNotBlank()) name.trim() else "UTME Candidate",
                                    if (email.isNotBlank()) email.trim() else "student.utme@gmail.com",
                                    finalReferral
                                )
                            },
                            enabled = !effectiveLoading,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .testTag("google_login_btn"),
                            shape = RoundedCornerShape(14.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                containerColor = SurfaceWhite,
                                contentColor = TextPrimary
                            ),
                            border = androidx.compose.foundation.BorderStroke(1.5.dp, BorderSubtle)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                // Multi-color Google "G" Badge
                                Surface(
                                    shape = CircleShape,
                                    color = Color(0xFFF1F5F9),
                                    modifier = Modifier.size(28.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = "G",
                                            fontWeight = FontWeight.Black,
                                            fontSize = 16.sp,
                                            color = Color(0xFF4285F4)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = if (authMode == AuthMode.SIGN_UP) "Continue with Google / Gmail" else "Sign in with Google / Gmail",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Quick Option to enter custom Gmail address
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = "Use specific Gmail address →",
                                style = MaterialTheme.typography.labelSmall,
                                color = PrimaryGreen,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier
                                    .clickable {
                                        showCustomGmailDialog = true
                                    }
                                    .padding(vertical = 2.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            HorizontalDivider(modifier = Modifier.weight(1f), color = BorderSubtle)
                            Text(
                                text = if (authMethod == AuthMethod.PHONE) "Or with Phone" else "Or with Email & Password",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextMuted,
                                modifier = Modifier.padding(horizontal = 10.dp)
                            )
                            HorizontalDivider(modifier = Modifier.weight(1f), color = BorderSubtle)
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        // Phone vs Email Toggle Pill
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            FilterChip(
                                selected = authMethod == AuthMethod.EMAIL,
                                onClick = { authMethod = AuthMethod.EMAIL },
                                label = { Text("Email Address") },
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Outlined.Email,
                                        contentDescription = null,
                                        modifier = Modifier.size(16.dp)
                                    )
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = PaleGreenBg,
                                    selectedLabelColor = PrimaryGreenDark,
                                    selectedLeadingIconColor = PrimaryGreen
                                ),
                                modifier = Modifier.weight(1f)
                            )

                            FilterChip(
                                selected = authMethod == AuthMethod.PHONE,
                                onClick = { authMethod = AuthMethod.PHONE },
                                label = { Text("Phone Number") },
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Outlined.Phone,
                                        contentDescription = null,
                                        modifier = Modifier.size(16.dp)
                                    )
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = PaleGreenBg,
                                    selectedLabelColor = PrimaryGreenDark,
                                    selectedLeadingIconColor = PrimaryGreen
                                ),
                                modifier = Modifier.weight(1f)
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        if (authMethod == AuthMethod.PHONE) {
                            // Phone Flow
                            if (authMode == AuthMode.SIGN_UP) {
                                OutlinedTextField(
                                    value = name,
                                    onValueChange = { name = it },
                                    label = { Text("Full Name") },
                                    placeholder = { Text("e.g. Chinedu Okafor") },
                                    leadingIcon = { Icon(Icons.Outlined.Person, contentDescription = null, tint = TextMuted) },
                                    singleLine = true,
                                    shape = RoundedCornerShape(14.dp),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("phone_name_input")
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                            }

                            OutlinedTextField(
                                value = phoneNumber,
                                onValueChange = { phoneNumber = it },
                                label = { Text("Phone Number (e.g. 08012345678)") },
                                leadingIcon = { Icon(Icons.Outlined.Phone, contentDescription = null, tint = TextMuted) },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone, imeAction = ImeAction.Next),
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("phone_input")
                            )

                            if (authMode == AuthMode.SIGN_UP) {
                                Spacer(modifier = Modifier.height(12.dp))
                                OutlinedTextField(
                                    value = referralCode,
                                    onValueChange = { referralCode = it.uppercase() },
                                    label = { Text("Referral / Study Code (Optional)") },
                                    placeholder = { Text("PRZ-4301 (+150 XP bonus)") },
                                    leadingIcon = { Icon(Icons.Default.CardGiftcard, contentDescription = null, tint = TextMuted) },
                                    singleLine = true,
                                    shape = RoundedCornerShape(14.dp),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("phone_referral_input")
                                )
                            }
                        } else {
                            // Email Flow
                            if (authMode == AuthMode.SIGN_UP) {
                                OutlinedTextField(
                                    value = name,
                                    onValueChange = { name = it },
                                    label = { Text("Full Name") },
                                    placeholder = { Text("e.g. Chinedu Okafor") },
                                    leadingIcon = { Icon(Icons.Outlined.Person, contentDescription = null, tint = TextMuted) },
                                    singleLine = true,
                                    shape = RoundedCornerShape(14.dp),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("email_name_input")
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                            }

                            OutlinedTextField(
                                value = email,
                                onValueChange = { email = it },
                                label = { Text("Email Address") },
                                placeholder = { Text("student@gmail.com") },
                                leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = null, tint = TextMuted) },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Next),
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("email_input")
                            )

                            // Email domain quick tap suggestions
                            if (email.isNotEmpty() && !email.contains("@")) {
                                Spacer(modifier = Modifier.height(6.dp))
                                LazyRow(
                                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    items(emailDomains) { domain ->
                                        Surface(
                                            shape = RoundedCornerShape(8.dp),
                                            color = PaleGreenBg,
                                            modifier = Modifier.clickable {
                                                email = "$email$domain"
                                            }
                                        ) {
                                            Text(
                                                text = domain,
                                                style = MaterialTheme.typography.labelSmall,
                                                color = PrimaryGreenDark,
                                                fontWeight = FontWeight.SemiBold,
                                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                            )
                                        }
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            OutlinedTextField(
                                value = password,
                                onValueChange = { password = it },
                                label = { Text("Password") },
                                leadingIcon = { Icon(Icons.Outlined.Lock, contentDescription = null, tint = TextMuted) },
                                trailingIcon = {
                                    IconButton(onClick = { showPassword = !showPassword }) {
                                        Icon(
                                            imageVector = if (showPassword) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                            contentDescription = if (showPassword) "Hide password" else "Show password",
                                            tint = TextMuted
                                        )
                                    }
                                },
                                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Password,
                                    imeAction = if (authMode == AuthMode.SIGN_UP) ImeAction.Next else ImeAction.Done
                                ),
                                keyboardActions = KeyboardActions(
                                    onDone = {
                                        keyboardController?.hide()
                                        focusManager.clearFocus()
                                    }
                                ),
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("password_input")
                            )

                            // Password Strength Bar for Sign Up
                            if (authMode == AuthMode.SIGN_UP && password.isNotEmpty()) {
                                Spacer(modifier = Modifier.height(6.dp))
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = when {
                                            isPasswordStrong -> "Strong password"
                                            isPasswordMedium -> "Good password"
                                            else -> "Weak password (min 6 chars)"
                                        },
                                        style = MaterialTheme.typography.labelSmall,
                                        color = when {
                                            isPasswordStrong -> PrimaryGreen
                                            isPasswordMedium -> Color(0xFFD97706)
                                            else -> IncorrectRed
                                        },
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    LinearProgressIndicator(
                                        progress = {
                                            when {
                                                isPasswordStrong -> 1.0f
                                                isPasswordMedium -> 0.66f
                                                else -> 0.33f
                                            }
                                        },
                                        modifier = Modifier
                                            .width(80.dp)
                                            .height(4.dp)
                                            .clip(RoundedCornerShape(2.dp)),
                                        color = when {
                                            isPasswordStrong -> PrimaryGreen
                                            isPasswordMedium -> Color(0xFFD97706)
                                            else -> IncorrectRed
                                        },
                                        trackColor = BorderSubtle
                                    )
                                }
                            }

                            // Confirm Password for Sign Up
                            if (authMode == AuthMode.SIGN_UP) {
                                Spacer(modifier = Modifier.height(12.dp))
                                OutlinedTextField(
                                    value = confirmPassword,
                                    onValueChange = { confirmPassword = it },
                                    label = { Text("Confirm Password") },
                                    leadingIcon = { Icon(Icons.Outlined.Lock, contentDescription = null, tint = TextMuted) },
                                    trailingIcon = {
                                        if (confirmPassword.isNotEmpty()) {
                                            if (password == confirmPassword) {
                                                Icon(Icons.Default.CheckCircle, contentDescription = "Passwords match", tint = PrimaryGreen)
                                            } else {
                                                Icon(Icons.Default.ErrorOutline, contentDescription = "Passwords do not match", tint = IncorrectRed)
                                            }
                                        }
                                    },
                                    visualTransformation = if (showConfirmPassword) VisualTransformation.None else PasswordVisualTransformation(),
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Next),
                                    singleLine = true,
                                    shape = RoundedCornerShape(14.dp),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("confirm_password_input")
                                )

                                Spacer(modifier = Modifier.height(12.dp))
                                OutlinedTextField(
                                    value = referralCode,
                                    onValueChange = { referralCode = it.uppercase() },
                                    label = { Text("Referral / Study Code (Optional)") },
                                    placeholder = { Text("PRZ-4301 (+150 XP bonus)") },
                                    leadingIcon = { Icon(Icons.Default.CardGiftcard, contentDescription = null, tint = TextMuted) },
                                    singleLine = true,
                                    shape = RoundedCornerShape(14.dp),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("email_referral_input")
                                )
                            } else {
                                // Forgot Password Link in Log In mode
                                Spacer(modifier = Modifier.height(8.dp))
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.clickable { rememberMe = !rememberMe }
                                    ) {
                                        Checkbox(
                                            checked = rememberMe,
                                            onCheckedChange = { rememberMe = it },
                                            colors = CheckboxDefaults.colors(checkedColor = PrimaryGreen)
                                        )
                                        Text(
                                            text = "Remember me",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = TextSecondary
                                        )
                                    }

                                    Text(
                                        text = "Forgot password?",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = PrimaryGreen,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .clickable { showForgotPasswordDialog = true }
                                            .padding(4.dp)
                                            .testTag("forgot_password_btn")
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        PrepzaButton(
                            text = if (effectiveLoading) "Connecting..." else if (authMode == AuthMode.SIGN_UP) "Create Free Account" else "Log In to Prepza",
                            icon = Icons.AutoMirrored.Filled.ArrowForward,
                            onClick = {
                                keyboardController?.hide()
                                focusManager.clearFocus()
                                localErrorMessage = null
                                infoFeedbackMessage = null
                                onClearError()

                                val finalReferral = referralCode.trim().ifBlank { null }

                                if (authMethod == AuthMethod.PHONE) {
                                    if (phoneNumber.isBlank()) {
                                        localErrorMessage = "Please enter a valid phone number"
                                        return@PrepzaButton
                                    }
                                    val candidateName = if (name.isNotBlank()) name.trim() else "UTME Candidate"
                                    onLoginWithPhone(phoneNumber.trim(), candidateName, finalReferral)
                                } else {
                                    if (authMode == AuthMode.SIGN_UP) {
                                        if (name.isBlank()) {
                                            localErrorMessage = "Please enter your full name"
                                            return@PrepzaButton
                                        }
                                        if (email.isBlank()) {
                                            localErrorMessage = "Please enter your email address"
                                            return@PrepzaButton
                                        }
                                        if (password.length < 6) {
                                            localErrorMessage = "Password must be at least 6 characters"
                                            return@PrepzaButton
                                        }
                                        if (confirmPassword.isNotEmpty() && password != confirmPassword) {
                                            localErrorMessage = "Passwords do not match. Please re-enter your password."
                                            return@PrepzaButton
                                        }
                                        onSignUpWithEmail(
                                            name.trim(),
                                            email.trim(),
                                            password,
                                            finalReferral
                                        )
                                    } else {
                                        if (email.isBlank()) {
                                            localErrorMessage = "Please enter your email address"
                                            return@PrepzaButton
                                        }
                                        if (password.isBlank()) {
                                            localErrorMessage = "Please enter your password"
                                            return@PrepzaButton
                                        }
                                        onLoginWithEmail(email.trim(), password)
                                    }
                                }
                            },
                            enabled = !effectiveLoading,
                            modifier = Modifier.testTag("auth_submit_btn")
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        OutlinedButton(
                            onClick = {
                                onClearError()
                                onLoginAsGuest()
                            },
                            enabled = !effectiveLoading,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(46.dp)
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
                    text = "Encrypted Local & Cloud-Synced Student Profile",
                    style = MaterialTheme.typography.labelSmall,
                    color = TextMuted
                )
                Text(
                    text = "Streaks, CBT mocks, test diagnostics & bookmarks remain linked to your account.",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    textAlign = TextAlign.Center
                )
            }
        }

        // FORGOT PASSWORD DIALOG
        if (showForgotPasswordDialog) {
            var resetEmail by remember { mutableStateOf(email.ifBlank { "" }) }
            var newResetPassword by remember { mutableStateOf("") }
            var isResetting by remember { mutableStateOf(false) }
            var resetStatusMsg by remember { mutableStateOf<String?>(null) }
            var resetStatusSuccess by remember { mutableStateOf(false) }

            Dialog(onDismissRequest = { showForgotPasswordDialog = false }) {
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = SurfaceWhite,
                    shadowElevation = 8.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Reset Your Password",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            IconButton(onClick = { showForgotPasswordDialog = false }) {
                                Icon(Icons.Default.Close, contentDescription = "Close", tint = TextMuted)
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Enter your registered email address to receive password reset instructions or update your password.",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        OutlinedTextField(
                            value = resetEmail,
                            onValueChange = { resetEmail = it },
                            label = { Text("Registered Email") },
                            leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = null, tint = TextMuted) },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        OutlinedTextField(
                            value = newResetPassword,
                            onValueChange = { newResetPassword = it },
                            label = { Text("New Password (min 6 chars)") },
                            placeholder = { Text("Enter new password") },
                            leadingIcon = { Icon(Icons.Outlined.Lock, contentDescription = null, tint = TextMuted) },
                            visualTransformation = PasswordVisualTransformation(),
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth()
                        )

                        if (resetStatusMsg != null) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = resetStatusMsg!!,
                                style = MaterialTheme.typography.bodySmall,
                                color = if (resetStatusSuccess) PrimaryGreen else IncorrectRed,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            OutlinedButton(
                                onClick = {
                                    if (resetEmail.isBlank()) {
                                        resetStatusMsg = "Please enter your email"
                                        resetStatusSuccess = false
                                        return@OutlinedButton
                                    }
                                    isResetting = true
                                    onRequestPasswordReset(resetEmail.trim()) { success, msg ->
                                        isResetting = false
                                        resetStatusSuccess = success
                                        resetStatusMsg = msg
                                    }
                                },
                                enabled = !isResetting,
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text("Send Email Link", style = MaterialTheme.typography.labelSmall)
                            }

                            Button(
                                onClick = {
                                    if (resetEmail.isBlank()) {
                                        resetStatusMsg = "Please enter your email"
                                        resetStatusSuccess = false
                                        return@Button
                                    }
                                    if (newResetPassword.length < 6) {
                                        resetStatusMsg = "New password must be at least 6 characters"
                                        resetStatusSuccess = false
                                        return@Button
                                    }
                                    isResetting = true
                                    onResetPasswordWithCode(resetEmail.trim(), newResetPassword) { success, msg ->
                                        isResetting = false
                                        resetStatusSuccess = success
                                        resetStatusMsg = msg
                                        if (success) {
                                            infoFeedbackMessage = "Password updated! You can now log in."
                                        }
                                    }
                                },
                                enabled = !isResetting,
                                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text("Update Now", style = MaterialTheme.typography.labelSmall, color = Color.White)
                            }
                        }
                    }
                }
            }
        }

        // SPECIFIC GMAIL ACCOUNT PICKER DIALOG
        if (showCustomGmailDialog) {
            var customGmail by remember { mutableStateOf(if (email.endsWith("@gmail.com")) email else "") }
            var customGmailName by remember { mutableStateOf(name.ifBlank { "" }) }

            Dialog(onDismissRequest = { showCustomGmailDialog = false }) {
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = SurfaceWhite,
                    shadowElevation = 8.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Surface(
                                    shape = CircleShape,
                                    color = Color(0xFFF1F5F9),
                                    modifier = Modifier.size(32.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = "G",
                                            fontWeight = FontWeight.Black,
                                            fontSize = 16.sp,
                                            color = Color(0xFF4285F4)
                                        )
                                    }
                                }
                                Text(
                                    text = "Google / Gmail Sign In",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                            }
                            IconButton(onClick = { showCustomGmailDialog = false }) {
                                Icon(Icons.Default.Close, contentDescription = "Close", tint = TextMuted)
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Enter your Gmail address for fast Google-authenticated sign-in with cloud backup.",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        OutlinedTextField(
                            value = customGmailName,
                            onValueChange = { customGmailName = it },
                            label = { Text("Your Name") },
                            placeholder = { Text("e.g. Chinedu Okafor") },
                            leadingIcon = { Icon(Icons.Outlined.Person, contentDescription = null, tint = TextMuted) },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        OutlinedTextField(
                            value = customGmail,
                            onValueChange = { customGmail = it },
                            label = { Text("Gmail Address") },
                            placeholder = { Text("username@gmail.com") },
                            leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = null, tint = TextMuted) },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(18.dp))

                        Button(
                            onClick = {
                                val cleanEmail = customGmail.trim().lowercase()
                                val formattedEmail = if (!cleanEmail.contains("@")) "$cleanEmail@gmail.com" else cleanEmail
                                val finalName = customGmailName.trim().ifBlank { "UTME Candidate" }
                                showCustomGmailDialog = false
                                onLoginWithGoogle(finalName, formattedEmail, referralCode.trim().ifBlank { null })
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(46.dp)
                        ) {
                            Text("Sign In with This Gmail", fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }
                }
            }
        }
    }
}
