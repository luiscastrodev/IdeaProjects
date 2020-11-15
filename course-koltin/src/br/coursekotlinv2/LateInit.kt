class Pesso {
    lateinit var nome: String //eu sei q nao tem valor e preciso atribuir valor do dps q construir a classe e depois q a funcao for chamada

    fun geradorNome() {
        nome = "debug"
    }
}

fun main() {

    val p = Pesso()
    p.geradorNome()
}