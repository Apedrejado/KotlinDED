

package main.kotlin.main.kotlin.utils
import main.kotlin.dices.D8Dice

class HitPointsCalculator(
    private val dice: D8Dice,
    private val constitutionModifier: Int
) {
    // Calcula os pontos de vida
    fun calculateHitPoints(): Int {
        // Rolagem de um dado d8 para calcular pontos de vida
        val baseHitPoints = dice.roll() + constitutionModifier
        return baseHitPoints.coerceAtLeast(1) // Garantir que os pontos de vida não sejam menores que 1
    }
}