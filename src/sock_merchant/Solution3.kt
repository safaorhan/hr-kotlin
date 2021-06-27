package sock_merchant

fun main() {
    sockMerchant3(6, arrayOf(1, 3, 2, 2, 2, 1, 4))
}

// [1,3,2,2,2,1,4]
fun sockMerchant3(n: Int, ar: Array<Int>): Int {
    val adetler = arrayOf(0, 0, 0, 0, 0)

    for (number in ar) {
        adetler[number] += 1
    }

    adetler.forEach { println(it) }

    return 0
}