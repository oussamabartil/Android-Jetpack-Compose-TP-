package com.example.tp4.feu3.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tp4.feu3.state.Feu3State
class Feu3ViewModel : ViewModel() {
// singleton contenant létat, observable mais privé
    private val _state = mutableStateOf(Feu3State())
// getter pour consulter cet état à l'extérieur de cette classe, mais setter privé

    var state
        get() = _state.value // _state.value = instance de Feu3State
        private set(newstate) {
            _state.value = newstate // remplace l'état par le nouveau

        }
    init {
        reset()
    }
    /// méthodes pour modifier les données
    fun reset() {
        state = Feu3State()
    }
    fun suivant() {
        if (state.rouge) {
            state = Feu3State(false, false, true)
        } else if (state.vert) {
            state = Feu3State(false, true, false)
        } else {
            state = Feu3State(true, false, false)
        }
    }
}