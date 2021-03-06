package chapter03

/**
 * Created by zhiwenyan on 2017/8/3.
 *
 */

class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    operator fun plus(other: Any): Int {
        return real.toInt()
    }

    operator fun invoke(): Double {
        return Math.hypot(real, imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(point: Point) = Point(x + point.x, y + point.y)

fun main(args: Array<String>) {
    val c1 = Complex(1.1, 2.0)
    val c2 = Complex(1.2, 2.2)
    println(c1 + c2)
    val a = 1
    a.plus(2)
    val first = Point(1, 2)
    val second = Point(2, 2)
    print(first + second)
}