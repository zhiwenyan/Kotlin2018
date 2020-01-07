package chapter14

/**
 * Description:
 * Data：2019/7/31
 * Author: Steven
 */
class User(var name: String)

/**扩展函数**/
fun User.Print() {
    print("用户名 $name")
}
fun isOdd(x: Int) = x % 2 != 0

fun main(arg: Array<String>) {
    var user = User("Runoob")
    user.Print()
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
}