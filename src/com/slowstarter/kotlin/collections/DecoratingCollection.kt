package com.slowstarter.kotlin.collections


/**
 * Collection interface를 구현한 예제
 */
class DelegatingCollection1<T> : Collection<T> {

    private val innerList = arrayListOf<T>()

    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean = innerList.isEmpty()

    override fun contains(element: T): Boolean = innerList.contains(element)

    override fun iterator(): Iterator<T> = innerList.iterator()

    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

/**
 * by 키워드를 통해 인터페이스에 대한 구현을 다른 객체에 위임 중이라는 사실을 명시함
 * - 컴파일러가 override를 통한 구현을 알아서 해 줌
 */
class DelegatingCollection2<T> (
        innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {}

fun main(args: Array<String>) {
    val testCollection1 = DelegatingCollection1<Int>()
    println(testCollection1.size)
    println(testCollection1.isEmpty())
    println(testCollection1.contains(1))
    println(testCollection1.containsAll(listOf(1,2,6)))


    val testCollection2 = DelegatingCollection2<Int>()
    println(testCollection2.size)
    println(testCollection2.isEmpty())
    println(testCollection2.contains(1))
    println(testCollection2.containsAll(listOf(1,2,6)))
}