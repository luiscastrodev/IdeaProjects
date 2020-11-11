package br.coursekotlinv2

fun media (vararg  notas: Int){

    println(notas.get(1))
}

fun main(){

    media(1,6)
}