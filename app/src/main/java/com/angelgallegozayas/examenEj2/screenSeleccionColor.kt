package com.angelgallegozayas.examenEj2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun selecionColor(){
    var colorSeleccionado by remember { mutableStateOf(Color.Black) }
    val listaColores = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Magenta, Color.Cyan )
    Column(modifier = Modifier.fillMaxSize().padding(top=40.dp),horizontalAlignment = Alignment.CenterHorizontally){
    Box(modifier = Modifier.background(colorSeleccionado).padding(100.dp).padding(bottom = 10.dp)){}
        val listaColores = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Magenta, Color.Cyan )
        listaColores.forEach { color ->
            Box(modifier = Modifier.border(2.dp, Color.Black) .background(color).padding( 20.dp).height(50.dp).fillMaxWidth().clickable { colorSeleccionado = color }){
                Text(text="Seleccionar", modifier = Modifier.align(Alignment.Center))
            }
        }
            //crear un foreach para recorrer la lista de colores






    }

}