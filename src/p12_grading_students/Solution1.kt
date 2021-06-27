package p12_grading_students

fun main() {

}

fun gradingStudents(grades: Array<Int>) : Array<Int> {
    for((i, grade) in grades.withIndex()) {
        if(grade >= 38 && (grade % 5 == 3 || grade % 5 == 4)) {
            grades[i] += 5 - grade % 5
        }
    }

    return grades
}
