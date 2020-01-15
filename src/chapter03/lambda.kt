package chapter03

/**
 * Created by zhiwenyan on 2017/8/3.
 */
//Lambda 表达式其实是匿名函数
// 写法{[参数列表]->[函数体，最后一行是返回值]}
fun main(args: Array<String>) {
    println(add(1, 2))
    sum(11, 1)
    sum(1,1)
    add(1, 1)
    printHello
    sum3(1,1)

    args.forEach { it ->
        print(it)
    }
    args.forEach { print(it) }

    args.forEach(::print)
}

//显示类型声明
val sum1: (Int, Int) -> Int = {  arg1, arg2 -> arg1 + arg2 }

val action: () -> Unit = { println(42) }

val action1 = { println(42) }

val sum3 ={ arg1: Int, arg2: Int -> arg1 + arg2 }

val add = { arg1: Int, arg2: Int ->
    println("$arg1+$arg2=${arg1 + arg2}")
    arg1 + arg2
}
val add1: (arg1: Int, arg2: Int) -> Int = { arg1, arg2 ->
    print("")
    arg1 + arg2
}
val printHello = { print("Hello") }

fun test() {

}
// lambda lambda表达式作为函数中的参数的时候
fun test(a : Int , b : (num1 : Int , num2 : Int) -> Int) : Int{
    return a + b.invoke(3,5)
}

val test2 = {}
