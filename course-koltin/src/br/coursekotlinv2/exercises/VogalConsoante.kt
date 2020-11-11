package br.coursekotlinv2.exercises

fun countVogals(frase: String): Int {

    var novafrase = ""

    for (f in frase) {
        if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
            novafrase += f
        }
    }
    return novafrase.length;
}


fun countConsoantes(frase: String): Int {

    val consoantes = "bcdfghjklmnpqrstvxzw"
    var total = 0

    for (f in frase) {
        if(f.toLowerCase() in consoantes) total ++
    }

    return total;
}

fun main() {
    countVogals("teste")
}

