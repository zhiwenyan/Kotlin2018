package chapter10

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * Description:
 * Data：2018/12/8
 * Author: Steven
 */
fun main(args: Array<String>) {
    val bufferedReader = BufferedReader(FileReader(File("a.txt")))
    var line: String
    while (true) {
        line = bufferedReader.readLine() ?: break
        println(line)
    }
    bufferedReader.close()
}