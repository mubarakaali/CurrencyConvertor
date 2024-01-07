package com.rates.framework.ui.theming

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun BikeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = Shapes,
        content = content
    )
}
