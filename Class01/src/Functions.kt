fun main() {
    println(max1(10, 20))
}

fun max(a: Int, b: Int): Int {

    return if (a > b) a else b
}

fun max1(x: Int, b: Int) = x + b