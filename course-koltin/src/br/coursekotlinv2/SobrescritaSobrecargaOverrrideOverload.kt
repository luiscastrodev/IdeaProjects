
open class Maquina2 (val marca: String){//colcoar open para dizer que classe pode ser herdada
open fun minhaMarca(){//colocar open para sobrescrever a funcao
    println("minha marca é $marca")
}
}

class Computador2(marca: String, val nucleos: Int) : Maquina2(marca) {

    //sobrescreve class minha marca classe Maquina2
    override fun minhaMarca(){
        super.minhaMarca()//chama a classe pai
        println("estou reescrevendo minha marca é $marca")
    }

    fun ligar(){}
    fun processar(){}

    //sobrecarga funcoes com mesmo nome porem parametros diferentes
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: Int, a:String) = println("Overload 2")

}

fun main(){

    val c:Computador2 = Computador2("DELL",10)

    /*chamar metodos na mesma classe com a mesma varivel*/
    with(c){
        ligar()
        processar()
        minhaMarca()
        overload(10,"teste")
    }

}