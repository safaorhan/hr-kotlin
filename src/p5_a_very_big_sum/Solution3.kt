package p5_a_very_big_sum

fun main() {
    val sum = aVeryBigSum3(arrayOf(2L, 8L, 10L, 5L, 9L))
    println(sum)
}

fun aVeryBigSum3(ar: Array<Long>) = ar.sum()