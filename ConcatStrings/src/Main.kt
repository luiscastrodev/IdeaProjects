fun main() {

    val format: String = "First Name"
    val a = 1
    val b = 2

    println("$format")

    println("\$format")

    println("Total is: ${sum(10, 20)}")
}

fun sum(a: Int, b: Int): Int {

    return a + b
}