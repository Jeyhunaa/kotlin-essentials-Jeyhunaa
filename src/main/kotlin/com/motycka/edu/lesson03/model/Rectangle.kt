package com.motycka.edu.lesson03.model

open class Rectangle(
    override val width: Double,
    override val length: Double
) : Shape2D, Quadrilateral {

    override fun area(): Double {
        return width * length
    }

    override fun perimeter(): Double {
        return 2 * (width + length)
    }

    override fun to3D(depth: Double): Shape3D {
        return Cuboid(width, length, depth)
    }
}
