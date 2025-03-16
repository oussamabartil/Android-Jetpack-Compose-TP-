package com.example.tp4.feu3.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tp4.feu3.controller.Feu3ViewModel
import com.example.tp4.feu3.state.Feu3State

class Feu3View {

}

@Composable
fun MainActivityFeu3View(viewmodel: Feu3ViewModel = viewModel()) {
    // état auquel s'abonne cette fonction composable
    val state = viewmodel.state
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // affichage du feu, version 1
        Feu3ViewV1(state, modifier = Modifier.padding(16.dp))
        Button(
            onClick = {
                viewmodel.suivant() // modif par le contrôleur
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
        ) {
            Text(text = "état suivant")
        }
    }
}

@Composable
fun Feu3ViewV1(state: Feu3State, modifier: Modifier = Modifier) {
    Text(text = "Feu ${state.nomCouleur}",
        style = MaterialTheme.typography.titleLarge,
        modifier = modifier,
    )
}