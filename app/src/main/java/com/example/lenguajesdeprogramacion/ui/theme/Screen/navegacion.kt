package com.example.lenguajesdeprogramacion.ui.theme.Screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lenguajesdeprogramacion.ui.theme.Screen.ScreenB



@Composable
fun mainScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "ScreenA") {
        composable("ScreenA") {
            ScreenA(navController)
        }
        composable("ScreenB") {
            ScreenB(navController)
        }
        composable("ScreenC") {
            ScreenC(navController)
        }
        composable("ScreenD") {
            ScreenD(navController)
        }
        composable("ScreenE") {
            ScreenE(navController)
        }
        composable("ScreenF") {
            ScreenF(navController)
        }
    }
}


