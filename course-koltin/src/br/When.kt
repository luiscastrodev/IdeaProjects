
fun getMinemonica (color : Color) :String =

    when(color){
        Color.RED -> "See"
        Color.ORANGE -> "AnyBody"
        Color.YELLOW -> "Life"
        Color.GREEN -> "Nice"
        Color.BLUE -> "no one"
    }

fun getTemperature(color : Color) : String{
    return when (color){
        Color.RED , Color.BLUE, Color.GREEN -> "Hot"
        Color.ORANGE -> "so so"
        Color.YELLOW -> "cold"
    }
}

fun main(){
    val min= getMinemonica(Color.BLUE)
    val temp = getTemperature(Color.YELLOW)
    println(temp)
}