import java.lang.Exception
import java.lang.IllegalArgumentException

// (1 + 2) + 4
interface Exp
class Num(val  number: Int) : Exp
class Sum(val left: Exp, val right: Exp) : Exp

fun rate(exp : Exp): Int{

    if(exp is Num){
        return  exp.number
    }

    /*
    if(exp is Sum){
        return  exp.left + exp.right
    }*/

    if(exp is Sum){
        return  rate(exp.left) + rate(exp.right)
    }
   throw IllegalArgumentException("not accept this exp")
}

fun main(){

    // (1 + 2) + 4
    val result = rate(Sum(Sum(Num(1), Num(2)),Num(4)))

    println(result)
}