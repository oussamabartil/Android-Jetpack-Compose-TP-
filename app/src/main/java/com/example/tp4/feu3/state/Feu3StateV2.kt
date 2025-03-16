package com.example.tp4.feu3.state

enum class FeuCouleur {
    ROUGE,
    ORANGE,
    VERT
}
data class Feu3State(
    val couleur: FeuCouleur = FeuCouleur.ROUGE
) {
    val rouge get() = couleur == FeuCouleur.ROUGE
    val orange get() = couleur == FeuCouleur.ORANGE
    val vert get() = couleur == FeuCouleur.VERT
    val nomCouleur: String
        get() = couleur.toString()
    fun copyChangeCouleur(nouvelle: FeuCouleur): Feu3State {
        return this.copy(couleur = nouvelle)
    }
}