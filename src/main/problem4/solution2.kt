package problem4

import java.util.Scanner

private fun isPalindrome(n : Int) : Boolean {
    val straight = n.toString()
    val reversed = straight.reversed()

    return straight == reversed
}

private fun getPreviousPalindrome(n : Int) : Int {
    var prev = n
    while (! isPalindrome(prev)) prev--

    return prev
}

private fun is3DigitTermsProduct(n : Int) : Boolean {
    for (i in 111..999) {
        for (j in 111..999) {
            if (i * j == n) return true
        }
    }

    return false
}

/**
 * this solution is way better, in fact we use the nested loops only to find the product terms only for palindrome nums
 * the optimization seems to be enough to pass tests
 */
fun largestPalindromeProductV2(input : Int) : Int {
    var candidate = getPreviousPalindrome(input - 1)

    while (! is3DigitTermsProduct(candidate)) {
        candidate = getPreviousPalindrome(candidate - 1)
    }

    return candidate
}

fun main() {
    val sc = Scanner(System.`in`)

    val numberOfInputs = sc.nextInt()

    for (i in 0 until numberOfInputs) {
        val input = sc.nextInt()

        val result = largestPalindromeProductV2(input)

        println(result)
    }
}
