package chapter10

import java.io.File

/**
 * Description:
 * Data：2018/12/8
 * Author: Steven
 */
fun main(args: Array<String>) {
    File("a.txt")
            .readLines()
            .forEach(::println)

}