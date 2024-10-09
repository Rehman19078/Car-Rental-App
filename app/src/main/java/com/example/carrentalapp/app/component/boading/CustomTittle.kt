package com.example.carrentalapp.app.component.boading

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.R
import com.example.carrentalapp.app.component.FontStyle

@Composable
fun CustomTittle(
    title: String,
    color: Color = Color(0xFF333333),
    fontSize: TextUnit = 20.sp,
    font: FontStyle = FontStyle.BOLD,
    textAlign: TextAlign = TextAlign.Center,
    modifier: Modifier = Modifier,
    lineHeight: TextUnit = 40.sp,
) {
    val fontFamily = when (font) {
       FontStyle.REGULAR -> FontFamily(Font(R.font.regular))
        FontStyle.BOLD -> FontFamily(Font(R.font.bold))
       FontStyle.MEDIUM -> FontFamily(Font(R.font.medium))
       FontStyle.LIGHT -> FontFamily(Font(R.font.light))
    }


    Text(
        text = title,
        fontSize = fontSize,
        fontFamily = fontFamily,
        color = color,
        lineHeight = lineHeight,
        textAlign = textAlign,
        modifier = modifier
    )
}

