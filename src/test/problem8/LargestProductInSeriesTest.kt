package problem8

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LargestProductInSeriesTest {

    @Test
    fun shouldSolveTheProblem() {
        val input1 = mutableListOf<Byte>(3, 6, 7, 5, 3, 5, 6, 2, 9, 1)
        Assertions.assertEquals(3150, largestConsecutiveDigitsProduct(input1, 5))

        val input2 = mutableListOf<Byte>(2, 7, 0, 9, 3, 6, 0, 6, 2, 6)
        Assertions.assertEquals(0, largestConsecutiveDigitsProduct(input2, 5))
    }

}
