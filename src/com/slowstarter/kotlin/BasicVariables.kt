package com.slowstarter.kotlin

// 원시타입과 문자열만 const 로 지정할 수 있다
const val UNIX_LINE_SEPARATOR1 = "\n" // public static final

var digit : Int = 1

var testArr1 : Array<Int> = arrayOf(1,2,3)


class BasicVariables(val test1 : String = "",
                     var test2 : String = "") {

    val TEST_VAL1 = "TEST_VAL1" // public static final
    var TEST_VAL2 = "TEST_VAL2" // public static final
}

fun main(args: Array<String>) {

    var test = BasicVariables()
    print(test.TEST_VAL1)
    print(UNIX_LINE_SEPARATOR1)
    print(test.TEST_VAL2)
    print(UNIX_LINE_SEPARATOR1)

    test = BasicVariables("test1", "test2")
    print(test.test1)
    print(UNIX_LINE_SEPARATOR1)
    print(test.test2)
}
