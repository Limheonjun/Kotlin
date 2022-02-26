package org.example.classes

import java.lang.IllegalArgumentException

/**
 * Getters And Setters
 * - 프로퍼티 아래에 get과 set을 정의하여 커스터마이징할 수 있음
 * - 이때 field라는 키워드를 사용하여 앞서 선언한 프로퍼티를 가리킬 수 있음
 */
class GSItem() {
    var name : String = ""
    var price : Double = 0.0
    get() {
        println("Inside Getter")
        return field //price아래에 있는 get이기 때문에 field는 price를 가리킴
    }
    set(value) {
        if(value >= 0.0) {
            println("Inside Setter")
            field = value
        } else {
            throw IllegalArgumentException("Negative Price is not Allowed")
        }
    }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = GSItem("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    println("Item name is ${item.name}")
    item.price = -10.0
    println(item.price)
}