
fun main(){
    var temp : Int = 0
    var sum :  Int = 0
    var qtd :  Int = 0

    while (temp != 999){

        println("Put your temp or 999 to logout")

        temp =  readLine()!!.toInt()

        if(temp != 999){
            sum += temp
            qtd ++

        }
    }

    println("Average is ${sum / qtd} ")
}