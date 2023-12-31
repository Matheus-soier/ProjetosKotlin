enum class State {
    IDLE, RUNNING, FINISHED
}

fun main() {
    val state = State.FINISHED
    val message = when (state) {
        State.IDLE -> "It's IDLE"
        State.RUNNING -> "It's RUNNING"
        State.FINISHED -> "It's FINISHED"
    }
    println(message)

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.GREEN.containsRed())
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)

}




