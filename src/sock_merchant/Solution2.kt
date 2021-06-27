package sock_merchant

fun main() {

}

// Complete the sockMerchant function below.
fun sockMerchant2(n: Int, ar: Array<Int>): Int {
    return ar.groupBy { it }.values.sumBy { it.size / 2 }
}