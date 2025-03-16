package com.example.tp4


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tp4.ui.theme.TP4Theme
//import androidx.compose.material3.*

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
//            Accueil(name = "numéro 6")

            //Utilisation de la fonction Prévisualisation
//            AccueilPreview()
            //Utilisation de la fonction AccueilMultiple pour voir les model et vue
            AccueilMultiplePreview()


            //Model  AccueilMultipleSeulementJ cette  fonction
            //ne salue que les personnes dont le nom commence par j.
            AccueilMultipleSeulementJPreview()
        }
    }
}

//Fonctions composables personnelles
//@Composable
//fun Accueil(name: String) {
//    Text(text = "Bonjour $name", fontSize=20.sp)
//}

//Prévisualisation: Mettez l’éditeur en mode Split. L’écran se partage en deux, le source à gauche et le résultat
//visuel à droite. C’est grâce à l’annotation @Preview.
@Preview
@Composable
fun AccueilPreview() {
    Accueil(name = "numéro 10")
}

//Structure d’une interface
//@Composable
//fun Accueil(name: String) {
//    Text(text = "Bonjour $name", fontSize=20.sp)
//    Text(text = "Je vois de grands progrès", color = Color.Blue)
//}

//Positionnement des elements
//Column est un LinearLayout vertical :
//@Composable
//fun Accueil(name: String) {
//    Column {
//        Text(text = "Bonjour $name", fontSize=20.sp)
//        Text(text = "Je vois de grands progrès", color = Color.Blue)
//    }
//}


//Utilisation de Row.
@Composable
fun Accueil(name: String) {
    Row {
        Text(text = "Bonjour $name", fontSize=20.sp)
        Text(text = "Je vois de grands progrès", color = Color.Blue)
    }
}


//Utilisation de ElevatedCard

//@Composable
//fun Accueil(name: String) {
//    ElevatedCard {
//        Text(text = "Bonjour $name", fontSize=20.sp)
//        Text(text = "Je vois de grands progrès", color = Color.Blue)
//    }
//}


//Paramétrage des vues
//@Composable
//fun Accueil(name: String) {
//    ElevatedCard {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//
//        ) {
//            Text(text = "Bonjour $name", fontSize=20.sp)
//            Text(text = "Je vois de grands progrès", color = Color.Blue)
//        }
//    }
//}



//Modèle et vue
@Composable
fun AccueilMultiple(names: List<String>) {
    Column {
        for (name in names) {
            Text(text = "Bonjour $name !", modifier = Modifier.padding(4.dp))
        }
    }
}
@Preview
@Composable
fun AccueilMultiplePreview() {
    AccueilMultiple(listOf("pierre", "paul", "jacques"))
}

@Composable
fun AccueilMultipleSeulementJ(names: List<String>) {
    Column {
        for (name in names) {
            if (name.startsWith("j")) {
                Text(text = "Bonjour $name !", modifier = Modifier.padding(4.dp))
            }
        }
    }
}
@Preview
@Composable
fun AccueilMultipleSeulementJPreview() {
    AccueilMultipleSeulementJ(listOf("paul", "jean", "pierre", "jacques"))
}