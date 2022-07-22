package problem1

import java.util.Scanner

/**
 * This version of the program still fails HackerRank test cases for exceeding time limits!
 * I need to optimize code further, O(n) complexity
 */
fun sumMultiplesOf3And5(input: Int) : Int {
    var sum = 0

    for (number in 3 until input) {
        if (number % 3 == 0 || number % 5 == 0){
            sum += number
        }
    }

    return sum
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt()

        val result = sumMultiplesOf3And5(input)

        println(result)
    }
}
