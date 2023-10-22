fun main() {
    cases("hello")
    cases(Human())
    cases(1)
    cases(0L)
    cases("Hello")
}
    class Human
fun cases(obj: Any) {
    when (obj) {
        1 -> println("Número 1")
        "Hello" -> println("Hello com H maiusculo")
        is Long -> println("É um Long")
        !is String -> println("Não é uma string")
        else -> println("Indefinido!")
    }
}
