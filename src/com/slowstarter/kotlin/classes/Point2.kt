package com.slowstarter.kotlin.classes

data class Student( val a :String,val b: String ){
    var name:String = a
    var subject:String = b
}


data class Point2( val x :Int,val y: Int ){
    var xPoint : Int = x
    var yPoint : Int = y
}

fun printEntries(map : Map<String, String>) {
    for((key, value) in map) {
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
//    val student = Student("TutorialsPoint.com","Kotlin")
//    val (name,subject) = student
//    println("You are learning "+subject+" from "+name)

    val point = Point2(10, 20)
    val (xPoint, yPoint) = point
    println(xPoint)
    println(yPoint)


    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotilin")
    printEntries(map)
}