package com.example.tp4.carrefour.state

import com.example.tp4.feu3.state.Feu3State
import com.example.tp4.feu3.state.FeuCouleur

@Suppress("ArrayInDataClass")
data class CarrefourState (
    val courant: Int = 0, // feu courant (vert ou orange, les autres rouges)
    val feux: Array<Feu3State> = arrayOf(
        Feu3State(), Feu3State(), Feu3State(), Feu3State() // 4 feux
    )
) {
// getters et méthodes de copie avec modification
    /**
     * retourne le Feu3State courant
     * @return le Feu3State de feux d'indice courant

     */
    val feuCourant get() = feux[courant]
    /**
     * retourne un CarrefourState dans lequel la couleur du feu courant est modifiée
     * @param couleur : nouvelle couleur du feu courant
     * @return CarrefourState
     */
    fun copyChangeCouleurCourant(couleur: FeuCouleur): CarrefourState {
        // Copie du tableau des feux
        val nouveauxFeux = feux.copyOf()
        // Modifier la couleur du feu courant
        nouveauxFeux[courant] = feux[courant].copy(couleur = couleur)
        // Retourner une nouvelle instance avec le feu modifié
        return copy(feux = nouveauxFeux)
    }
    /**
     * retourne un CarrefourState dans lequel le numéro du feu courant est modifié
     * @param num : numéro du feu courant, ramené entre 0 et le nombre de feux - 1
     * @return CarrefourState
     */
    fun copyChangeCourant(num: Int): CarrefourState {
        // S'assurer que num est dans les limites
        val numNormalisé = num.coerceIn(0, feux.size - 1)
        // Retourner une nouvelle instance avec le courant mis à jour
        return copy(courant = numNormalisé)
    }
}