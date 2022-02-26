package org.example.classes

/**
 * Data Class
 * - 데이터를 갖고 있는 클래스들은 data class의 분류에 들어감
 * - 여기에 속한 것들에는 DTO, 도메인클래스, VO 등
 * - 자바에서는 자바빈 또한 이 클래스에 해당
 * - 데이터클래스 앞에는 data 키워드를 붙임
 * - 데이터 클래스는 파라미터를 갖는 최소 한개 이상의 메인 생성자가 존재해야함
 * - 데이터 클래스 출력 시에는 내부에 담긴 데이터가 보기 좋게 출력, 일반 클래스의 경우 객체의 아이디를 출력
 * - data클래스는 hashcode와 equals를 통해 동일성을 비교할 수 있음
 * - 데이터 클래스는 데이터 컨테이너로써 사용됨
 * - copy함수를 통해 데이터를 쉽게 복제할 수 있음
 */
data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(1,"Reactive Programming in Modern Java using Project Reactor", "lim")
    println(course)

    val course2 = Course(1,"Reactive Programming in Modern Java using Project Reactor", "lim")
    println("Chekcing Object Equality : ${course == course2}")

    //오브젝트 복사 시 변경을 원하는 데이터만 바꿀 수 있음
    val course3 = course2.copy(id = 3, author = "lim")
    println(course3)
}