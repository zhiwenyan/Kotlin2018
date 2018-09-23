package chapter02

/**
 * Created by zhiwenyan on 2017/7/19.
 */

//数组
fun main(args: Array<String>) {
    val arrayOfint: IntArray = intArrayOf(1, 3, 5, 7)
    val arrayOfchar: CharArray = charArrayOf('K', 'O', 'T', 'L', 'I', 'N')
    val arrayOfstring: Array<String> = arrayOf("I", "am", "Steven")
    arrayOfchar.iterator().forEach { println(it) }
    arrayOfint.get(0)
    println(arrayOfint.size)
    for (i in arrayOfint) {
        println("$i,")
    }
    arrayOfint.forEach { println(it) }
    println(arrayOfint[1])
    println(arrayOfchar.joinToString(""))

    println(arrayOfint.slice(1..3))

}



