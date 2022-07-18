package problem1

import java.util.Scanner

/**
 * This version of the program still fails HackerRank test cases for exceeding time limits!
 * I need to optimize code further
 */
fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    val inputs = IntArray(numberOfInputs)
    for (index in 0 until numberOfInputs) {
        inputs[index] = sc.nextInt()
    }

    for (input in inputs) {
        var sum = 0

        for (number in 3 until input) {
            if (number % 3 == 0 || number % 5 == 0){
                sum += number
            }
        }

        println(sum)
    }
}
