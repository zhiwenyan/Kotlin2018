package chapter04

/**
 * Description: 数据类
 * 再见 JavaBean
 * 默认实现的copy，toString()方法
 * componentN方法
 * allOpen和noArg插件
 *
 * Data：01/01/2018
 * Author: Steven
 */
data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.component1())
    println(china.component2())
    val(id,name)=china
    println(id)
    println(name)
}