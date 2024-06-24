package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose.primaryContainerLight
import com.example.compose.primaryLight
import com.example.compose.secondaryContainerLight
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
                modifier = Modifier
                    .padding(vertical = 5.dp),
                painter = painterResource(id = if(selected) item.selectedIcon else item.unselectedIcon),
                contentDescription = "Icones do bottom app bar"
            )
        },

        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = primaryLight,
            unselectedIconColor = primaryContainerLight,
            indicatorColor = secondaryContainerLight
        )
    )

}