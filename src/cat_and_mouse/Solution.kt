package cat_and_mouse

import kotlin.math.abs

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val a = abs(x - z)
    val b = abs(y - z)

    return when {
        a < b -> "Cat A"
        b < a -> "Cat B"
        else -> "Mouse C"
    }
}