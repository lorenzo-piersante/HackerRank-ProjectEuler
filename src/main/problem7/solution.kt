package problem7

import java.util.Scanner
import kotlin.math.ceil
import kotlin.math.sqrt

private fun isPrime(n: Int) : Boolean {
    val maxDivider = ceil(sqrt(n.toDouble())).toInt()

    for (i in 2..maxDivider) {
        if (n % i == 0) return false
    }

    return true
}

val primeNumbers = mutableSetOf(2, 3, 5, 7, 11)

/**
 * this function create the list of prime numbers with the highest input provided as size
 * despite the fact that the list creation has a relevant complexity ...
 * ... every subsequent testcase perform the fetch with a O(1) complexity
 *
 * "someone would say BLAZINGLY FAST!" -Jeff Delaney
 */
fun warmup(n : Int) : MutableSet<Int> {
    var candidate = 12

    while (primeNumbers.count() <= n) {

        if (isPrime(candidate)) {
            primeNumbers.add(candidate)
        }

        candidate++

    }

    return primeNumbers
}

fun getNthPrimeNumber(n : Int) : Int {
    return primeNumbers.elementAt(n - 1)
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    val inputs = mutableListOf<Int>()
    for (i in 0 until numberOfInputs) {
        inputs.add(i, sc.nextInt())
    }

    // HackerRank uses older kotlin version, so you need to use the following syntax to pass the test:
    // warmup(inputs.max<Int>() ?: 0)
    warmup(inputs.maxOrNull() ?: 0)

    for (input in inputs) {
        println(getNthPrimeNumber(input))
    }
}
