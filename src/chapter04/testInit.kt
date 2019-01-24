package chapter04

/**
 * Description:
 * Data：1/24/2019-10:51 AM
 * @author: yanzhiwen
 */
class Person {
    init {
        println("Hello Person!")
    }
}
open class ParentClass(name: String) {
    open fun publicMethod(){
        println("I am Parent public")
    }
}
class Child(name: String, age : Int) : ParentClass(name){
    override fun publicMethod() {
        super.publicMethod()
        println("I am  Child public")

    }
}


fun main(args: Array<String>) {

    val person=Person()
    val  child=Child("sss",22)
    child.publicMethod()
}