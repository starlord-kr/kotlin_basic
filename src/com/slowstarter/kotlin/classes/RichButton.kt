package com.slowstarter.kotlin.classes

import com.slowstarter.kotlin.interfaces.Clickable

open class RichButton() : Clickable {

    fun disable() {} // 이 함수는 final이다 하위 클래스가 이 메소드를 오버라이드 할 수 없다

    open fun animate() {}

//    override fun click() = println("RichButton was clicked!") // 오버라이드한 메소드를 기본적으로 열려있다

    final override fun click() = println("RichButton was clicked!") // 오버라이드한 메소드를 기본적으로 열려있다
}

fun main(args: Array<String>) {
    val richButton = RichButton()
    richButton.disable()
    richButton.animate()
    richButton.click()
}