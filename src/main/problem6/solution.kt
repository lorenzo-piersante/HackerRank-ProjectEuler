package problem6

import java.util.Scanner

fun calculateSumSquareDifference(n : Int) : Long {
    var sum = 0L
    var sumOfSquare = 0L

    for (i in 1..n) {
        sum += i
        sumOfSquare += i * i
    }

    return sum * sum - sumOfSquare
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt()

        val result = calculateSumSquareDifference(input)

        println(result)
    }
}
