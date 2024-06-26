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
import com.example.compose.onPrimaryLight
import com.example.compose.primaryLight
import com.leandrodev.kidsafeguardapp.data.model.CardExploreApp

@Composable
fun CardExploreAppUI(item: CardExploreApp) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(80.dp)
            .border(0.5.dp, Color.LightGray, CircleShape)
            .clip(shape = CircleShape),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .background(color = onPrimaryLight)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                tint = primaryLight,
                painter = painterResource(id = item.icon),
                contentDescription = "Icone do explorer App"
            )
        }
    }
}