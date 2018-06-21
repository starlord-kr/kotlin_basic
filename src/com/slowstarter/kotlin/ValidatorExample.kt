package com.slowstarter.kotlin


class User(val id: Int, val name: String, val address: String)

fun saveUser1(user: User) {
    if(user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name.")
    }

    if(user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.address}: empty Address.")
    }
    println("Saved UserId: ${user.id}")
}

// 로컬함수를 사용한 예제
fun saveUser2(user: User) {

    fun validate(user: User, value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName.")
        }
    }

    validate(user, user.name, "Name");
    validate(user, user.address, "Address");

    println("Saved UserId: ${user.id}")
}

// 로컬함수 바깥에서 함수의 파라메타 접근 예제
fun saveUser3(user: User) {

    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName.") as Throwable
        }
    }

    validate(user.name, "Name");
    validate(user.address, "Address");

    println("Saved UserId: ${user.id}")
}

// 검증로직을 확장함수로 추출하기
fun saveUser4(user: User) {
    user.validateBeforeSave()
}

// 검증로직을 확장함수로 추출하기
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName.")
        }
    }
    validate(name, "Name");
    validate(address, "Address");

    println("Saved UserId: $id")
}

fun main(args: Array<String>) {

    val normalUser1 = User(1, "test1", "seoul1")
    val abNormalUser1 = User(2, "", "")

    saveUser1(normalUser1)
//    saveUser1(abNormalUser1)

    val normalUser2 = User(3, "test2", "seoul2")
    val abNormalUser2 = User(4, "", "")
    saveUser2(normalUser2)
//    saveUser2(abNormalUser2)

    val normalUser3 = User(5, "test3", "seoul3")
    val abNormalUser3 = User(6, "", "")
    saveUser3(normalUser3)
//    saveUser3(abNormalUser3)

    val normalUser4 = User(7, "test4", "seoul4")
    val abNormalUser4 = User(8, "", "")
    saveUser4(normalUser4)
    saveUser4(abNormalUser4)
}
