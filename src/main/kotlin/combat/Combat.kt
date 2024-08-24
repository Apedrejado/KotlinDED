package main.kotlin.combat

import main.kotlin.character.Character
import main.kotlin.dices.Dice

class Combat {
    fun applyDamage(attacker: Character, defender: Character, dice: Dice): String {
        // Rolar o dado para determinar o dano
        val damage = dice.roll()
        val attackResult = "${attacker.name} atacou ${defender.name} e causou $damage de dano."

        // Subtrair o dano dos pontos de vida do defensor
        defender.hitPoints -= damage

        // Garantir que os pontos de vida não fiquem abaixo de 0
        if (defender.hitPoints < 0) {
            defender.hitPoints = 0
        }

        val healthStatus = "${defender.name} agora tem ${defender.hitPoints} pontos de vida."

        // Retornar uma string contendo os resultados do ataque
        return "$attackResult\n$healthStatus"
    }
}
