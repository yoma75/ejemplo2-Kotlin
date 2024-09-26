package com.example.ejerciciodos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         CompletedTasksScreen()
      }
   }
}

@Composable
fun CompletedTasksScreen() {
   Column(
      modifier = Modifier
         .fillMaxSize()  // tamaño de la pantalla
         .padding(16.dp),  // espacio interno
      verticalArrangement = Arrangement.Center,  // centrado verticalmente
      horizontalAlignment = Alignment.CenterHorizontally  // centrado horizontalmente
   ) {
      Image(
         painter = painterResource(id = R.drawable.img_tarea_2),  // imagen
         contentDescription = "Check Image",  // descripción de la imagen
         modifier = Modifier.size(110.dp)  // tamaño de la imagen
      )

      Spacer(modifier = Modifier.height(24.dp))  // espacio entre imagen y texto

      Text(
         text = "All tasks completed",
         fontSize = 24.sp,
         fontWeight = FontWeight.Bold
      )

      Spacer(modifier = Modifier.height(8.dp))

      Text(
         text = "Nice work!",
         fontSize = 18.sp,
         color = Color.Gray
      )
   }
}

@Preview(showBackground = true)
@Composable
   fun CompletedTasksScreenPreview() {
      CompletedTasksScreen()
   }
