package br.coursekotlinv2

fun operacao(a: Int, b: Int, c: String) : Int{

    try {
        when (c) {
            "Soma" -> return a + b
            "Divisao" -> return a / b
            "Multiplicacao" -> return a * b
            "Subtracao" -> return a - b
            else -> return 0
        }
    }catch(e: ArithmeticException) {
        println(e.message)
        return  0;
    }

}

fun main() {

    println(operacao(0, 0, "Divisao"))

}