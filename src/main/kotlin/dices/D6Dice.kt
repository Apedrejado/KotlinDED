package main.kotlin.dices

import kotlin.random.Random

class D6Dice : Dice {
    override fun roll(): Int {
        // Gera um número aleatório entre 1 e 6
        return Random.nextInt(1, 7)
    }

    // Implementa o método da interface sem alterações
    override fun rollTreeTimes(): Int {
        return rollThreeTimes("atributo padrão")
    }

    // Novo método para receber o nome do atributo
    fun rollThreeTimes(attributeName: String): Int {
        println("---------------------------")
        val a = roll()
        println("Para o atributo '$attributeName', no Primeiro dado tirou: $a")

        println("---------------------------")
        val b = roll()
        println("Para o atributo '$attributeName', no Segundo dado tirou: $b")

        println("---------------------------")
        val c = roll()
        println("Para o atributo '$attributeName', no Terceiro dado tirou: $c")

        // Exibindo o resultado da soma dos dados
        val total = a + b + c
        println("---------------------------")
        println("Total para o atributo '$attributeName' é: $total")

        // Pausando e pedindo para o jogador digitar "jogar dados"
        println("Digite 'jogar dados' para continuar...")
        readLine()  // Aguarda a entrada do jogador

        return total
    }
}
