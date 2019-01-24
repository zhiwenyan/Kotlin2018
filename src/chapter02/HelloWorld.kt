package chapter02

/**
 * Created by zhiwenyan on 2017/7/19.
 */
val FINAL_HELLO_WORLD: String = "Hello World"
var helloWorld: String = FINAL_HELLO_WORLD
var nullableHelloWorld: String? = helloWorld
val helloWorldArray: Array<Char> = arrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldCharArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldLength: Int = helloWorld.length
val helloWorldLengthLong: Long = helloWorldLength.toLong()
var string_array:Array<String> = arrayOf("How", "Are", "You")
var long_array:LongArray = longArrayOf(1, 2, 3)
var float_array:FloatArray = floatArrayOf(1.0f, 2.0f, 3.0f)
var double_array:DoubleArray = doubleArrayOf(1.0, 2.0, 3.0)
var boolean_array:BooleanArray = booleanArrayOf(true, false, true)
var char_array:CharArray = charArrayOf('a', 'b', 'c')

fun main(args: Array<String>) {
    println("final hello world: " + FINAL_HELLO_WORLD)
    println("assignable hello world: " + helloWorld)


    println("hello world from nullable type: " + nullableHelloWorld)
    println("hello world from Array: " + helloWorldArray.joinToString(""))
    println("hello world from CharArray: " + String(helloWorldCharArray))
//    println("class name hello world: " + HelloWorld::class.java.simpleName)
//    println("class name hello world: " + HelloWorld::class.java.name)
//    println("part of the class name of HelloWorld: "
//            + HelloWorld::class.java.simpleName.slice(0 until helloWorldLength)) // [0, 11)
    println("the length of hello world is : " + helloWorldLength)
    println("the length of hello world is (long): " + helloWorldLengthLong)
}
