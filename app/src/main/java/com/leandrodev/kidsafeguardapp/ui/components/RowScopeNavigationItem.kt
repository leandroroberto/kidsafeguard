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
import com.leandrodev.kidsafeguardapp.navigation.item.BottomNavItem
import com.leandrodev.kidsafeguardapp.ui.theme.alphaPrimaryColor
import com.leandrodev.kidsafeguardapp.ui.theme.primaryColor

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
            selectedIconColor = primaryColor,
            unselectedIconColor = primaryColor,
            indicatorColor = alphaPrimaryColor
        )
    )

}