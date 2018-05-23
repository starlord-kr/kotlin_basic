package com.slowstarter.kotlin.classes

import com.slowstarter.kotlin.interfaces.User


/**
 * Primary-Constructor에 프라퍼티를 직접 선언한다
 * User의 추상 프라퍼티를 구현하고 있으므로 override를 표시해야 한다
 */
class PrivateUser(override val nickname: String) : User

/**
 * SubscribingUser의 nickname은
 * 호출될 때마다 substringBefore도 호출된다
 */
class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

/**
 * FacebookUser의 nickname은
 * 초기화 시에 계산한 데이터를 가지고 사용된다
 */
class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int) = "fb:$accountId"


class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
        }
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FacebookUser(123456).nickname)
}