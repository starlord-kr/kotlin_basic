package com.slowstarter.kotlin.iterate

fun fizzBuzz(i: Int) =  when {
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0 -> "Buzz"
    i % 3 == 0 -> "Fizz"
    else -> "$i"
}

fun main(args : Array<String>) {

    var oneToTen = 1..10
    for(i in oneToTen) {
        print(i)
        print(" ")
    }

    println()
    println("---------------------")

    // 오름차순
    for(i in 1..100) {
        print(fizzBuzz(i))
        print(" ")
    }

    println()
    println("---------------------")

    for(i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
        print(" ")
    }

    println()
    println("---------------------")

    for(i in 0 until 100 step 2) {
        print(fizzBuzz(i))
        print(" ")
    }
}