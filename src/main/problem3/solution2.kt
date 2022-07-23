package problem3

import java.util.*
import kotlin.math.floor
import kotlin.math.sqrt

/**
 * we could optimize even more but this is yet good enough
 */
fun getMaxPrimeFactorV2(input : Long) : Long {
    var n = input
    var candidate = 1L

    while (n % 2 == 0L) {
        n /= 2
        candidate = 2
    }

    while (n % 3 == 0L) {
        n /= 3
        candidate = 3
    }

    // now we have to iterate only for integers which does not have prime factor 2 and 3

    var i = 5L
    while (i <= floor(sqrt(n.toDouble()))) {
        while (n % i == 0L) {
            candidate = i
            n /= i
        }

        i+=2

        while (n % i == 0L) {
            candidate = i
            n /= i
        }

        i+= 4
    }

    return if (n > 4) n else candidate
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input : Long = sc.nextLong()

        val result = getMaxPrimeFactorV2(input)

        println(result)
    }
}
