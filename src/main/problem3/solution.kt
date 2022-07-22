package problem3

import java.util.*

fun getMaxPrimeFactor(input : Long) : Int {
    TODO()
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input : Long = sc.nextLong()

        val result = getMaxPrimeFactor(input)

        println(result)
    }
}
