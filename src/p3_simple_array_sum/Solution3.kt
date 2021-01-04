package p3_simple_array_sum

fun main() {
    val sum = simpleArraySum3(arrayOf(2,8,10,5,9))
    println(sum)
}

fun simpleArraySum3(ar: Array<Int>) = ar.sum()