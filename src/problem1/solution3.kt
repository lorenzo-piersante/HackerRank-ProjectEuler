package problem1

import java.util.Scanner

private fun triangleNumber(n : Int) : Long {
    val ln = n.toLong()

    return ln*(ln+1)/2
}

private fun solve(n : Int) : Long {
    val s3 = 3 * triangleNumber(n/3)
    val s5 = 5 * triangleNumber(n/5)
    val s15 = 15 * triangleNumber(n/15)

    return s3 + s5 + s15
}

/**
 * This is a great solution with O(1) complexity!
 */
fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt() - 1

        println(solve(input))
    }
}
