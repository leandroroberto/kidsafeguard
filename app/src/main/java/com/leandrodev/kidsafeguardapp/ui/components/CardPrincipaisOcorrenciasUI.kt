package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leandrodev.kidsafeguardapp.data.model.CardPrincipaisOcorrencias
import com.leandrodev.kidsafeguardapp.ui.theme.alphaColorWhite
import com.leandrodev.kidsafeguardapp.ui.theme.blackColor

@Composable
fun CardPrincipaisOcorrenciasUI(item: CardPrincipaisOcorrencias) {

    Card(
        modifier = Modifier
            .width(120.dp)
            .height(200.dp)
            .border(0.7.dp, Color.LightGray, shape = CardDefaults.shape),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .background(alphaColorWhite)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier,
                text = item.title,
                textAlign = TextAlign.Center,
                color = blackColor,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            )
            Image(
                modifier = Modifier
                    .size(100.dp),
                painter = painterResource(id = item.image), contentDescription = "imagem do card"
            )
        }
    }
}