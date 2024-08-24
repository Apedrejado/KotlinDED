package main.kotlin.classes

class Wizard : CharacterClass {
    override val className: String = "Wizard"

    override fun getClassFeatures(): List<String> {
        return listOf("Spell casting", "Arcane Recovery", "Fire Ball")
    }
}
