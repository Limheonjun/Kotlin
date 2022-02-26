package org.example.functions

/**
 * 함수
 * - fun 함수명(파라미터명: 타입): 반환타입 {} 의 형식
 * - 간단하게 반환타입 뒤에 등호를 붙이고 반환값을 선언해줄 수도 있음(addition1)
 * - 코틀린의 Unit타입은 자바의 void타입과 동일 => 아무것도 반환하지 않는다
 */
fun main() {
    printName("lim")
    val result = addition(1, 2)
    println("Result is $result")

    val result1 = addition1(1,2)
    println("Result is $result1")
}

fun addition(x: Int, y: Int): Int {
    return x+y
}

fun addition1(x: Int, y: Int) = x+y

fun printName(name: String) {
    println("Name is $name")
}
