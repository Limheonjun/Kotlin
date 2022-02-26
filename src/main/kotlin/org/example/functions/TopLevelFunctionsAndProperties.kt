package org.example.functions

/**
 * Top Level Functions / Top Level Properties
 * - T.L.F와 T.L.P는 다른 코틀린파일에서 import하여 사용 가능
 */
fun main() {
    val num = topLevelFunction()
    println("Num is : $num")

    println(courseName)
}

const val courseName = "Kotlin Programing"

fun topLevelFunction(): Int {
    return (0..100).random()
}
