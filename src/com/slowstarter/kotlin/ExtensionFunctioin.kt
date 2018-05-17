package com.slowstarter.kotlin

// Extention-Function example
// 기존의 String class 에 함수를 추가함
// String is receiver-type
// "Kotilin" receiver-object

fun String.lastChar1() : Char = this.get(this.length -1)
fun String.lastChar2() : Char = get(length -1)
fun String.lastChar3() : Char {
    return get(length -1)
}

fun main(args: Array<String>) {

    println("Kotlin123!".lastChar1())
    println("Kotlin123!".lastChar2())
    println("Kotlin123!".lastChar3())
}
