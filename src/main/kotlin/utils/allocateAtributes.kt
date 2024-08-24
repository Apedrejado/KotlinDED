package main.kotlin.utils

import main.kotlin.character.Attributes
import main.kotlin.dices.D6Dice

class AllocateAttributes {

    private val dice = D6Dice()

    // Função para alocar atributos com pontos disponíveis
    fun allocateAttributes(): Attributes {
        val totalPoints = 27
        var remainingPoints = totalPoints

        val attributes = mutableMapOf(
            "strength" to 8,
            "dexterity" to 8,
            "constitution" to 8,
            "intelligence" to 8,
            "wisdom" to 8,
            "charisma" to 8
        )

        val costTable = mapOf(
            8 to 0, 9 to 1, 10 to 2, 11 to 3, 12 to 4, 13 to 5, 14 to 7, 15 to 9
        )

        println("Você tem $totalPoints pontos para gastar nos atributos.")

        for (attribute in attributes.keys) {
            while (true) {
                println("Alocar pontos para $attribute (mínimo 8, máximo 15):")
                println("Pontos restantes: $remainingPoints")
                val input = readLine()?.toIntOrNull()

                if (input != null && input in 8..15) {
                    val cost = costTable[input] ?: 0
                    if (remainingPoints - cost >= 0) {
                        attributes[attribute] = input
                        remainingPoints -= cost
                        break
                    } else {
                        println("Pontos insuficientes. Tente um valor menor.")
                    }
                } else {
                    println("Valor inválido. Digite um número entre 8 e 15.")
                }
            }
        }

        return Attributes(
            strength = attributes["strength"]!!,
            dexterity = attributes["dexterity"]!!,
            constitution = attributes["constitution"]!!,
            intelligence = attributes["intelligence"]!!,
            wisdom = attributes["wisdom"]!!,
            charisma = attributes["charisma"]!!
        )
    }

    // Função para gerar atributos aleatórios com o dado de 6 lados
    fun randomAttributes(): Attributes {
        val attributes = mapOf(
            "strength" to dice.rollThreeTimes("strength"),
            "dexterity" to dice.rollThreeTimes("dexterity"),
            "constitution" to dice.rollThreeTimes("constitution"),
            "intelligence" to dice.rollThreeTimes("intelligence"),
            "wisdom" to dice.rollThreeTimes("wisdom"),
            "charisma" to dice.rollThreeTimes("charisma")
        )


        println("Atributos aleatórios gerados:")
        attributes.forEach { (attribute, value) ->
            println("$attribute: $value")
        }

        return Attributes(
            strength = attributes["strength"] ?: 8, // Valor default para segurança
            dexterity = attributes["dexterity"] ?: 8,
            constitution = attributes["constitution"] ?: 8,
            intelligence = attributes["intelligence"] ?: 8,
            wisdom = attributes["wisdom"] ?: 8,
            charisma = attributes["charisma"] ?: 8
        )
    }
}
