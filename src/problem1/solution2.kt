package problem1

import java.util.Scanner

/**
 * Time limit exceeded again!!!
 * Might be even worse than solution 1
 * I'm proud of having used Set, so I will keep it as reference
 */
fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    val inputs = IntArray(numberOfInputs)
    for (index in 0 until numberOfInputs) {
        inputs[index] = sc.nextInt()
    }

    for (input in inputs) {
        val ds = mutableSetOf<Int>()

        if (input <= 3) {
            println(0)
            continue
        }

        if (input <= 5) {
            println(3)
            continue
        }

        val a = if (input % 3 == 0) input - 3 else input - input % 3
        for (i in 3..a step 3) {
            ds.add(i)
        }

        val b = if (input % 5 == 0) input - 5 else input - input % 5
        for (j in 5..b step 5) {
            ds.add(j)
        }

        println(ds.sum())
    }
}
