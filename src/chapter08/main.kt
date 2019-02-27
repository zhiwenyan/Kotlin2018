package chapter08

/**
 * Description: 反射
 * Data：2018/12/8
 * Author: Steven
 */
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val clz = Person::class.java
    val kclz=Person::class
    val person = Person("steven", 22)
    val clz2 = person.javaClass
    println(person.age)
    //构造器
    val person2 = clz2.getConstructor(String::class.java, Int::class.java)
            .newInstance("sss", 20)
    println(person2)
    //属性 成员变量
    val name = clz2.getDeclaredField("name")
            .apply { isAccessible = true }
            .get(person2)
    println(name)

    val name2=clz2.getDeclaredField("name")
            .apply { isAccessible=true }
            .set(person,"Andy")
    println(name2)

    clz2.getDeclaredMethod("getName")
            .invoke(person2)
}