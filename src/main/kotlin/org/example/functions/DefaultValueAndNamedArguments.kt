package org.example.functions

import java.time.LocalDate

/**
 * Default Value Parameters / Named Arguments
 * - 함수의 파라미터에 기본값 지정 가능
 * - 파라미터의 변수명을 명시적으로 지정하여 선언도 가능하며 이에따라 파라미터의 순서를 변경할 수도 있음
 */
fun main() {
    printPersonDetails("lim", "abc@gmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("lim")
    printPersonDetails(name = "lim", dob = LocalDate.parse("2000-01-01"))
    printPersonDetails(dob = LocalDate.parse("2000-01-01"), name = "lim", email = "abc@gmail.com")
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and the dob is $dob")
}