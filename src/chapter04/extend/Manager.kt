package chapter04.extend

/**
 * Description:
 * Data：24/12/2017
 * Author: Steven
 */
class Manager : Driver, Writer {
    override fun drive() {
    }

    override fun write() {
    }
}

/**
 * 接口代理
 */
//class SeniorManager(val driver: Driver, val writer: Writer) : Driver, Writer {
//    override fun drive() {
//        driver.drive()
//    }
//
//    override fun write() {
//        writer.write()
//    }
//}
class SeniorManager(val driver: Driver, val writer: Writer) :
        Driver by driver, Writer by writer

class CarDriver : Driver {
    override fun drive() {
        println("开车呢")
    }
}

class PPTWriter : Writer {
    override fun write() {
        println("做PPT呢")
    }

}

interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val seniorManager = SeniorManager(driver, writer)
    seniorManager.drive()
    seniorManager.write()
}