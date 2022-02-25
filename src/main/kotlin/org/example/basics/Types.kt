package org.example.basics

/**
 * 코틀린에선 기본형과 래퍼타입의 구분이 없음
 * 모든 코틀린의 숫자들은 대포 타입으로 나타낼 수 있음
 * Integer 타입 - Byte, Short, Int, Long
 * Floating-Point 타입 - Float, Double
 * Character Type - Char
 * Boolean Type - Boolean
 */
fun main() {

    //타입
    val salary = 30000L //타입을 명시해주지 않아도 추론
    println(salary)

    //문자열 내부에 상수 사용
    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}") //문자열 안에 $, ${}를 사용하여 바로 변수를 사용할 수 있음

    //멀티라인 스트링
    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent() //자바스크립트의 템플릿 리터럴과 비슷, trimIndent함수를 제거하면 들여쓰기 도 다 포함되어 출력
    println(multiLine1)
}