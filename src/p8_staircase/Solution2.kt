package p8_staircase

fun main() {
    staircase2(4)
}

fun staircase2(n: Int): Unit {
    for (line in 1..n) {
        println(" ".repeat(n - line) + "#".repeat(line))
    }
}