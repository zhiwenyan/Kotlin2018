package chapter03

/**
 * Description:
 * Data：23/12/2017
 * Author: Steven
 */
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }
    for ((index, value) in args.withIndex()) {
        println("$index->$value")
    }
    for (indexedValue in args.withIndex()) {
        println("${indexedValue.index}->${indexedValue.value}")
    }
    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    for (i in list) {
        println(i)
    }

    var x = 5
    while (x > 0) {
        println(x)
        x--
    }
}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}