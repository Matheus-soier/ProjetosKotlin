class Animal (val name: String)
class Zoo (val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}
fun main() {
    val animals = listOf(Animal("Leão"), Animal("Cobra"), Animal("Macaco"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Olha só, é um ${animal.name}")
    }
}