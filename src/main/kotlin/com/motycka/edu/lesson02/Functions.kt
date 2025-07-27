package com.motycka.edu.lesson02


// Coffee prices
val coffeePrices = mapOf(
    ESPRESSO to 2.5,
    CAPPUCCINO to 3.0,
    AMERICANO to 2.0,
    FLAT_WHITE to 3.2,
    DOUBLE_ESPRESSO to 3.0
)

val coffeeOrders = mutableMapOf<Int, List<String>>()

fun main() {
    // You can write code here to try the functions
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
    // processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0) // will fail due to insufficient payment
}

/* Implement the functions below */

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placeOrder(items)
    val totalToPay = payOrder(orderId)

    if (payment < totalToPay) {
        throw IllegalArgumentException("Insufficient payment")
    }

    val change = payment - totalToPay

    // Print payment information
    println("Payment: $payment, Total: $totalToPay, Change: $change")

    completeOrder(orderId)

    return change
}

fun placeOrder(items: List<String>): Int {
    val orderId = coffeeOrders.size + 1
    coffeeOrders[orderId] = items
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: throw IllegalArgumentException("Order not found")

    var total = 0.0
    for (item in items) {
        total += coffeePrices[item] ?: 0.0
    }

    // Apply discount if 3 or more items (cheapest item free)
    if (items.size >= 3) {
        val prices = items.map { coffeePrices[it] ?: 0.0 }
        val discount = prices.minOrNull() ?: 0.0
        total -= discount
    }

    return total
}

fun completeOrder(orderId: Int) {
    if (!coffeeOrders.containsKey(orderId)) {
        throw IllegalArgumentException("Order not found")
    }
    coffeeOrders.remove(orderId)
}