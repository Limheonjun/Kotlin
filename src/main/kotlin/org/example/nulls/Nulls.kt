package org.example.nulls


/**
 * Null
 * - Nullable과 Non-Nullable 타입으로
 * - Nullable 타입
 *  > 널값이 될 수 있는 변수
 *  > val nameNullable : String ? = null 과 같이 타입 뒤에 '?'를 붙여줌
 * - Non-Nullable 타입
 *  > 절대 null이 할당될 수 없는 변수
 *  > val nameNonNull : String = "lim" 또는 val nameNonNull = "lim" 과 같이 사용
 * - nullable타입의 경우 null이 아닌경우 프로퍼티에 접근하기 위해선 '?'를 붙여주고 접근할 프로퍼티를 선언
 * - nullable타입의 데이터가 null일 경우 기본값을 지정해주기 위해선 데이터 뒤에 '?:' 를 붙여야함(elvis operator)
 * - 절대 null이 안오도록 assertion이 가능, '!!'를 사용, 절대 null이 되면 안된다는 말(not null assertions)
 * - as뒤에 '?'를 붙여서 as 뒤의 타입으로 캐스팅 할 수 있으면 해당 구문을 실행하도록 설정(safe operator)
 * - non-null 파라미터를 받는 함수에 null값을 반환하는 경우 npe발생
 * - 그래서 nullable타입에 safe operator를 붙이고 run메소드를 사용하여 null이 아닌 경우 실행될 구문 설정
 */

data class Movie(
    val id : Int?,
    val name : String
)

fun printName(name: String) {
    println("Name is $name")
}

fun printName2(name: String?){
    println("Name is : $name")
}

fun main() {
    var nameNullable : String? = null

//    printName(nameNullable!!)
    nameNullable?.run {
        printName(this)
    }
    println("Value is : ${nameNullable?.length}") //safe operator
//    nameNullable = "lim"
    val length = nameNullable?.length ?: 0
    println("length : $length")


//    if(nameNullable != null) {
//        println("Value is : ${nameNullable.length}")
//    }

    nameNullable = "lim"
    println("Value is : $nameNullable")

    var name : String = "lim"
    printName2(name)

    val movie = Movie(null, "Tree")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non-null assertions
    println("Saved Movie : $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
//    return movie
}

