fun main() {
    //var mutavel
    var a = "texto1"
    println(a)
    a = "texto2"
    println(a)

    //val imutavel
    val c = 3.5
    val b = 3
    println(b + c)

    fun condicional() = false

    //valor da variavel depende de uma condição
    val z: Int = if(condicional()) {
        10
    } else {
        20
    }
    println(z)

    //valor de uma variavel pode ser nulo ou não basta adicionar um "?"
    val texto: String?
    texto = null
    println("$texto")

    //Retornando uma String que pode ser nula
    val textoNulo: String? = null
    val textoNormal = "Matheus Sampaio Soier"
    fun nulo(str: String?): Int {
        return str?.length ?: 0
    }
    println(nulo(textoNulo)) //Imprimindo um length de uma String nula (usando a mesma função)
    println(nulo(textoNormal)) //Imprimindo o length de uma String normal (usando a mesma função)

    //Função executando string -> vazia, nula ou com valor
    fun stringDescrita(str: String?): String {
        if (str != null && str.length > 0) {
            return "Tamanho da String é igual a: ${str.length}"
        } else if(str == null){
            return "Valor da String é nulo!"
        } else {
            return "Valor da String é vazio"
        }
    }
    println(stringDescrita(null))
    println(stringDescrita(""))
    println(stringDescrita("Kotlin é muito divertido!"))
}

