package tech.echoing.leetcode

/**
 * Created by journey on 2020/5/26.
 */
fun main() {
    var one = false
    val (a, b) = readLine()!!.split(" ").let {
        if (it.size > 1) {
            one = true
            it.map { it.toInt() }
        } else {
            arrayListOf(0, 0)
        }
    }
    if (one) println(a + b)
}

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        print(a + b)
    }
}