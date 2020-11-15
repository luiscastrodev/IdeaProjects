data class Food(val name: String, val calories: Int, val ingredients: List<Ingredients> = listOf())
data class Ingredients(val nome: String, val quantidade: Int)

fun main() {

    // Cria lista de dados
    val data = listOf(
        Food(
            "Lasanha", 1200,
            listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de tomate", 2),
                Ingredients("Manjerição", 3)
            )
        ),
        Food("Panqueca", 500),
        Food("Omelete", 200),
        Food("Parmegiana", 700),
        Food("Sopa de feijão", 300),
        Food(
            "Hamburguer", 2000,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburguer", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )


    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "Sim" else "Não"}")

    // Quantas receitas tenho na coleção?
    println("Tenho: ${data.count()}")

    // Qual a primeira e última receita?
    println("Primeira: ${data.first().name}")
    println("Ultima: ${data.last().name}")

    // Qual a soma de calorias?
    val cal = data.sumBy { it.calories }//or
    println("Soma de calorias: ${data.sumBy { x -> x.calories }}")

    // Me dê as duas primeiras receitas
    val firsttwo = data.take(2)
    println("as duas primeiras receitas: ${firsttwo[0].name}")
    println("as duas primeiras receitas: ${firsttwo[1].name}")


}
