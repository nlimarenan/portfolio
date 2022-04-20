package com.ms.kotlin.sintax.clazz

class Triangle(base: Double, height: Double) {
  var area =  base*height

  fun showTriangleArea(){
    println("The triangle area is: $area")
  }
}