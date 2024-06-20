package com.leandrodev.kidsafeguardapp.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leandrodev.kidsafeguardapp.R
import com.leandrodev.kidsafeguardapp.ui.theme.alphaPrimaryColor
import com.leandrodev.kidsafeguardapp.ui.theme.blackColor
import com.leandrodev.kidsafeguardapp.ui.theme.primaryColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarUI() {

    val isSystemInDarkTheme = isSystemInDarkTheme()

    TopAppBar(
        modifier = Modifier
            .fillMaxWidth(),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = alphaPrimaryColor,
            titleContentColor = primaryColor
        ),
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_baby), contentDescription = "icone do App")
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    color = if(isSystemInDarkTheme) primaryColor else blackColor,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    text = stringResource(id = R.string.kid_safe_guard)
                )
            }
        }
    )
}