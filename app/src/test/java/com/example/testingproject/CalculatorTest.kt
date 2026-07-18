package com.example.testingproject

import org.junit.Assert.*
import org.junit.Before
import kotlin.test.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun start(){
        calculator= Calculator()
    }

    @Test
    fun check(){
        val result=calculator.add(10,10)
        assertEquals(20,result)
    }
}