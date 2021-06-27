package subarray_division

fun main() {
    val result = birthday(arrayOf(1, 1, 1), 2, 2)
    println(result)
}

fun birthday(s: Array<Int>, d: Int, m: Int) = (0..s.size - m).count { start ->
    s.copyOfRange(start, start + m).sum() == d
}
