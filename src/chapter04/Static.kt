package chapter04

/**
 * Description: 伴生对象与静态对象
 * 1、每个类可以对应一个伴生对象
 * 2、伴生对象的成员全局独一份
 * 3、伴生对象成员类似Java的静态成员
 *
 * 静态成员考虑用包级函数，变量替代
 * @JvmFiled和JvmStatic的使用
 *
 * Data：31/12/2017
 * Author: Steven
 */
fun main(args: Array<String>) {
    println(Latitude.ofDouble(2.0).value)
    val l1 = Latitude.ofDouble(2.0)
    println(Latitude.ofLatitude(l1).value)
    println(Latitude.TAG)
}

class Latitude private constructor(val value: Double) {
    //类的伴生对象
    companion object {
        @JvmStatic
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }
        @JvmField
        //定义一个静态变量
        val TAG: String = "Latitude"
    }
}