package chap09.section3

import chap03.section1.add

fun main() {
    val capitalCityMap: MutableMap<String, String> =
            mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)

    val addData = mutableMapOf<String, String>("USA" to "Washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)
}
