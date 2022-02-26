package org.example.classes

/**
 * Inheritance
 * - 코틀린에서도 상속을 지원
 * - 코틀린의 Any클래스를 모든 코틀린 객체의 상위 클래스이며, 자바의 Object클래스에 해당
 * - 모든 클래스는 final => 기본적으로 클래스의 확장은 허용되지 않음
 * - open 키워드가 사용되었을때 상속이 허용됨
 * - 단 하나의 클래스만 상속 가능
 *
 * Overriding Functions
 * - 함수의 오버라이딩을 위해선 open 키워드를 붙여야함
 * - 하위 클래스에서 상위 클래스의 함수를 오버라이딩 하기 위해선 override키워드를 붙여야함
 *
 * Overriding Variables
 * - 변수의 오버라이딩을 위해서는 마찬가지로 open키워드를 붙이고 하위 클래스에선 override 키워드를 붙여야함
 * => 변수의 오버라이딩은 어떨때 사용하는지?
 */
open class User(val name : String) {
    open var isLoggedIn : Boolean = false

    open fun login() {
        println("Inside user Login")
    }

}

open class abc

class Student(name : String) : User(name) {
    override var isLoggedIn : Boolean = false
    override fun login() {
        println("Inside Student Login")
        super.login()
    }

}
class Instructor(name : String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is : ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")

    val instructor = Instructor("lim")
    println("name is : ${instructor.name}")
    instructor.login()
}