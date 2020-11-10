package br.coursekotlinv2


fun main()
{
    try {
        println("test".toInt())
    }catch (e : NumberFormatException){
        println("Erro ao converter o número")
    }
    catch (e: Exception){
        println("Houve um erro generico")
    }

}
