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
    BufferedReader(FileReader(File("a.txt")))
            .use {
                var line: String
                while (true) {
                    line = it.readLine() ?: break
                    println(line)
                }
            }

}