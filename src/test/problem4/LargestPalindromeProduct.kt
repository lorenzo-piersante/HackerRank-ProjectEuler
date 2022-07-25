package problem4

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LargestPalindromeProduct {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(101101, largestPalindromeProduct(101110))
        Assertions.assertEquals(793397, largestPalindromeProduct(800000))
        Assertions.assertEquals(906609, largestPalindromeProduct(1000000))
        Assertions.assertEquals(99999, largestPalindromeProduct(101101))
    }

    @Test
    fun shouldSolveTheProblemV2() {
        Assertions.assertEquals(101101, largestPalindromeProductV2(101110))
        Assertions.assertEquals(793397, largestPalindromeProductV2(800000))
        Assertions.assertEquals(906609, largestPalindromeProductV2(1000000))
        Assertions.assertEquals(99999, largestPalindromeProductV2(101101))
    }

}
