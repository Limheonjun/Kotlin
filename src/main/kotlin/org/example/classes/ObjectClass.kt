package org.example.classes

/**
 * Object keyword
 * - 클래스와 인스턴스를 동시에 생성하게 해주는 키워드
 * - 자바의 싱클톤 패턴과 동일
 * - 인스턴스의 생성 없이 "클래스명.메서드명" 으로 사용 가능
 */

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User authenticate for userName : $userName")
    }
}

fun main() {
    Authenticate.authenticate("lim", "abc")
}