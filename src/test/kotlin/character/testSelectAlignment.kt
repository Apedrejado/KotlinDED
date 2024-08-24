package main.kotlin.test.kotlin.character

import main.kotlin.utils.selectAlignment
import java.io.ByteArrayInputStream
import java.io.InputStream

fun testSelectAlignment() {
    // Testar seleção de alinhamento
    var input: InputStream = ByteArrayInputStream("Lawful\nGood\n".toByteArray())
    System.setIn(input)
    val alignment = selectAlignment()
    assert(alignment == "Lawful Good") { "Falhou: esperado 'Lawful Good', mas obteve '$alignment'" }

    println("Todos os testes para selectAlignment passaram.")
}