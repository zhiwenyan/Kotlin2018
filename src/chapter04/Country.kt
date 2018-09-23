package chapter04

/**
 * Description: 数据类？？？
 * Data：01/01/2018
 * Author: Steven
 */
data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.component1())
    println(china.component2())
}