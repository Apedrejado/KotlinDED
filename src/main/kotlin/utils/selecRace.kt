package main.kotlin.utils

import main.kotlin.races.Dwarf
import main.kotlin.races.Elf
import main.kotlin.races.RaceStrategy
import main.kotlin.races.Undead

fun selectRace(): RaceStrategy {
    println("Escolha a raça do seu personagem (escreva o nome):")
    println("Elf, Dwarf, Undead")
    while (true) {
        val input = readLine()?.trim()?.lowercase()
        return when (input) {
            "elf" -> Elf()
            "dwarf" -> Dwarf()
            "undead" -> Undead()
            else -> {
                println("Raça inválida. Por favor, escolha novamente.")
                continue
            }
        }
    }
}
