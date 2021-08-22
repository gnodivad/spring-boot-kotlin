package com.gnodivad.learningkotlin.kotlin

@Throws(InterruptedException::class)
fun divide(a: Int, b: Int): Double {
    Thread.sleep(1000)
    return (a.toDouble()) / b
}

fun main() {
    var result = try {
        divide(5, 23)
    } catch (e: Exception) {
        0
    }

    println(result)
}