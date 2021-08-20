package com.gnodivad.learningkotlin.kotlin

fun printAString(value: String) {
    println(value)
}

fun addTwoNumbers(one: Double, two: Double) = one + two

fun printSomeMaths(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}

fun main() {
    printAString("Hello world")

    println(addTwoNumbers(17.3, 9.6))
    printSomeMaths(two = 17.3, one = 9.6)
}