package org.example.classes

/**
 * Secondary Constructor
 * - 가능한한 메인 생성자를 사용
 * - 서브 생성자를 필요로 하는 시점이 오면 사용
 */
class Item() {
    var name : String = ""

    constructor(_name: String): this() {
        name = _name
    }
}

class Item2(
    //메인 생성자
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    //서브 생성자
    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0
    ): this(_name, _age) {
        email = _email
    }
}

fun main() {
    val item = Item2(_email = "abc@gmail.com")
    println("Item name is ${item.name}")

    val item2 = Item2(_email = "abc@gmail.com", _name = "lim", _age = 28)
    println("Name : ${item2.name} and the age is ${item2.age} and the email is ${item2.email}")
}