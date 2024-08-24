    package main.kotlin.character

    data class Attributes(
        val strength: Int,
        val dexterity: Int,
        val constitution: Int,
        val intelligence: Int,
        val wisdom: Int,
        val charisma: Int
    ) {
        val strengthModifier: Int
            get() = calculateModifier(strength)

        val dexterityModifier: Int
            get() = calculateModifier(dexterity)

        val constitutionModifier: Int
            get() = calculateModifier(constitution)

        val intelligenceModifier: Int
            get() = calculateModifier(intelligence)

        val wisdomModifier: Int
            get() = calculateModifier(wisdom)

        val charismaModifier: Int
            get() = calculateModifier(charisma)

        private fun calculateModifier(attribute: Int): Int {
            return (attribute - 10) / 2
        }
    }
