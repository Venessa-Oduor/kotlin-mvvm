package com.venessa.mvvmandroid.ui.theme.screens.Login

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.venessa.mvvmandroid.navigation.ROUTE_REGISTER
import com.venessa.mvvmandroid.ui.theme.screens.home.BottomBar


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavHostController) {

    Scaffold(
        topBar = { TopAppBar(title = { Text( "MIT MAY 2024",
            color = Color.Magenta,
            fontSize = 25.sp)
        }) },
            content = {
                var name by remember { mutableStateOf("") }
                var email by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }
                var isLogin by remember { mutableStateOf("") }
                Column(modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text(text = "Login",
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier
                        .padding(bottom = 24.dp))
                OutlinedTextField(value = name,
                    onValueChange ={name=it} ,
                    label ={ Text(text = "Name:",
                        fontFamily = FontFamily.Serif)},
                    modifier = Modifier
                        .width(350.dp)
                        .fillMaxWidth()
                        .padding(bottom = 20.dp))
                OutlinedTextField(value = email,
                    onValueChange ={email=it} ,
                    label ={ Text(text = "Email:", fontFamily = FontFamily.Serif)},
                    modifier = Modifier
                        .width(350.dp)
                        .fillMaxWidth()
                        .padding(bottom = 16.dp))
                OutlinedTextField(value = password,
                    onValueChange ={password=it},
                    label = { Text(text = "Password:", fontFamily = FontFamily.Serif)},
                    modifier = Modifier
                        .width(350.dp)
                        .fillMaxWidth()
                        .padding(bottom = 16.dp))
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier. width(250.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color.Black,
                        contentColor = Color.White
                    )) {
                    Text(
                        text = "Login",
                        color = Color.White)}
                TextButton(onClick = {navController.navigate(ROUTE_REGISTER)}) {
                    Text(text = "Don't have an account? Register")

                }



            }},
                bottomBar = { BottomBar(navController) }
                            )



}

@Preview
@Composable
private fun LoginPrev() {
    LoginScreen(rememberNavController())
}