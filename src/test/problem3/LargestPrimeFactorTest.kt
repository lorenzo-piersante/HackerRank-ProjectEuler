package problem3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LargestPrimeFactorTest {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(5, getMaxPrimeFactor(10))
        Assertions.assertEquals(17, getMaxPrimeFactor(17))
    }

    @Test
    fun shouldSolveTheProblemV2() {
        Assertions.assertEquals(5, getMaxPrimeFactorV2(10))
        Assertions.assertEquals(17, getMaxPrimeFactorV2(17))
    }

}
