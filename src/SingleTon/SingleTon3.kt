package SingleTon

/**
 * Description:
 * Data：2019/4/12
 * Author: Steven
 */

class SingleTon3 private constructor() {

    companion object {
        @Volatile
        private var instance: SingleTon3? = null

        fun getInstance(): SingleTon3 {
            return instance ?: synchronized(SingleTon3::class.java) {
                instance ?: SingleTon3().also {
                    instance = it
                }
            }

        }

    }
}