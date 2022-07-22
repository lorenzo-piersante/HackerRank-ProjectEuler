package problem1

import java.util.Scanner

/**
 * Time limit exceeded again!!!
 * Might be even worse than solution 1, O(n) complexity
 * I'm proud of having used Set, so I will keep it as reference
 */
fun sumMultiplesOf3And5V2(input: Int) : Int {
    val ds = mutableSetOf<Int>()

    if (input <= 3) {
        return 0
    }

    if (input <= 5) {
        return 3
    }

    val a = if (input % 3 == 0) input - 3 else input - input % 3
    for (i in 3..a step 3) {
        ds.add(i)
    }

    val b = if (input % 5 == 0) input - 5 else input - input % 5
    for (j in 5..b step 5) {
        ds.add(j)
    }

    return ds.sum()
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt()

        val result = sumMultiplesOf3And5V2(input)

        println(result)
    }
}
