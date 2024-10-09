package com.example.carrentalapp.app.component.boading

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.app.component.CustomHeading
import com.example.carrentalapp.app.component.CustomImage
import com.example.myapp.app.utilites.extension.calculateScaleFactors

@Composable
fun CustomBoardingScreen(
    imageResId: Int,
    headingText: String,
    fontSize: TextUnit = 20.sp,
    modifier: Modifier = Modifier,
    padding: Dp = 25.dp,
    contentScale: ContentScale = ContentScale.FillBounds
) {
    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val scaleFactors = calculateScaleFactors(maxWidth, maxHeight)
        Box(modifier = Modifier.fillMaxSize()) {
            // Background Image
            CustomImage(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = contentScale
            )
            // Heading
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(350.dp))
                CustomHeading(
                    title = headingText,
                    fontSize = fontSize,
                    lineHeight = 25.sp,
                    modifier = Modifier.padding(start = padding, end = padding)
                )
            }
        }
    }
}
