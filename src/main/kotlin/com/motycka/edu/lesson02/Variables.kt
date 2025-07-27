package com.motycka.edu.lesson02

/*
Define String variables for two types of coffee: espresso and cappuccino.
 */
const val espresso = "Espresso"
const val cappuccino = "Cappuccino"

/*
Define Double variables for the prices of espresso and cappuccino.
 */
val espressoPrice : Double = 2.50
val cappuccinoPrice : Double = 3.00

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {

    val totalPrice: Double = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

    println(totalPrice)
}


fun main(args: Array<String>) {

    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }

    variables(espressoQuantity = espressoQuantity, cappuccinoQuantity = cappuccinoQuantity)
}
