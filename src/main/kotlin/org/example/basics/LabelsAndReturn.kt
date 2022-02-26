package org.example.basics

fun main() {
    for(i in 1..5) {
        println("i in $i")
        if(i == 3) break
    }

    label()

    for(i in 1..5) {
        println("i in $i")
        if(i == 3) return //return을 사용하게 되면 함수(여기선 main) 자체가 종료되어버림
    }

    println("End of the Program!")
}

fun label() {
    loop@ for(i in 1..5) {
        println("i in label $i")
//        if(i == 3) break@loop
        innerLoop@ for(j in 1..5) {
            println("j in label $j")
//            if(j == 2) break@innerLoop
            if(j == 2) continue@loop
        }
    }
}