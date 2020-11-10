package br.coursekotlinv2

fun main(){
    val str: String ? = null

    str?.length

    println(str.isNullOrEmpty())
}