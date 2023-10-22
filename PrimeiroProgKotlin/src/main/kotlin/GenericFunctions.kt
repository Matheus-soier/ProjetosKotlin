class MutableStackF<E>(vararg items: E) {
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStackF(*elements)
fun main() {
    val stack = mutableStackOf<Int>(1, 2, 3, 4, 5, 5)
    for (i in 1..stack.size()) {
        stack.pop()
        println(stack)
    }
}