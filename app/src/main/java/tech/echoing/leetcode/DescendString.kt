package tech.echoing.leetcode

/**
 * Created by journey on 2020/4/1.
 */
fun main(args: Array<String>) {
    val list = listOf("a", "bcd", "ef", "ghij")
    println(list.sortedByDescending { it.length })

    val map = mapOf("asd" to "asdasd", "2" to "12312")
    val path = "www.ceht.com"
    print(map.keys.toList())
    print(map.values.toList())
    map.keys.toList().map { it }
    val str = map.toString()
        .replace("{", "")
        .replace("}", "")
        .split(",")

    print(str.map { "?$it" })
}