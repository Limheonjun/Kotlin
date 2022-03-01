package org.example.exceptions

import java.lang.Exception
import java.lang.RuntimeException

/**
 * Exceptions
 * - Nothing타입은 절대 값을 리턴하는게 아니라 항상 예외만을 리턴하는걸 나타냄
 */

fun main() {
    println("Name Length is ${nameLength("Dilip")}")
    println("Name Length is ${nameLength(null)}")
    returnNoting()
}

fun returnNoting(): Nothing {
    throw RuntimeException()
}

fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    }catch (ex: Exception) {
        println("Exception is : $ex")
        null
    }
    return result
}
