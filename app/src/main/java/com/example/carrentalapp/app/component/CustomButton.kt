package com.example.carrentalapp.app.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.R

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    textColor: Color = Color.White,
    backgroundColor: Color = Color(0xFF252525),
    cornerRadius: Dp = 5.dp,
    modifier: Modifier = Modifier,
    font: FontStyle = FontStyle.LIGHT,
) {
    val fontFamily = when (font) {
        FontStyle.REGULAR -> FontFamily(Font(R.font.regular))
        FontStyle.BOLD -> FontFamily(Font(R.font.bold))
        FontStyle.MEDIUM -> FontFamily(Font(R.font.medium))
        FontStyle.LIGHT -> FontFamily(Font(R.font.light))
    }
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = textColor
        ),
        shape = RoundedCornerShape(cornerRadius),
        modifier = modifier
            .height(55.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = text,
            style = TextStyle(
                color = textColor, // Use customizable text color
                fontFamily = fontFamily,
                fontSize = 16.sp
            )
        )
    }
}
