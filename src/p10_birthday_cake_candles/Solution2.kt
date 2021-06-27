package p10_birthday_cake_candles

fun main() {
    val result = birthdayCakeCandles2(arrayOf(4, 4, 2, 1, 4))

    println(result)
}

fun birthdayCakeCandles2(candles: Array<Int>): Int {
    var tallest = candles.max()!!

    return candles.count { it == tallest }
}