package org.example.collections

import org.example.dataset.Course
import org.example.dataset.CourseCategory
import org.example.dataset.KAFKA
import org.example.dataset.courseList
import java.util.function.BiPredicate

/**
 *  Collections Operations
 * - it키워드는 컬렉션 순회 시 각 원소에 접근하게 해주는 역할
 * - predicate는 (인풋타입) -> 아웃풋타입 으로 지정해주어야함
 * - exploreMap과 exploreFilter의 Filter가 다른 이유는 exploreMap에는 predicate을 그대로 넘겼고, exploreFilter에는 중괄호를 통해 람다를 직접 호출하는 형태이기 때문
 * - flatMap은 컬렉션이 다른 컬렉션을 갖고 있는 경우 사용
 */

fun main() {
//    val courseList = courseList()
//
//    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT}
//    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN}
//
//    val list = listOf(listOf(1,2,3), listOf(4,5,6))
//
//    val mapResult = list.map {
//        outerList -> outerList.map { it.toDouble() }
//    }
//    println("mapResult : $mapResult")
//
//    val flatMapResult = list.flatMap {
//            outerList -> outerList.map { it.toDouble() }
//    }
//    println("flatMapResult : $flatMapResult")
//
////    exploreFilter(courseList, desPredicate)
//
////    exploreMap(courseList, devPredicate)
//    val courses = exploreFlatMap(courseList, KAFKA)
//    println(courses)

    exploreHashMap()
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Dilip" to 33, "Scooby" to 5)
    nameAgeMutableMap
        .forEach { (k,v) ->
            println("Key : $k and the value is $v")
        }

    val value = nameAgeMutableMap.getOrElse("Dilip1"){"abc"}
    println("Value is $value")

    val result = nameAgeMutableMap.containsKey("abc")
    println("result is $result")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap is $filteredMap")

    val maxAge = nameAgeMutableMap
        .maxByOrNull { it.value }
    println("maxAge is $maxAge")

}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach{
            println(it)
        }
    println("courses : $courses")
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) } //위의 필터와 동일한 기능
        .forEach{
            println("devCourse : $it")
        }
}
