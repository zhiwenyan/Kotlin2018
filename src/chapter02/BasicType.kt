package chapter02

/**
 * Created by zhiwenyan on 2017/7/18.
 */

/**
 * 数据类型
 */
fun main(args: Array<String>) {

    val aBoolean: Boolean = true    //定义一个Boolean变量
    println(aBoolean)

    val aInt: Int = 100
    println(aInt)

    val antherInt: Int = 0xFF   //表示一个十六进制
    println(antherInt)

    val moreInt: Int = 0b01010101 //表示一个二进制
    println(moreInt)

    val maxInt: Int = Int.MAX_VALUE  //2的31次减1
    println(maxInt)

    val minInt: Int = Int.MIN_VALUE  //-2的31次减1
    println(minInt)

    val aLong: Long = 123L
    println(aLong)

    val aFloat: Float = 2.0F
    println(aFloat)

    val maxFloat: Float = Float.MAX_VALUE
    println(maxFloat)
    val minFloat: Float = Float.MIN_VALUE
    println(minFloat)

    //0.0F/0.0F不是数
    println(0.0F / 0.0F == Float.NaN)
    val aDouble: Double = 1.0
    println(aDouble)
    //字节
    val aByte: Byte = 127

    println(aByte)
    //字符
    val aChar: Char = 'H'
    val aChar1: Char = '中'
//    val aChar2:Char='\u00'
    //字符串
    val aString: String = "Hello"

    //转义字符
    println("****转义字符****")
    println("\t")
    println("\n")
    print("\\\n")
    println("\$")

    //基本类型的转换
    val anInt: Int = 5
    val anLong: Long = anInt.toLong()

    //字符
    val string: String = "Hello"
    val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o'))
    println(string == fromChars) //值
    println(string === fromChars) //对象

    println(string.contains('H'))

    val arg1: Int = 1
    val arg2: Int = 1
    println("$arg1+$arg2=${arg1 + arg2}") //字符串模板

    val sayHello: String = "Hello \"Trump\""
    println(sayHello)
}