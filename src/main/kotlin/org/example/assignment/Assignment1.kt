package org.example.assignment

data class Employee(
    val id: Int,
    val name: String
)

fun main() {
    val employee1 = Employee(1,"lim")
    println(employee1)

    val employee2 = Employee(1,"lim")
    val employee3 = employee1.copy(name = "kim")

    println("employee1 and employee2 is Same ? : ${employee1 == employee2}")
}