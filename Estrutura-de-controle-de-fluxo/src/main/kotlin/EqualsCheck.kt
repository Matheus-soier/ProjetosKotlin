//Comparação Estrutural -> ==
//Comparação Referencial -> ===

fun main() {
    val autor = setOf("Shakespeare", "Twain", "Hemingway")
    val escritor = setOf("Twain", "Shakespeare", "Hemingway")

    println(autor == escritor)
    println(autor === escritor)
}