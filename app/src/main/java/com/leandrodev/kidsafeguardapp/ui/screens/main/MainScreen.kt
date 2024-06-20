package com.leandrodev.kidsafeguardapp.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leandrodev.kidsafeguardapp.R
import com.leandrodev.kidsafeguardapp.data.model.CardExploreApp
import com.leandrodev.kidsafeguardapp.data.model.CardPrincipaisOcorrencias
import com.leandrodev.kidsafeguardapp.ui.components.LazyRowExploreApp
import com.leandrodev.kidsafeguardapp.ui.components.LazyRowPrincipaisOcorrencias
import com.leandrodev.kidsafeguardapp.ui.theme.primaryColor

@Composable
fun MainScreen() {

    val itemsExploreApp = listOf(
        CardExploreApp(
            icon = R.drawable.ic_book_line,
        ),

        CardExploreApp(
            icon = R.drawable.ic_alarm_siren
        ),

        CardExploreApp(
            icon = R.drawable.ic_news_line
        ),

        CardExploreApp(
            icon = R.drawable.ic_game_fill
        )
    )

    val itemsPrincipaisOcorrencias = listOf(
        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.engasgo),
            image = R.drawable.criancaengasgo
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.queda),
            image = R.drawable.quedacrianca,
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.queimadura),
            image = R.drawable.queimaduracrianca
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.picadaInseto),
            image = R.drawable.picadainsetocrianca
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.afogamento),
            image = R.drawable.criancaafogando
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.desmaios),
            image = R.drawable.criancadesmaiando
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.Transparent
            )
            .padding(bottom = 16.dp),
        contentAlignment = Alignment.BottomCenter
    ) {

        Column(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                fontWeight = FontWeight.Bold,
                text = stringResource(id = R.string.seja_bem_vindo),
                color = primaryColor,
                fontSize = 22.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 24.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = R.string.explore_o_app),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = primaryColor
                )

                LazyRowExploreApp(items = itemsExploreApp)

            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = R.string.principais_ocorrencias),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = primaryColor
                )

                LazyRowPrincipaisOcorrencias(items = itemsPrincipaisOcorrencias)

            }
        }

    }
}