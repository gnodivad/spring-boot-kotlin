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

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "") {
    var approved: Boolean = false

    set(value) {
        if (age >= 21) {
            field = value
        } else {
            println("You can't approve a customer under 21 years old.")
        }
    }
}

fun main() {
    val customer = AnotherAlternativeCustomer("Ong", address = "Malaysia", age = 22)
    customer.age = 23
    customer.approved = true
    val customer2 = AnotherAlternativeCustomer("John", 31)
    customer2.approved = true
    println("${customer.name} is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.name} is ${customer2.age} years old and is ${customer2.approved}")
}