package br.coursekotlinv2


fun main(){
    println(Prioridade2.ALTA.value)
}

enum class  Prioridade{
    ALTA,BAIXA
}

enum class  Prioridade2(val  value : Int){
    ALTA(1),BAIXa(2)
}