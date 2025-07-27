package com.motycka.edu.lesson03.model

class Cuboid(
    private val width: Double,
    private val height: Double,
    private val depth: Double
) : Shape3D {

    override fun volume(): Double {
        return width * height * depth
    }

    override fun surfaceArea(): Double {
        return 2 * (width * height + width * depth + height * depth)
    }
}
