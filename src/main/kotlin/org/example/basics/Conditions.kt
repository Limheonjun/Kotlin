package org.example.basics

/**
 * if-else
 * 항상 반환값을 갖으며, 값이 없는 경우 Unit타입을 반환한다
 *
 * when
 * if-else에 비해 좀 더 명확한 표현을 제공, 나머지 기능은 동일
 */
fun main() {

    /** if-else */
    var name = "Alex"
    name = "Chloe"
    //코틀린에서 if-else블럭에서는 언제나 값을 반환
    val result = if(name.length == 4) {
        println("Name is Four Characters")
        name.length
    } else {
        println("Name is Not Four Characters")
        name.length
    }

    println("result : $result") //Unit타입은 코틀린에서 값이 없다는 걸 나타내는 타입

    //1 -> GOLD, 2 -> SILVER, 3 -> BRONZE
    var position = 2

    var medal = if(position == 1) {
        "GOLD"
    } else if(position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println(medal)

    //when
    var medal2 = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal2)

}