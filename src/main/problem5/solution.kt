package problem5

import java.util.Scanner

/**
 * I think the code can be optimized
 * for example if you know a number can be divided by 8 you know it can be divided by 2 and 4 (2 cycles are wasted)
 *
 * this solution seems to be good enough for HackerRank so for now I will keep it as it is
 */
fun smallestMultiple(n : Int) : Int {
    var candidate = n

    while (candidate < 1_000_000) {
        for (i in 1..n) {
            if (candidate % i != 0) {
                candidate++
                break
            }

            if (i == n) return candidate
        }
    }

    throw Exception("computation is too expensive")
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt()

        val result = smallestMultiple(input)

        println(result)
    }
}
