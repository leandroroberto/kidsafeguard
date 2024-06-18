package com.leandrodev.kidsafeguardapp.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.leandrodev.kidsafeguardapp.navigation.navhost.MyNavHost
import com.leandrodev.kidsafeguardapp.ui.theme.KidsafeguardappTheme
import com.leandrodev.kidsafeguardapp.viewmodel.splashscreen.SplashScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        // Configure the splash screen transition.
        val splashScreenViewModel: SplashScreenViewModel by viewModels()
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                splashScreenViewModel.isLoading.value
            }
        }

        super.onCreate(savedInstanceState)
        setContent {
            KidsafeguardappTheme {

                MyNavHost(navHostController = rememberNavController())

            }

            actionBar?.hide()
        }
    }
}
