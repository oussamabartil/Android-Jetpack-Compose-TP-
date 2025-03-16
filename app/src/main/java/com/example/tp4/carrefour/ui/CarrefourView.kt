package com.example.tp4.carrefour.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tp4.carrefour.controller.CarrefourViewModel
import com.example.tp4.carrefour.state.CarrefourState
import com.example.tp4.feu3.state.Feu3State
import com.example.tp4.feu3.ui.Feu3ViewV3
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.draw.scale
import com.example.tp4.feu3.state.FeuCouleur

@Composable
fun MainActivityCarrefourView(viewmodel: CarrefourViewModel = viewModel()) {
    val state = viewmodel.state // Observer l'état du carrefour

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Affichage du carrefour avec l'état actuel
        CarrefourView(state = state)

        Spacer(modifier = Modifier.height(16.dp))

        // Bouton pour passer à l'étape suivante
        Button(onClick = { viewmodel.suivant() }) {
            Text("Suivant")
        }
    }
}
@Composable
fun CarrefourView(state: CarrefourState, modifier:Modifier=Modifier, size: Dp =180.dp) {
    Box(
        modifier.fillMaxWidth().padding(60.dp)
    ) {
        val mod = Modifier.scale(0.5f).align(Alignment.Center)
        Feu3ViewV3(state = state.feux[0], modifier = mod)
        Feu3ViewV3(state = state.feux[1], modifier = mod)
        Feu3ViewV3(state = state.feux[2], modifier = mod)
        Feu3ViewV3(state = state.feux[3], modifier = mod)
    }
}
@Preview(showBackground = true)
@Composable
fun CarrefourPreview() {
    CarrefourView(state = CarrefourState(1, arrayOf(
        Feu3State(), Feu3State(FeuCouleur.VERT), Feu3State(), Feu3State())
    ))
}