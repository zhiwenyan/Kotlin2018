package chapter11

/**
 * Description: 扩展函数
 * Kotlin 可以对一个类的属性和方法进行扩展，且不需要继承或使用 Decorator 模式。
 * 扩展是一种静态行为，对被扩展的类代码本身不会造成任何影响。
 * 扩展函数可以在已有类中添加新的方法，不会对原类做修改，扩展函数定义形式：

fun receiverType.functionName(params){body}
receiverType：表示函数的接收者，也就是函数扩展的对象
functionName：扩展函数的名称
params：扩展函数的参数，可以为NULL

 * Data：2019/3/25
 * Author: Steven
 */
class User(var name: String)

fun User.Print() {
    println("用户名 $name")

}

fun MutableList<Int>.Swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp


}

fun main(args: Array<String>) {
    var user = User("Runoob")
    user.Print()

    val l = mutableListOf(1, 2, 3)
    // 位置 0 和 2 的值做了互换
    l.Swap(0, 2) // 'swap()' 函数内的 'this' 将指向 'l' 的值

    println(l.toString())



}