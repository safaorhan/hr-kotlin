package p3_simple_array_sum

fun main() {
    val sum = simpleArraySum(arrayOf(2,8,10,5,9))
    println(sum)
}

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0

    for (element in ar) {
        sum += element
    }

    return sum
}