
fun main(){
    var temp : Int = 0
    var sum :  Int = 0
    var qtd :  Int = 0

    do{
        println("Put your temp or 999 to logout")

        temp =  readLine()!!.toInt()

        if(temp != 999){
            sum += temp
            qtd ++

        }
    }
    while (temp != 999)

    println("Average is ${sum / qtd} ")
}