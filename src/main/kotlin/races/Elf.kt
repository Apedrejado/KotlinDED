package main.kotlin.races

import main.kotlin.character.Attributes

class Elf : RaceStrategy {
    override val raceName: String = "Elf"

    override fun applyRaceBonuses(attributes: Attributes): Attributes {
        return attributes.copy(
            dexterity = attributes.dexterity + getDexterityBonus(),
            intelligence = attributes.intelligence + getIntelligenceBonus()
        )
    }

    override fun getRaceBenefits(): List<String> {
        return listOf("Darkvision", "Keen Senses", "Fey Ancestry")
    }

    override fun getStrengthBonus(): Int = 0
    override fun getDexterityBonus(): Int = 2
    override fun getConstitutionBonus(): Int = 0
    override fun getIntelligenceBonus(): Int = 1
    override fun getWisdomBonus(): Int = 0
    override fun getCharismaBonus(): Int = 0
}
