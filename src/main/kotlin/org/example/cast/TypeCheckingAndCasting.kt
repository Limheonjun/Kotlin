package org.example.cast

/**
 * Type Checking And Casting
 * - is : 특정 타입인지 체크할 수 있음(자바의 instance of와 유사)
 * - as : 특정 타입으로 캐스팅 시킴, 예외 발새애 시 ClassCastException발생
 */

data class Meal(val type : String)

fun main() {
    var meal = Meal("dinner")
    checkType(meal)
    checkType("WOW")

    castNumber(1.0)
//    castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}

fun castNumber(any: Any) {
    when(any) {
        any as Double -> println("Value is Double ")

    }
}

fun checkType(type: Any) {

    when(type) {
        is Meal -> {
            //val meal = type as Meal //smart casting을 해주기 때문에 이와 같이 타입 단언은 필요가 없음
            println(type.copy())
        }
        is String -> {
            print(type.lowercase()) //smart casting : 타입이 한번 결정되면 따로 캐스팅할 필요 없이 바로 프로퍼티에 접근 가능
        }
    }
}
