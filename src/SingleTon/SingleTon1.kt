package SingleTon

import java.util.concurrent.Executors

/**
 * Description:单例模式  饿汉式
 * Data：9/29/2018-4:10 PM
 * @author: yanzhiwen
 */
object SingleTon

class Person {
    var age = 0
}


fun main(args: Array<String>) {
    val s = SingleTon
    val s1 = SingleTon
    println(s1 == s)

    for (index in 1..10) {

    }
    for (index in 100 downTo 1) {

    }
    for (index in 1 until 10) {

    }

}