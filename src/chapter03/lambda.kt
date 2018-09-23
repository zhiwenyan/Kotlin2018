package chapter03

/**
 * Created by zhiwenyan on 2017/8/3.
 */
//Lambda 表达式其实是匿名函数
// 写法{[参数列表]->[函数体，最后一行是返回值]}
fun main(args: Array<String>) {
    println(add(1, 2))
    sum(11, 1)
    printHello
}

val sum = { arg1: Int, arg2: Int -> arg1 + arg2 }

val add = { arg1: Int, arg2: Int ->
    println("$arg1+$arg2=${arg1 + arg2}")
    arg1 + arg2
}
val printHello = { print("Hello") }