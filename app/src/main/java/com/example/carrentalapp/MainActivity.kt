package com.example.carrentalapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.carrentalapp.app.ui.auth.login.LoginScreen
import com.example.carrentalapp.app.ui.auth.onboarding.OnboardingScreen
import com.example.carrentalapp.app.ui.auth.splash.SplashScreen
import com.example.carrentalapp.ui.theme.CarRentalAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarRentalAppTheme {
                LoginScreen()
               // OnboardingScreen()
              //  OnBoardingScreen()
                //SplashScreen()
            }
        }
    }
}
