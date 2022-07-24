package problem4

import java.util.Scanner

private fun isPalindrome(n : Int) : Boolean{
    val straight = n.toString()
    val reversed = straight.reversed()

    return straight == reversed
}

/**
 * bruteforce solution -> Time limit exceeded O(n^2)
 */
fun largestPalindromeProduct(input : Int) : Int {
    var maxPalindrome = 0

    for (i in 111..999 ) {
        for (j in 111..999) {
            val p = i * j

            if (isPalindrome(p) && p > maxPalindrome && p < input){
                maxPalindrome = p
            }
        }
    }

    return maxPalindrome
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt()

        val result = largestPalindromeProduct(input)

        println(result)
    }
}
