package chapter03

/**
 * Description: 具名参数，变长参数
 * Data：24/12/2017
 * Author: Steven
 */
fun main(vararg args: String) {
    for (arg in args) {
        println(arg)
    }
    hello(1, 2, 3, 4, 5, str = "1")

}

fun hello(vararg ints: Int, str: String) {
    ints.forEach { println(it) }
    ints.forEach(::println)
    println(str)
}
