package projetkotlin.com.simpletextcomposeapplication

open class Pessoa constructor(protected val idade: Int) {

    open fun fala() {
        val mensagem: String
        mensagem = "Eu sou uma pessoa com a idade de $idade"
        println(mensagem)
    }
}

class Professor constructor(idade: Int) : Pessoa(idade) {

    override fun fala() {
        val mensagem = "Eu sou um professor com $idade anos"
        println(mensagem)
    }

    fun ensina(){
        println("Eu ensino")
    }
}

fun main() {
    val simplesPessoa: Pessoa = Pessoa(18)
    simplesPessoa.fala()

    var professor = Professor(idade = 38)
    professor.fala()
    professor.ensina()

    professor = Professor(idade = 40)
    professor.fala()
}