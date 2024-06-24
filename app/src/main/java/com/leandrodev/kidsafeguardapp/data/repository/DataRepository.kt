package com.leandrodev.kidsafeguardapp.data.repository

import android.content.Context
import androidx.compose.runtime.Composable
import com.leandrodev.kidsafeguardapp.R
import com.leandrodev.kidsafeguardapp.data.model.CardExploreApp
import com.leandrodev.kidsafeguardapp.data.model.CardPrincipaisOcorrencias

object DataRepository {
    @Composable
    fun getItemsPrincipaisOcorrencias(context: Context) : List<CardPrincipaisOcorrencias> {
        return listOf(
                CardPrincipaisOcorrencias(
                    title = context.getString(R.string.engasgo),
                    image = R.drawable.criancaengasgo
                ),
        CardPrincipaisOcorrencias(
            title = context.getString(R.string.queda),
            image = R.drawable.quedacrianca
        ),
        CardPrincipaisOcorrencias(
            title = context.getString(R.string.queimadura),
            image = R.drawable.queimaduracrianca
        ),
        CardPrincipaisOcorrencias(
            title = context.getString(R.string.picadaInseto),
            image = R.drawable.picadainsetocrianca
        ),
        CardPrincipaisOcorrencias(
            title = context.getString(R.string.afogamento),
            image = R.drawable.criancaafogando
        ),
        CardPrincipaisOcorrencias(
            title = context.getString(R.string.desmaios),
            image = R.drawable.criancadesmaiando
        )
        )
    }


    @Composable
    fun getItemsPrincipaisOcorrencias(context: Context, additionalItem: List<CardPrincipaisOcorrencias>) : List<CardPrincipaisOcorrencias>{
        val defaultItems = getItemsPrincipaisOcorrencias(context)
        return defaultItems + additionalItem
    }


    @Composable
    fun getItemsExploreApp(context: Context) : List<CardExploreApp>{
        return listOf(

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
    }
}