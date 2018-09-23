package chapter05

/**
 * Description:  闭包：函数式编程的福音
 * 函数的运行环境
 * 持有函数运行状态
 * 函数内部定义函数
 * 函数内部也可以定义类
 * Data：07/01/2018
 * Author: Steven
 */
val String = "HelloWorld"

fun makeFun(): () -> Unit {
    var count = 0
    //fun() 匿名函数
    return fun() {
        println(++count)
    }
}

fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return fun(): Long {
        var result = second
        second += first
        first = second - first
        return result
    }
}

//fun fibonacci(): () -> Long {
//    var first = 0L
//    var second = 1L
//    return fun(): Long {
//        var result = second
//        second += first
//        first = second - first
//        return result
//    }
//}
//fun add(x: Int) = fun(y: Int) = x + y
fun add(x: Int): (Int) -> Int {
//    data class Person(val name: String, val age: Int)

    return fun(y: Int): Int {
        return x + y
    }
}

fun main(args: Array<String>) {
    val x = makeFun()
    x()
    x()
    println("---")
    val x1 = fibonacci()
    println(x1())
    println(x1())
    println(x1())
    println(x1())
    println(x1())
    println(x1())
    println(x1())
    var add5 = add(5)
    var add2 = add5(2)
    println(add2)
}