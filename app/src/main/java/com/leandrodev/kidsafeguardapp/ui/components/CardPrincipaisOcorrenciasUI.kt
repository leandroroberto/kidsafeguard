package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.compose.onPrimaryContainerLight
import com.example.compose.onPrimaryLight
import com.leandrodev.kidsafeguardapp.data.model.CardPrincipaisOcorrencias

@Composable
fun CardPrincipaisOcorrenciasUI(item: CardPrincipaisOcorrencias) {

    Card(
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
            .border(0.7.dp, Color.LightGray, shape = CardDefaults.shape),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .background(onPrimaryLight)
                .padding(8.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier,
                text = item.title,
                textAlign = TextAlign.Center,
                color = onPrimaryContainerLight,
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