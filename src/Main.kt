package main.kotlin

import main.kotlin.character.Character
import main.kotlin.races.RaceStrategy
import main.kotlin.utils.*

fun main() {
    println("Bem-vindo à criação de personagens!")

    // Ler o nome do personagem
    val name = readName()

    // Selecionar a raça
    val race: RaceStrategy = selectRace()

    // Selecionar a classe
    val characterClass = selectClass()

    // Selecionar o alinhamento
    val alignment = selectAlignment()

    // Selecionar o background (região de origem e função anterior)
    val background = selectBackground()

    // Instanciar a classe AllocateAttributes
    val attributeAllocator = AllocateAttributes()

    // Permitir que o usuário escolha entre alocação manual ou aleatória dos atributos
    println("Você gostaria de alocar os atributos manualmente ou gerar aleatoriamente?")
    println("Digite 'manual' para alocar manualmente ou 'random' para gerar aleatoriamente:")

    val attributes = when (readLine()?.trim()?.lowercase()) {
        "manual" -> attributeAllocator.allocateAttributes()
        "random" -> attributeAllocator.randomAttributes()
        else -> {
            println("Escolha inválida. Atributos serão gerados aleatoriamente por padrão.")
            attributeAllocator.randomAttributes()
        }
    }

    // Criar o personagem com os atributos, alinhamento e background escolhidos ou gerados
    val character = Character(
        name = name,
        race = race,
        characterClass = characterClass,
        alignment = alignment,  // Passa o alinhamento para o personagem
        background = background,  // Passa o background para o personagem
        baseAttributes = attributes
    )

    // Exibir as informações do personagem criado
    println("---------------------------------------------------------------")
    character.displayCharacterInfo()
}
