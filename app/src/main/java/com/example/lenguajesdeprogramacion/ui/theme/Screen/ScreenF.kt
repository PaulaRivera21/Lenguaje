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
fun ScreenF(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFF003A70),
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
                            navController.navigate("ScreenB")
                        }
                    ) {
                        Text("Kotlin", color = Color.White)
                    }
                    TextButton(
                        onClick = {
                            navController.navigate("ScreenC")
                        }
                    ) {
                        Text("Java", color = Color.White)
                    }
                    TextButton(
                        onClick = {
                            navController.navigate("ScreenD")
                        }
                    ) {
                        Text("JavaScript", color = Color.White)
                    }
                    TextButton(
                        onClick = {
                            navController.navigate("ScreenE")
                        }
                    ) {
                        Text("MySQL", color = Color.White)
                    }
                    TextButton(
                        onClick = {
                            navController.navigate("ScreenF")
                        }
                    ) {
                        Text("C++", color = Color(0xFF007ACC))
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
                painter = painterResource(id = R.drawable.c),
                contentDescription = "Logo de c++",
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(0.7f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "C++",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0077B5)
            )
            Text(
                text = "C++ es un lenguaje de programación orientado a objetos de alto rendimiento, utilizado principalmente en aplicaciones que requieren eficiencia, como sistemas operativos, videojuegos y aplicaciones gráficas.",
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
                color = Color(0xFF007ACC)
            )
            Image(
                painter = painterResource(id = R.drawable.ccodigo),
                contentDescription = "Ejemplo de código en c++",
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
                color = Color(0xFF007ACC)
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                BulletItem(text = "Desarrollo de software de sistemas")
                BulletItem(text = "esarrollo de videojuegos")
                BulletItem(text = "Desarrollo de aplicaciones desktop")
                BulletItem(text = "Programación de aplicaciones científicas y de ingeniería")
                BulletItem(text = "Desarrollo de software financiero y de comercio")
            }
        }
    }
}