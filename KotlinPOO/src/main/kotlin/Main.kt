fun main() {
    val dog = Dog()
    val matheus = Human()
    val gustavo = Human()

    gustavo.name = "Gustavo Sampaio"
    matheus.name = "Matheus Soier"

    dog.name = "Linux"
    dog.owner = gustavo
    dog.sayHi()
}