package org.example.classes

/**
 * enum
 */
enum class MyEnum {
    DEVELOPMENT,
    BUSIESS,
    DESIGN,
    MARKETING
}

data class EnumTest(
    val id : Int,
    val name : String,
    val enum : MyEnum = MyEnum.BUSIESS
)

fun main() {
    val test = EnumTest(1,"lim")
    println(test)
}