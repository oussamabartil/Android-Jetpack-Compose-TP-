package com.example.tp4


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tp4.ui.theme.TP4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            TP4Theme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//            Text("Bonjour tout le monde !")


            //Expression Lambda
         //   setContent(null, { Text("OK") })

            //Paramétrage de l’apparence
//            setContent {
//                Text(
//                    text = "Bonjour tout le monde !",
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 32.sp,
//                    color = Color.Magenta
//                )
//            }

            //Utilisation de la fonction composable personnelle Accueil
            Accueil(name = "numéro 6")
        }
    }
}

//Fonctions composables personnelles
@Composable
fun Accueil(name: String) {
    Text(text = "Bonjour $name", fontSize=20.sp)
}