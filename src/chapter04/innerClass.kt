package chapter04

/**
 * Description: 内部类
 * 定义在内部的类
 * 默认的是静态的内部类
 * 非静态的内部类inner关键字
 *
 *
 * 匿名内部类
 * 没有定义名字的内部类
 * 类名编译时生成，类似Outter$1.class
 * 可继承父类，实现多个接口，与java注意区别
 *
 * Data：01/01/2018
 * Author: Steven
 */
open class Outter {
    val a: Int = 0

    //静态内部类
    class innerClass1 {

    }

    //非静态内部类
    inner class innerClass {
        val a: Int = 5
        fun Hello() {
            //访问内部a
            println(a)
            //访问外部a
            println(this@Outter.a)
        }
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val inner = Outter().innerClass()
    inner.Hello()
    val clz=Outter.innerClass1()
    val view = View()
    //匿名内部类
    view.onClickListener = object : OnClickListener {
        override fun onClick() {

        }
    }
    //可以继承
    view.onClickListener = object : Outter(), OnClickListener {
        override fun onClick() {

        }
    }
}