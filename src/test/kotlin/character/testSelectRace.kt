package main.kotlin.test.kotlin.character

import main.kotlin.races.Elf
import main.kotlin.utils.selectRace
import java.io.ByteArrayInputStream
import java.io.InputStream

fun testSelectRace() {
    // Testar seleção de raça
    var input: InputStream = ByteArrayInputStream("Elf\n".toByteArray())
    System.setIn(input)
    val race = selectRace()
    assert(race is Elf) { "Falhou: esperado Elf, mas obteve ${race::class.simpleName}" }

    println("Todos os testes para selectRace passaram.")
}