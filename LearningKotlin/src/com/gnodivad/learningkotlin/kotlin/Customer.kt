package com.gnodivad.learningkotlin.kotlin

class Customer {
    val name: String = "David"
    val address: String = "Singapore"
    val age: Int = 21
}

fun main() {
    val customer = Customer()
    println("${customer.name} is ${customer.age} years old")
}