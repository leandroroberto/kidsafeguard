package com.leandrodev.kidsafeguardapp.ui.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
          icon = R.drawable.ic_book_line
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
            image = R.drawable.engasgocrianca
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.engasgo),
            image = R.drawable.engasgocrianca
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.engasgo),
            image = R.drawable.engasgocrianca
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.engasgo),
            image = R.drawable.engasgocrianca
        ),

        CardPrincipaisOcorrencias(
            title = stringResource(id = R.string.engasgo),
            image = R.drawable.engasgocrianca
        )
    )

    Column(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = stringResource(id = R.string.seja_bem_vindo),
            color = primaryColor,
            fontSize = 26.sp,
            lineHeight = 30.sp
        )

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
                .padding(horizontal = 16.dp, vertical = 24.dp)
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