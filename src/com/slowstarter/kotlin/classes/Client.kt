package com.slowstarter.kotlin.classes

import java.util.*

/**
 * 기본 생성자만 있는 클래스
 */
class Client(val name: String, val postalCode: Int)

/**
 * equals, toString 을 override 한 클래스
 */
class Client1(val name: String, val postalCode: Int) {

    /**
     * Any는 java.lang.Object에 대응하는 클래서로 코들린의 모든 클래스의 최상위 클래스다
     * "Any?"는 널이 될 수 있는 타입이므로 "other"는 null일 수 있다
     */
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client1)
            return false

        return name == other.name && postalCode == other.postalCode
    }

    /**
     * toString을 override함으로써 인스턴스의 문자열 표현을 얻는다
     */
    override fun toString(): String {
        return "Client(name=$name, postalCode=$postalCode)"
    }
}

/**
 * hashcode, equals, toString 을 override 한 클래스
 */
class Client2(val name: String, val postalCode: Int) {

    /**
     * JVM 언어에서는 equals가 true를 반환하는 두 객체는 반드시 같은 hashCode를 반환해야 한다
     */
    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }

    /**
     * Any는 java.lang.Object에 대응하는 클래서로 코들린의 모든 클래스의 최상위 클래스다
     * "Any?"는 널이 될 수 있는 타입이므로 "other"는 null일 수 있다
     */
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client2)
            return false

        return name == other.name && postalCode == other.postalCode
    }

    /**
     * toString을 override함으로써 인스턴스의 문자열 표현을 얻는다
     */
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"
}

/**
 * data 변경자를 class에 사용하면 컴파일러가 equals, hashCode, toString 메서드를 자동으로 만들어준다
 *
 * 1. 인스턴스 간 비교를 위한 equals
 * 2. HashMap과 같은 해시 기반 컨테이너에서 키로 사용할 수 있는 hashCode
 * 3. 클래스의 각 필드를 선언 순서대로 표시하는 문자열을 만들어주는 toString
 *
 */
data class Client3(val name: String, val postalCode: Int)

fun main(args: Array<String>) {

    val client1 = Client("number2", 12345)
    println(client1)
    val client2 = Client("number2", 12345)
    println(client2)

    /**
     * kotlin에서는 객체 비교로 == 를 사용한다. 내부적으로 equals를 사용한다.
     */
    print("CASE1 : ")
    println(client1 == client2)

    val client1_1 = Client1("james", 12345)
    println(client1_1)
    val client1_2 = Client1("james", 12345)
    println(client1_2)

    /**
     * kotlin에서는 객체 비교로 == 를 사용한다. 내부적으로 equals를 사용한다.
     */
    print("CASE2 : ")
    println(client1_1 == client1_2)

    /**
     * HashSet은 원소를 비교할 때 비용을 줄이기 위해 먼저 객체의 해시 코드를 비교하고 해시 코드가 같은 경우에만 실제 값을 비교한다.
     */
    print("CASE3 : ")
    val processed1 = hashSetOf(Client1("number1", 12345))
    println(processed1.contains(Client1("number1", 12345)))

    println("CASE4 : ")
    val client2_1 = Client2("james", 12345)
    println("hashCode: " + client2_1.hashCode())
    val client2_2 = Client2("james", 12345)
    println("hashCode: " + client2_2.hashCode())

    println(client2_1)
    println(client2_2.equals(client2_1))
    println(client2_1 == client2_2)

    print("CASE5 : ")
    val processed2 = hashSetOf(client2_1)
    println(processed2.contains(client2_2))
    println(client2_1 == client2_2)

    print("CASE6 : ")
    val client5_1 = Client3("bond", 11111)
    val client5_2 = Client3("bond", 11111)
    println(client5_1 == client5_2)

}