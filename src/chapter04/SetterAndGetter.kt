package chapter04

/**
 * Description:
 * Data：2019/4/12
 * Author: Steven
 */
class Book(val age: Int = 10) {
    var name: String = ""
    var author: String = ""
        get() = "123"
        set(value) {
            field = value
        }

}

class Test {

    /*
     * getter 和 setter是可选的
     */

    // 当用var修饰时，必须为属性赋默认值(特指基本数据类型，因为自定义的类型可以使用后期初始化属性，见后续) 即使在用getter()的情况下,不过这样写出来，不管我们怎么去改变其值，其值都为`123`
    var test1: String = ""
        get() = "123"
        set(value) {
            field = value
        }

    var age = 0
        get() = 10
        set(value) {
            field = value
        }

    // 用val修饰时，用getter()函数时，属性可以不赋默认值。但是不能有setter()函数。
    val test2: String
        get() = "123"       // 等价于：val test2 : String = "123"
}

fun main(args: Array<String>) {
    val book = Book()
    book.name
    book.author

}