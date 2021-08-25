package com.gnodivad.application

import com.gnodivad.utilities.toSentenceCase

fun applySomeFunctionToString(inputString: String, myFunction: (String) -> String): String {
    return myFunction(inputString)
}

fun main() {
    val result = applySomeFunctionToString("hello", ::toSentenceCase)
    val result2 = applySomeFunctionToString("hello") { it.toUpperCase() }
    println(result)
    println(result2)
    println()

    val colors = listOf("red", "green", "blue", "black")
    val uppercaseColors = colors.map { it.uppercase() }
    uppercaseColors.forEach { println(it) }
    println()

    val colorsStartWithB = colors.filter { it.startsWith("b") }
    colorsStartWithB.forEach { println(it) }
    println()

    colors.flatMap { if (it.startsWith("b")) listOf(it, it) else listOf(it) }.forEach { println(it) }
    println()

    println(colors.reduce { result, value -> "$result, $value" })
    println()

    val numbers = colors.map { it.length }
    numbers.forEach { println(it) }
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count())
    println()

    println(numbers.fold(0) { result, value -> result + value })
    println(numbers.fold(0) { result, value -> if (value > result) value else result })
}