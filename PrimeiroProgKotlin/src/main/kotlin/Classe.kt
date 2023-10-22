class Cliente(val nome: String, val idade: Int)
class Contato(val id: Int, var email: String?)

fun main() {

    val Cliente = Cliente("Matheus Sampaio Soier", 20)
    val Contato = Contato(111, "business.soier@gmail.com")

    Contato.email = "devmatheus.soier@gmail.com"

    println("Nome do cliente: ${Cliente.nome} \nIdade do cliente: ${Cliente.idade} \nId do Cliente: ${Contato.id} \nEmail do Cliente: ${Contato.email}")
}