package p4_compare_the_triplets

fun main() {
    val a = arrayOf(5, 6, 7)
    val b = arrayOf(3, 6, 10)
    val result = compareTriplets2(a, b)
    println("${result[0]} ${result[1]}")
}

fun compareTriplets2(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreOfAlice = 0
    var scoreOfBob = 0

    for(i in 0..2) {
        if(a[i] > b[i]) scoreOfAlice += 1
        if(a[i] < b[i]) scoreOfBob += 1
    }

    return arrayOf(scoreOfAlice, scoreOfBob)
}