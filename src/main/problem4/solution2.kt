package problem4

import java.util.Scanner

private fun isPalindrome(n : Int) : Boolean{
    val straight = n.toString()
    val reversed = straight.reversed()

    return straight == reversed
}

private fun getNextPalindrome(n : Int) : Int {
    if (isPalindrome(n)) return n

    for (i in n-1 downTo 101101) {
        if (isPalindrome(i)) return i
    }

    return 101101
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
 * anyway this solution is failing one testcase on HackerRank for Wrong Answer
 * I am trying to figure out where the bug is ...
 */
fun largestPalindromeProductV2(input : Int) : Int {
    var n = getNextPalindrome(input)
    while (n > 101101) {
        if (is3DigitTermsProduct(n)) return n
        n = getNextPalindrome(n-1)
    }

    return 101101
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
