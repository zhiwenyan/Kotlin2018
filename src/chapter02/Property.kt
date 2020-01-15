package chapter02

/**
 * Description:
 * Data：1/24/2019-1:42 PM
 * @author: yanzhiwen
 */

class Person() {
    val age: Int
    val id: Long = 0
    val s: String

    init {
        age = 0
        s = "ss"
    }
}

fun main(args: Array<String>) {
    val person=Person()
    println(person.age)
    val a:Int
    a=1
}