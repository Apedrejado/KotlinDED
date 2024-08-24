package main.kotlin.utils

fun selectAlignment(): String {
    val tendency = selectTendency()
    val morality = selectMorality()

    return if (tendency == "Neutral" && morality == "Neutral") {
        "True Neutral"
    } else {
        "$tendency $morality"
    }
}

private fun selectTendency(): String {
    println("Escolha a tendência do seu personagem (Lawful, Neutral, Chaotic):")
    return when (readLine()?.trim()?.lowercase()) {
        "lawful" -> "Lawful"
        "neutral" -> "Neutral"
        "chaotic" -> "Chaotic"
        else -> {
            println("Escolha inválida. A tendência será definida como Neutral por padrão.")
            "Neutral"
        }
    }
}

private fun selectMorality(): String {
    println("Escolha a moralidade do seu personagem (Good, Neutral, Evil):")
    return when (readLine()?.trim()?.lowercase()) {
        "good" -> "Good"
        "neutral" -> "Neutral"
        "evil" -> "Evil"
        else -> {
            println("Escolha inválida. A moralidade será definida como Neutral por padrão.")
            "Neutral"
        }
    }
}
