
fun main (){

    val people = People("My name", 52)

    //cant no be changed
    //people.age = ""

    println(people.name)
    println(people.age)

    println("My age is  ${people.age}")
}


class People(
    val name: String,
    val age: Int
)
