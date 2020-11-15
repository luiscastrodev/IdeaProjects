abstract class Mamifero(var nome: String) {

    var peso : Float = 0f

    abstract fun falar()
    open fun domir() {
        println("dormindo")
    }
}

class Cachorro(nome: String) : Mamifero(nome) {

    init {
        this.peso = 100f
    }
    override fun falar() {
        println("auau")
    }
}

class Gato(nome: String) : Mamifero(nome) {

    override fun falar() {
        println("miau")
    }

    override fun domir() {
        println("Gato dormindo")
    }
}

fun main() {

    var dog = Cachorro("Hulk")

    println(dog.peso)
    println(dog.domir())

    println(dog.falar())


    Gato("mel").domir()
}