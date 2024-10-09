package com.example.myapp.app.utilites.extension

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

data class ScaleFactors(val scaleWidth: Float, val scaleHeight: Float)

@Composable
fun calculateScaleFactors(maxWidth: Dp, maxHeight: Dp): ScaleFactors {
    val baseWidth = 420.dp
    val baseHeight = 800.dp

    val scaleWidth = maxWidth.value / baseWidth.value
    val scaleHeight = maxHeight.value / baseHeight.value

    return ScaleFactors(scaleWidth, scaleHeight)
}

fun Dp.scale(scaleFactor: Float): Dp {
    return this * scaleFactor
}

fun TextUnit.scale(scaleFactor: Float): TextUnit {
    return this * scaleFactor
}