package problem2

import java.util.Scanner

private fun solve(input : Long) : Long {
    val sequence = arrayListOf<Long>()

    sequence.add(0, 1)
    sequence.add(1, 1)

    for (j in 2 until 10000) {
        val element = sequence[j-2] + sequence[j-1]
        if (element > input) break
        sequence.add(j, element)
    }

    var sum = 0L

    for (element in sequence) {
        if (element % 2 == 0L) sum += element
    }

    return sum
}


/**
 * This solution is passing hackerrank tests, but it is an O(n) solution
 * I am not sure if we can do better
 */
fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input : Long = sc.nextLong() - 1

        println(solve(input))
    }
}
