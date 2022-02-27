package org.example.collections

import org.example.dataset.Course
import org.example.dataset.CourseCategory
import org.example.dataset.courseList

/**
 *  Collections Sequence
 * - 일반적인 컬렉션 연산은 하나의 연산에서 모든 원소가 연산되고 그 다음에 또 모든 원소가 연산되는 형태였는데,
 *   sequence를 사용하게되면 모든 함수에서 하나의 원소가 모두 연산되고, 그 다음 원소가 모든 함수에서 연산되는 형태
 * - 마지막 종단연산(toList와 같은 것들)이 없으면 연산이 진행되지 않음(스트림과 유사해보임)
 */


fun main() {
    val namesListUsingSequence = listOf("alex", "ben", "chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()
    println("namesListUsingSequence : $namesListUsingSequence")
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT}

    exploreFilterUsingSequence(courseList(), devPredicate)

    val range = 1..1000_000_000

    range
        .asSequence()
        .map { it.toDouble() }
        .take(40) //앞에서부터 40까지만큼만 추출
        .forEach{
            println("Value is : $it")
        }
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList
        .asSequence()
        .filter { predicate.invoke(it) } //위의 필터와 동일한 기능
        .forEach{ //forEach역시 종단연산에 해당
            println("devCourse : $it")
        }
}