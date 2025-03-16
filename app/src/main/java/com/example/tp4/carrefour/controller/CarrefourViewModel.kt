package com.example.tp4.carrefour.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tp4.carrefour.state.*
import com.example.tp4.feu3.state.FeuCouleur

class CarrefourViewModel : ViewModel() {
// singleton contenant l'état, observable mais privé
    private val _state = mutableStateOf(CarrefourState())
// getter pour consulter cet état à l'extérieur de cette classe, mais setter privé

    var state
        get() = _state.value // _state.value = instance de MessageListState
        private set(newstate) {
            _state.value = newstate // remplace l'état par le nouveau

        }
    init {
        state = CarrefourState() // constructeur état initial
    }
    /// méthodes pour modifier les données
    fun suivant() {
        val feuActuel = state.feuCourant

        // Déterminer la prochaine couleur du feu actuel
        val nouvelleCouleur = when {
            feuActuel.rouge -> FeuCouleur.VERT
            feuActuel.vert -> FeuCouleur.ORANGE
            feuActuel.orange -> FeuCouleur.ROUGE
            else -> FeuCouleur.ROUGE // Par défaut, au cas où
        }

        // Mettre à jour la couleur du feu actuel
        state = state.copyChangeCouleurCourant(nouvelleCouleur)

        // Si le feu passe au rouge, changer au feu suivant
        if (nouvelleCouleur == FeuCouleur.ROUGE) {
            state = state.copyChangeCourant((state.courant + 1) % state.feux.size)
        }    }
}