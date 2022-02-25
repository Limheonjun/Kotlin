package org.example.basics

/**
 * 반복문과 범위
 * - 범위 추가 시 "시작..끝" 의 형태로 나타내면 자동으로 "시작<= .. <=끝" 의 형태로 변환된다
 */
fun main() {

    val range = 1..10
    for(i in range) {
        println("i : $i")
    }

    val reverseRange = 10 downTo 1
    for(i in reverseRange) {
        println("reverseRange : $i")
    }

    //천번째 단계에서 step만큼 skip하여 반복
    for(i in reverseRange step 2) {
        println("reverseRange With Skip : $i")
    }

}