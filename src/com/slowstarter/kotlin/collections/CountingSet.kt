package com.slowstarter.kotlin.collections

/**
 * extends 나 implements 대신 by를 사용하여 의존성을 낮춘다
 *
 * MutableCollection 의 구현을 by 를 사용하여 innerSet 에 위임한다
 * CountingSet 에 MutableCollection의 구현 방식에 대한 의존관계가 생기지 않는다
 */
class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>())
    : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element : T) : Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c : Collection<T>) : Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args : Array<String>) {
    val cSet = CountingSet<Int>()
    cSet.addAll(listOf(1,1,3))
    println("${cSet.objectsAdded} objects were added, ${cSet.size} remain.")
}