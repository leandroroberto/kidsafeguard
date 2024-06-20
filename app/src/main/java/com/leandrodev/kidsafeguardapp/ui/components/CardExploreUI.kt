package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.leandrodev.kidsafeguardapp.data.model.CardExploreApp
import com.leandrodev.kidsafeguardapp.ui.theme.alphaColorWhite
import com.leandrodev.kidsafeguardapp.ui.theme.colorWhite
import com.leandrodev.kidsafeguardapp.ui.theme.primaryColor

@Composable
fun CardExploreAppUI(item: CardExploreApp) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(80.dp)
            .border(0.5.dp, Color.LightGray, CircleShape)
            .clip(shape = CircleShape),
        colors = CardDefaults.cardColors(
            containerColor = alphaColorWhite,
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .background(color = colorWhite)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                tint = primaryColor,
                painter = painterResource(id = item.icon),
                contentDescription = "Icone do explorer App"
            )
        }
    }
}