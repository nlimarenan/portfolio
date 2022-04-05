package com.ms.kotlin

import com.ms.kotlin.sintax.FunctionsContract

class KotlinPortfolioInitializer

fun main(args: Array<String>){
    //tried to determine two ways to print a message
    println("O resultado da funcão sum é ${FunctionsContract().sum(1,2)}")
    println("O resultado da funcão de sobrecarga sum é ${FunctionsContract().sum(1,2, 3)}")

    //thereś no return type in the funcion, but the return is being converted to string and being generated
    val sumResult = FunctionsContract().sum(2, 2)
    println("O resultado da funcão de sobrecarga sum é $sumResult")


}

