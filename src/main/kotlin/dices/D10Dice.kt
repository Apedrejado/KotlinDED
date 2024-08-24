package main.kotlin.main.kotlin.dices

import main.kotlin.dices.Dice
import kotlin.random.Random

class D10Dice: Dice {
    override fun roll(): Int {
        // Gera um número aleatório entre 1 e 10
        return Random.nextInt(1, 11)
    }

    override fun rollTreeTimes(): Int {
        println("---------------------------")
        val a = roll()
        println("No Primeiro dado tirou: $a")

        println("---------------------------")
        val b = roll()
        println("No Segundo dado tirou: $b")

        println("---------------------------")
        val c = roll()
        println("No Terceiro dado tirou: $c")

        // Exibindo o resultado da soma dos dados
        val total = a + b + c
        println("---------------------------")
        println("O total dos dados é: $total")

        // Pausando e pedindo para o jogador digitar "jogar dados"
        println("Digite 'jogar dados' para continuar...")
        readLine()  // Aguarda a entrada do jogador

        return total
    }
}