package problem3

import java.util.Scanner

/**
 * bruteforce solution with O(n) complexity
 * apparently working, but fails one HackerRank test case due Time limit exceeded
 */
fun getMaxPrimeFactor(input : Long) : Long {
    var n = input
    var candidate = 1L

    if (input < 2) {
        return candidate
    }

    for (i in 2L..n) {
        if (n % i == 0L) {
            n /= i
            if (i > candidate) candidate = i
        }
    }

    return candidate
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input : Long = sc.nextLong()

        val result = getMaxPrimeFactor(input)

        println(result)
    }
}
