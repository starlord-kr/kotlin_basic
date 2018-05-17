package com.slowstarter.kotlin.functions

// Extention-Function example
// - 확장함수는 단 지 정적 메소드 호출에 대한 문법적인-편의(Syntatic-sugar)
// 기존의 String class 에 함수를 추가함
// String is receiver-type
// "Kotilin" receiver-object

fun String.lastChar1() : Char = this.get(this.length -1)
fun String.lastChar2() : Char = get(length -1)
fun String.lastChar3() : Char {
    return get(length -1)
}

// Collection에 대한 확장함수
fun <T> Collection<T>.joinToString1(
        separator: String = ",",
        prefix: String = "",
        postfix: String = "") : String {

    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) { // this는 receiver-object를 가리킨다 T타입 원소로 이루어진 컬렉션이다
        // println(index)
        // 중괄호가 있으나 없으나 같다
        if(index > 0)
            result.append(separator)
            result.append(element)
    }
    result.append(postfix)

    return result.toString()
}

fun Collection<String>.join(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
) = joinToString1(separator, prefix, postfix)

fun main(args: Array<String>) {

    println("Kotlin123!".lastChar1())
    println("Kotlin123!".lastChar2())
    println("Kotlin123!".lastChar3())


    var list = listOf("a", "b", "c")
    println(list.joinToString1())
    println(list.joinToString1(" "))
    println(list.join())
    println(list.join(" + "))
}
