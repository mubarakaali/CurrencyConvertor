package com.rates.framework.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun MainTitleText(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = MaterialTheme.typography.h1.copy(fontSize = 48.sp),
        color = MaterialTheme.colors.primary,
        fontFamily = FontFamily.Cursive,
    )
}

@Composable
fun MediumTitleText(
    title: String,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colors.primary
) {
    Text(
        text = title,
        modifier = modifier,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h6,
        color = textColor,
        fontFamily = FontFamily.Serif,
    )
}
@Composable
fun StandardCustomText(
    title: String,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colors.primary
) {
    Text(
        text = title,
        modifier = modifier,
        textAlign = TextAlign.Start,
        style = MaterialTheme.typography.subtitle1,
        color = textColor,
        fontFamily = FontFamily.Serif,
    )
}