package chapter03

/**
 *
 *类的成员
 *
 *属性的初始化
 *属性的初始化尽量在构造方法中完成
 *无法在构造方法中初始话化的，尝试降级为局部变量
 *var 用延迟初始化lateinit val用lazy
 *
 * Created by zhiwenyan on 2017/8/3.
 */
class X

class A {
    var b = 0
    init {
        this.b=b

    }
    constructor()
    //lateinit 延迟初始化
    lateinit var c: String
    lateinit var d: X
    // 声明一个延迟初始化的字符串
    // 声明一个延迟初始化的字符串
    private val mStr : String by lazy{
        "我是延迟初始化字符串变量"
    }

    val e: X by lazy {
        println("init X")
        X()
    }

}


fun main(args: Array<String>) {
    val a = A()
    println(a.e)
    a.d = X()
    println(a.d)
    println(a.c)

}