package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.leandrodev.kidsafeguardapp.data.model.CardPrincipaisOcorrencias

@Composable
fun LazyRowPrincipaisOcorrencias(items: List<CardPrincipaisOcorrencias>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .padding(10.dp)
    ) {
        items(items.size){
            CardPrincipaisOcorrenciasUI(item = items[it])
        }
    }
}