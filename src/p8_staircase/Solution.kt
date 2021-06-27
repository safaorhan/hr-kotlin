package p8_staircase

fun main() {
    staircase(5)
}

fun staircase(n: Int): Unit {
    for (line in 1..n) {

        for(i in 1..n - line) {
            print(" ")
        }

        for(i in 1..line) {
            print("#")
        }

        println()
    }
}