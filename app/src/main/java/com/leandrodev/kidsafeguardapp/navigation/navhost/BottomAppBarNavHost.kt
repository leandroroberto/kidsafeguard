package com.leandrodev.kidsafeguardapp.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.leandrodev.kidsafeguardapp.ui.emergencycontacts.EmergencyScreen
import com.leandrodev.kidsafeguardapp.ui.screens.instructions.InstructionsScreen
import com.leandrodev.kidsafeguardapp.ui.screens.main.MainScreen
import com.leandrodev.kidsafeguardapp.ui.screens.news.NewsScreen
import com.leandrodev.kidsafeguardapp.util.EmergencyScreenRoute
import com.leandrodev.kidsafeguardapp.util.InstructionsScreenRoute
import com.leandrodev.kidsafeguardapp.util.MainScreenRoute
import com.leandrodev.kidsafeguardapp.util.NewsScreenRoute

@Composable
fun BottomAppBarNavHost(navHostController: NavHostController) {

   NavHost(navController = navHostController, startDestination = MainScreenRoute ){

        composable<MainScreenRoute> {
            MainScreen()
        }

       composable<InstructionsScreenRoute> {
           InstructionsScreen()
       }

       composable<EmergencyScreenRoute> {
           EmergencyScreen()
       }

       composable<NewsScreenRoute> {
           NewsScreen()
       }
   }
}


