package com.venessa.mvvmandroid.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.venessa.mvvmandroid.ui.theme.screens.Login.LoginScreen
import com.venessa.mvvmandroid.ui.theme.screens.calculator.Calculatorscreen
import com.venessa.mvvmandroid.ui.theme.screens.customlist.Custom_listScreen
import com.venessa.mvvmandroid.ui.theme.screens.home.HomeScreen
import com.venessa.mvvmandroid.ui.theme.screens.intent.Intentscreen
import com.venessa.mvvmandroid.ui.theme.screens.register.RegisterScreen
import com.venessa.mvvmandroid.ui.theme.screens.simplelist.SimpleListView

@Composable
fun AppNavHost(modifier: Modifier = Modifier ,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_HOME) {
    NavHost(navController =navController,modifier=modifier, startDestination = startDestination){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_CALCULATOR){
            Calculatorscreen(navController)

        }
        composable(ROUTE_INTENT){
            Intentscreen(navController)
        }
        composable(ROUTE_CUSTOM_LIST){
            Custom_listScreen()

        }
        composable(ROUTE_SIMPLE_LIST){
            SimpleListView(navController)

        }

        }

        }


