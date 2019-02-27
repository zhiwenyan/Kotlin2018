package chapter05


/**
 * Description:map
 * Data：01/01/2018
 * Author: Steven
 */
data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working!")
    }
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)
    //list.map一一映射另外一个集合
    val newList = list.map {
        it * 2 + 3
    }
    newList.forEach(::println)


    val newList2 = list.map(Int::toDouble)
    newList2.forEach(::println)

    for (i in newList) {
        println(i)
    }
    println("**************flatMap********************")
    //flatMap
    val list2 = listOf(
            1..20,
            2..10
    )
    val flatList = list2.flatMap { it }
    flatList.forEach(::println)
    println("**************reduce********************")

    println(factorial(6))

    println("************filter**********************")
    (0..6).map(::factorial).filter { it % 2 == 1 }

    println("***********let*************************")

    val person = findPerson()
    println(person?.age)
    println(person?.name)
//
    //let扩展函数的实际上是一个作用域函数，当你需要去定义一个变量在一个特定的作用域范围内，let函数的是一个不错的选择；
    // let函数另一个作用就是可以避免写一些判断null的操作。
    findPerson()?.let {(name,age) ->
        println(name)
        println(age)

    }
    findPerson()?.let { person ->
        person.work()
        println(person.age)
    }
    //apply
    findPerson()?.apply {
        work()
        println(age)
    }

//   with( findPerson()) {
//        work()
//        println(age)
//    }
}

fun findPerson(): Person? {
    return null
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}

