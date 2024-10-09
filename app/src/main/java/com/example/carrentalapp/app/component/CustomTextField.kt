package com.example.carrentalapp.app.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.R
import java.time.format.TextStyle
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String = "",
    fontSize: Int = 16,
    isPassword: Boolean = false,
    showTrailingIcon: Boolean = false,
    font: FontStyle = FontStyle.LIGHT,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = if (isPassword) KeyboardOptions.Default.copy(
        keyboardType = KeyboardType.Password, imeAction = ImeAction.Done
    ) else KeyboardOptions.Default.copy(
        keyboardType = KeyboardType.Email, imeAction = ImeAction.Done
    ),
    borderColor: Color = Color(0xFFE2E8F0) // Default border color
) {
    var passwordVisible by remember { mutableStateOf(false) }

    val fontFamily = when (font) {
        FontStyle.REGULAR -> FontFamily(Font(R.font.regular))
        FontStyle.BOLD -> FontFamily(Font(R.font.bold))
        FontStyle.MEDIUM -> FontFamily(Font(R.font.medium))
        FontStyle.LIGHT -> FontFamily(Font(R.font.light))
    }

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                style = androidx.compose.ui.text.TextStyle(
                    color = Color(0xFF94A3B8),
                    fontFamily = fontFamily,
                    fontSize = fontSize.sp
                )
            )
        },
        textStyle = androidx.compose.ui.text.TextStyle(
            fontFamily = fontFamily,
            fontSize = fontSize.sp
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = borderColor,
            unfocusedBorderColor = borderColor,
            cursorColor = Color.Black,
            focusedTrailingIconColor = Color.Black,
            unfocusedTrailingIconColor = Color.Black
        ),
        visualTransformation = if (isPassword && !passwordVisible) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            if (isPassword && showTrailingIcon) {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(
                        imageVector = if (passwordVisible) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff,
                        contentDescription = if (passwordVisible) "Hide password" else "Show password",
                        tint = Color(0xFF64748B)
                    )
                }
            }
        },
        shape = RoundedCornerShape(8.dp),
        keyboardOptions = keyboardOptions,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    )
}
