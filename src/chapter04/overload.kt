package chapter04

/**
 * Description: 方法重载与默认参数
 * 方法重载：Overloads
 * 名称相同，参数不同的方法
 * jvm函数签名的概念：函数名：参数列表
 * 跟返回值没有关系
 *
 * 默认参数
 * 为函数参数设定一个默认值
 * 可以为任意位置的参数设置默认值
 * 函数调用产生混淆时用具名参数

 * Data：31/12/2017
 * Author: Steven
 */
class Overloads {
    //方法重载
    @JvmOverloads
    fun a(int: Int = 0): Int {
        return int
    }
}

fun main(args: Array<String>) {
    val overloads = Overloads()
    overloads.a()
    println(overloads.a())
    val integerList = ArrayList<Int>()
    integerList.add(13)
    integerList.add(2)
    integerList.add(3)
    integerList.add(23)
    integerList.add(5)
    integerList.add(15)
    integerList.add(50)
    integerList.add(500)
    println(integerList)
    integerList.removeAt(1)
    integerList.remove(5)
    println(integerList)
}