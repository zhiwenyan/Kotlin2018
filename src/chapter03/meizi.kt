package chapter03

/**
 * Description: 类的成员变量和成员的方法
 * Data：23/12/2017
 * Author: Steven
 */

class 妹子(var 性格: String, var 长相: String, var 声音: String) {
    fun 唱歌(歌名: String) {
        //唱歌的具体实现
        println("妹子正在唱歌: $歌名")
    }

    fun 跳舞(舞蹈名: String) {
        //跳舞的具体实现
        println("妹子正在跳舞: $舞蹈名")
    }
}

fun main(args: Array<String>) {
    val 某个妹子 = 妹子("彪悍", "未知", "没听过")
    某个妹子.唱歌("歌唱祖国")
    某个妹子.跳舞("天鹅湖")
}