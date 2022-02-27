package org.example.collections

/**
 * Collections Nullability
 */

fun main() {
    collections_nullability()
}

fun collections_nullability() {
    var list : MutableList<String>? = null

    list = mutableListOf()
    list.add("Dilip")
    list?.forEach {
        println("Value is : $it")
    }

    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach {

        println("Value Length is : ${it?.length}")
    }
}