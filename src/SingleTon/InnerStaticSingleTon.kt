package SingleTon

/**
 * Description:
 * Data：9/29/2018-4:48 PM
 * @author: yanzhiwen
 */
class InnerStaticSingleTon {
    companion object {
        fun getInstance() = Holder.INSTANCE
    }

    private object Holder {
        val INSTANCE = InnerStaticSingleTon()
    }
}

fun main(args: Array<String>) {
    InnerStaticSingleTon.getInstance()
}