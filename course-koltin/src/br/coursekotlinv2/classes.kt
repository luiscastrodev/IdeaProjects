package br.coursekotlinv2

class Pessoa1

class Pessoa2(var nome: String, var anonascimento: Int)

class Pessoa3(val nome: String) {

    var ano : Int? = null
    constructor(nome: String, anonascimento: Int) : this(nome){
        this.ano =anonascimento
    }

    fun saudacao() {
        println("Seja Bem vindo!!")
    }
}

fun main() {

    val pessoa3: Pessoa3 = Pessoa3("Pedro", 1990)
    val pessoa4: Pessoa3 = Pessoa3("Pedro")

    println(pessoa3.ano)

}