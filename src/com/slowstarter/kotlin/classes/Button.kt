package com.slowstarter.kotlin.classes

import com.slowstarter.kotlin.interfaces.Clickable
import com.slowstarter.kotlin.interfaces.Focusable

// extends 나 implements 대신 : 키워드를 사용해서 구현한다
class Button : Clickable, Focusable {
    // override 변경자를 꼭 사용하여 구현한다
    override fun click() = println("I was clicked!")

    // 인터페이스 다중상속의 경우는 명시적으로 구현한다
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    var button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}