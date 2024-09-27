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
fun ScreenE(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFFF29111),
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
                        Text("MySQL", color = Color(0xFF00758F))
                    }
                    TextButton(
                        onClick = {
                            navController.navigate("ScreenF")
                        }
                    ) {
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
                painter = painterResource(id = R.drawable.mysql),
                contentDescription = "Logo de mysql",
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(0.7f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "MySQL",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF00758F)
            )
            Text(
                text = "MySQL es un sistema de gestión de bases de datos relacional que utiliza SQL para la gestión y manipulación de datos.",
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
                color = Color(0xFF00758F)
            )
            Image(
                painter = painterResource(id = R.drawable.mysqlcodigo),
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
                color = Color(0xFF00758F)
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                BulletItem(text = "Gestión de bases de datos para sitios web")
                BulletItem(text = "Desarrollo aplicaciones empresariales")
                BulletItem(text = "Desarrollo de Comercio electrónico")
                BulletItem(text = "Análisis de datos y reporting")
                BulletItem(text = "Desarrollo de aplicaciones móviles")
            }
        }
    }
}
