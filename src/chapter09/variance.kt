package chapter09

/**
 * Description:什么是型变
 * 泛型实参的继承关系对泛型类型的影响
 * 协变：泛型类型与实参的继承关系相同
 * 逆变：泛型类型与实参的继承关系相反
 * 不变：泛型类型没有关系
 * Data：2018/9/24
 * Author: Steven
 */
//Out (协变)
//
//如果你的类是将泛型作为内部方法的返回，那么可以用 out：

interface Production<out T> {
    fun produce(): T
}

//可以称其为 production class/interface，因为其主要是产生（produce）指定泛型对象。因此，可以这样来记：produce = output = out。
//
//In(逆变)

//如果你的类是将泛型对象作为函数的参数，那么可以用 in：

interface Consumer<in T> {
    fun consume(item: T)
}
//Invariant(不变)
//
//如果既将泛型作为函数参数，又将泛型作为函数的输出，那就既不用 in 或 out。

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}

fun main(args: Array<String>) {
}