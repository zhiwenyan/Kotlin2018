package chapter09

/**
 * Description: 泛型
 * Data：2018/9/24
 * Author: Steven
 */
fun main(args: Array<String>) {
    val max = max(1, 2)
    println(max)
    val complex = Complex(1.0, 2.0)
    println(complex)
    testGenerics<String>()
}

//方法泛型
fun <T : Comparable<T>> max(a: T, b: T): T {
    return if (a < b) b else a

}

fun <T> min(a: T): T {
    return a
}

//类泛型
//T : Number 泛型边界
data class Complex<T : Number>(val a: T, val b: T) {
    override fun toString(): String {
        return "($a+$b i)"
    }
}

//
inline fun <reified T> testGenerics() {
    println(T::class.java)
}
