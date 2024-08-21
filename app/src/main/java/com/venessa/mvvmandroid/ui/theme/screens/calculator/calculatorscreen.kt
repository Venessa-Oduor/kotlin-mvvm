package com.venessa.mvvmandroid.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.venessa.mvvmandroid.navigation.ROUTE_REGISTER

@Composable
fun Calculatorscreen(navController: NavHostController) {
    var num1 by remember { mutableStateOf(TextFieldValue("")) }
    var num2 by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Calculator",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(value = num1,
            label ={ Text(text = "Number1:",
                fontFamily = FontFamily.Serif)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange ={ num1=it } )
        OutlinedTextField(value = num2,
            onValueChange ={num2=it} ,
            label ={ Text(text = "Number2:", fontFamily = FontFamily.Serif)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

            OutlinedTextField(value = answer,
            onValueChange ={answer=it} ,
            label ={ Text(text = "Answer:", fontFamily = FontFamily.Serif)})



        Spacer(modifier = Modifier.height(25.dp))
        Button(
            onClick = {
                val myfirstnum = num1.text.trim()
                val mysecontnum = num2.text.trim()
                if (myfirstnum.isEmpty() || mysecontnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() + mysecontnum.toDouble()
                    answer = myanswer.toString()
                }
            },
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "+",
                color = Color.White,
                fontSize = 15.sp
            )

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = { val myfirstnum = num1.text.trim()
                val mysecontnum = num2.text.trim()
                if (myfirstnum.isEmpty() || mysecontnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() * mysecontnum.toDouble()
                    answer = myanswer.toString()
                }},
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "*",
                color = Color.White,
                fontSize = 20.sp
            )

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = { val myfirstnum = num1.text.trim()
                val mysecontnum = num2.text.trim()
                if (myfirstnum.isEmpty() || mysecontnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() - mysecontnum.toDouble()
                    answer = myanswer.toString()
                } },
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "-",
                color = Color.White,
                fontSize = 20.sp
            )

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = { val myfirstnum = num1.text.trim()
                val mysecontnum = num2.text.trim()
                if (myfirstnum.isEmpty() || mysecontnum.isEmpty()) {
                    answer = "Please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() / mysecontnum.toDouble()
                    answer = myanswer.toString()
                } },
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "/",
                color = Color.White,
                fontSize = 20.sp
            )

        }




        }

    }


@Preview
@Composable
private fun calculatorprev() {
    Calculatorscreen(rememberNavController())
    
}








