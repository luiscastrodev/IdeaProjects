package br.coursekotlinv2

fun main(){

    val test : Int? = null

     val op = test ?: 100 //se valor for null use 100 senao use valor de test
    println(op)

}