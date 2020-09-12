package chap03.section3

fun main() {
    val result = CallByValue(lambda())
    println(result)
}

fun CallByValue(b: Boolean): Boolean {
    println("CallByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}
