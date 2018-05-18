package com.slowstarter.kotlin.strings

val PATH = "/User/slowstarter/kotlin-book/chapter.adoc"
val CMP_STR = "12.345-6.A"

// String lib를 활용한 예제
fun parsePath1(path: String) {
    val directory = path.substringBeforeLast("/");
    val fullName = path.substringAfterLast("/");

    val fileName = fullName.substringBeforeLast(".");
    val extension = fullName.substringAfterLast(".");

    println("-----------------------------------------------------------")
    println("Dir: $directory, FullName: $fullName")
    println("Name: $fileName, Ext: $extension")
    println()
}

// 정규식을 활용한 예제
fun parsePath2(path: String) {
    // 마지막 슬래시 마지막 점에 대해 디렉터리-파일이름-확장자를 구하는 정규식
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if(matchResult != null) {
        println("-----------------------------------------------------------")
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, Name: $filename, Ext: $extension")
    }
    println()
}

fun splitString() {
    println("-----------------------------------------------------------")
    println(CMP_STR.split("\\.|-".toRegex()))
    println(CMP_STR.split(".", "-"))
    println(CMP_STR.split('.', '-'))
}

fun main(args: Array<String>) {
    parsePath1(PATH)
    parsePath2(PATH)
    splitString()
}