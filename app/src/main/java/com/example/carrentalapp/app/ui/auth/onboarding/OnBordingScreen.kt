package com.example.carrentalapp.app.ui.auth.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.R
import com.example.carrentalapp.app.component.CustomHeading
import com.example.carrentalapp.app.component.boading.CustomBoardingScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen() {
    val context = LocalContext.current
    // val sharedPrefsHelper = SharedPrefsHelper(context)
    val pagerState = rememberPagerState { 3 }
    val buttonText = if (pagerState.currentPage == 2) "Get Started" else "Next"
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState) { page ->
            when (page) {
                0 -> CustomBoardingScreen(
                    imageResId = R.drawable.boardingone,
                    headingText = "Make it easy for users to quickly book a ride from their current location with just a few taps."
                )

                1 -> CustomBoardingScreen(
                    imageResId = R.drawable.boardingtwo,
                    headingText = "Provide a variety of vehicle options to choose from, catering to different preferences \n" +
                            "and budgets."
                )

                2 -> CustomBoardingScreen(
                    imageResId = R.drawable.boardingthree,
                    headingText = "Let users track their ride in real-time, so they know exactly where their driver is and when \n" +
                            "they'll arrive."
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 34.dp, end = 34.dp, bottom = 34.dp),
horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            CustomHeading(title = "SKIP", fontSize = 18.sp)
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.padding(bottom = 7.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(3) { index ->
                    var color =
                        if (pagerState.currentPage == index) Color(0xFF2387E0) else Color(0xFFFFFFFF)
                    var colorwidth = if (pagerState.currentPage == index) 15.dp else 8.dp
                    Spacer(modifier = Modifier.width(10.dp))
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .height(8.dp)
                            .width(colorwidth)
                            .background(color)

                    )

                }
            }
            Spacer(modifier = Modifier.weight(1f))
            CustomHeading(title = "NEXT", fontSize = 18.sp)

        }
//Box

////Button
//        Button(
//            modifier = Modifier
//                .padding(bottom = 50.dp)
//                .fillMaxWidth()
//                .height(50.dp)
//                .padding(start = 25.dp, end = 25.dp)
//                .align(Alignment.BottomCenter),
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.LightGray
//            ),
//            onClick = {
//                if (pagerState.currentPage < 2) {
//                    scope.launch {
//                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                    }
//                } else {
//
//                }
//            }
//        ) {
//            Text(text = buttonText, color = Color.White, fontSize = 18.sp)
//        }
    }
}