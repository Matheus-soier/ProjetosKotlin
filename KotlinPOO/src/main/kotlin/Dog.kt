class Dog {
    var name: String? = null
    var owner: Human? = null
    fun sayHi() {
        println("Hi ${owner?.name}, my name is $name!")
    }
}