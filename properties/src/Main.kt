fun main(){

    print(People(20,10).IsShow)
    print(People(2,3).IsSize)
    print(People(2,3).IsShow2)

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