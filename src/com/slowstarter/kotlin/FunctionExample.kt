package com.slowstarter.kotlin


fun <T> joinToString1(collection: Collection<T>,
                      separator: String,
                      prefix: String,
                      postfix: String) : String {

    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        // println(index)
        // 중괄호가 있으나 없으나 같다
        if(index > 0)
            result.append(separator)
            result.append(element)
    }
    result.append(postfix)

    return result.toString()
}

/**
 * 파라메타에 default 값을 지정함으로써 Java의 불필요한 Overloading 을 줄일 수 있다
 * ex-java) http://mng.bz/4KZC
 */
fun <T> joinToString2(collection: Collection<T>,
                      separator: String = ",",
                      prefix: String = "",
                      postfix: String = "") : String {

    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        // println(index)
        // 중괄호가 있으나 없으나 같다
        if(index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)

    return result.toString()
}

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    val result1 = joinToString1(list1, ";", "(", ")")
    println(result1)

    // 파라메타 초기화를 통해 오버로딩처럼 사용가능
    val result2 = joinToString2(list1, ";", "", "")
    println(result2)

    val result3 = joinToString2(list1)
    println(result3)

    val result4 = joinToString2(list1, "-")
    println(result4)
}
