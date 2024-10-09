package com.example.carrentalapp.app.ui.auth.login

import CustomButtonWithIcon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.R
import com.example.carrentalapp.app.component.CustomButton
import com.example.carrentalapp.app.component.CustomHeading
import com.example.carrentalapp.app.component.CustomHeadingTwo
import com.example.carrentalapp.app.component.CustomImage
import com.example.carrentalapp.app.component.CustomOutlinedTextField
import com.example.carrentalapp.app.component.FontStyle
import com.example.carrentalapp.app.component.boading.CustomTittle
import com.example.myapp.app.utilites.extension.calculateScaleFactors
import com.example.myapp.app.utilites.extension.scale

@Composable
fun LoginScreen() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val scaleFactors = calculateScaleFactors(maxWidth, maxHeight)
        var loginemail by remember { mutableStateOf("") }
        var loginpassword by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .scale(scaleFactors.scaleWidth)
                .fillMaxSize(),
            //   .scale(scaleFactors.scaleWidth, scaleFactors.scaleHeight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CustomImage(
                painter = painterResource(id = R.drawable.authlogo),
                contentDescription = "auth logo",
                modifier = Modifier
                    .height(39.dp.scale(scaleFactors.scaleHeight))
                    .width(163.dp.scale(scaleFactors.scaleWidth))
            )
            Spacer(modifier = Modifier.height(27.dp.scale(scaleFactors.scaleHeight)))
            CustomTittle(
                title = "Login",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(8.dp.scale(scaleFactors.scaleHeight)))
            CustomHeading(
                title = "Please enter email & password",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start,
                color = Color(0xFF90A3BF)
            )
            Spacer(modifier = Modifier.height(18.dp.scale(scaleFactors.scaleHeight)))
            CustomHeadingTwo(title = "Email")
            Spacer(modifier = Modifier.height(8.dp.scale(scaleFactors.scaleHeight)))
            CustomOutlinedTextField(
                value = loginemail,
                onValueChange = { loginemail = it },
                placeholder = "Enter your Email",
                isPassword = false,
                showTrailingIcon = false
            )
            Spacer(modifier = Modifier.height(24.dp.scale(scaleFactors.scaleHeight)))
            CustomHeadingTwo(title = "Password")
            Spacer(modifier = Modifier.height(8.dp.scale(scaleFactors.scaleHeight)))
            CustomOutlinedTextField(
                value = loginpassword,
                onValueChange = { loginpassword = it },
                placeholder = "Enter your Password",
                isPassword = true,
                showTrailingIcon = true
            )
            Spacer(modifier = Modifier.height(24.dp.scale(scaleFactors.scaleHeight)))
            CustomHeadingTwo(
                title = "Forgot Password?",
                font = FontStyle.LIGHT,
                color = Color(0xFF3563E9),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.height(24.dp.scale(scaleFactors.scaleHeight)))
            CustomButton(text = "Login", onClick = { /*TODO*/ })
            Spacer(modifier = Modifier.height(24.dp.scale(scaleFactors.scaleHeight)))
            //anotion
            Spacer(modifier = Modifier.height(33.dp.scale(scaleFactors.scaleHeight)))
            CustomButtonWithIcon(text = "Sign in with Google", onClick = { /*TODO*/ })
            Spacer(modifier = Modifier.height(24.dp.scale(scaleFactors.scaleHeight)))
            CustomButtonWithIcon(
                text = "Sign in with Google",
                backgroundColor = Color(0xFF4267B2),
                textColor = Color(0xFFFFFFFF),
                leadingImage = painterResource(id = R.drawable.facebook),
                onClick = { /*TODO*/ })
            Spacer(modifier = Modifier.height(24.dp.scale(scaleFactors.scaleHeight)))
            CustomButtonWithIcon(
                text = "Sign in with Apple",
               backgroundColor = Color(0xFF252525),
                textColor = Color(0xFFFFFFFF),
                leadingImage = painterResource(id = R.drawable.apple),
                onClick = { /*TODO*/ })
        }
    }
}