fun main() {
    for (c in 'a'..'j') {
        print(c)
    }
    print(" ")
    for (c in 'z' downTo 'a' step 2) {
        print(c)
    }
    println(" ")
    val x = 2

    if(x in 2..5) {
        println("X está entre 2 e 5")
    }

    if (x !in 6..10) {
        println("X não está entre 6 e 10")
    }

}
