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
    hello(1, 2, 3, 4, 5, string = "1")

}

fun hello(vararg ints: Int, string: String) {
    ints.forEach(::println)
    println(string)
}
