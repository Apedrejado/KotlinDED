package main.kotlin.dices

import kotlin.random.Random

interface Dice {
    fun roll(): Int
    fun rollTreeTimes(): Int
}


