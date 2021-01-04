package p4_compare_the_triplets

fun main() {
    val a = arrayOf(5, 6, 7)
    val b = arrayOf(3, 6, 10)
    val result = compareTriplets(a, b)
    println("${result[0]} ${result[1]}")
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreOfAlice = 0
    var scoreOfBob = 0

    if(a[0] > b[0]) scoreOfAlice += 1
    if(a[0] < b[0]) scoreOfBob += 1
    if(a[1] > b[1]) scoreOfAlice += 1
    if(a[1] < b[1]) scoreOfBob += 1
    if(a[2] > b[2]) scoreOfAlice += 1
    if(a[2] < b[2]) scoreOfBob += 1

    return arrayOf(scoreOfAlice, scoreOfBob)
}