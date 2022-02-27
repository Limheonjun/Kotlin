package org.example.collections

/**
 * Lamda
 * - 람다함수의 선언은 { x: Int -> x*x } 와 같은 형태로 선언
 * - 람다의 타입은 (x: Int, y: Int) -> Int와 같이 지정할 수 있음
 * - 함수의 마지막 인자로 람다가 들어가면 람다를 함수의 인자에서 밖으로 뺄 수 있음
 */
fun main() {
    val addLamda = { x: Int -> x+x}

    val addResult = addLamda(3)
    println("addResult : $addResult")

    val multiplyLamda = { x: Int, y: Int ->
        println("x is $x and y is $y")
        x*y}

    val multiplyResult = multiplyLamda(2, 3)
    println("multiplyResult : $multiplyResult")

    val result = calculate(2, 3) { a, b -> a * b }
    println("Result is $result")

    val result2 = calculate(2, 3, { a, b -> a + b })
    println("Result is $result2")
}

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x,y)
}