package org.example.classes

class Item3(
    //메인 생성자
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int = 0
    init {
        println("Inside Init Block")
        nameLength = name.length
    }

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
    val item = Item3(_email = "abc@gmail.com", _name = "lim", _age = 28)
    println("Name : ${item.name} and the age is ${item.age} and the email is ${item.email} and the namelength is ${item.nameLength}")
}