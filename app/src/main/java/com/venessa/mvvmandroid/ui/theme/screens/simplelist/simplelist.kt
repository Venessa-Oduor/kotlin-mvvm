package com.venessa.mvvmandroid.ui.theme.screens.simplelist

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

private val countryList =
    mutableListOf("Kenya", "USA", "China", "United States")

private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Gray)
    .padding(10.dp)

@RequiresApi(Build.VERSION_CODES.O)
private val textStyle = androidx.compose.ui.text.TextStyle(
    fontSize = 20.sp, color = Color.White)

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SimpleListView(navController: NavHostController) {
    LazyColumn(modifier = listModifier) {
        items(countryList) { country ->
            Text(text = country, style = textStyle)
        }
    }
}


@Preview
@Composable
private fun simpleprev() {
    SimpleListView(rememberNavController())

}