package p5_a_very_big_sum

fun main() {
    val sum = aVeryBigSum(arrayOf(2L, 8L, 10L, 5L, 9L))
    println(sum)
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = 0L
    for(number in ar) {
        sum += number
    }

    return sum
}