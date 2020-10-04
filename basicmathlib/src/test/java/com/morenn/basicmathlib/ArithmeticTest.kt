package com.morenn.basicmathlib

import org.junit.Assert.assertEquals
import org.junit.Test

internal class ArithmeticTest {

    @Test
    fun simpleAddition() {
        assertEquals(simpleAddition(0, 0), 0)
        assertEquals(simpleAddition(16, 4), 20)
        assertEquals(simpleAddition(-25, 4), -21)
    }

    @Test
    fun simpleSubtraction() {
        assertEquals(simpleSubtraction(0, 0), 0)
        assertEquals(simpleSubtraction(16, 4), 12)
        assertEquals(simpleSubtraction(-25, 4), -29)
    }

    @Test
    fun simpleMultiplication() {
        assertEquals(simpleMultiplication(0, 0), 0)
        assertEquals(simpleMultiplication(16, 4), 64)
        assertEquals(simpleMultiplication(-25, 4), -100)
    }

    @Test
    fun simpleDivision() {
        assertEquals(simpleDivision(0, 0), Double.NaN, 0.0)
        assertEquals(simpleDivision(16, 4), 4.0, 0.0)
        assertEquals(simpleDivision(-25, 4), -6.25, 0.0)
        assertEquals(simpleDivision(3, 2), 1.5, 0.0)
    }

    @Test
    fun isEven() {
        assertEquals(isEven(0), true)
        assertEquals(isEven(16), true)
        assertEquals(isEven(-25), false)
    }

    @Test
    fun isOdd() {
        assertEquals(isOdd(0), false)
        assertEquals(isOdd(16), false)
        assertEquals(isOdd(-25), true)
    }

    @Test
    fun isPrime() {
        assertEquals(isPrime(0), true)
        assertEquals(isPrime(1), true)
        assertEquals(isPrime(16), false)
        assertEquals(isPrime(-29), true)
    }

    @Test
    fun getGCD() {
        assertEquals(getGCD(81, 153), 9)
        assertEquals(getGCD(153, 81), 9)
    }
}