package main.kotlin.character

import main.kotlin.dices.D8Dice
import main.kotlin.races.RaceStrategy
import main.kotlin.classes.CharacterClass
import main.kotlin.main.kotlin.utils.HitPointsCalculator

class Character(
    val name: String,
    val race: RaceStrategy,
    val characterClass: CharacterClass,
    val alignment: String,  // Novo atributo: Alinhamento do personagem
    val background: String,  // Novo atributo: Background do personagem
    baseAttributes: Attributes,
) {
    // Atributos base fornecidos
    private val baseAttributes: Attributes = baseAttributes

    // Aplica os bônus da raça aos atributos base
    private val adjustedAttributes: Attributes = race.applyRaceBonuses(baseAttributes)

    // Modificadores de atributos
    val strength_Modifier: Int = calculateModifier(adjustedAttributes.strength)
    val dexterity_Modifier: Int = calculateModifier(adjustedAttributes.dexterity)
    val constitution_Modifier: Int = calculateModifier(adjustedAttributes.constitution)
    val intelligence_Modifier: Int = calculateModifier(adjustedAttributes.intelligence)
    val wisdom_Modifier: Int = calculateModifier(adjustedAttributes.wisdom)
    val charisma_Modifier: Int = calculateModifier(adjustedAttributes.charisma)

    // Calcula pontos de vida usando a classe HitPointsCalculator
    val dice = D8Dice()
    private val hitPointsCalculator = HitPointsCalculator(dice, constitution_Modifier)
    var hitPoints: Int = hitPointsCalculator.calculateHitPoints()

    // Calcula o modificador de um atributo
    private fun calculateModifier(attributeValue: Int): Int {
        return (attributeValue - 10) / 2
    }

    // Exibe as informações do personagem
    fun displayCharacterInfo() {
        println("Name: $name")
        println("Race: ${race.raceName}")
        println("Class: ${characterClass.className}")
        println("Alignment: $alignment")  // Exibe o alinhamento do personagem
        println("Background: $background")  // Exibe o background do personagem
        println("Hit Points: $hitPoints")
        println("Attributes:")
        displayAttribute("Strength", baseAttributes.strength, race.getStrengthBonus(), strength_Modifier)
        displayAttribute("Dexterity", baseAttributes.dexterity, race.getDexterityBonus(), dexterity_Modifier)
        displayAttribute("Constitution", baseAttributes.constitution, race.getConstitutionBonus(), constitution_Modifier)
        displayAttribute("Intelligence", baseAttributes.intelligence, race.getIntelligenceBonus(), intelligence_Modifier)
        displayAttribute("Wisdom", baseAttributes.wisdom, race.getWisdomBonus(), wisdom_Modifier)
        displayAttribute("Charisma", baseAttributes.charisma, race.getCharismaBonus(), charisma_Modifier)
    }

    // Exibe um atributo com o bônus e o modificador, se houver
    private fun displayAttribute(attributeName: String, baseValue: Int, bonusValue: Int, modifier: Int) {
        val modifierSign = if (modifier >= 0) "+$modifier" else "$modifier"
        if (bonusValue != 0) {
            println("  $attributeName: $baseValue + $bonusValue (Modifier: $modifierSign)")
        } else {
            println("  $attributeName: $baseValue (Modifier: $modifierSign)")
        }
    }
}
