package org.example.classes

/**
 * Visibility Modifiers
 * - public, protected, private, internal 총 4가지 가시성 제어자가 존재
 * - public : 기본 접근 제어자, 어디서나 접근 가능
 * - private : 동일 클래스 내에서만 접근 가능
 * - protected : 동일 클래스와 하위 클래스에서만 접근 가능
 * - internal : Gradle이나 Maven에 의해 퍼블리싱 된 모듈에 대해서만 private, 즉 라이브러리의 경우 접근 가능한건 해당 라이브러리 내부에서만 접근 가능
 * - 상위 클래스를 상속한 경우 접근 제어자를 확장시킬 수 있음
 */

open class Modifier(val name : String) {
    private fun secret() {
        println("Only invoke in class")
    }

    protected fun logout() {
        println("Only invoke in class and subclass")
    }
}

fun main() {
    val modifier = Modifier("lim")
}