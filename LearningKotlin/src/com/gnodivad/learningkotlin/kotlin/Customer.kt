package com.gnodivad.learningkotlin.kotlin

class Customer(val name: String, val address: String, var age: Int)  {

}

fun main() {
    val customer = Customer("Ong", "Malaysia", 22)
    customer.age = 23
    println("${customer.name} is ${customer.age} years old")
}