package com.slowstarter.kotlin.enum

enum class Color (val r: Int, val g: Int, val b: Int) {
    RED(255,0 ,0 ),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color): String {
    when(color) {
        Color.RED -> return "Rechard"
        Color.ORANGE -> return "Of"
        Color.YELLOW -> return "York"
        Color.GREEN -> return "Gave"
        Color.BLUE -> return "Battle"
        Color.INDIGO -> return "In"
        Color.VIOLET -> return "Vain"
    }
}

fun getMnemonic2(color: Color) =
    when(color) {
        Color.RED -> "Rechard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {

    println("RED=" + Color.RED.rgb())
    println("ORANGE=" + Color.ORANGE.rgb())
    println("YELLOW=" + Color.YELLOW.rgb())
    println("GREEN=" + Color.GREEN.rgb())
    println("BLUE=" + Color.BLUE.rgb())
    println("INDIGO=" + Color.INDIGO.rgb())
    println("VIOLET=" + Color.VIOLET.rgb())

    println("it is " + getMnemonic(Color.RED))
    println("it is " + getMnemonic(Color.GREEN))
    println("it is " + getMnemonic(Color.BLUE))

    println("it is " + getMnemonic2(Color.RED))
    println("it is " + getMnemonic2(Color.GREEN))
    println("it is " + getMnemonic2(Color.BLUE))
}