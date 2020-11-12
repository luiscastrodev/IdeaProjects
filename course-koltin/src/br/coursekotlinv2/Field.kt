package br.coursekotlinv2



class Maquina(var marca : String){

    var nucleos: Int = 0

    get (){
        println("get started")
        return field
    }

    set(value) {
        println("set started")
        field = value
    }

}

fun main(){

    var m = Maquina("ts")
    println(m.nucleos)
}