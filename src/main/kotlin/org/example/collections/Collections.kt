package org.example.collections

/**
 * Collections
 * - 자바의 컬렉션을 재사용
 * - Mutable 컬렉션과 Immutable 컬렉션으로 나뉘어 있음
 * - Immutable Collection
 *  > 한번 생성되면 변경되지 않음
 *  > listOf("1", "2")와 같은 팩토리 함수를 사용할 수 있음(hashMapOf, setOf)
 * - Mutable Collection
 *  > 컬렉션 내부의 데이터 수정이 허용됨
 *  > mutableListOf("1", "2")와 같이 팩토리 함수를 사용할 수 있음(mutableMapOf, mutableSetOf)
 * - 컬렉션 생성 시 코틀린이 타입 추론을 해주기 때문에 타입을 굳이 넣지 않아도 됨
 * - map 사용시 to 연산자를 사용하여 키와 벨류를 저장
 */

fun main() {
    val names = listOf("Alex", "Ben", "Chloe")
    println("Names : $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("NamesMutableList : $namesMutableList")
    namesMutableList.add("Adam")
    println("NamesMutableList after : $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("set : $set")

    val mutableSet = mutableSetOf("Alex", "Ben", "Chloe")
    println("mutableSet : $mutableSet")
    mutableSet.add("Adam")
    println("mutableSet after : $mutableSet")

    val nameAgeMap = mapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMap : $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMutableMap : $nameAgeMutableMap")
    nameAgeMutableMap["abc"] = 100
    println("nameAgeMutableMap after : $nameAgeMutableMap")
}

/**
 * Lamda Expression
 */