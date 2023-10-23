data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun main() {
    val user = User(name = "Alex", id = 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    val userCopy = user.copy()
    println(user.copy())
    println(user === userCopy)
    println(user.copy("Max"))
    println(user.copy(id = 3))

    // Forma alternativa para acessar os atributos do objeto user
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

    println("name = ${user.name}")
    println("id = ${user.id}")
}