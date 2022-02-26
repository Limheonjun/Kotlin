package org.example.interfaces

import org.example.classes.Course

/**
 * Interface
 * - 자바와 유사함
 * - 인터페이스는 abstract, non-abstract 메소드를 갖고 있음
 * - 상태를 가질 수 없음
 * - 인터페이스 내부에 추상메소드와 일반메소드를 정의할 수 있음
 * - 추상메소드는 구현을 하지 않으면 되고, 일반메소드는 구현하기만 하면 됨
 * - 하위 메소드에서 재정의하려면 override 키워드를 사용하기만 하면 됨
 * - 여러개의 인터페이스 구현 가능
 * - 여러개의 인터페이스 구현 시 함수명이 겹칠때는 "super<타입>.함수명" 과 같은 형식으로 사용가능
 * - 인터페이스에 변수를 추가할 경우에 하위 클래스에서는 해당 변수를 오버라이딩해야함
 * - 변수 오버라이딩 시 val을 var로 변경할 수도 있음
 */

data class Book(
    val id: Int,
    val name: String,
    val author: String
)

interface CourseRepository {
    val isCoursePersisted : Boolean
    fun getById(id: Int) : Book //abstract function
    fun save(book: Book) : Int {
        print("book : $book")
        return book.id
    }
}

interface Repository {
    fun getAll() : Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Book {
        return Book(id,"Reactive Programming in Modern Java using Project Reactor", "lim")
    }

    override fun save(book: Book): Int {
        isCoursePersisted = true
        return super.save(book)
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Book {
        return Book(id,"Reactive Programming in Modern Java using Project Reactor", "lim")
    }

    override fun save(book: Book): Int {
        println("book in NoSqlCourseRepository : ${book.id}")
        return book.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB: A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}



fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
    val bookId = sqlCourseRepository.save(Book(5, "Reactive Programming in Modern Java using Project Reactor", "lim"))

    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    println("saved Course Id is : $bookId")

    val noSlCourseRepository = NoSqlCourseRepository()
    val course2 = noSlCourseRepository.getById(1)
    println("Course is $course")
    noSlCourseRepository.save(Book(6, "Reactive Programming in Modern Java using Project Reactor", "lim"))

    val ab = AB()
    ab.doSomething()
}