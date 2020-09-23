package chap04.section3

fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception) {
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int): Unit {
    if (amount < 1000)
        throw Exception("$amount is below 1000.")
}
