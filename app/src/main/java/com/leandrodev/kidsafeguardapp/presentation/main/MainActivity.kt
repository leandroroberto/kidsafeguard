package com.leandrodev.kidsafeguardapp.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.leandrodev.kidsafeguardapp.ui.screens.emergencycontacts.EmergencyContacts
import com.leandrodev.kidsafeguardapp.ui.screens.home.MainScreen
import com.leandrodev.kidsafeguardapp.ui.screens.instructions.Instructions
import com.leandrodev.kidsafeguardapp.ui.screens.news.News
import com.leandrodev.kidsafeguardapp.ui.theme.KidsafeguardappTheme
import com.leandrodev.kidsafeguardapp.util.EmergencyContacts
import com.leandrodev.kidsafeguardapp.util.Instructions
import com.leandrodev.kidsafeguardapp.util.MainScreen
import com.leandrodev.kidsafeguardapp.util.News
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
        enableEdgeToEdge()
        setContent {
            KidsafeguardappTheme {

                //Configure navController
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = MainScreen) {

                    composable<MainScreen>{
                        MainScreen(navController = navController)
                    }

                    composable<Instructions> {
                        Instructions(navController = navController)
                    }

                    composable<EmergencyContacts>{
                        EmergencyContacts(navController = navController)
                    }

                    composable<News>{
                        News(navController = navController)
                    }

                }
            }
        }
    }
}
