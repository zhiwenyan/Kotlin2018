package chapter05

import java.util.concurrent.locks.Lock


/**
 * Description:map
 * Data：01/01/2018
 * Author: Steven
 */
data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working!")
    }
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)
    //list.map一一映射另外一个集合
    val newList = list.map {
        it * 2 + 3
    }
    args.run { }

    newList.forEach(::println)


    val newList2 = list.map(Int::toDouble)
    newList2.forEach(::println)

    for (i in newList) {
        println(i)
    }
    println("**************flatMap********************")
    //flatMap
    val list2 = listOf(
            1..20,
            2..10
    )
    val flatList = list2.flatMap { it }
    flatList.forEach(::println)
    println("**************reduce********************")

    println(factorial(6))

    println("************filter**********************")

    (0..6).map(::factorial).filter {
        it % 2 == 1
    }

    println("***********let*************************")

    val person = findPerson()
    println("***********age*************************")

    println(person?.age)
    println("***********name*************************")
    println(person?.name)


//
    //let扩展函数的实际上是一个作用域函数，当你需要去定义一个变量在一个特定的作用域范围内，let函数的是一个不错的选择；
    // let函数另一个作用就是可以避免写一些判断null  的操作。
    findPerson()?.let { (name, age) ->
        println(name)
        println(age)

    }
    findPerson()?.let { it ->
        it.work()
        println(it.age)
    }
    //apply
    findPerson()?.apply {
        work()
        println(age)
    }
    findPerson()?.run {

    }
    findPerson()?.also { it ->
        print(it.age)
    }
    run {

    }

//    with(findPerson()) {
//        work()
//        println(age)
//    }

}

fun findPerson(): Person? {
    return null
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}

//在Kotlin中，高阶函数即指：将函数用作一个函数的参数或者返回值的函数。
fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

private fun resultByOpt(num1: Int, num2: Int, result: (Int, Int) -> Int): Int {
    return result(num1, num2)
}

private fun testDemo() {
    val result1 = resultByOpt(1, 2) { num1, num2 ->
        num1 + num2
    }

    val result2 = resultByOpt(3, 4) { num1, num2 ->
        num1 - num2
    }

    val result3 = resultByOpt(5, 6) { num1, num2 ->
        num1 * num2
    }

    val result4 = resultByOpt(6, 3) { num1, num2 ->
        num1 / num2
    }

    println("result1 = $result1")
    println("result2 = $result2")
    println("result3 = $result3")
    println("result4 = $result4")
}

