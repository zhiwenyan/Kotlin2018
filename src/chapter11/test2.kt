package chapter11

import chapter14.Print
import chapter14.User

/**
 * Description:
 * Data：2019/3/25
 * Author: Steven
 */
data class Person(var name: String)

fun main(args: Array<String>) {
    val person = Person("sss")
    println(person)
    println(person.name.hashCode())
    println(person.hashCode())
    val user = User("ss")
    user.Print()

}