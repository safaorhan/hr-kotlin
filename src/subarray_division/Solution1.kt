package subarray_division

fun main() {

}

fun birthday2(s: Array<Int>, d: Int, m: Int) = (0..s.size - m).count {
    s.copyOfRange(it, it + m).sum() == d
}