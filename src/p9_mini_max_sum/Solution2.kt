package p9_mini_max_sum

fun main() {

}

fun miniMaxSum2(arr: Array<Int>): Unit {
    var min = arr.min()!!
    var max = arr.max()!!
    var sum = arr.map { it.toLong() }.sum()

    println("${sum - max} ${sum - min}")
}