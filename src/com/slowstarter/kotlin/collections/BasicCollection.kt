package com.slowstarter.kotlin.collections

fun example1() {
    val list1 = arrayListOf(1, 7, 53)
    println(list1);
    val list2 = arrayListOf<Int>(1, 7, 53)
    println(list2);

    val set1 = hashSetOf(1, 7, 53)
    println(set1);
    val set2 = hashSetOf<Int>(1, 7, 53)
    println(set2);

    // to 는 일반함수 입니다
    val map1 = hashMapOf(1 to "One", 7 to "Seven", 53 to "fifty-three")
    println(map1);
    val map2 = hashMapOf<Int, String>(1 to "One", 7 to "Seven", 53 to "fifty-three")
    println(map2);
}

fun example2() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings) // default toString() 호출
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}

/**
 *
 */
fun main(args: Array<String>) {
    example1()
    example2()
}