package org.example.basics

fun main() {
    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1
    while(x < 5) {
        println("Value of x is : $x")
        x++
    }
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of x is : $i")
        i++
    }while(i < 5)
}