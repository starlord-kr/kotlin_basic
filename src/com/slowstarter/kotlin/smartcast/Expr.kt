package com.slowstarter.kotlin.smartcast

interface Expr

// value 라는 프라퍼티로만 존재하는 단순한 클래스로 Expr 인터페이스를 구현한다
class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

// return 문이 있는 eval
fun eval1(e: Expr) : Int {
    if(e is Num) {
        val n = e as Num // as를 사용한 명시적인 타입캐스팅
        return n.value
    }

    if(e is Sum) {
        return eval1(e.left) + eval1(e.right)
    }

    throw IllegalArgumentException("Unknown expression")
}

// return 문이 없는 if
// 값을 만들어 내는 식
fun eval2(e: Expr) : Int =
    if(e is Num) {
        e.value
    } else if(e is Sum) {
        eval2(e.left) + eval2(e.right)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

// return 문이 없는 when
fun eval3(e: Expr) : Int =
    when(e) {
        is Num -> e.value // (인자 타입을 검사하는 when 분기문) -> (스마트캐스트가 쓰임)
        is Sum -> eval3(e.left) + eval3(e.right) // (인자 타입을 검사하는 when 분기문) -> (스마트캐스트가 쓰임)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun eval4(e: Expr) : Int =
    when(e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left =  eval4(e.left)
            val right =  eval4(e.right)
            println("sum: $left + $right")

            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main(args : Array<String>) {

    //  Tree 구조 구현 및 출력
    println(eval1(Sum(Sum(Num(1), Num(2)), Num(3))))
    println(eval2(Sum(Sum(Num(2), Num(3)), Num(4))))
    println(eval3(Sum(Sum(Num(3), Num(4)), Num(5))))
    println(eval4(Sum(Sum(Num(4), Num(5)), Num(6))))
}