package org.example.scopefunctions

import org.example.classes.Course
import org.example.dataset.CourseCategory

/**
 * Scope Functions
 * - 오브젝트 컨텍스트 내에서 코드 블럭을 실행할 때 사용되는 함수
 * - let, run, with, apply, also가 존재
 * - also : 오브젝트가 만들어진 다음 실행될 사이드 이펙트(실행될 코드)가 존재할때 사용
 * - let : 오브젝트에 대한 연산 후 반환값이 존재할때 사용
 * - run : with와 동일하지만 let처럼 사용됨. 오브젝트의 초기화와 연산 후 리턴값이 있을 때 사용, 오브젝트 없이 단독으로도 사용 가능
 */

fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Run Result is : $result")

    val length = run {
        val name = "Dilip"
        println(name)
        name.length
    }
    println("Runn length is : $length")
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers) {
//        println("Size is ${numbers.size}")
//        val list = numbers.plus(6) //컬렉션 원소 추가(add함수와 같은 역할), 반환값은 원소가 추가된 컬렉션
//        list.sum()
        println("Size is $size")
        sum()
    }

    println("With Result is : $result")
}



fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map{ it*2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println(result)

    var name : String? = null
    name = "Dilip"
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }
    println(result1)
}

fun exploreApply() {
    val course = Course(1,"Design Thinking in Kotlin", "lim")
        .apply {
            courseCateogry = CourseCategory.DESIGN
//            this.courseCateogry = CourseCategory.DESIGN
        }

    println("course : $course")
}

fun exploreAlso() {
    val course = Course(1,"Design Thinking in Kotlin", "lim")
        .apply {
            courseCateogry = CourseCategory.DESIGN
//            this.courseCateogry = CourseCategory.DESIGN
        }
        .also {
            println("Course is $it")
        }

}