
class Constants private constructor(){

    companion object{ //o nome eh opcional
        val TABLE = "Pessoa"

        fun teste(){
            println("Sou um método estático")
        }
    }

    object VENDAS { //nome eh obrigatorio
        val TABLE_NAME = "Pessoa"

        object  COLUNAS{
            val ID = "id"
        }

    }

}

fun main(){

    Constants.TABLE

    Constants.teste()

    Constants.VENDAS.TABLE_NAME

    Constants.VENDAS.COLUNAS.ID

}