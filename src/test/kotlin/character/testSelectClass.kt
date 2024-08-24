package main.kotlin.test.kotlin.character

import main.kotlin.classes.Fighter
import main.kotlin.utils.selectClass
import java.io.ByteArrayInputStream
import java.io.InputStream

fun testSelectClass() {
    // Testar seleção de classe
    var input: InputStream = ByteArrayInputStream("Fighter\n".toByteArray())
    System.setIn(input)
    val characterClass = selectClass()
    assert(characterClass is Fighter) { "Falhou: esperado Fighter, mas obteve ${characterClass::class.simpleName}" }

    println("Todos os testes para selectClass passaram.")
}