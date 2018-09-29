package SingleTon

/**
 * Description:单例模式  饿汉式
 * Data：9/29/2018-4:10 PM
 * @author: yanzhiwen
 */
object  SingleTon

fun main(args: Array<String>) {
    val  s=SingleTon
    val  s1=SingleTon
    println(s1==s)
}