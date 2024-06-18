package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.leandrodev.kidsafeguardapp.R
import com.leandrodev.kidsafeguardapp.ui.theme.alphaPrimaryColor
import com.leandrodev.kidsafeguardapp.ui.theme.primaryColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarUI() {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = alphaPrimaryColor,
            titleContentColor = primaryColor
        ),
        title = {
            Text(text = stringResource(id = R.string.primeiros_cuidados))
        },
        navigationIcon = {
            IconButton(
                onClick = {

                }

            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "icone para voltar",
                    tint = primaryColor
                )
            }
        },
        actions = {
            IconButton(
                onClick = {

                }
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                    contentDescription = "icone para voltar",
                    tint = primaryColor
                )
            }
        }
    )
}