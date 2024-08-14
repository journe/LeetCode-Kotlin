package tech.echoing.leetcode

fun plusOne(digits: IntArray): IntArray {
    return plusOneIndex(digits, digits.lastIndex)
}

fun plusOneIndex(digits: IntArray, index: Int): IntArray {
    return if (digits[index] != 9) {
        digits[index] += 1
        digits
    } else {
        digits[index] = 0
        if (index == 0) {
            val temp = intArrayOf(1)
            temp + digits
        } else {
            plusOneIndex(digits, index - 1)
        }
    }
}