package chapter10

import java.util.concurrent.Executors

/**
 * Description: SAM Single Abstract Method
 *
 * Data：2018/12/8
 * Author: Steven
 */
fun main(args: Array<String>) {
    Executors.newCachedThreadPool().submit {
        println("Hello")
    }
    val list= listOf("hello","world")
    val hashMap=HashMap<Int,String>()
    val map1= mapOf(1 to "2",2 to "2")




}