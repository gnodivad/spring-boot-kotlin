package com.gnodivad.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val myDouble = 21.4

    println("Is myDouble a Double? ${myDouble is Double}")
    println("myDouble is a ${myDouble::class.qualifiedName}")
    println("myDouble's javaClass is ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")

    val anotherInteger: Int = 17

    val myFloat: Float = 13.6f

    val result = myFloat + anotherInteger
    println(result)

    val bd = BigDecimal(17)
    val bd2: BigDecimal
    bd2 = bd.add(BigDecimal(30))
    println(bd2)

    println()

    var name = "David"
    val surname = "Ong"

    name = "John"
//    surname = "Doe"

    println("Hello $name ${surname.uppercase(Locale.getDefault())}")
    println("Your first \$name has ${name.length} characters")

    val story =  """It was a dark and stormy night
        |A foul smell crept across the city.
        |Jane wondered what time it was, and when it would by daylight""".trimMargin("|")
    println(story)

    val changedStory = story.replaceAfterLast("it", " would be dawn.")
    println(changedStory)
}