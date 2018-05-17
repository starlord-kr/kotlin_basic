 package com.slowstarter.kotlin

data class Person2(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person2("Alice"),
            Person2("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Bob, age=29)
