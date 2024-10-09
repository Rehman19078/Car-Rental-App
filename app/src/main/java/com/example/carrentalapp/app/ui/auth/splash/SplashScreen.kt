package com.example.carrentalapp.app.ui.auth.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.carrentalapp.R
import com.example.carrentalapp.app.component.CustomImage
import com.example.myapp.app.utilites.extension.calculateScaleFactors

@Composable
fun SplashScreen() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val scaleFactors = calculateScaleFactors(maxWidth, maxHeight)
        Column(
            modifier = Modifier
                .fillMaxSize()
                //.scale(scaleFactors.scaleWidth, scaleFactors.scaleHeight)
                .background(Color(0xFF08152d)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier
                .height(100.dp)
                .scale(scaleFactors.scaleHeight))
            CustomImage(
                painter = painterResource(id = R.drawable.splashicon),
                contentDescription = "splash icon"
            )
            Spacer(
                modifier = Modifier
                    .height(251.dp)
                    .scale(scaleFactors.scaleHeight)
            )
            CustomImage(
                painter = painterResource(id = R.drawable.splashcar),
                contentDescription = "splashcard",
                modifier = Modifier
                    .height(256.dp)
                    .scale(scaleFactors.scaleHeight)
                    .width(394.dp)
                    .scale(scaleFactors.scaleWidth)
            )

        }
    }
}