package p10_birthday_cake_candles

fun main() {
    val result = birthdayCakeCandles3(arrayOf(4, 4, 2, 1, 4))

    println(result)
}

fun birthdayCakeCandles3(candles: Array<Int>): Int {
    var tallest = 0
    var counter = 0

    for(candle in candles) {
        if(candle > tallest) {
            tallest = candle
            counter = 0
        }

        if(candle == tallest) counter += 1
    }

    return counter
}