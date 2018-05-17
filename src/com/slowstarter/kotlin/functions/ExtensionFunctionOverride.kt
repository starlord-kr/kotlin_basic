package com.slowstarter.kotlin.functions

open class View {
    open fun click() = println("View clicked!")

    /**
     * 클래스를 확장한 함수(확장함수)와 그 클래스의 멤버 함수의 이름과 시그니처가 같다면 확장함수가 아니라 멤버함수가 호출된다
     * - 멤버함수의 우선순위가 높다
     */
    // fun showOff() = println("Real View clicked!")
}

fun View.showOff() = println("I'm a View!")

class Button: View() {
    override fun click() = println("Button clicked!")
}
fun Button.showOff() = println("I'm a Button!")

/**
 * 클래스의 메소드는 실제 타입에 따라 호출할 메소드가 결정되지만
 * 확장함수는 클래스의 일부가 아니기 때문에 그 변수에 저장된 객체의 동적인 타입에 의해 확장함수가 결정되지 않는다
 */
fun main(args: Array<String>) {
    var view1 = View()
    view1.click()
    view1.showOff()

    println()

    var view2 : View = Button()
    view2.click()
    view2.showOff()

    println()

    Button().showOff()
}