package br.coursekotlinv2.exercises

import org.junit.Assert
import org.junit.Test

class VogalConsoanteTest {

    @Test fun countVogals(){
        Assert.assertEquals(11,countVogals("quantas vogais tem essa frase?"))
    }

    @Test fun countConsoantes(){
        Assert.assertEquals(4,countConsoantes("kotlin"))
    }

    @Test fun countVogalEConsoantes(){
       val frase = "kotlin"
        Assert.assertEquals(2,countVogals(frase))
        Assert.assertEquals(4,countConsoantes(frase))

    }
}