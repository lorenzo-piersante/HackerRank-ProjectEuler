package problem8

import java.util.Scanner

private fun multiplyDigits(digits: List<Byte>, from : Int, to : Int) : Long {
    var candidate = 1L
    for (i in from..to) {
        candidate *= digits[i]
    }

    return candidate
}

fun largestConsecutiveDigitsProduct(digits : MutableList<Byte>, subsetsLength : Int) : Long {
    var largest = 0L

    var from = 0
    var to = subsetsLength - 1
    while (to <= digits.count() - 1) {
        val candidate = multiplyDigits(digits, from, to)
        if (candidate > largest) largest = candidate

        from++
        to++
    }

    return largest
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val numLength = sc.nextInt()
        val subsetsLength = sc.nextInt()

        val inputNumber = sc.next()

        val digits = mutableListOf<Byte>()
        for (j in 0 until numLength) {
            // for HackerRank (older kotlin version) replace the following line of code with:
            // digits.add(Character.getNumericValue(inputNumber[j]).toByte())
            digits.add(inputNumber[j].digitToInt().toByte())
        }

        val result = largestConsecutiveDigitsProduct(digits, subsetsLength)

        println(result)
    }
}
