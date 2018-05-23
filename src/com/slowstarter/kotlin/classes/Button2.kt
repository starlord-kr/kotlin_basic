package com.slowstarter.kotlin.classes

import javax.naming.Context
import javax.print.attribute.AttributeSet


open class View {

    // Secondary-Constructor example
    constructor(ctx: Context) {
    }

    constructor(ctx: Context, attr: AttributeSet) {
    }
}

/**
 * Primary-Contructor가 없다면,
 */
class MyButton1 : View {

    // 상위클래스의 생성자를 호출해야 한다 example1
    constructor(ctx: Context) : super(ctx) {
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
    }
}



class MyButton2 : View {

//    private val attr: AttributeSet = null;
//
//    // 상위클래스의 생성자를 호출해야 한다 example1
//    constructor(ctx: Context) : this(ctx, attr) {
//    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
    }
}

// 상위클래스의 생성자를 호출해야 한다  example2
class MyButton3(ctx: Context) : View(ctx) {
}

// 상위클래스의 생성자를 호출해야 한다  example3
class MyButton4(ctx: Context, attr: AttributeSet) : View(ctx, attr) {
}

fun main(args: Array<String>) {

}