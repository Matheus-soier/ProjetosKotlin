open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, "India")

fun main() {
    val lion: Lion = Asiatic("Linux")
    lion.sayHello()
}