package chapter04

/**
 * Description: 枚举
 * 实例可数的类 ，注意枚举也是类
 * 可以修改构造，添加成员
 * 可以提升代码的表现力
 *
 * Data：01/01/2018
 * Author: Steven
 */
enum class LogLevel(val id: Int) {
    VERBOSE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4), ASSERT(5);

    fun getTag(): String {
        return "$id, $name"
    }

    override fun toString(): String {
        return "$name, $ordinal"
    }
}

fun main(args: Array<String>) {
    println(LogLevel.DEBUG.ordinal)
    LogLevel.values().map(::println)

    println(LogLevel.valueOf("ERROR"))
}

class LogLevel2 protected constructor() {
    companion object {
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
        val INFO = LogLevel2()
        val WARN = LogLevel2()
        val ERROR = LogLevel2()
        val ASSERT = LogLevel2()
    }
}