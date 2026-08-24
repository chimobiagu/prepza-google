package com.example.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val PrepzaColorScheme = lightColorScheme(
    primary = PrimaryGreen,
    onPrimary = Color.White,
    primaryContainer = SoftGreenBg,
    onPrimaryContainer = PrimaryGreenDark,
    secondary = InfoBlue,
    onSecondary = Color.White,
    background = AppBackground,
    onBackground = TextPrimary,
    surface = SurfaceWhite,
    onSurface = TextPrimary,
    surfaceVariant = PaleGreenBg,
    onSurfaceVariant = TextSecondary,
    outline = BorderSubtle,
    error = IncorrectRed,
    onError = Color.White
)

@Composable
fun PrepzaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = PrepzaColorScheme,
        typography = Typography,
        content = content
    )
}
