package org.example.classes

/**
 * Companion Object
 * - 코틀린은 static 키워드를 지원하지 않음
 * - companion object 키워드는 함수에 static 키워드를 사용한 것과 같음
 * - 클래스명.함수명으로 바로 접근 가능
 */
class Man(name : String) {
    var isLoggedIn : Boolean = false

    companion object {
        const val numOfEnrolledCourses = 10
        fun country() = "USA"
    }

    fun login() {
        println("Inside Student Login")
    }

}

fun main() {
    val country = Man.country()
    println("Country is : $country")
    println("numOfEnrolledCourses is : ${Man.numOfEnrolledCourses}")
}