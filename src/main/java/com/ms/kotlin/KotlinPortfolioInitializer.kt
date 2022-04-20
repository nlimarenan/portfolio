package com.ms.kotlin

import com.ms.kotlin.sintax.FunctionsContract
import com.ms.kotlin.sintax.clazz.Triangle
import java.util.logging.Logger

class KotlinPortfolioInitializer
    //Variable at top level
    val PI = 3.14
    var x = 1

fun main(args: Array<String>){
    //tried to determine two ways to print a message
    println("O resultado da funcao sum e ${FunctionsContract().sum(1,2)}")
    println("O resultado da funcao de sobrecarga sum e ${FunctionsContract().sum(1,2, 3)}")

    //thereś no return type in the funcion, but the return is being converted to string and being generated
    val sumResult = FunctionsContract().sum(2, 2)
    println("O resultado da funcao de sobrecarga sum e $sumResult")

    println("O resultado da funcao de sobrecarga sum e ${FunctionsContract().sumWithExplicitReturnType(2,5)
    }")

    // OK
    elvisLike<String>("", "").length
    // Error: 'null' cannot be a value of a non-null type
    //elvisLike<String>("", null).length

    // OK
    elvisLike<String?>(null, "").length
    // Error: 'null' cannot be a value of a non-null type
    //elvisLike<String?>(null, null).length
     FunctionsContract().showPIValue(PI)


    /*---------------------------------------------*/
    Triangle(3.0,5.0).showTriangleArea()
}


fun <T> elvisLike(x: T, y: T & Any): T & Any = x ?: y

