package main.kotlin.races

import main.kotlin.character.Attributes

class Undead : RaceStrategy {
    override val raceName: String = "Undead"

    override fun applyRaceBonuses(attributes: Attributes): Attributes {
        return attributes.copy(
            strength = attributes.strength + getStrengthBonus(),
            dexterity = attributes.dexterity + getDexterityBonus(),
            constitution = attributes.constitution + getConstitutionBonus(),
            intelligence = attributes.intelligence + getIntelligenceBonus(),
            wisdom = attributes.wisdom + getWisdomBonus(),
            charisma = attributes.charisma + getCharismaBonus()
        )
    }

    override fun getRaceBenefits(): List<String> {
        return listOf("Dark Harvest", "Undead Frenzy")
    }

    override fun getStrengthBonus(): Int = 1
    override fun getDexterityBonus(): Int = 0
    override fun getConstitutionBonus(): Int = 2
    override fun getIntelligenceBonus(): Int = 0
    override fun getWisdomBonus(): Int = 0
    override fun getCharismaBonus(): Int = 0
}
