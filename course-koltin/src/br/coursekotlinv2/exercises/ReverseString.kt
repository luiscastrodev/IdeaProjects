package br.coursekotlinv2.exercises


fun main(){
    println(reverseusingFor("Kotlin"))
}

fun reverseusingSB(str: String) : String{
    return StringBuilder(str).reverse().toString()
}

fun reverseusingFor(str: String) : String{

    var retorno = StringBuilder()
    var i = str.length -1

    while (i>=0){
        retorno.append(str[i])
        i--
    }

    return retorno.toString()
}