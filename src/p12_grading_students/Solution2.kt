package p12_grading_students

fun main() {

}

fun gradingStudents2(grades: Array<Int>) = grades.map {
    when {
        it < 38 -> it
        it % 5 == 4 -> it + 1
        it % 5 == 3 -> it + 2
        else -> it
    }
}.toTypedArray()

