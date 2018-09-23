package chapter05

/**
 * Description:高阶函数的基本概念
 * 高阶函数f(g(x)):函数作为参数或者返回值
 * 传入或者返回函数的函数
 * 函数的引用::println
 * 带有Receiver的引用 pdfPrinter::println
 * Data：01/01/2018
 * Author: Steven
 */
fun main(args: Array<String>) {
    args.forEach(::println)

    val helloWorld = Hello::world

//    args.filter(String::isNotEmpty)

    val pdfPrinter = PdfPrinter()
    args.forEach(pdfPrinter::println)
}

class PdfPrinter {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Hello {
    fun world() {
        println("Hello World.")
    }
}