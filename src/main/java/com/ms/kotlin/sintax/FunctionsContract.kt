package com.ms.kotlin.sintax

class FunctionsContract {
    fun sum(a: Int, b: Int) = a + b

    fun sum(a: Int, b: Int, c: Int): Int?{
        return a + b + c
    }
}