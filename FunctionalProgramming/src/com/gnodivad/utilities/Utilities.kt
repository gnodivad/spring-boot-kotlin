package com.gnodivad.utilities

fun toSentenceCase(input: String): String {
    return input[0].toUpperCase() + input.substring(1)
}

fun main() {
    println(toSentenceCase("hello"))
}