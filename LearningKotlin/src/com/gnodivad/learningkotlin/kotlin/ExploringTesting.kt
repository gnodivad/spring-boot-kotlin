package com.gnodivad.learningkotlin.kotlin

import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.fail

class AgeCalculation() {
    fun getAge(dob: Calendar): Int {
        return 0
    }
}

class AgeCaculationTests() {

    @Test
    fun checkAgeWhenBornToday() {
        assertEquals(0, AgeCalculation().getAge(Calendar.getInstance()))
    }
}