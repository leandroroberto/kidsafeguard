package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leandrodev.kidsafeguardapp.data.model.CardPrincipaisOcorrencias

@Composable
fun CardPrincipaisOcorrenciasUI(item: CardPrincipaisOcorrencias) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(100.dp)
            .height(150.dp)
            .clip(shape = RoundedCornerShape(16.dp)),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = item.title, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Image(
                modifier = Modifier
                    .size(80.dp),
                painter = painterResource(id = item.image), contentDescription = "imagem do card")
        }
    }
}