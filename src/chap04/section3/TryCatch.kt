package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: Exception) {
        e.printStackTrace()
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")
    } finally {
        println("finally ....")
    }
}