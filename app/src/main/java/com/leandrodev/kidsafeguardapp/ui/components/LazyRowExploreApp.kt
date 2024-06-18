package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.leandrodev.kidsafeguardapp.data.model.CardExploreApp

@Composable
fun LazyRowExploreApp(items: List<CardExploreApp>) {
    LazyRow(
        modifier = Modifier
            .padding(8.dp)
    ) {
        items(items.size){
            CardExploreAppUI(items[it])
        }
    }
}