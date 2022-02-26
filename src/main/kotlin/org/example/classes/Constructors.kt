package org.example.classes

/**
 * Constructors
 * - 코틀린에서는 게터나 세터 없이 바로 생성자 메소드의 인자에 접근 가능
 */
class Person(
    val name : String = "",
    val age : Int = 0
    ) {

    fun action() {
        println("Person Walks")
    }

}

fun main() {
    val person = Person("Alex", 25)
    println("Name : ${person.name} and the age is ${person.age}")

    val person2 = Person()
    println("Name : ${person2.name} and the age is ${person2.age}")
}