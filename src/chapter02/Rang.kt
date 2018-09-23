package chapter02

/**
 * Created by zhiwenyan on 2017/7/19.
 */
//Rang 区间
fun main(args: Array<String>) {

    val intRang: IntRange = 0..1024  //闭区间[0,1024]
    println(intRang)
    //intRang.contains(100)等同于100 in intRang
    println(intRang.contains(100))
    println(100 in intRang)

    val rang: IntRange = 0 until 10 //开区间
    println(rang)
    for (i in rang) {
        print("$i,")
    }

    val emptyRang: IntRange = 0..-1
    println(emptyRang.isEmpty())
}