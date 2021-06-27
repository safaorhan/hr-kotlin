package counting_valleys

fun main() {

}

fun countingValleys(steps: Int, path: String): Int {
    var level = 0
    var previousLevel = 0
    var valleys = 0

    for(i in 0 until steps) {
        level += if (path[i] == 'U') 1 else -1

        if(level == 0 && previousLevel < level) {
            valleys++
        }

        previousLevel = level
    }

    return valleys
}
