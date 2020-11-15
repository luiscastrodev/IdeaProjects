open class Maquina3(val marca: String) {
    //colcoar open para dizer que classe pode ser herdada
    open fun minhaMarca() {//colocar open para sobrescrever a funcao
        println("minha marca é $marca")
    }
}

class Computador3(marca: String, val nucleos: Int) : Maquina3(marca) {

    //sobrescreve class minha marca classe Maquina2
    override fun minhaMarca() {
        super.minhaMarca()//chama a classe pai
        println("estou reescrevendo minha marca é $marca")
    }

    private fun ligar() {} //somente disponivel na classe interna
    fun processar() {}

    //sobrecarga funcoes com mesmo nome porem parametros diferentes
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: Int, a: String) = println("Overload 2")

}

fun main() {

    val c: Computador3 = Computador3("DELL", 10)

    /*chamar metodos na mesma classe com a mesma varivel*/
    with(c) {
        /*ligar()//erro ao chamar pois eh private*/
        processar()
        minhaMarca()
        overload(10, "teste")
    }

}
