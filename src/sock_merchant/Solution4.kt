package sock_merchant

fun main() {
    val pairs = sockMerchant4(7, arrayOf(1, 3, 2, 2, 2, 1, 4))
    println("$pairs çift var")
}

// Complete the sockMerchant function below.
fun sockMerchant4(n: Int, ar: Array<Int>): Int {
    val socks = mutableMapOf<Int, Int>()

    for(number in ar) {
        if(socks.containsKey(number)) {
            socks[number] = socks[number]!! + 1
        } else {
            socks[number] = 1
        }
    }

    var pairs = 0
    for((key, value) in socks) {
        pairs += value / 2
    }

    println(socks)
    return pairs
}