package com.example.ui.viewmodel

import com.example.data.db.UserAccountEntity

/**
 * Centralized UI State for Authentication in Prepza.
 * Encapsulates idle, loading, success, and structured error states.
 */
sealed interface AuthUiState {
    object Idle : AuthUiState
    object Loading : AuthUiState
    data class Success(
        val account: UserAccountEntity,
        val message: String? = null
    ) : AuthUiState
    data class Error(
        val message: String,
        val errorType: AuthErrorType = AuthErrorType.GENERAL
    ) : AuthUiState
}

enum class AuthErrorType {
    INVALID_CREDENTIALS,
    ACCOUNT_NOT_FOUND,
    EMAIL_ALREADY_EXISTS,
    WEAK_PASSWORD,
    GOOGLE_SIGN_IN_CANCELLED,
    GOOGLE_SIGN_IN_FAILED,
    NETWORK_ERROR,
    VALIDATION_ERROR,
    RATE_LIMITED,
    GENERAL
}
