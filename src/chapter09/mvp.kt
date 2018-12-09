package chapter09

/**
 * Description:
 * Data：2018/9/24
 * Author: Steven
 */
interface IView<out  P:IPresenter<IView<P>>>{
    val presenter:P

}

interface IPresenter<out V:IView<IPresenter<V>>>
fun main(args: Array<String>) {

}