package chapter04.extend

/**
 * Description:继承
 * 默认的类、方法都是final的，要继承或者重写加open关键字
 * Data：24/12/2017
 * Author: Steven
 */
abstract class Person(open val age: Int) {
    abstract fun work()
}

class MaNong(age: Int) : Person(age) {

    override val age: Int
        get() = 0

    override fun work() {
        println("我是码农，我在写代码")
    }
}

class Doctor(age: Int) : Person(age) {
    override fun work() {
        println("我是医生，我在给病人看病")
    }
}

fun main(args: Array<String>) {
    val person: Person = MaNong(23)
    person.work()
    println(person.age)

    val person2: Person = Doctor(24)
    person2.work()
    println(person2.age)
}