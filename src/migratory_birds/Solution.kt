package migratory_birds

fun migratoryBirds(arr: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()

    for (id in arr) {
        map[id] = if (map.containsKey(id)) map[id]!! + 1 else 1
    }

    return map.toSortedMap().maxBy { it.value }!!.key
}