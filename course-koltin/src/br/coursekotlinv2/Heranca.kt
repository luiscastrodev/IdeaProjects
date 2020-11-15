
open class Maquina (val marca: String){//colcoar open para dizer que classe pode ser herdada
    fun minhaMarca(){
        println("minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca) {
    fun ligar(){}
    fun processar(){}
}

fun main(){

    val c:Computador = Computador("DELL",10)

    /*chamar metodos na mesma classe com a mesma varivel*/
    with(c){
        ligar()
        processar()
        minhaMarca()
    }

}