package picking_numbers

import kotlin.math.abs

fun main() {
    val result = pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1))
    print(result)
}

fun pickingNumbers(a: Array<Int>): Int {
    val group = mutableListOf<Int>()
    var max = 0

    a.sortedArray().forEach { num ->
        if (group.isEmpty() || num - group.minOrNull()!! <= 1) {
            group.add(num)
        } else {
            max = maxOf(max, group.size)
            group.clear()
            group.add(num)
        }
    }

    return maxOf(max, group.size)
}