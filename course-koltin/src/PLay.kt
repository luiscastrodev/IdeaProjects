fun play(num : Int) = when{

    num % 15 == 0 -> "Yeap"
    num % 3 == 0 ->  "Yea"
    num % 5 == 0 -> "ap"
    else -> "$num"
}


fun main(){
    for (num in 1..100){
       println(play(num))
    }
}