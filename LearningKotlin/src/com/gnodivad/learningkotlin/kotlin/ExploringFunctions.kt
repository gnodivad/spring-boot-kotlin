package com.gnodivad.learningkotlin.kotlin

fun printAString(value: String) {
    println(value)
}

fun addTwoNumbers(one: Double = 6.2, two: Double = 3.9) = one + two

fun printSomeMaths(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}

fun main() {
    printAString("Hello world")

    println(addTwoNumbers(17.3, 9.6))
    println(addTwoNumbers(5.6))
    println(addTwoNumbers(two = 5.6))
    printSomeMaths(two = 17.3, one = 9.6)
}