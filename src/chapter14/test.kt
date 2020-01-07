package chapter14

/**
 * Description:
 * Data：2019/1/25
 * Author: Steven
 */
data class Person(var name:String, var age:Int){

    override fun equals(other: Any?): Boolean {

        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}
fun main(args:Array<String>){
    val p1=Person("a",10)
    val p2=Person("a",10)
    if(p1.equals(p2)){
        println("true")
    }
}