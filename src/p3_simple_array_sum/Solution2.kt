package p3_simple_array_sum

fun main() {
    val sum = simpleArraySum2(arrayOf(2,8,10,5,9))
    println(sum)
}

fun simpleArraySum2(ar: Array<Int>): Int {
    var sum = 0

    ar.forEach { sum += it }

    return sum
}