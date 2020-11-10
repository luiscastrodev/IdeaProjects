package br.coursekotlinv2

fun  main (){

    val str = "My firt project is\n\n\n"

    for(c in str){
        println(c)
    }

    for (i in 1..100){
        println(i)
    }

    for (i in 1..100 step 10)
        println(i)

    for (j in 100 downTo  1)
        println(j)

}