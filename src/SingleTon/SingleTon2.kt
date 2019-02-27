package SingleTon

/**
 * Description:
 * Data：2019/1/25
 * Author: Steven
 */
class  SingleTon2 private constructor()
{
    companion object {
        fun getInstance():SingleTon2=SingleTon.instnace

    }
    class SingleTon
    {
        companion object {
            val  instnace= SingleTon2()

        }
    }
}


fun main(args: Array<String>) {
    val  s=SingleTon2.getInstance()
    val s2=SingleTon2.getInstance()
    println(s==s2)
}