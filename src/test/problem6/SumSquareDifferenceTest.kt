package problem6

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SumSquareDifferenceTest {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(0, calculateSumSquareDifference(1))
        Assertions.assertEquals(22, calculateSumSquareDifference(3))
        Assertions.assertEquals(2640, calculateSumSquareDifference(10))
        Assertions.assertEquals(2500166641665000, calculateSumSquareDifference(10000))
    }

}
