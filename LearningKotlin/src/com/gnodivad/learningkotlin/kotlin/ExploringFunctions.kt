package com.gnodivad.learningkotlin.kotlin

fun printAString(value: String) {
    println(value)
}

fun addTwoNumbers(one: Double, two: Double) = one + two

fun main() {
    printAString("Hello world")

    println(addTwoNumbers(17.3, 9.6))
}