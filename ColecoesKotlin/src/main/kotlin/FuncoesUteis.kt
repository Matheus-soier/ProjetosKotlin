fun main() {
    //Collections Filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positive = numbers.filter { it >= 0 }
    val negative = numbers.filter { it < 0 }

    println("Todos números da lista: $numbers")
    println("Números positivos da lista: $positive")
    println("Números negativos da lista: $negative")

    //Collection Map
    val doubled = numbers.map { it * 2 }
    val tripled = numbers.map { it * 3 }

    println("Todos os números da lista: $numbers")
    println("Números multiplicados por 2: $doubled")
    println("Números multiplcados por 3: $tripled")

    //Collection Any
    val anyNegative = numbers.any { it < 0 } //Retorna true
    val anyGT6 = numbers.any { it > 6 } //Retorna False
    println("Números menores que 0: $anyNegative")
    println("Números maiores que 6: $anyGT6")

    //Collection  FlatMap
    val fruitsBag = listOf("Banana", "Maça", "Abacaxi")
    val clouthsBag = listOf("Calça", "Camisa", "Meia")
    val cart = listOf(fruitsBag, clouthsBag)
    val mapBag = cart.map { it } //Lista separadamente
    val flatMapBag = cart.flatMap { it } //Lista unicamente os itens

    println(mapBag)
    println(flatMapBag)
}