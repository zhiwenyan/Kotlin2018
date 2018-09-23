package chapter03

/**
 * Created by zhiwenyan on 2017/7/19.
 */
fun main(args: Array<String>) {
    val FINAL_HELLO_WORLD:String ="HelloWorld"  //val 的value不可变
    println(FINAL_HELLO_WORLD)
    var helloWorld:String="HelloWorld"   //var 的value可变
    helloWorld="Hello"
    println(helloWorld)
    val FINAL_HELLO_CHINA="HelloChina"  //类型推断
    println(FINAL_HELLO_CHINA)

}