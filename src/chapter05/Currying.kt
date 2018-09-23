package chapter05

import java.io.OutputStream

/**
 * Description:
 * Data：07/01/2018
 * Author: Steven
 */
fun log(tag: String, target: OutputStream, message: Any?){
    target.write("[$tag] $message\n".toByteArray())
}

fun main(args: Array<String>) {
    log("benny", System.out, "HelloWorld")
}