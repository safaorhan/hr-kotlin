package p5_a_very_big_sum

fun main() {
    val sum = aVeryBigSum2(arrayOf(2L, 8L, 10L, 5L, 9L))
    println(sum)
}

fun aVeryBigSum2(ar: Array<Long>): Long {
    var sum = 0L

    ar.forEach { sum += it }

    return sum
}