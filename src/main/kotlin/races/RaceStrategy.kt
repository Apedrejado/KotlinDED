package main.kotlin.races

import main.kotlin.character.Attributes

interface RaceStrategy {
    val raceName: String

    fun applyRaceBonuses(attributes: Attributes): Attributes {
        return Attributes(
            strength = attributes.strength + getStrengthBonus(),
            dexterity = attributes.dexterity + getDexterityBonus(),
            constitution = attributes.constitution + getConstitutionBonus(),
            intelligence = attributes.intelligence + getIntelligenceBonus(),
            wisdom = attributes.wisdom + getWisdomBonus(),
            charisma = attributes.charisma + getCharismaBonus()
        )
    }

    fun getRaceBenefits(): List<String>

    fun getStrengthBonus(): Int
    fun getDexterityBonus(): Int
    fun getConstitutionBonus(): Int
    fun getIntelligenceBonus(): Int
    fun getWisdomBonus(): Int
    fun getCharismaBonus(): Int
}
