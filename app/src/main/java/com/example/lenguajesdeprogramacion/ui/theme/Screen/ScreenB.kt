package com.example.lenguajesdeprogramacion.ui.theme.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lenguajesdeprogramacion.R

@Composable
fun ScreenB(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFF0095D5),
                contentColor = Color.White,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(
                        onClick = { navController.navigate("ScreenA") }
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Inicio",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    TextButton(
                        onClick = {
                            navController.navigate("ScreenB") }) {
                        Text("Kotlin", color = Color(0xFFFFA500))
                    }
                    TextButton(
                        onClick = {
                        navController.navigate("ScreenC")
                        }
                    ) {
                        Text("Java", color = Color.White)
                    }
                    TextButton(
                        onClick = { navController.navigate("ScreenD")
                        }) {
                        Text("JavaScript", color = Color.White)
                    }
                    TextButton(
                        onClick = { navController.navigate("ScreenE")
                        }) {
                        Text("MySQL", color = Color.White)
                    }
                    TextButton(
                        onClick = { navController.navigate("ScreenF")
                        }) {
                        Text("C++", color = Color.White)
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.kotlin),
                contentDescription = "Logo de Kotlin",
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(0.7f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Kotlin",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0077B5)
            )
            Text(
                text = "Kotlin es un lenguaje de programación moderno, desarrollado por JetBrains, que es interoperable con Java y es usado principalmente para el desarrollo de aplicaciones Android.",
                modifier = Modifier.padding(horizontal = 16.dp),
                fontSize = 20.sp,
                lineHeight = 28.sp,
                color = Color(0xFF333333)
            )
            Text(
                text = "Ejemplo de código: ",
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFFA500)
            )
            Image(
                painter = painterResource(id = R.drawable.kotlincodigo),
                contentDescription = "Ejemplo de código en Kotlin",
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(0.85f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Usos comunes: ",
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFFA500)
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                BulletItem(text = "Desarrollo de aplicaciones Android")
                BulletItem(text = "Desarrollo de backend")
                BulletItem(text = "Desarrollo de aplicaciones multiplataforma")
                BulletItem(text = "Desarrollo web (frontend)")
                BulletItem(text = "Desarrollo de aplicaciones desktop")
            }
        }
    }
}

@Composable
fun BulletItem(text: String) {
    Row(
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Text(
            text = "•",
            fontSize = 22.sp,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(
            text = text,
            fontSize = 20.sp,
            color = Color(0xFF444444)
        )
    }
}