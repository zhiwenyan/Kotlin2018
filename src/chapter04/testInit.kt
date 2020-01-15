package chapter04

/**
 * Description:
 * Data：1/24/2019-10:51 AM
 * @author: yanzhiwen
 */
class Bird( weight: Double, age: Int, color: String) {
    init {
        println("do something....")
        println("weight is $weight")
    }

    fun printWeight() {
       // print(weight)
    }
}

class Person {
    init {
        println("Hello Person!")
    }
}

open class ParentClass {
    open fun publicMethod() {
        println("I am Parent public")
    }
}

class Child(val name: String = "ss", val age: Int = 0, val height: Double = 0.00) : ParentClass() {
    override fun publicMethod() {
        super.publicMethod()
        println("I am  Child public")
        println(name)

    }
}


fun main(args: Array<String>) {

    val person = Person()
    val child = Child("sss")
    val child1 = Child(name = "ss")
    child.publicMethod()
}