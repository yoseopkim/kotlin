package chap08.section2

import java.sql.Array
import java.util.*

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray()
    println("ASC: ${Arrays.toString(sortedNums)}")

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DEC: ${Arrays.toString(sortedNumsDesc)}")

    arr.sort(1, 3)
    println("QRI: ${Arrays.toString(arr)}")
    arr.sortDescending()
    println("QRI: ${Arrays.toString(arr)}")

    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: ${listSorted}")
    println("LST: ${listDesc}")

    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}