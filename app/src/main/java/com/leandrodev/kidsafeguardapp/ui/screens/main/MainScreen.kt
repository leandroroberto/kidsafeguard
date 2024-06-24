package com.leandrodev.kidsafeguardapp.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.onPrimaryContainerLight
import com.example.compose.primaryDark
import com.example.compose.tertiaryContainerLight
import com.leandrodev.kidsafeguardapp.R
import com.leandrodev.kidsafeguardapp.data.repository.DataRepository
import com.leandrodev.kidsafeguardapp.ui.components.LazyRowExploreApp
import com.leandrodev.kidsafeguardapp.ui.components.LazyRowPrincipaisOcorrencias

@Composable
fun MainScreen() {

    val isDarkMode = isSystemInDarkTheme()

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
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .padding(10.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                text = stringResource(id = R.string.seja_bem_vindo),
                color = if(isDarkMode) primaryDark else onPrimaryContainerLight,
                fontSize = 20.sp
            )

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = tertiaryContainerLight
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_tips),
                        contentDescription = "Icone de dicas")
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Mantenha um Kit de Primeiros Socorros Sempre a Mão. Inclua bandagens, pinças, desinfetante e luvas. Verifique o kit regularmente.")
                }
            }

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
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = if(isDarkMode) primaryDark else onPrimaryContainerLight,
                )

                LazyRowExploreApp(items = DataRepository.getItemsExploreApp(context = LocalContext.current))

            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = R.string.principais_ocorrencias),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = if(isDarkMode) primaryDark else onPrimaryContainerLight,
                )

                LazyRowPrincipaisOcorrencias(
                    items = DataRepository.getItemsPrincipaisOcorrencias(
                        LocalContext.current
                    )
                )

            }
        }

    }
}