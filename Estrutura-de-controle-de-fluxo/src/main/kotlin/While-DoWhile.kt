fun main() {
    fun eatACake() {
        println("Comeu um bolo!")
    }
    fun bakeAcake() {
        println("Assou um bolo!")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while(cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeAcake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}
