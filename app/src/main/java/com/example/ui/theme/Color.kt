package com.example.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

// CompositionLocal to provide theme state across the entire composable tree
val LocalThemeIsDark = compositionLocalOf { false }

// Primary Forest Green Palette (Inspiration Green)
val PrimaryGreen = Color(0xFF0E6932)
val PrimaryGreenDark = Color(0xFF0B4F26)
val PrimaryGreenLight = Color(0xFF22C55E)
val PrimaryEmerald = Color(0xFF10B981)

// Raw Light Mode Tokens
val RawSoftGreenBgLight = Color(0xFFDCFCE7)
val RawPaleGreenBgLight = Color(0xFFF0FDF4)
val RawAppBackgroundLight = Color(0xFFFBFDFA)
val RawSurfaceWhite = Color(0xFFFFFFFF)
val RawTextPrimaryLight = Color(0xFF0F172A)
val RawTextSecondaryLight = Color(0xFF64748B)
val RawTextMutedLight = Color(0xFF94A3B8)
val RawBorderSubtleLight = Color(0xFFE2E8F0)

// Raw Dark Theme Neutrals matching screenshot deep slate canvas
val RawAppBackgroundDark = Color(0xFF0F141C)
val RawSurfaceDark = Color(0xFF141A23)
val RawSurfaceDarkVariant = Color(0xFF1E2633)
val RawTextPrimaryDark = Color(0xFFF8FAFC)
val RawTextSecondaryDark = Color(0xFF94A3B8)
val RawTextMutedDark = Color(0xFF64748B)
val RawBorderDark = Color(0xFF1E293B)

// Static Constants for direct/non-composable use
val AppBackgroundDark = RawAppBackgroundDark
val SurfaceDark = RawSurfaceDark
val SurfaceDarkVariant = RawSurfaceDarkVariant
val TextPrimaryDark = RawTextPrimaryDark
val TextSecondaryDark = RawTextSecondaryDark
val BorderDark = RawBorderDark

// Dynamic Composable Color Getters (adapts immediately across all screens and modes)
val AppBackground: Color
    @Composable get() = if (LocalThemeIsDark.current) RawAppBackgroundDark else RawAppBackgroundLight

val SurfaceWhite: Color
    @Composable get() = if (LocalThemeIsDark.current) RawSurfaceDark else RawSurfaceWhite

val ElevatedSurface: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF1B232E) else Color(0xFFFFFFFF)

val InputFieldBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF141A23) else Color(0xFFFFFFFF)

val TextPrimary: Color
    @Composable get() = if (LocalThemeIsDark.current) RawTextPrimaryDark else RawTextPrimaryLight

val TextSecondary: Color
    @Composable get() = if (LocalThemeIsDark.current) RawTextSecondaryDark else RawTextSecondaryLight

val TextMuted: Color
    @Composable get() = if (LocalThemeIsDark.current) RawTextMutedDark else RawTextMutedLight

val BorderSubtle: Color
    @Composable get() = if (LocalThemeIsDark.current) RawBorderDark else RawBorderSubtleLight

val PaleGreenBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF0B2818) else RawPaleGreenBgLight

val SoftGreenBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF0D3320) else RawSoftGreenBgLight

val SoftEmeraldBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF0D3320) else RawSoftGreenBgLight

val DarkCardBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF141A23) else Color(0xFF181C20)

val DarkCardVariant: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF1E2633) else Color(0xFF22282F)

// Pastel Badges & Accents (Light & Dark friendly with high contrast)
val SoftAmberBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF382910) else Color(0xFFFEF3C7)
val AmberAccent = Color(0xFFD97706)

val SoftBlueBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF152A47) else Color(0xFFDBEAFE)
val BlueAccent = Color(0xFF2563EB)

val SoftPurpleBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF2E1B42) else Color(0xFFF3E8FF)
val PurpleAccent = Color(0xFF9333EA)

val SoftOrangeBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF3A2012) else Color(0xFFFFEDD5)
val OrangeAccent = Color(0xFFEA580C)

val SoftRoseBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF3A1822) else Color(0xFFFFE4E6)
val RoseAccent = Color(0xFFE11D48)

val SoftTealBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF12342E) else Color(0xFFCCFBF1)
val TealAccent = Color(0xFF0D9488)

// Functional Feedback Colors
val CorrectGreen = Color(0xFF16A34A)
val CorrectGreenBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF14381F) else Color(0xFFDCFCE7)

val IncorrectRed = Color(0xFFEF4444)
val IncorrectRedBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF3E1A1A) else Color(0xFFFEE2E2)

val SoftRed = Color(0xFFEF4444)
val SoftRedBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF3E1A1A) else Color(0xFFFEE2E2)

val WarningAmber = Color(0xFFF59E0B)
val WarningAmberBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF382910) else Color(0xFFFEF3C7)

val InfoBlue = Color(0xFF3B82F6)
val InfoBlueBg: Color
    @Composable get() = if (LocalThemeIsDark.current) Color(0xFF152A47) else Color(0xFFDBEAFE)

// Book Covers
val BookCoverGreen = Color(0xFF2E7D47)
val BookCoverBlue = Color(0xFF3B66DE)
val BookCoverPurple = Color(0xFF6356D8)
val BookCoverDark = Color(0xFF1D2024)

// Sepia Reader Theme
val SepiaBackground = Color(0xFFF8F1E5)
val SepiaText = Color(0xFF433225)
val SepiaSurface = Color(0xFFEFE6D5)
