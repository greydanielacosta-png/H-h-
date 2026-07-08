package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = HorizonPink,
    secondary = HorizonYellow,
    tertiary = HorizonTeal,
    background = DarkAsphalt,
    surface = DarkGarage,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onTertiary = Color.Black,
    onBackground = TextWhite,
    onSurface = TextWhite,
    surfaceVariant = CyberConsole,
    onSurfaceVariant = TextGray
)

private val LightColorScheme = darkColorScheme(
    // Force dark theme for gaming HUD immersion
    primary = HorizonPink,
    secondary = HorizonYellow,
    tertiary = HorizonTeal,
    background = DarkAsphalt,
    surface = DarkGarage,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onTertiary = Color.Black,
    onBackground = TextWhite,
    onSurface = TextWhite,
    surfaceVariant = CyberConsole,
    onSurfaceVariant = TextGray
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = true, // Force Dark Theme for full visual immersion
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}
