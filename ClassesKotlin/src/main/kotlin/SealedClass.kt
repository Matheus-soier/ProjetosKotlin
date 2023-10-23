sealed class Mammal(val name: String)

class Cat(val nameCat: String) : Mammal(nameCat)
class Human(val nameHuman: String, val job: String) : Mammal(nameHuman)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Cat -> return "Hello ${mammal.name}"
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
    }
}

fun main() {
    val cat: Mammal = Cat("Nenem")
    val human: Mammal = Human("Matheus", "Software Developer")

    println(greetMammal(cat))
    println(greetMammal(human))
}