package p11_time_conversion

fun main() {

}

// 07:45:32PM
fun timeConversion(s: String): String {
    // 1. divide
    var hour = s.substring(0..1).toInt()
    var middle = s.substring(2..7)
    var amPm = s.substring(8..9)

    // 2. convert

    if (hour == 12 && amPm == "AM") {
        hour -= 12
    } else if (hour in 1..11 && amPm == "PM") {
        hour += 12
    }

    // 3. combine

    return if (hour < 10) {
        "0$hour$middle"
    } else {
        "$hour$middle"
    }
}
