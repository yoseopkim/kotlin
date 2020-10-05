package chap09.section3

fun main() {
    val intHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7)
    intHashSet.add(5)
    intHashSet.remove(6)
    println(intHashSet)
}
