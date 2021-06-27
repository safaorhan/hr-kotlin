package p10_birthday_cake_candles

fun main() {
    val result = birthdayCakeCandles(arrayOf(4, 4, 2, 1))

    println(result)
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var tallest = 0
    for(candle in candles) {
        if(candle > tallest) tallest = candle
    }

    var counter = 0
    for(candle in candles) {
        if(candle == tallest) counter += 1
    }

    return counter
}