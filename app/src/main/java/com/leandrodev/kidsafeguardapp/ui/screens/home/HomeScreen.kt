package com.leandrodev.kidsafeguardapp.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.compose.gradientColor
import com.example.compose.onPrimaryContainerLight
import com.example.compose.onTertiaryContainerLight
import com.example.compose.primaryContainerDark
import com.example.compose.primaryContainerLight
import com.example.compose.secondaryContainerLight
import com.leandrodev.kidsafeguardapp.navigation.item.BottomNavItem
import com.leandrodev.kidsafeguardapp.navigation.navhost.BottomAppBarNavHost
import com.leandrodev.kidsafeguardapp.ui.components.AddBottomItem
import com.leandrodev.kidsafeguardapp.ui.components.AppBarUI
import com.leandrodev.kidsafeguardapp.util.EmergencyScreenRoute
import com.leandrodev.kidsafeguardapp.util.InstructionsScreenRoute
import com.leandrodev.kidsafeguardapp.util.MainScreenRoute
import com.leandrodev.kidsafeguardapp.util.NewsScreenRoute

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navHostController: NavHostController = rememberNavController()) {

    var selectedItem by remember { mutableIntStateOf(0) }

    val isDarkMode = isSystemInDarkTheme()

    // Obtenha o gradiente do seu arquivo Color
    val gradientColors = gradientColor

    // Crie o pincel (Brush) de gradiente linear
    val gradientBrush = Brush.linearGradient(
        colors = gradientColors.toList(),
        start = androidx.compose.ui.geometry.Offset(0f, 0f),
        end = androidx.compose.ui.geometry.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
    )

    // Calcula a média ponderada das cores do gradiente
    val averageColor = Color(
        red = (gradientColors.first.red + gradientColors.second.red) / 2,
        green = (gradientColors.first.green + gradientColors.second.green) / 2,
        blue = (gradientColors.first.blue + gradientColors.second.blue) / 2,
        alpha = (gradientColors.first.alpha + gradientColors.second.alpha) / 2
    )

    Scaffold(
        modifier = Modifier,
        containerColor = if(isDarkMode) onTertiaryContainerLight else averageColor,
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(CircleShape)
                    .border(1.dp, primaryContainerLight, CircleShape),
                containerColor = if(isDarkMode) primaryContainerDark else secondaryContainerLight,
                content = {
                    BottomNavItem.items.forEachIndexed { index, item ->

                        if (index == 0) {
                            Spacer(modifier = Modifier.width(8.dp))
                        }

                        AddBottomItem(
                            item = item,
                            selected = selectedItem == index,
                            onClick = {
                                selectedItem = index
                                when (index) {
                                    0 -> navHostController.navigate(MainScreenRoute)
                                    1 -> navHostController.navigate(InstructionsScreenRoute)
                                    2 -> navHostController.navigate(EmergencyScreenRoute)
                                    3 -> navHostController.navigate(NewsScreenRoute)
                                }
                            },
                            label = {
                                Text(
                                    text = stringResource(id = item.title),
                                    color = onPrimaryContainerLight,
                                    fontSize = 11.sp,
                                    fontWeight = if (selectedItem == index) FontWeight.ExtraBold else FontWeight.Normal
                                )
                            }
                        )

                        if (index == BottomNavItem.items.size - 1) {
                            Spacer(modifier = Modifier.width(8.dp))
                        }
                    }
                }
            )
        },
        topBar = {
            AppBarUI()
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