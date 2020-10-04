package chap08.section1

import java.lang.IllegalStateException

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
    val result2 = getType<Int>(10)
    println("result2 = $result2")

}

inline fun <reified T> getType(value: Int): T {
    println(T::class)
    println(T::class.java)

    return when (T::class) {
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}
