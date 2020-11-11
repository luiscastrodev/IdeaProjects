package br.coursekotlinv2.exercises

import org.junit.Assert
import org.junit.Test


class ReverseStringTest (){

    @Test
    fun reverseusingSB(){
        Assert.assertEquals("bs niltok", reverseusingSB("kotlin sb"))
    }

    @Test
    fun reverseusingFor(){
        Assert.assertEquals("rof niltok", reverseusingFor("kotlin for"))
    }
}