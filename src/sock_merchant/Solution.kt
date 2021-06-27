package sock_merchant

fun main() {


}

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val socks = mutableMapOf<Int, Int>()

    ar.forEach {
        socks[it] = (socks[it] ?: 0) + 1
    }

    println(socks)

    return socks.values.sumBy { it / 2 }
}