package main.kotlin.utils

import main.kotlin.classes.CharacterClass
import main.kotlin.classes.Fighter
import main.kotlin.classes.Wizard

fun selectClass(): CharacterClass {
    println("Escolha a classe do seu personagem (escreva o nome):")
    println("Fighter, Wizard")
    while (true) {
        val input = readLine()?.trim()?.lowercase()
        return when (input) {
            "fighter" -> Fighter()
            "wizard" -> Wizard()
            else -> {
                println("Classe inválida. Por favor, escolha novamente.")
                continue
            }
        }
    }
}
