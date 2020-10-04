package com.morenn.basicmathlib

fun simpleAddition(p1: Int, p2: Int): Int = p1 + p2

fun simpleSubtraction(p1: Int, p2: Int): Int = p1 - p2

fun simpleMultiplication(p1: Int, p2: Int): Int = p1 * p2

fun simpleDivision(p1: Int, p2: Int): Double = p1.toDouble() / p2.toDouble()

fun isEven(p1: Int): Boolean = p1 % 2 == 0

fun isOdd(p1: Int): Boolean = p1 % 2 != 0

fun isPrime(p1: Int): Boolean {
    var isPrime = true
    for (i in 2..p1 / 2) {
        if (p1 % i == 0) {
            isPrime = false
            break
        }
    }

    return isPrime
}

fun getGCD(p1: Int, p2: Int): Int {
    var gcd = 1

    var i = 1
    while (i <= p1 && i <= p2) {
        if (p1 % i == 0 && p2 % i == 0)
            gcd = i
        ++i
    }

    return gcd
}
