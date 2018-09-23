package chapter03

/**
 * Created by fumi_it1 on 2017/8/3.
 */
//函数  得函数者得天下
//args 参数类型
fun main(args: Array<String>) {
//    println("hello,${args[0]}")
    println(sum(1, 1))
    println(sum1(1, 1))
    println(xtoLong(1))
}

//函数的写法
fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}
fun sum1(arg1: Int, arg2: Int) = arg1 + arg2
//匿名函数  ????
val xtoLong = fun(x: Int): Long {
    return x.toLong()
}