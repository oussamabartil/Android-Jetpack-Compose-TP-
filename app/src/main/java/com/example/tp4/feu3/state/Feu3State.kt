package com.example.tp4.feu3.state

data class Feu3StateV1(
    val rouge: Boolean = true,
    val orange: Boolean = false,
    val vert: Boolean = false,
) {
    /**
     * @return nom de la couleur courante
     */
    val nomCouleur: String
        get() =
            if (rouge) "rouge" else
                if (orange) "orange" else
                    if (vert) "vert" else "???"

}