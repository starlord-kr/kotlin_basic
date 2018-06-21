package com.slowstarter.kotlin.functions


fun testSumAndAction() {
    val sum1 = { x:Int, y:Int -> x + y }
    val action1 = { println(42) }

    println(sum1)
    println(action1)
    println(sum1(3, 4))
    println(action1())

    val sum2: (Int, Int) -> Int = { x, y -> x + y }
    val action2: () -> Unit = { println(42) }

    println(sum2)
    println(action2)
    println(sum2(3, 4))
    println(action2())
}

// 반환값이 null
var canReturnNull : (Int, Int) -> Int? = { x, y -> null }
// 함수 타입이 null
var funOrNull : ((Int, Int) -> Int)? = null

/**
 * 함수타입의 파라미터에 각각 이름은 붙였다.
 */
fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit
) {
    /* ... */
    println(url);
    println(callback);
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2,3)
    println("The result is $result")
}

fun String.filter(predicate : (Char) -> Boolean) : String {
    val sb = StringBuilder()
    for(index in 0 until length) { // 수신객체의 길이
        val element = get(index)
        println(element)
        if(predicate(element))
            sb.append(element)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
//    testSumAndAction()

//    val url = "http://kotl.in"
//    performRequest(url) {code, content -> /* ..... */ } // 선언된 함수의 파라미터 이름을 그대로 써도되고,
//    performRequest(url) {code, page -> /* ........ */ } // 그냥 원하는 다른 이름을 붙여도 된다.
//
//    twoAndThree({a, b -> a + b})
//    twoAndThree{a, b -> a * b}

    println("ab123c".filter { it in 'a'..'z' })
}