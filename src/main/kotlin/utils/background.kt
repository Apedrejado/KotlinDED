package main.kotlin.utils

fun selectBackground(): String {
    val region = selectRegion()
    val role = selectRole()

    return "Origin from $region, served as a $role."
}

private fun selectRegion(): String {
    println("Escolha a região de origem do seu personagem:")
    println("The Forgotten Isles")
    println("The Shadowed Highlands")
    println("The Glimmering Plains")

    return when (readLine()?.trim()?.lowercase()) {
        "forgotten isles" -> "The Forgotten Isles"
        "shadowed highlands" -> "The Shadowed Highlands"
        "glimmering plains" -> "The Glimmering Plains"
        else -> {
            println("Escolha inválida. A região será definida como 'The Glimmering Plains' por padrão.")
            "The Glimmering Plains"
        }
    }
}

private fun selectRole(): String {
    println("Escolha a função/histórico do seu personagem:")
    println("Wandering Scholar")
    println("Exiled Leader")
    println("Mystic Warrior")

    return when (readLine()?.trim()?.lowercase()) {
        "wandering scholar" -> "Wandering Scholar"
        "exiled leader" -> "Exiled Leader"
        "mystic warrior" -> "Mystic Warrior"
        else -> {
            println("Escolha inválida. A função será definida como 'Mystic Warrior' por padrão.")
            "Mystic Warrior"
        }
    }
}
