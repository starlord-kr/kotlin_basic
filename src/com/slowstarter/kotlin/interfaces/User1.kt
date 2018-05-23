package com.slowstarter.kotlin.interfaces

/**
 * User를 구현하는 하위클래스는 email은 반드시 override 해야하지만,
 * nickname은 override하지 않고 상속할 수 있다
 */
interface User1 {
    val email: String

    val nickname: String
        get() = email.substringBefore('@') // Custom-Getter

    // interface 는 backing-filed 를 가질 수 없다
    var etc: String
        get() = "Unspecified"
        set(value: String) {}
//        get() = field
//        set(value: String) {
//            field = value
//        }

    // 메소드 선언
    fun event()
    // 메소드 구현
    fun event(action: Boolean) {
        // ...
    }
}

/**
 *
 */
class Dummy : User1 {

    override val email: String = "slowstarter.dev@gmail.com"

    override fun event() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Dummy2(val name: String) {
    var address: String = "Unspecified"
        get
        set(value:String) {
            println("""
                Address was changed for $name: "$field" -> "$value"
                    """.trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    var test = Dummy()
    test.etc = "New ETC..."
    println(test.email)
    println(test.nickname)
    println(test.etc)

    println("-------------------------------------------")
    var test2 = Dummy2("slowstarter")
    test2.address = "Elsenheimerstrasse 47, 80687 Muenchen"
    println(test2.address)
}