package com.slowstarter.kotlin.iterate

import java.util.*

/**
 * map 에 대한 사용 예제
 * map[key]
 * map[key] = value
 */
fun iterateMap() {
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun iterateList() {
    val list = arrayListOf<String>("10", "11", "1001")

    for((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z' // 'a'<='c' && 'c'<='z' 의 의미이다

fun isNotDigit(c: Char) = c in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't konw"
}

fun checkLetter() {
    println("isLetter:" + isLetter('q'))
    println("isNotDigit:" + isNotDigit('q'))
}

// in 연산자를 사용해서 값이 범위 안에 속하는지 확인할 수 있다
fun useInOperator() {
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

fun main(args: Array<String>) {
    iterateMap()
    iterateList()
    checkLetter()
    recognize('8')
    useInOperator()
}