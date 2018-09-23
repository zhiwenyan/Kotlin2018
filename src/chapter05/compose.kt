package chapter05

/**
 * Description: 函数复合 f(g(x))
 *
 * Data：07/01/2018
 * Author: Steven
 */
//f(g(x)) m(x)=f(g(x))
var add5 = { i: Int -> i + 5 }
var multipyBy2 = { i: Int -> i * 2 }

fun main(args: Array<String>) {
//    println(multipyBy2(add5(8)))
    val add5AndmultipyBy2 = add5 compose multipyBy2
    println(add5AndmultipyBy2(8))
}

/**
 * 复合函数
 * P1,P2 作为参数 R作为返回值
 *
 * infix 中缀表达式
 */

infix fun <P1, P2, R> Function1<P1, P2>.addThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}