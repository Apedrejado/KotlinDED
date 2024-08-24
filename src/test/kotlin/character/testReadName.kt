package main.kotlin.test.kotlin.character
import main.kotlin.utils.readName
import java.io.ByteArrayInputStream
import java.io.InputStream

fun testReadName() {
    // Testar nome válido
    var input: InputStream = ByteArrayInputStream("John Doe\n".toByteArray())
    System.setIn(input)
    var name = readName()
    assert(name == "John Doe") { "Falhou: esperado 'John Doe', mas obteve '$name'" }

    // Testar entrada inválida
    input = ByteArrayInputStream("\n".toByteArray())
    System.setIn(input)
    name = readName()
    assert(name == "Unknown") { "Falhou: esperado 'Unknown', mas obteve '$name'" }

    println("Todos os testes para readName passaram.")
}






