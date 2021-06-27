package electronic_shops

fun main() {

}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var max = 0
    for (keyboard in keyboards) {
        for (drive in drives) {
            val sum = drive + keyboard
            if (sum in max..b) {
                max = sum
            }
        }
    }

    return max
}