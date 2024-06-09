package com.leandrodev.kidsafeguardapp.navigation.item

import androidx.annotation.DrawableRes
import com.leandrodev.kidsafeguardapp.R

sealed class BottomNavItem (
    val title: Int,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,

){
    data object home: BottomNavItem(
        title = R.string.bottom_bar_item_home,
        selectedIcon = R.drawable.ic_home_fill,
        unselectedIcon = R.drawable.ic_home_line
    )
    data object instruction: BottomNavItem(
        title = R.string.bottom_bar_item_instructions,
        selectedIcon = R.drawable.ic_instructions_fill,
        unselectedIcon = R.drawable.ic_instructions_line
    )
    data object emergency: BottomNavItem(
        title = R.string.bottom_bar_item_emergency,
        selectedIcon = R.drawable.ic_emergency_fill,
        unselectedIcon = R.drawable.ic_emergency_line
    )
    data object news: BottomNavItem(
        title = R.string.bottom_bar_item_news,
        selectedIcon = R.drawable.ic_news_fill,
        unselectedIcon = R.drawable.ic_news_line
    )

    companion object {
        val items = listOf(home, instruction, emergency, news)
    }
}