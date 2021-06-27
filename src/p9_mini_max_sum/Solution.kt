package p9_mini_max_sum

fun main() {

}

fun miniMaxSum(arr: Array<Int>): Unit {
    var min = Int.MAX_VALUE
    var max = 0
    var sum = 0L

    for(number in arr) {
        sum += number
        if(number < min) min = number
        if(number > max) max = number
    }

    println("${sum - max} ${sum - min}")
}