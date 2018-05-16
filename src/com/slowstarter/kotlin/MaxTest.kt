package com.slowstarter.kotlin

fun max1(a: Int, b: Int):Int {
    return if(a > b) a else b
}

fun max2(a: Int, b: Int):Int {
    return (if(a > b) a else b)
}

fun max2_1(a: Int, b: Int):Int {
    return if(a > b){ a }else{ b }
}

//
fun max3(a: Int, b: Int):Int = if(a > b) a else b

//
fun max4(a: Int, b: Int) = if(a > b) a else b

fun main(args: Array<String>) {

    /**
     * 컴파일러는 변수 선언 시점의 초기화 식으로부터 변수의 타입을 추론하며,
     * 변수 선언 이후 변수 재대잉ㅂ이 이뤄질 때는 이미 추론한 변수의 타입을 염두에 두고 대입문의 타입을 검사한다.
     */
    var test1 = 1
    var test2: Int = 2
    var test3: Int // 초기화 식이 없다면 변수에 저장될 값에 대해 아무 정보가 없기 때문에 컴파일러가 타입을 추론 할 수 없다.

    test3 = 3

    println(max1(1, 2));
    println(max2(2, 3));
    println(max2_1(2, 3));
    println(max3(3, 4));
    println(max4(4, 5));
}
