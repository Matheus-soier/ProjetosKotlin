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

    //Vararg -> Permite quantidade de parâmetros indefinidos dentro de uma mesma variável, jogando os dados em um array
    fun textos(vararg text: String) {
        for (t in text) println(t)
    }
    textos("Português", "Ingles", "Espanhol", "Alemão", "Francês", "Russo", "Mandarim")

    //Executando função com parâmetros nomeados juntamente com array de String em uma sobrecarga de método e parâmetros
    fun textos(vararg text: String, prefixo: String) {
        for (t in text) println("$prefixo: $t")
    }
    textos( "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", prefixo = "Número")
}
