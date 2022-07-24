package problem4

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LargestPalindromeProduct {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(101101, largestPalindromeProduct(101110))
        Assertions.assertEquals(793397, largestPalindromeProduct(800000))
    }

}
