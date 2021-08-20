package com.gnodivad.learningkotlin.kotlin

class Customer(val name: String, val address: String, var age: Int)  {
    constructor(name: String, age: Int): this(name, "", age) {
        println("secondary constructor")
    }

    init {
        println("init block")
    }
}

fun main() {
    val customer = Customer("Ong", "Malaysia", 22)
    customer.age = 23
    val customer2 = Customer("John", 31)
    println("${customer.name} is ${customer.age} years old")
    println("${customer2.name} is ${customer2.age} years old")
}