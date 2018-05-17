package com.slowstarter.kotlin.functions

// getter만 존재하는 Extension-property
val String.lastChar: Char
    get() = get(length - 1)

// 변경 가능한 Extension-property
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }


fun main(args: Array<String>) {
    val test1 = "Kotlin!123"
    println(test1.lastChar)

    println()

    val sb = StringBuilder("Kotlin!456")
    println(sb.lastChar)
    sb.lastChar = 'A'
    println(sb.lastChar)
}