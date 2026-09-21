package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

enum class AppThemeMode {
    LIGHT,
    DARK,
    SYSTEM
}

private val PrepzaLightColorScheme = lightColorScheme(
    primary = PrimaryGreen,
    onPrimary = Color.White,
    primaryContainer = RawSoftGreenBgLight,
    onPrimaryContainer = PrimaryGreenDark,
    secondary = InfoBlue,
    onSecondary = Color.White,
    background = RawAppBackgroundLight,
    onBackground = RawTextPrimaryLight,
    surface = RawSurfaceWhite,
    onSurface = RawTextPrimaryLight,
    surfaceVariant = RawPaleGreenBgLight,
    onSurfaceVariant = RawTextSecondaryLight,
    outline = RawBorderSubtleLight,
    outlineVariant = Color(0xFFE2E8F0),
    error = IncorrectRed,
    onError = Color.White
)

private val PrepzaDarkColorScheme = darkColorScheme(
    primary = PrimaryGreenLight,
    onPrimary = Color(0xFF04200E),
    primaryContainer = Color(0xFF143822),
    onPrimaryContainer = Color(0xFFDCFCE7),
    secondary = Color(0xFF60A5FA),
    onSecondary = Color(0xFF0B192C),
    background = RawAppBackgroundDark,
    onBackground = RawTextPrimaryDark,
    surface = RawSurfaceDark,
    onSurface = RawTextPrimaryDark,
    surfaceVariant = RawSurfaceDarkVariant,
    onSurfaceVariant = RawTextSecondaryDark,
    outline = RawBorderDark,
    outlineVariant = Color(0xFF333C46),
    error = Color(0xFFF87171),
    onError = Color.White
)

@Composable
fun PrepzaTheme(
    themeMode: AppThemeMode = AppThemeMode.SYSTEM,
    content: @Composable () -> Unit
) {
    val isDark = when (themeMode) {
        AppThemeMode.LIGHT -> false
        AppThemeMode.DARK -> true
        AppThemeMode.SYSTEM -> isSystemInDarkTheme()
    }

    val colorScheme = if (isDark) PrepzaDarkColorScheme else PrepzaLightColorScheme

    CompositionLocalProvider(LocalThemeIsDark provides isDark) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}
