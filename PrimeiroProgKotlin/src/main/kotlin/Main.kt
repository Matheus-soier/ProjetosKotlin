fun main() { //Ponto de entrada de um código Kotlin, definido pela função [main]
    val kotlin = "Matheus Soier"

    //Função com váriavel predefinida
    fun testeMenssagem(mensagem: String, prefixo: String = "Informação") {
        return println("$prefixo: $mensagem") // -> Interpolação de Strings
    }

    //Maneira 1 de executar uma função simples
    fun soma(y: Int, x: Int): Int {
        return x + y
    }

    //Maneira 2 de executar uma função simples
    fun soma(y: Int, x: Int, z: Int) = x * y * z

    //Executando sobrecarga
    fun executar() {
    println(soma(10, 10, 10))
    println(soma(10, 10))
    testeMenssagem("Carro Vermelho!", "Informação Recebida")
    println("Hello World, $kotlin!")
    }

    executar()
}
