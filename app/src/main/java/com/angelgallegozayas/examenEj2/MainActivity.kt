package com.angelgallegozayas.examenEj2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.angelgallegozayas.examenEj2.ui.theme.ExamEjercicio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamEjercicio2Theme {
                selecionColor()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamEjercicio2Theme {
        Greeting("Android")
    }
}

//@Composable
//fun navigation(){
//
//    val navController = rememberNavController()
//    //al final ponemos la primera pantalla que queremos que se muestre
//    NavHost(navController = navController, startDestination = Productos){
//    composable<Productos> {
//        ProductosScreen { nombreProducto, precio, imagen -> navController.navigate(dDetalleProducto(nombreProducto, precio, imagen)) } }
//    composable<dDetalleProducto> { P ->
//       val detalleProducto = P.toRoute<dDetalleProducto>()
//        ScreenDetalleProducto(detalleProducto.nombre,
//            detalleProducto.precio,
//            detalleProducto.imagen)
//    }
//    }
//
//
//}