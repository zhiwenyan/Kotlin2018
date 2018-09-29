package SingleTon

/**
 * Description:懒汉式
 * Data：9/29/2018-4:16 PM
 * @author: yanzhiwen
 */
class LazySingleTon private constructor() {
    companion object {
        val INSTANCE_1 by lazy(LazyThreadSafetyMode.NONE) {
            LazySingleTon()
        }
    }

    private var INSTANCE_2: LazySingleTon? = null
    fun getInstance(): LazySingleTon {

        if (INSTANCE_2 == null) {
            INSTANCE_2 = LazySingleTon()
        }
        return INSTANCE_2!!
    }

}

fun main(args: Array<String>) {
    val l = LazySingleTon.INSTANCE_1.getInstance()
    val l1 = LazySingleTon.INSTANCE_1.getInstance()
    println(l == l1)

}