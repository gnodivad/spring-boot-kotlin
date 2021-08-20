package com.gnodivad.learningkotlin.kotlin

class Customer(val name: String, val address: String, var age: Int)  {
    constructor(name: String, age: Int): this(name, "", age)
}

class AlternativeCustomer(val name: String, val age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int): this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "")

fun main() {
    val customer = AnotherAlternativeCustomer("Ong", address = "Malaysia", age = 22)
    customer.age = 23
    val customer2 = AnotherAlternativeCustomer("John", 31)
    println("${customer.name} is ${customer.age} years old")
    println("${customer2.name} is ${customer2.age} years old")
}