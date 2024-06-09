package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope

import androidx.navigation.NavController
import com.leandrodev.kidsafeguardapp.util.MainScreen
import kotlinx.coroutines.launch
@Composable
fun AppDrawer(
    drawerState: DrawerState,
    navController: NavController
){
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DrawerContent(
                onItemClick = {
                    scope.launch {
                        drawerState.close()
                    }
                    navController.navigate(it)
                }
            )
        }

    ) {

    }
}



@Composable
fun DrawerContent(
    onItemClick: (String) -> Unit
){
    Column {
        DrawerItem(text = "Início", onItemClick = { onItemClick }, route = "MainScreen")
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DrawerItem(text: String, onItemClick: (String) -> Unit, route: String) {
    DrawerItem(
        text = text,
        onItemClick = onItemClick,
        route = route
    )
}