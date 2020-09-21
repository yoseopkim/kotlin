package chap04.section3

fun main() {

    var getMessage = lambda@ { num: Int ->
        if (num !in 1..100) {
            return@lambda "Error"
        }
        "Success"
    }

    var getMessage2 = fun(num: Int): String {
        if (num !in 1..100) {
            return "Error"
        }
        return "Success"
    }

    val result = getMessage(99)
    print(result)
    println()
    val result2 = getMessage2(102)
    print(result2)
}
