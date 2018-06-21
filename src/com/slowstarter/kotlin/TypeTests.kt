package com.slowstarter.kotlin

var intVal : Int = 1

fun test() : Int {
    var intVal : Int

    intVal = 2

    return intVal
}

fun main(args: Array<String>) {
    println(intVal)
    println(test())
}