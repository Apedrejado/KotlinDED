package main.kotlin.classes

class Fighter : CharacterClass {
    override val className: String = "Fighter"

    override fun getClassFeatures(): List<String> {
        return listOf("Heavy Armor", "Shield Proficiency", "Weapon Proficiency")
    }
}
