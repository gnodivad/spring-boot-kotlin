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
}