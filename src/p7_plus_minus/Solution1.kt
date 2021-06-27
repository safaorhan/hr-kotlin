package p7_plus_minus

fun main() {
    // positives: 4
    // negatives: 4
    // zeros: 2
    plusMinus(arrayOf(-4, 0, 0, 2, 3, 4, 30, -1, -1, -2))
}

fun plusMinus(arr: Array<Int>) {
    var positives = 0
    var negatives = 0
    var zeros = 0

    for(number in arr) {
        when {
            number > 0 -> positives += 1
            number < 0 -> negatives += 1
            else -> zeros += 1
        }
    }

    val size = arr.size.toDouble()
    println("%.6f".format(positives / size))
    println("%.6f".format(negatives / size))
    println("%.6f".format(zeros / size))
}
