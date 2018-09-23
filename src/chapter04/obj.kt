package chapter04

/**
 * Description: 类的鼻祖 Objects 单例
 * 1、只有一个实例的类
 * 2、不能自定义构造方法
 * 3、可以实现接口，继承负类
 * 4、本质上就是单例模式最基本的实现
 * Data：31/12/2017
 * Author: Steven
 */
class Driver

interface OnExternalDriverMountListener {
    fun onMount(driver: Driver)

    fun onUnmount(driver: Driver)
}

abstract class Player

object MusicPlayer : Player(), OnExternalDriverMountListener {
    override fun onMount(driver: Driver) {
    }

    override fun onUnmount(driver: Driver) {
    }
}


val state: Int = 0
fun play(url: String) {

}

fun stop() {

}

fun main(args: Array<String>) {
    val m1 = MusicPlayer
    val m2 = MusicPlayer
    println(m1 == m2)

}