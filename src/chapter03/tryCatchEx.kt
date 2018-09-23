package chapter03

/**
 * Description:捕获异常
 * Data：24/12/2017
 * Author: Steven
 */
fun main(args: Array<String>) {
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        0
    }
    try {
        val arg1 = args[0].toInt() //1
        val arg2 = args[1].toInt() //2a
        println("$arg1 + $arg2 = ${sum(arg1, arg2)}")
    } catch (e: NumberFormatException) {
        println("您确定输入的是整数吗？")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("您确定输入的是两个整数吗？")
    } catch (e: Exception) {
        println("程序出现了未知异常，可能是您的人品太差了。${e.message}")
    } finally {
        println("谢谢您使用我们的加法计算器")
    }

    fun sum(arg1: Int, arg2: Int): Int {
        return arg1 + arg2
    }
}