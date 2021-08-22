package com.gnodivad.learningkotlin.kotlin

fun main() {
    try {
        println(7 / 0)
    } catch (e: ArithmeticException) {
        println("caught")
    }
    
    Thread.sleep(1000)
}