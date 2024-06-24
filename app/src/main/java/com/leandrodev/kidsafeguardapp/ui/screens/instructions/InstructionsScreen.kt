package com.leandrodev.kidsafeguardapp.ui.screens.instructions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.onPrimaryContainerLight
import com.leandrodev.kidsafeguardapp.R
import com.leandrodev.kidsafeguardapp.data.repository.DataRepository
import com.leandrodev.kidsafeguardapp.ui.components.LazyRowInstrucoes

@Composable
fun InstructionsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = onPrimaryContainerLight,
            text = stringResource(id = R.string.instrucoes_primeiros_socorros)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            color = onPrimaryContainerLight,
            text = stringResource(id = R.string.aprenda_a_lidar_com_diferentes_emergencias)
        )

        LazyRowInstrucoes(
            items = DataRepository
                .getItemsPrincipaisOcorrencias(context = LocalContext.current)
        )

    }
}