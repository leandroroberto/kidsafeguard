package com.leandrodev.kidsafeguardapp.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.leandrodev.kidsafeguardapp.navigation.item.BottomNavItem
import com.leandrodev.kidsafeguardapp.navigation.navhost.BottomAppBarNavHost
import com.leandrodev.kidsafeguardapp.ui.components.AddBottomItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navHostController: NavHostController = rememberNavController()) {

    var selectedItem by remember  { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                content = {
                    BottomNavItem.items.forEachIndexed { index, item ->
                        AddBottomItem(
                            item = item,
                            selected = selectedItem == index,
                            onClick = { selectedItem = index }
                        )
                    }
                }
            )
        },

        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .padding(paddingValues)
            ) {
                BottomAppBarNavHost(navHostController)
            }
        }

    )
}