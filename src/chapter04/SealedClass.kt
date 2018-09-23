package chapter04

/**
 * Description: 密封类
 * 子数可数
 * <v1.1,子类必须定义为密封类的内部类
 * v1.1 子类只需要与密封类在同一个文件中
 * 仔细体会与枚举的不同
 *
 * Data：01/01/2018
 * Author: Steven
 */
sealed class PlayerCmd {
    class Play(val url: String, val position: Long = 0) : PlayerCmd()

    class Seek(val position: Long) : PlayerCmd()

    object Pause : PlayerCmd()

    object Resume : PlayerCmd()

    object Stop : PlayerCmd()
}

enum class PlayerState {
    IDLE, PAUSE, PLAYING
}