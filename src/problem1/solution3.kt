package problem1

import java.util.*

private fun f(x : Int) : Int {
    return (x*(x+1)).floorDiv(2)
}

/**
 * TODO: this version is a work in progress
 */
fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (index in 0 until numberOfInputs) {
        val input = sc.nextInt() - 1

        val a = input.floorDiv(3)
        val b = input.floorDiv(5)
        val c = input.floorDiv(15)

        println(3*f(a)+5*f(b)-15*f(c))
    }
}
