package tech.echoing.leetcode

import java.util.*

fun main(args: Array<String>) {

}

fun longestCommonPrefix(strs: Array<String>): String {
    var res = ""
    var same = true
    var links = arrayListOf<Objects>()
    for (i in 0..strs[0].length){
        res += strs[0][i].toString()
        strs.forEach {
            if (!it[i].equals(res)){
                same = false
                return@forEach
            }
        }
        if (!same) {
            break
        }
    }
    return res
}

fun findstr(strs: Array<String>,res: String,index: Int){
    strs.forEach {
        if (!it[index].equals(res)){
//            res = ""

        }
    }
}