package com.example.tp4.feu3.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.RadioButton
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
        // affichage du feu, version 2
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

//Autre visualisation
@Composable
fun Feu3ViewV2(state: Feu3State, modifier: Modifier = Modifier) {
    Column(
        modifier.wrapContentSize()
    ) {
// feu rouge
        Row(Modifier.align(Alignment.Start).padding(horizontal = 16.dp)) {
            RadioButton(
                selected = state.rouge,
                onClick = null // non réactif
            )
            Text(
                text = "rouge",
                modifier = Modifier.padding(start = 16.dp)
            )
        }

// TODO idem pour le feu orange et pour le feu vert
//le feu vert
        Row(Modifier.align(Alignment.Start).padding(horizontal = 16.dp)) {
            RadioButton(
                selected = state.vert,
                onClick = null // non réactif
            )
            Text(
                text = "vert",
                modifier = Modifier.padding(start = 16.dp)
            )
        }
//        le feu orange
        Row(Modifier.align(Alignment.Start).padding(horizontal = 16.dp)) {
            RadioButton(
                selected = state.orange,
                onClick = null // non réactif
            )
            Text(
                text = "orange",
                modifier = Modifier.padding(start = 16.dp)
            )
        }


    }}