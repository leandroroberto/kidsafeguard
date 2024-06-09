package com.leandrodev.kidsafeguardapp.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.leandrodev.kidsafeguardapp.ui.screens.emergencycontacts.EmergencyScreen
import com.leandrodev.kidsafeguardapp.ui.screens.home.HomeScreen
import com.leandrodev.kidsafeguardapp.ui.screens.instructions.InstructionsScreen
import com.leandrodev.kidsafeguardapp.ui.screens.news.NewsScreen
import kotlinx.serialization.Serializable

@Composable
fun BottomAppBarNavHost(navHostController: NavHostController) {
   NavHost(navController = navHostController, startDestination = HomeScreenRoute ){
        composable<HomeScreenRoute> {
            HomeScreen(navHostController)
        }
   }
}