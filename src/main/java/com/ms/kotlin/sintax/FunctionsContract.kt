package com.ms.kotlin.sintax

import org.springframework.expression.common.ExpressionUtils.toDouble

class FunctionsContract {
    fun sum(a: Int, b: Int) = a + b

    fun sum(a: Int, b: Int,
            c: Int): Int?{
        return a + b + c
    }

    fun sumWithExplicitReturnType(a: Int,
                                  b:Int):Int{
        return a+b
    }

    fun sumWithImplicitReturnType(a: Int,
                                  b: Int){
        a+b
    }

    fun sumWithDefaultTypeParameter(a: Int,
                                    b: Int = 1): Int{
        return a + b
    }

    fun sumWithAFunctionInsideThisFunction(a: Int,
                                    b: Int = 1): Double{
        fun calculateHalfOfAValue(c: Double): Double{
         return c/2
        }
        return calculateHalfOfAValue(a.toDouble()) + b
    }

    fun showPIValue(PI: Double){
        println("O valor do PI e: $PI")
    }
}