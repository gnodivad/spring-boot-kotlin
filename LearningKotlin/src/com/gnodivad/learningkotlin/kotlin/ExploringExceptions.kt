package com.gnodivad.learningkotlin.kotlin

@Throws(InterruptedException::class)
fun divide(a: Int, b: Int): Double {
    return (a.toDouble()) / b
}

fun main() {
    divide(5, 23)
}