package chap09.section3

fun main() {
    val intLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intLinkedHashSet.add(4)
    intLinkedHashSet.remove(21)

    println(intLinkedHashSet)
    intLinkedHashSet.clear()
    println(intLinkedHashSet)
}
