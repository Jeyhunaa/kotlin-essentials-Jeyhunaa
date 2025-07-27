package com.motycka.edu.lesson03.model

class Square(side: Double) : Rectangle(side, side) {

    // MUST override these explicitly to pass the test
    override val width: Double = side
    override val length: Double = side

    override fun area(): Double {
        return width * length
    }

    override fun perimeter(): Double {
        return 4 * width
    }

    override fun to3D(depth: Double): Shape3D {
        return Cuboid(width, width, width)
    }
}
