package com.motycka.edu.lesson03

object AreaCalculator {

    // Rectangle: Double
    fun calculateRectangleArea(a: Double, b: Double): Double {
        return a * b
    }

    // Rectangle: Int
    fun calculateRectangleArea(a: Int, b: Int): Double {
        return a.toDouble() * b.toDouble()
    }

    // Circle: Double
    fun calculateCircleArea(r: Double): Double {
        return Math.PI * r * r
    }

    // Circle: Int
    fun calculateCircleArea(r: Int): Double {
        return Math.PI * r.toDouble() * r.toDouble()
    }

    // Triangle: Double
    fun calculateTriangleArea(a: Double, b: Double): Double {
        return 0.5 * a * b
    }

    // Triangle: Int
    fun calculateTriangleArea(a: Int, b: Int): Double {
        return 0.5 * a.toDouble() * b.toDouble()
    }
}

fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
    println(AreaCalculator.calculateRectangleArea(5.5, 4.0))

    println(AreaCalculator.calculateCircleArea(3))
    println(AreaCalculator.calculateCircleArea(3.0))

    println(AreaCalculator.calculateTriangleArea(4, 6))
    println(AreaCalculator.calculateTriangleArea(4.0, 6.0))
}
