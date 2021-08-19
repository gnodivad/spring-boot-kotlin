package com.gnodivad.learningkotlin.kotlin

import java.util.*

fun main(args: Array<String>) {
    var name = "David"
    val surname = "Ong"

    name = "John"
//    surname = "Doe"

    println("Hello $name ${surname.uppercase(Locale.getDefault())}")
    println("Your first \$name has ${name.length} characters")
}