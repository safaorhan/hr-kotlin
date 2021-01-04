package p4_compare_the_triplets

fun main() {
    val a = arrayOf(5, 6, 7)
    val b = arrayOf(3, 6, 10)
    val result = compareTriplets3(a, b)
    println("${result[0]} ${result[1]}")
}

fun compareTriplets3(a: Array<Int>, b: Array<Int>): Array<Int> {
    val scoreOfAlice = a.zip(b).count { it.first > it.second }
    val scoreOfBob = a.zip(b).count { it.second > it.first }

    return arrayOf(scoreOfAlice, scoreOfBob)
}