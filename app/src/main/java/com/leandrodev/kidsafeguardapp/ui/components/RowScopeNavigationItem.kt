package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.leandrodev.kidsafeguardapp.navigation.item.BottomNavItem

@Composable
fun RowScope.AddBottomItem(
    item: BottomNavItem,
    selected: Boolean,
    label: @Composable (() -> Unit)? = null,
    onClick: () -> Unit,
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        label = label,
        icon = {
            Icon(
                painter = painterResource(id = if(selected) item.selectedIcon else item.unselectedIcon),
                contentDescription = "Icones do bottom app bar"
            )
        }
    )
}