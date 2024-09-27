package com.example.lenguajesdeprogramacion.ui.theme.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
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
import com.example.lenguajesdeprogramacion.R

@Composable
fun ScreenA(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.White,
                contentColor = Color.White,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(
                        onClick = { navController.navigate("ScreenB") }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .border(2.dp, Color.White, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.kotlin),
                                contentDescription = "Kotlin",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(
                        onClick = { navController.navigate("ScreenC") }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .border(2.dp, Color.White, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.java),
                                contentDescription = "Java",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(
                        onClick = { navController.navigate("ScreenD") }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .border(2.dp, Color.White, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.js),
                                contentDescription = "JavaScript",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(
                        onClick = { navController.navigate("ScreenE") }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .border(2.dp, Color.White, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mysql),
                                contentDescription = "MySQL",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(
                        onClick = { navController.navigate("ScreenF") }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .border(2.dp, Color.White, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.c),
                                contentDescription = "C++",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                }
            }
        },
        containerColor = Color.Black
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 24.dp, vertical = 16.dp)
                .background(Color.Black),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Lenguajes de Programación",
                modifier = Modifier.padding(top = 24.dp),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.White
            )

            Image(
                painter = painterResource(id = R.drawable.icono_inicio),
                contentDescription = "Imagen representativa",
                modifier = Modifier
                    .size(300.dp)
                    .padding(top = 16.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "En esta aplicación, exploraremos algunos de los lenguajes de programación más populares y sus aplicaciones en el mundo del desarrollo de software.",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.White
            )

            Text(
                text = "Desde lenguajes orientados a objetos hasta aquellos centrados en el desarrollo web, cada uno juega un papel fundamental en la creación de tecnología moderna.",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.White
            )

            Text(
                text = "Aprende sobre sus características, usos comunes, y descubre cuál puede ser el mejor para tu próximo proyecto.",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.White
            )
            Text(
                text = "Algunos de los lenguajes que veremos serán:",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 10.dp),
                color = Color.White
            )
            Text(
                text = "Java, Kotlin, MySQL, JavaScript...",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 10.dp),
                color = Color.White
            )
        }
    }
}

