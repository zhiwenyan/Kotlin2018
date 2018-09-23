package chapter05

/**
 * Description:map
 * Data：01/01/2018
 * Author: Steven
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)
    //list.map一一映射另外一个集合
    val newList = list.map {
        it * 2 + 3
    }
    newList.forEach(::println)
    val newList2 = list.map(Int::toDouble)
    newList2.forEach(::println)
    for (i in newList) {
        println(i)
    }

    //flatmap的使用
    val list1 = listOf(
            1..20,
            2..5,
            100..300
    )
    val flatList = list1.flatMap { it }
    flatList.forEach(::println)
    //reduce 求和的方法
    println(flatList.reduce { acc, i -> acc + i })
    (0..6).map(::factorial).forEach(::println)

}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}