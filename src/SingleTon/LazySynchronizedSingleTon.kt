package SingleTon

/**
 * Description:懒汉式
 * Data：9/29/2018-4:16 PM
 * @author: yanzhiwen
 */
class LazySynchronizedSingleTon private constructor() {
    companion object {
        private var INSTANCE: LazySynchronizedSingleTon? = null

        @Synchronized
        fun getInstace(): LazySynchronizedSingleTon {
            if (INSTANCE == null) {
                INSTANCE = LazySynchronizedSingleTon()
            }
            return INSTANCE!!
        }
    }
}

fun main(args: Array<String>) {
    val l = LazySynchronizedSingleTon.getInstace()
    val l2 = LazySynchronizedSingleTon.getInstace()
    println(l==l2)
}
