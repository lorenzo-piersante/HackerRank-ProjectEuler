package problem1

import java.util.*

/**
 * https://en.wikipedia.org/wiki/Triangular_number
 */
private fun triangleNumber(n : Int) : Int {
    return n*(n+1)/2
}

private fun s3(n : Int) : Int {
    return 3 * triangleNumber(n/3)
}

private fun s5(n : Int) : Int {
    return 5 * triangleNumber(n/5)
}

private fun s15(n : Int) : Int {
    return 15 * triangleNumber(n/15)
}

/**
 * TODO: work in progress solution
 * based on this post: https://medium.com/@TheZaki/project-euler-1-multiples-of-3-and-5-c24cb64071b0
 */
fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (index in 0 until numberOfInputs) {
        val input = sc.nextInt() - 1

        println(s3(input) + s5(input) - s15(input))
    }
}
