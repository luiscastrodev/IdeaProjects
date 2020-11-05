fun main(){

   /* print(People(20,10).IsShow)
    print(People(2,3).IsSize)
    print(People(2,3).IsShow2)*/

    //var person  = Person("Person1",210)
    var person2  = Person(1,"Person2")

    //print("${person.name}  ${person.age}")
    print("${person2.name}  ${person2.age}")
}

class People(
    var heigth : Int,
    val with : Int
){
    val IsSize: Boolean get(){

        return  heigth < with
    }

    val IsShow : Boolean get() = heigth > with

    val IsShow2 get() = heigth > with


    fun isShow (): Boolean{
        return  heigth > with
    }
}

class Person(val name: String, var age: Int) {
    constructor(name: String) : this(name, 0)
    constructor(yearOfBirth: Int, name: String)
            : this(name, 2018 - yearOfBirth)
}