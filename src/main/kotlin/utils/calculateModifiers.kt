package main.kotlin.utils

import main.kotlin.character.Attributes

fun calculateModifier(value: Int): Int {
    return (value - 10) / 2
}

fun modifiers(attributes: Attributes): Map<String, Int> {
    return mapOf(
        "strength" to calculateModifier(attributes.strength),
        "dexterity" to calculateModifier(attributes.dexterity),
        "constitution" to calculateModifier(attributes.constitution),
        "intelligence" to calculateModifier(attributes.intelligence),
        "wisdom" to calculateModifier(attributes.wisdom),
        "charisma" to calculateModifier(attributes.charisma)
    )
}
