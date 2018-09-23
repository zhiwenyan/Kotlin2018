package chapter02

/**
 * Created by zhiwenyan on 2017/7/18.
 */

class Student(age: Int, sex: Char, address: String) : person(age, sex, address) {

    fun score(s: String) {
        println(s)

    }
}

open class person(age: Int, sex: Char, address: String) {
    init {
        println("输出了学生的信息：年龄：$age,性别：$sex,地址：$address")
    }
}

fun main(args: Array<String>) {
    val student: Student = Student(12, 'M', "上海")
    student.score("100")
}