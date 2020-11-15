
fun main(args: Array<String>){

    //List - array , Set , HashMap


    val l0 = listOf<String>("Madrid","Dublin","New York")//,imutavel
    val l1 = mutableListOf<String>("Madrid","Dublin","New York")//mutavel

    arrayListOf<String>("Madrid","Dublin","New York") //mesma coisa de usar Arraylist do java


    //diferenca do setof e list of
    //set of nao adiiona item repetido
    //o list of adiciona itens repetidos
    val s1 = setOf<String>("Madrid","Dublin","New York","Dublin")//,imutavel
    val s2 = setOf<String>()//mutavel

    println(s2.size)

    val h1 = hashMapOf<String, String>(Pair("key","value"), Pair("Franca","Paris"))
    println(h1["Franca"])

    val m1 = mapOf<String, String>(Pair("key","value"), Pair("Franca","Paris"))
    //diferenca hasmap e  of nenhuma unica coisa uma implementa a outra entao pode ser que nao tenha alguns metodos

    val m2 = mutableMapOf<String, String>(Pair("key","value"), Pair("Franca","Paris"))

}